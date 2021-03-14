Create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
descricao varchar (255) not null,
tipo varchar(255),
ativo boolean not null,
primary key (id)
);

select *from tb_categoria;

insert tb_categoria (descricao,tipo,ativo) values ("Pizza grande","Salgada",true);
insert tb_categoria (descricao,tipo,ativo) values ("Pizza grande","Doce",true);
insert tb_categoria (descricao,tipo,ativo) values ("Pizza media","Salgada",true);
insert tb_categoria (descricao,tipo,ativo) values ("Pizza broto","Salgada",true);
insert tb_categoria (descricao,tipo,ativo) values ("Pizza broto","Doce",true);


create table tb_pizza(
id bigint auto_increment,
sabor varchar(255) not null,
preco decimal (4,2) not null,
qtProduto int not null,
unidade varchar (4) not null,
categoria_id bigint,
primary key(id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

insert tb_pizza (sabor,preco,qtProduto,unidade,categoria_id) values ("Mussarela",30.00,40,"un",1);
insert tb_pizza (sabor,preco,qtProduto,unidade,categoria_id) values ("Romeu e Julieta",70.00,20,"un",2);
insert tb_pizza (sabor,preco,qtProduto,unidade,categoria_id) values ("Calabresa",28.00,10,"un",3);
insert tb_pizza (sabor,preco,qtProduto,unidade,categoria_id) values ("Brigadeiro",45.00,60,"un",5);
insert tb_pizza (sabor,preco,qtProduto,unidade,categoria_id) values ("Espinafre",52.00,40,"un",4);
insert tb_pizza (sabor,preco,qtProduto,unidade,categoria_id) values ("Escarola",68.00,38,"un",1);
insert tb_pizza (sabor,preco,qtProduto,unidade,categoria_id) values ("Prestigio",79.00,20,"un",2);
insert tb_pizza (sabor,preco,qtProduto,unidade,categoria_id) values ("Nutella",50.00,40,"un",5);

select * from tb_pizza;
select * from tb_pizza where preco > 45.00;

select * from tb_pizza where preco between 29 and 60;
select * from tb_pizza where sabor like '%c%';

select *from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id;

select tb_pizza.sabor, tb_categoria.tipo from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id where tb_categoria.tipo = "Doce";


