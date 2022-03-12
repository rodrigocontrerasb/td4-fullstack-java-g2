/*    */ package com.desafiolatam.servlet;
/*    */ 
/*    */ import com.desafiolatam.dao.DepartamentoEmpleadoDaoImpl;
/*    */ import com.desafiolatam.modelo.DepartamentoEmpleado;
/*    */ import java.io.IOException;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.ServletRequest;
/*    */ import javax.servlet.ServletResponse;
/*    */ import javax.servlet.annotation.WebServlet;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ 
/*    */ @WebServlet({"/procesaBusquedaEmplDept"})
/*    */ public class ProcesaBusquedaEmpDept
/*    */   extends HttpServlet {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/* 22 */     String nomDepartamento = request.getParameter("nomDepto");
/*    */     
/* 24 */     List<DepartamentoEmpleado> deptosEmpleadosList = new ArrayList<>();
/*    */     
/* 26 */     DepartamentoEmpleadoDaoImpl obtieneDeptoEmpleado = new DepartamentoEmpleadoDaoImpl();
/*    */     
/* 28 */     deptosEmpleadosList = obtieneDeptoEmpleado.obtieneDepartamento(nomDepartamento);
/*    */     
/* 30 */     request.setAttribute("departamentoEmpleado", deptosEmpleadosList);
/*    */     
/* 32 */     request.getRequestDispatcher("ListaUnoMuchos.jsp").forward((ServletRequest)request, (ServletResponse)response);
/*    */   }
/*    */ }


/* Location:              /Users/rodrigo/Desktop/Material Apoyo Lectura - Códigos/EjemploRelaciones/WEB-INF/classes/!/com/desafiolatam/servlet/ProcesaBusquedaEmpDept.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */