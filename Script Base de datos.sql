create database colegio;

use colegio;

create table estudiantes(
	documento varchar(10)not null primary key,
	nombre varchar(25)not null,
    apellido varchar(25)not null,
    curso int(2)not null, 
    telefono varchar(10)not null,
    correo varchar(25) not null
);

create table periodos(
cod_periodo varchar(6) not null,
nombre_periodo varchar(30),
primary key(cod_periodo)
);

create table materia(
cod_materia varchar(5) not null,
nombre_materia varchar(20) not null,
horas_semanales int(2) not null,
primary key(cod_materia)
);

create table notas(
documento varchar(10) not null,
cod_periodo varchar(6) not null,
cod_materia varchar(5) not null,
nota float (2.2) not null,
primary key(documento,cod_periodo,cod_materia),
foreign key(documento) references estudiantes(documento)on delete cascade,
foreign key(cod_periodo) references periodos(cod_periodo)on delete cascade,
foreign key(cod_materia) references materia(cod_materia)on delete cascade
);

create table usuario(
id int(10) not null primary key,
usuario varchar (25) not null,
clave varchar (25) not null 
);

insert into periodos values('2021-1','Primer periodo 2021');
insert into periodos values('2021-2','Segundo periodo 2021');
insert into periodos values('2022-1','Primer periodo 2022');
insert into periodos values('2022-2','Segundo periodo 2022');

insert into materia values('Mate1','Matematicas','5');
insert into materia values('Espa2','Español','5');
insert into materia values('Ing3','Ingles','3');
insert into materia values('EduF4','Educacion Fisica','2');
insert into materia values('Quim5','Quimica','5');
insert into materia values('Fisi6','Fisica','5');
insert into materia values('Esta7','Estadisticas','3');

insert into notas values('1022922601','2022-1','Mate1',3.5);
insert into usuario values(1,'JhonMaster','jhon2022');
drop table notas;
select*from usuario;
select*from periodos;
select *from materia;
select *from estudiantes;
select*from notas;