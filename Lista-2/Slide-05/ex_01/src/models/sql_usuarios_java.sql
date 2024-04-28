create database Usuario;
use Usuario;

create table usuarios(
id_usuario int primary key auto_increment,
nome_usuario varchar(50),
email_usuario varchar(100),
login_usuario varchar(100),
senha_usuario varchar(50)
);

select * from usuarios;