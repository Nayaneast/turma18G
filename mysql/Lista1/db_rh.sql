create database db_rh;
use db_rh;

create table tb_funcionarios(
id bigint  auto_increment,
nome varchar (255) not null,
idade int,
cargo varchar(255),
salario float, 
primary key (id)
 
);
select *from tb_funcionarios;

insert into tb_funcionarios(nome,idade,cargo,salario) values("Nubia Oliveira",38,"Diretora Executiva",11000);

select *from tb_funcionarios;

insert into tb_funcionarios(nome,idade,cargo,salario) values("Sergio Carvalho",19,"Estagiario",1500);
insert into tb_funcionarios(nome,idade,cargo,salario) values("Maria Silva",23,"Analista Jr",2500);
insert into tb_funcionarios(nome,idade,cargo,salario) values("Ana Souza",26,"Analista Pleno",6500);
insert into tb_funcionarios(nome,idade,cargo,salario) values("Carlos Mello",21,"Analista Jr",2500);

select *From tb_funcionarios;

select *from tb_funcionarios where salario > 2000;

select *from tb_funcionarios where salario < 2000;

update tb_funcionarios set nome = "Sergio Simon" where id = 2;

select*from tb_funcionarios;








