/*    */ package com.desafiolatam.dao;
/*    */ 
/*    */ import com.desafiolatam.modelo.Departamento;
/*    */ import com.desafiolatam.modelo.DepartamentoEmpleado;
/*    */ import com.desafiolatam.modelo.Empleado;
/*    */ import com.desafiolatam.procesaconexion.AdministradorConexion;
/*    */ import java.sql.Connection;
/*    */ import java.sql.SQLException;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class DepartamentoEmpleadoDaoImpl
/*    */   extends AdministradorConexion
/*    */   implements DepartamentoEmpleadoDao {
/*    */   public DepartamentoEmpleadoDaoImpl() {
/* 16 */     Connection conn = generaPoolConexion();
/*    */   }
/*    */ 
/*    */   
/*    */   public List<DepartamentoEmpleado> obtieneDepartamento(String nomDepto) {
/* 21 */     List<DepartamentoEmpleado> deptosEmpleados = new ArrayList<>();
/* 22 */     String query = "SELECT *  FROM EMPLEADO EMP INNER JOIN DEPARTAMENTO DEP ON DEP.NUMDEPTO = EMP.NUMDEPTO WHERE ";
/*    */ 
/*    */     
/* 25 */     if (nomDepto.isEmpty() && nomDepto.isEmpty()) {
/* 26 */       query = "SELECT *  FROM EMPLEADO EMP INNER JOIN DEPARTAMENTO DEP ON DEP.NUMDEPTO = EMP.NUMDEPTO";
/*    */     } else {
/* 28 */       query = String.valueOf(query) + "DEP.NOMDEPTO = '" + nomDepto + "'";
/*    */     } 
/*    */     
/*    */     try {
/* 32 */       this.pstm = this.conn.prepareStatement(query);
/* 33 */       this.rs = this.pstm.executeQuery();
/* 34 */       while (this.rs.next()) {
/* 35 */         Departamento depto = new Departamento(this.rs.getInt("NUMDEPTO"), this.rs.getString("NOMDEPTO"), this.rs.getString("UBICACIONDPTO"));
/* 36 */         Empleado empleado = new Empleado(this.rs.getInt("NUMEMPLEADO"), this.rs.getString("NOMBRE"), this.rs.getInt("NUMDEPTO"));
/* 37 */         DepartamentoEmpleado deptoEmpl = new DepartamentoEmpleado(depto, empleado);
/* 38 */         deptosEmpleados.add(deptoEmpl);
/*    */       } 
/* 40 */     } catch (SQLException e) {
/* 41 */       e.printStackTrace();
/*    */     } 
/* 43 */     return deptosEmpleados;
/*    */   }
/*    */ }


/* Location:              /Users/rodrigo/Desktop/Material Apoyo Lectura - Códigos/EjemploRelaciones/WEB-INF/classes/!/com/desafiolatam/dao/DepartamentoEmpleadoDaoImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */