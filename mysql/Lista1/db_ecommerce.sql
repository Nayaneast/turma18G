Create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
id bigint auto_increment,
produto varchar(255) not null,
marca varchar(255) not null,
preco decimal(10,2) not null,
quantidade int not null,
primary key(id)
);

select*from tb_produtos;

insert into tb_produtos (produto,marca,preco,quantidade) values ("Bolsa","Gucci",1900.00,3);
insert into tb_produtos (produto,marca,preco,quantidade) values ("Bolsa","YSL",35000.00,8);
insert into tb_produtos (produto,marca,preco,quantidade) values ("Óculos","Gucci",4000.00,3);
insert into tb_produtos (produto,marca,preco,quantidade) values ("Bolsa","Dior",1900.00,3);
insert into tb_produtos (produto,marca,preco,quantidade) values ("Carteira","Gucci",350.00,3);
insert into tb_produtos (produto,marca,preco,quantidade) values ("Bolsa","Dior",6000.00,3);
insert into tb_produtos (produto,marca,preco,quantidade) values ("Carteira","Prada",499.00,3);
insert into tb_produtos (produto,marca,preco,quantidade) values ("Bolsa","Louis Vuitton",29000.00,5);

select *from tb_produtos where preco > 500;
select *from tb_produtos where preco < 500;

update tb_produtos set preco = 399.00 where id = 3;

 