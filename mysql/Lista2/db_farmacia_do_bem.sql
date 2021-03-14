Create database db_farmacia_do_bem;

Use db_farmacia_do_bem;

Create table tb_categoria(
id bigint auto_increment,
descricao varchar (255),
lote int not null,
dtVencimento date not null,
primary key (id)
);

INSERT INTO tb_categoria(descricao,lote,dtVencimento) VALUES("Medicamento",216389,21/03/2025);
insert into tb_categoria(descricao,lote,dtvencimento) values("Cosmetico",390028,"2027/04/23"),("Higiene",390028,"2026/06/13"),("Medicamento",659408,"2025/04/12"),("Medicamento",373829,"2022/04/18");


update tb_categoria  set dtVencimento = "2025/03/21" where id = 1;

select *from tb_categoria;

Use db_farmacia_do_bem;

Create table tb_produtos(
id bigint auto_increment,
produto varchar (255),
preco decimal(4,2) not null,
qtProduto int not null,
restricao varchar(255),
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

select *from tb_produtos;

INSERT INTO tb_produtos(produto,preco,qtProduto,restricao,categoria_id) VALUES("Dipirona 500mg",12.38,210,"Recomenda-se não utilizar durante a gravidez",1);
INSERT INTO tb_produtos(produto,preco,qtProduto,restricao,categoria_id) VALUES("Neosaldina",60.00,20,"Não recomendado para crianças",4);
INSERT INTO tb_produtos(produto,preco,qtProduto,restricao,categoria_id) VALUES("Ibuprofeno 500mg",25.60,90,"Não recomendado para criancas",5);
INSERT INTO tb_produtos(produto,preco,qtProduto,restricao,categoria_id) VALUES("Batom vermelho",70.00,290,"Verificar alergenicos",2);
INSERT INTO tb_produtos(produto,preco,qtProduto,restricao,categoria_id) VALUES("Batom roxo",65.00,34,"Verificar alergenicos",2);
INSERT INTO tb_produtos(produto,preco,qtProduto,restricao,categoria_id) VALUES("Sobonete neutro",5.00,300,"Verificar alergenicos",3);
INSERT INTO tb_produtos(produto,preco,qtProduto,restricao,categoria_id) VALUES("Sabonete mel",7.00,90,"Verificar alergenicos",3);
INSERT INTO tb_produtos(produto,preco,qtProduto,restricao,categoria_id) VALUES("Advil",44.70,850,"Recomenda-se não utilizar durante a gravidez",4);

select *from tb_produtos where preco > 50.00;

select *from tb_produtos where preco between 3 and 60;

select *from tb_produtos where produto like '%b%';

select *from tb_produtos inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id;

select tb_produtos.produto, tb_categoria.descricao from tb_produtos  inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id where tb_categoria.descricao = "Medicamento";
