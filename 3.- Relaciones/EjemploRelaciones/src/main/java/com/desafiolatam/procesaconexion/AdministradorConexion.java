package com.desafiolatam.procesaconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class AdministradorConexion {
	protected Connection conn = null;
	protected PreparedStatement pstm = null;
	protected ResultSet rs = null;

	protected Connection generaConexion() {
		String usr = "curso2";
		String pwd = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";
		// String url = "jdbc:oracle:thin:@//localhost:1521/desafio_ejemplo01";
		String url = "jdbc:oracle:thin:@//192.168.56.102:1521/ORCL";

		try {
			Class.forName(driver);
			this.conn = DriverManager.getConnection(url, usr, pwd);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return this.conn;
	}

	protected Connection generaPoolConexion() {
		/*
		 * try { Context initContext = new InitialContext(); DataSource ds =
		 * (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle"); try {
		 * this.conn = ds.getConnection(); } catch (SQLException e) {
		 * e.printStackTrace(); } } catch (NamingException e) { e.printStackTrace(); }
		 * return this.conn;
		 */

		String usr = "curso2";
		String pwd = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";
		// String url = "jdbc:oracle:thin:@//localhost:1521/desafio_ejemplo01";
		String url = "jdbc:oracle:thin:@//192.168.56.102:1521/ORCL";

		try {
			Class.forName(driver);
			this.conn = DriverManager.getConnection(url, usr, pwd);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return this.conn;
	}
}

/*
 * Location: /Users/rodrigo/Desktop/Material Apoyo Lectura -
 * Códigos/EjemploRelaciones/WEB-INF/classes/!/com/desafiolatam/procesaconexion/
 * AdministradorConexion.class Java compiler version: 8 (52.0) JD-Core Version:
 * 1.1.3
 */