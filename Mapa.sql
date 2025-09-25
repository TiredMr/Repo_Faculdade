CREATE TABLE Categoria (
    id_categoria INT PRIMARY KEY,
    descricao_categoria VARCHAR(100) NOT NULL
);

CREATE TABLE Uf (
    id_uf INT PRIMARY KEY,
    sigla_uf CHAR(2) NOT NULL,
    descricao_uf VARCHAR(100) NOT NULL
);

CREATE TABLE Cidade (
    id_cidade INT PRIMARY KEY,
    nome_cidade VARCHAR(100) NOT NULL,
    id_uf INT NOT NULL,
    FOREIGN KEY (id_uf) REFERENCES Uf(id_uf)
);

CREATE TABLE Produto (
    id_produto INT PRIMARY KEY,
    descricao_produto VARCHAR(100) NOT NULL,
    id_categoria INT NOT NULL,
    preco_unitario DECIMAL(10, 2) NOT NULL,
    quantidade_estoque INT NOT NULL,
    observacoes TEXT,
    FOREIGN KEY (id_categoria) REFERENCES Categoria(id_categoria)
);

CREATE TABLE Clientes (
    id_cliente INT PRIMARY KEY,
    nome_completo_cliente VARCHAR(100) NOT NULL,
    cpf_cnpj_cliente CHAR(14) NOT NULL,
    telefone_cliente VARCHAR(15),
    email_cliente VARCHAR(100),
    endereco_cliente VARCHAR(200) NOT NULL,
    id_uf INT NOT NULL,
    id_cidade INT NOT NULL,
    cep_cliente CHAR(10) NOT NULL,
    FOREIGN KEY (id_uf) REFERENCES Uf(id_uf),
    FOREIGN KEY (id_cidade) REFERENCES Cidade(id_cidade)
);

CREATE TABLE Pedidos (
    id_pedido INT PRIMARY KEY,
    id_cliente INT NOT NULL,
    data_pedido DATETIME NOT NULL,
    total_pedido DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES Clientes(id_cliente)
);

CREATE TABLE Pedidos_Produtos (
    id_pedidos_produtos INT PRIMARY KEY,
    id_pedido INT NOT NULL,
    id_produto INT NOT NULL,
    referencia VARCHAR(50),
    descricao VARCHAR(100) NOT NULL,
    quantidade INT NOT NULL,
    preco_unitario DECIMAL(10, 2) NOT NULL,
    valor_total DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (id_pedido) REFERENCES Pedidos(id_pedido),
    FOREIGN KEY (id_produto) REFERENCES Produto(id_produto)
);
