CREATE TABLE products (
    id VARCHAR(255) NOT NULL,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(300),
    price NUMERIC(10, 2),
    PRIMARY KEY (id)
);