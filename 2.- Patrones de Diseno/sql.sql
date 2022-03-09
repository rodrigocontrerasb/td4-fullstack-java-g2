create table curso (id_curso varchar2(50) primary key, descripcion varchar2(100),precio number(22));
create table forma_pago (id_forma_pago varchar2(50),descripcion varchar2(100),recargo varchar2(100));
create table inscripcion(id_inscripcion number(22) primary key, nombre varchar2(100),telefono number(22), id_curso varchar2(50), id_forma_pago varchar2(50), foreign key (id_curso) references curso(id_curso));

CREATE SEQUENCE inscripcion_sec MINVALUE 1 START WITH 1 INCREMENT BY 1 NOCACHE;

insert into curso values('1','Java Enterprice Edition',800.000);
insert into curso values('2','Java Standar Edition',600.000);
insert into curso values('3','JavaScript ECMA 6', 500.000);

insert into forma_pago values ('1598','Tarjeta Credito','10%');
insert into forma_pago values ('1547','Tarjeta Debito','15%');
insert into forma_pago values ('3578','Efectivo','5%' );
