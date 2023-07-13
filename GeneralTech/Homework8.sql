CREATE DATABASE tmp_1;
USE tmp_1;

CREATE TABLE customers (
    id INTEGER PRIMARY KEY AUTOINCREMENT, 
    name VARCHAR(20),
    lastname VARCHAR(20),
    gender char(1) CHECK(gender IN ('f', 'm')),
    age INTEGER
);

CREATE TABLE orders (
    id INTEGER PRIMARY KEY AUTOINCREMENT, 
    customerid INTEGER,
    productid INTEGER,
    ordertype VARCHAR(128),
    product_count INTEGER
);


CREATE TABLE products (
    id INTEGER PRIMARY KEY AUTOINCREMENT, 
    title VARCHAR(128),
    price NUMERIC(8, 2)
);

INSERT INTO orders (customerid, productid, ordertype, product_count) VALUES (1, 3, 'online', 3);
INSERT INTO orders (customerid, productid, ordertype, product_count) VALUES (1, 2, 'online', 5);
INSERT INTO orders (customerid, productid, ordertype, product_count) VALUES (3, 1, 'direct', 2);
INSERT INTO orders (customerid, productid, ordertype, product_count) VALUES (3, 4, 'direct', 6);
INSERT INTO orders (customerid, productid, ordertype, product_count) VALUES (3, 3, 'direct', 3);
INSERT INTO orders (customerid, productid, ordertype, product_count) VALUES (1, 3, 'online', 4);
INSERT INTO orders (customerid, productid, ordertype, product_count) VALUES (5, 7, 'online', 2);
INSERT INTO orders (customerid, productid, ordertype, product_count) VALUES (5, 9, 'online', 7);
INSERT INTO orders (customerid, productid, ordertype, product_count) VALUES (6, 5, 'direct', 4);


INSERT INTO customers (name, lastname, age, gender) VALUES ('Гайк', 'Инанц', 29, 'm');
INSERT INTO customers (name, lastname, age, gender) VALUES ('Максим', 'Грибов', 32, 'm');
INSERT INTO customers (name, lastname, age, gender) VALUES ('Антон', 'Куликов', 27, 'm');
INSERT INTO customers (name, lastname, age, gender) VALUES ('Юрий', 'Митрофанов', 30, 'm');
INSERT INTO customers (name, lastname, age, gender) VALUES ('Нелли', 'Ефремян', 25, 'f');
INSERT INTO customers (name, lastname, age, gender) VALUES ('Ольга', 'Степанова', 35, 'f');

INSERT INTO products (title, price) VALUES ('молоко', 70);
INSERT INTO products (title, price) VALUES ('колбаса', 230);
INSERT INTO products (title, price) VALUES ('хлопья', 150);
INSERT INTO products (title, price) VALUES ('хлеб', 30);
INSERT INTO products (title, price) VALUES ('масло', 120);
INSERT INTO products (title, price) VALUES ('чипсики', 60);
INSERT INTO products (title, price) VALUES ('шоколад', 70);
INSERT INTO products (title, price) VALUES ('кетчуп', 150);
INSERT INTO products (title, price) VALUES ('яблоко', 70);

SELECT * FROM orders;
SELECT * FROM customers;
SELECT * FROM products;

-- 1) найдите имя и фамилию пользователей, у которых нет заказов

SELECT 
	t1.name,
	t1.lastname
FROM customers t1
INNER JOIN orders t2
ON t1.id = t2.customerid 
WHERE t2.product_count = 0;

-- 2) найдите название товаров, которые ни разу не заказывали

SELECT 
	title 
FROM products 
WHERE title NOT IN(
	SELECT
		t1.title
	FROM products t1
	INNER JOIN orders t2 
	ON t1.id = t2.productid 
);

-- 3) найдите название товаров, которые ни разу не заказывали онлайн

SELECT 
	t1.title
FROM products t1
INNER JOIN orders t2
ON t1.id = t2.productid 
WHERE t2.ordertype = 'direct';

-- 4) найдите имя и фамилию покупателя, который сделал самый дорогой заказ

SELECT 
	t1.name,
	t1.lastname,
	t2.most_expensive_order
FROM customers t1
INNER JOIN(
	SELECT
		t3.customerid,
		t3.product_count * t4.price AS most_expensive_order
	FROM orders t3
	INNER JOIN products t4
	ON t3.productid = t4.id 
	ORDER BY t4.price DESC 
	LIMIT 1
) t2
ON t1.id = t2.customerid;


