/*    */ package com.desafiolatam.modelo;
/*    */ 
/*    */ public class DepartamentoEmpleado
/*    */ {
/*    */   private Departamento departamento;
/*    */   private Empleado empleado;
/*    */   
/*    */   public DepartamentoEmpleado(Departamento departamento, Empleado empleado) {
/*  9 */     this.departamento = departamento;
/* 10 */     this.empleado = empleado;
/*    */   }
/*    */   
/*    */   public Departamento getDepartamento() {
/* 14 */     return this.departamento;
/*    */   }
/*    */   public void setDepartamento(Departamento departamento) {
/* 17 */     this.departamento = departamento;
/*    */   }
/*    */   public Empleado getEmpleado() {
/* 20 */     return this.empleado;
/*    */   }
/*    */   public void setEmpleado(Empleado empleado) {
/* 23 */     this.empleado = empleado;
/*    */   }
/*    */ }


/* Location:              /Users/rodrigo/Desktop/Material Apoyo Lectura - Códigos/EjemploRelaciones/WEB-INF/classes/!/com/desafiolatam/modelo/DepartamentoEmpleado.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */