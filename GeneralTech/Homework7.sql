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

-- 1) вывести название продукта, который чаще всего встречается в заказах
-- Solution 1
SELECT 
	products.title,
	COUNT(*) AS cnt
FROM orders
JOIN products 
ON products.id = orders.productid
GROUP BY productid
ORDER BY cnt DESC 
LIMIT 1

-- Solution 2
SELECT 
	title
FROM products 
WHERE id = (
	SELECT
		productid
	FROM orders
	GROUP BY productid
	HAVING COUNT(*)  = (
		SELECT 
			MAX(cnt) AS max_cnt
		FROM (
		SELECT
			COUNT(*) AS cnt 
		FROM orders 
		GROUP BY productid 
		) t1
	)
)


-- 2) вывести название продукта, который покупают чаще всего (нужно посчетать общее количество купленных единиц)
SELECT 
	t1.title,
	t2.total_order
FROM products t1
INNER JOIN (
	SELECT 
		t1.productid,
		SUM(t1.product_count) AS total_order
	FROM orders t1
	INNER JOIN products t2
	ON t1.productid = t2.id
	GROUP BY productid
	ORDER BY total_order DESC
	LIMIT 1
	) t2 
ON t1.id = t2.productid;


-- 3) вывести общую выручку магазина. Сумма всех купленных единиц товара.
	SELECT 
		SUM(t1.product_count * t2.price) AS total_income
	FROM orders t1
	INNER JOIN products t2
	ON t1.productid = t2.id
	
-- 4) определить сумму выручки за онлайн продажи (online) и за продажи в магазине (direct)
-- online
SELECT 
	SUM(t1.product_count * t2.price) AS online_income
FROM orders t1
INNER JOIN products t2
ON t1.productid = t2.id
AND t1.ordertype = 'online'

-- direct
SELECT 
	SUM(t1.product_count * t2.price) AS online_income
FROM orders t1
INNER JOIN products t2
ON t1.productid = t2.id
AND t1.ordertype = 'direct'

