package com.desafiolatam.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.desafiolatam.modelo.Departamento;
import com.desafiolatam.procesaConexion.AdministradorConexion;

public class DepartamentoDaoImp extends AdministradorConexion implements DepartamentoDao {

	public DepartamentoDaoImp() {
		//Connection conn = generaConexion();
		
		Connection conn = generaPoolConexion();
	}

	@Override
	public List<Departamento> obtieneDepartamento() {

		String sql = "SELECT * FROM departamento";
		List<Departamento> deptos = new ArrayList<Departamento>();
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				Departamento depto = new Departamento(rs.getInt("NUMDEPTO"), rs.getString("NOMDEPTO"),
						rs.getString("UBICACIONDPTO"));
				deptos.add(depto);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return deptos;

	}

}
