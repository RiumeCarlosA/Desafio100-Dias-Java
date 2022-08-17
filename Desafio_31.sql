use Sistema;
CREATE TABLE vendedor(
	CodVendedor int(4) not null AUTO_INCREMENT,
  	Nome varchar(45) not null,
  	SalarioFixo decimal(10,2) not null,
  	FaixaComissao ENUM('A', 'B', 'C', 'D') not null,
    PRIMARY KEY (CodVendedor),
    unique key  (Nome)
);
CREATE TABLE pedido(
    CodPedido int(4) not null AUTO_INCREMENT,
    PrazoEntrega date not null,
    DataPedido date not null,
    CodCliente int(4) not null,
    CodVendedor int(4) not null,
    PRIMARY KEY (CodPedido),
    unique key (CodCliente),
    unique key (CodVendedor)
);
CREATE TABLE cliente(
    CodCliente int(4) not null AUTO_INCREMENT,
    Nome varchar(45) not null,
    Endereco varchar(45) not null,
    Cidade varchar(45) not null,
    Cep varchar(45) not null,
    Uf varchar(2) not null,
    Ie varchar(45) not null,
    PRIMARY KEY (CodCliente)
);
CREATE TABLE itemPedido(
    CodItemPedido int(4) not null AUTO_INCREMENT,
    CodPedido int(4) not null,
    CodProduto int(4) not null,
    Quantidade int(5) not null,
    PRIMARY KEY (CodItemPedido),
    unique key (CodPedido),
    unique key (CodProduto)
);
CREATE TABLE produto(
    CodProduto int(4) not null AUTO_INCREMENT,
    Descricao varchar(45) not null,
    ValorUnitario DECIMAL(10,2) not null,
    PRIMARY KEY (CodProduto)
);
