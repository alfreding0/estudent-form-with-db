/* create database app_curso_git*/
create table estudiante(
	id serial primary key,
	nombre varchar(50),
	apellido varchar(50),
	ci varchar(12),
	sexo char(1),
	telefono varchar(10)
);