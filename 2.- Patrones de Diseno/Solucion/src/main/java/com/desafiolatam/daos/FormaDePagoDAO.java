package com.desafiolatam.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.desafiolatam.entidades.CursoDTO;
import com.desafiolatam.entidades.FormaDePagoDTO;

public class FormaDePagoDAO {

	public List obtieneFormasDePago() throws SQLException, ClassNotFoundException {

		// creamos la lista de objetos que devolveran los resultados
		List<FormaDePagoDTO> formaDePago = new ArrayList<FormaDePagoDTO>();

		// creamos la consulta a la base de datos
		String consultaSql = " SELECT id_forma_pago, descripcion, recargo " + " FROM system.forma_pago ";

		// conexion a la base de datos y ejecucion de la sentencia
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// Connection conexion =
		// DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","chotokan");
		Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.102:1521/ORCL", "system",
				"oracle");

		try (PreparedStatement stmt = conexion.prepareStatement(consultaSql)) {

			ResultSet resultado = stmt.executeQuery();
			while (resultado.next()) {
				FormaDePagoDTO formaPago = new FormaDePagoDTO();
				formaPago.setIdFormaDePago(resultado.getInt("id_forma_pago"));
				formaPago.setDescripcion(resultado.getString("descripcion"));
				// formaPago.setRecargo(resultado.getDouble("recargo"));
				formaPago.setRecargo(10);
				formaDePago.add(formaPago);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return formaDePago;
	}
}
