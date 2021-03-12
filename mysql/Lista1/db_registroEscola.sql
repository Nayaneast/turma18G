create database db_registroEscola;

use db_registroEscola;

create table tb_alunos(
matricula bigint auto_increment,
nome varchar(255) not null,
idade int not null,
nota decimal (2,1) not null,
ativo boolean,
primary key(matricula)	
);

select *from tb_alunos;

alter table tb_alunos change nota  nota decimal (3,1) not null; 

insert into tb_alunos(nome,idade,nota,ativo) values("Alice",9,8.0,true);
insert into tb_alunos(nome,idade,nota,ativo) values("Ana",10,4.5,false);
insert into tb_alunos(nome,idade,nota,ativo) values("Jorge",9,6.5,true);
insert into tb_alunos(nome,idade,nota,ativo) values("Matheus",8,8.0,true);
insert into tb_alunos(nome,idade,nota,ativo) values("Lucas",10,4.5,false);
insert into tb_alunos(nome,idade,nota,ativo) values("Maria",9,10.0,true);
insert into tb_alunos(nome,idade,nota,ativo) values("Valter",9,7.5,true);
insert into tb_alunos(nome,idade,nota,ativo) values("Iza",8,10.0,true);

select * from tb_alunos where nota >7;
select * from tb_alunos where nota <7;

update tb_alunos set nota = 3.5 where matricula = 4;