package com.desafiolatam.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.desafiolatam.entidades.CursoDTO;

public class CursoDao {

	public List obtieneCursos() throws SQLException, ClassNotFoundException {

		// creamos la lista de objetos que devolveran los resultados
		List<CursoDTO> listaDeCursos = new ArrayList<CursoDTO>();

		// creamos la consulta a la base de datos
		String consultaSql = " SELECT id_curso, descripcion, precio " + " FROM system.curso ";

		// conexion a la base de datos y ejecucion de la sentencia
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// Connection conexion =
		// DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","chotokan");
		Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.102:1521/ORCL", "system",
				"oracle");

		try (PreparedStatement stmt = conexion.prepareStatement(consultaSql)) {

			ResultSet resultado = stmt.executeQuery();
			while (resultado.next()) {
				CursoDTO cursoDto = new CursoDTO();
				cursoDto.setIdCurso(resultado.getInt("id_curso"));
				cursoDto.setDescricion(resultado.getString("descripcion"));
				cursoDto.setPrecio(resultado.getDouble("precio"));
				listaDeCursos.add(cursoDto);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return listaDeCursos;
	}
}
