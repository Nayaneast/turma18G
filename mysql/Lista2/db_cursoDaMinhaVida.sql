Create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
descricao varchar (255) not null,
modalidade varchar (255),
ativo boolean not null,
primary key (id)
);

select *from tb_categoria;

insert tb_categoria (descricao,modalidade,ativo) values ("Graduação","EAD",true);
insert tb_categoria (descricao,modalidade,ativo) values ("Graduação","Presencial",false);
insert tb_categoria (descricao,modalidade,ativo) values ("Mestrado","EAD",true);
insert tb_categoria (descricao,modalidade,ativo) values ("Pós Graduação","EAD",true);
insert tb_categoria (descricao,modalidade,ativo) values ("Curso Livre","EAD",true);


create table tb_curso(
id bigint auto_increment,
curso varchar(255) not null,
preco decimal (6,2) not null,
vagas int not null,
duracao varchar (255) not null,
inscricao date not null,
categoria_id bigint,
primary key(id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

insert tb_curso (curso,preco,vagas,duracao,inscricao,categoria_id) values ("Analise de Sistemas",500.00,40,"4 anos","2021/03/18",1);
insert tb_curso (curso,preco,vagas,duracao,inscricao,categoria_id) values ("Sistama da Informação",5400.00,60,"3 anos","2021/03/12",1);
insert tb_curso (curso,preco,vagas,duracao,inscricao,categoria_id) values ("Engenharia de Software",800.00,20,"4 anos","2021/03/22",2);
insert tb_curso (curso,preco,vagas,duracao,inscricao,categoria_id) values ("Ciência da Computação",950.00,80,"2 anos","2021/03/15",3);
insert tb_curso (curso,preco,vagas,duracao,inscricao,categoria_id) values ("Jogos Digitais", 600.00,69,"2 anos","2021/04/10",4);
insert tb_curso (curso,preco,vagas,duracao,inscricao,categoria_id) values ("HTML",40.00,200,"2 meses","2021/04/20",5);
insert tb_curso (curso,preco,vagas,duracao,inscricao,categoria_id) values ("Phyton",70.00,80," 4 meses","2021/04/14",5);
insert tb_curso (curso,preco,vagas,duracao,inscricao,categoria_id) values ("Java",60.00,40,"3 meses","2021/03/18",5);

select * from tb_curso;
select *from tb_curso where preco > 50.00;
select * from tb_curso where preco between 3 and 60;
select * from tb_curso where curso Like '%j%';

select *from tb_curso inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id;

select tb_curso.curso, tb_categoria.descricao from tb_curso  inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id where tb_categoria.descricao = "Curso Livre";