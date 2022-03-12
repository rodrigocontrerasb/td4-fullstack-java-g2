package com.desafiolatam.procesaConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class AdministradorConexion {

	protected Connection conn = null;
	protected PreparedStatement pstm = null;
	protected ResultSet rs = null;

	protected Connection generaConexion() {

		String usr = "curso2";
		String pwd = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@//192.168.56.102:1521/ORCL";

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usr, pwd);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return conn;

	}

	protected Connection generaPoolConexion() {
		
		System.out.println("CONECTADO VIA POOL DE CONEXION");

		Context initContext;
		try {

			initContext = new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/ConexionOracle");
			try {

				conn = ds.getConnection();

			} catch (Exception e) {
				// TODO: handle exception

				e.printStackTrace();
			}

		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}

		return conn;
	}

}
