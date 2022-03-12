package com.desafiolatam.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Utiles {

	// --------------------------------------------------------------------------------------
	public void select() {

		System.out.println("EN SELECT");

		String usr = "curso";
		String pwd = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";
		// String url = "jdbc:oracle:thin:@//localhost:1521/desafio_ejemplo01";
		String url = "jdbc:oracle:thin:@//192.168.56.102:1521/ORCL";

		Connection conn = null;

		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usr, pwd);
			String sql = "SELECT * FROM departamento, empleado";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				System.out.println("DEPARTAMENTOS:::");
				System.out.println(rs.getInt("NUMDEPTO"));
				System.out.println(rs.getString("NOMDEPTO"));
				System.out.println(rs.getString("UBICACIONDPTO"));
				System.out.println("EMPLEADOS:::");
				System.out.println(rs.getInt("NUMEMPLEADO"));
				System.out.println(rs.getString("NOMBRE"));
				System.out.println(rs.getInt("NUMDEPTO"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// --------------------------------------------------------------------------------------
	public void insert() {

		System.out.println("EN INSERT");

		String usr = "curso";
		String pwd = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";
		// String url = "jdbc:oracle:thin:@//localhost:1521/desafio_ejemplo01";
		String url = "jdbc:oracle:thin:@//192.168.56.102:1521/ORCL";

		Connection conn = null;

		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usr, pwd);
			String sql = "INSERT INTO DEPARTAMENTO (NUMDEPTO, NOMDEPTO, UBICACIONDPTO) VALUES (?,?,?)";
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, 12);
			pstm.setString(2, "CONTABILIDAD");
			pstm.setString(3, "MEXICO");

			int resultado = pstm.executeUpdate();

			if (resultado > 0) {
				System.out.println("Fila correctamente insertada");
			} else {
				System.out.println("Ha ocurrido un error");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	// --------------------------------------------------------------------------------------
	public void delete() {

		System.out.println("EN DELETE");

		String usr = "curso";
		String pwd = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";
		// String url = "jdbc:oracle:thin:@//localhost:1521/desafio_ejemplo01";
		String url = "jdbc:oracle:thin:@//192.168.56.102:1521/ORCL";

		Connection conn = null;

		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usr, pwd);
			String sql = "DELETE FROM DEPARTAMENTO WHERE NUMDEPTO = ?";
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, 12);

			int resultado = pstm.executeUpdate();

			if (resultado == 1) {
				System.out.println("Fila correctamente borrada");
			} else {
				System.out.println("Ha ocurrido un error");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	// --------------------------------------------------------------------------------------
	public void update() {

		System.out.println("EN UPDATE");

		String usr = "curso";
		String pwd = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";
		// String url = "jdbc:oracle:thin:@//localhost:1521/desafio_ejemplo01";
		String url = "jdbc:oracle:thin:@//192.168.56.102:1521/ORCL";

		// Instancia nueva
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		// Intentamos el proceso de UPDATE
		try {
			
			// Conexion
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usr, pwd);
			String sql = "UPDATE DEPARTAMENTO SET UBICACIONDPTO = ?";
			pstm = conn.prepareStatement(sql);

			// reemplazo
			pstm.setString(1, "CHILE");

			// Ejecucion y salida
			int resultado = pstm.executeUpdate();

			// Verificacion de la salida
			if (resultado == 1) {
				System.out.println("Fila correctamente actualizada");
			} else {
				System.out.println("Ha ocurrido un error");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
