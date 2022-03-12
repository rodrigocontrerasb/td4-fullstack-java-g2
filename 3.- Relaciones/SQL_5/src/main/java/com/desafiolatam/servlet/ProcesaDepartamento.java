package com.desafiolatam.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.dao.DepartamentoDaoImp;
import com.desafiolatam.modelo.*;

@WebServlet("/procesaDepartamento")
public class ProcesaDepartamento extends HttpServlet {
	
	private static final long serialVersionUIS = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Departamento> listaDeptos = new ArrayList<Departamento>();
		DepartamentoDaoImp deptoDao = new DepartamentoDaoImp();
		listaDeptos = deptoDao.obtieneDepartamento();
		
		// Request
		request.setAttribute("deptoDao", listaDeptos);
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
		
	}

}
