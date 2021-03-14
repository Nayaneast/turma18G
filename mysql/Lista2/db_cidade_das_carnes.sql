Create database db_cidade_das_carnes;

Use db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
unidade varchar (4) not null,
ativo boolean not null,
primary key(id)
);

select *from tb_categoria;

insert tb_categoria (descricao,unidade,ativo) values ("Bovino","Kg",true),("Suino","Kg",true),("Aves","Kg",true),("pertence feijoada","Kg",true),("imbutidos","Kg",true);

create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
preco decimal not null,
qtProduto int not null,
dtVencimento date not null,
lote int not null,
categoria_id bigint,
primary key(id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

insert tb_produtos (nome,preco,qtProduto,dtVencimento,lote,categoria_id) values  ("ASA",40.00,30,"2021/03/25",120990,3);
insert tb_produtos (nome,preco,qtProduto,dtVencimento,lote,categoria_id) values  ("Picanha",20.00,30,"2021/03/20",138090,1);
insert tb_produtos (nome,preco,qtProduto,dtVencimento,lote,categoria_id) values  ("Coxa de Frango",20.00,30,"2021/03/22",120947,3);
insert tb_produtos (nome,preco,qtProduto,dtVencimento,lote,categoria_id) values  ("Bacon",30.00,30,"2021/03/17",1493049,2);
insert tb_produtos (nome,preco,qtProduto,dtVencimento,lote,categoria_id) values  ("Salsicha",8.00,30,"2021/03/25",120990,5);
insert tb_produtos (nome,preco,qtProduto,dtVencimento,lote,categoria_id) values  ("Cupim",20.00,30,"2021/03/19",134590,1);
insert tb_produtos (nome,preco,qtProduto,dtVencimento,lote,categoria_id) values  ("Peito de Frango",25.00,30,"2021/03/29",124928,3);
insert tb_produtos (nome,preco,qtProduto,dtVencimento,lote,categoria_id) values  ("Orelha de Porco",20.00,30,"2021/03/16",145200,4);

select *from tb_produtos;

select *from tb_produtos where preco > 50;
select *from tb_produtos where preco between 3 and 60;
select *from tb_produtos where nome like 'C%';

select *from tb_produtos inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id;

select tb_produtos.nome, tb_categoria.descricao from tb_produtos  inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id where tb_categoria.descricao = "Aves";
