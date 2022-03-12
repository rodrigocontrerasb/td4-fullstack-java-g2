package com.desafiolatam.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/preConfirmacion")
public class PreConfirmacion extends HttpServlet
{
   protected void doGet(HttpServletRequest request ,HttpServletResponse response) 
		   								   throws ServletException
                                          ,IOException
   {
      request.getRequestDispatcher("confirmacion.jsp").forward(request, response);
   }
}
