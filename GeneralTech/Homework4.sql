CREATE DATABASE learn;
USE  learn; 

-- 1. Создайте таблицу goods (id, title, quantity)
-- Добавте данные ('велосипед', 4), ('лыжи',  5), (коньки',  7), ('скейт', 2).

 CREATE TABLE goods (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(128),
	quantity INTEGER CHECK(quantity BETWEEN 0 AND 100)
 );

INSERT INTO goods (title, quantity) VALUES ("Велосипед", 3);
INSERT INTO goods (title, quantity) VALUES ("Лыжи", 10);
INSERT INTO goods (title, quantity) VALUES ("Скейт", 2);
INSERT INTO goods (title, quantity) VALUES ("Коньки", 5);

SELECT * FROM goods;

-- 2. Добавьте поле price (integer) со значением по умолчанию 0
-- Проверьте содержимое таблицы

ALTER TABLE goods
ADD COLUMN price INTEGER DEFAULT 0;
SELECT * FROM goods;

 -- 3. Измените тип у price на numeric (перед изменением очситите поле "... set price = null")

UPDATE goods
SET price = null;
SELECT * FROM goods;
ALTER TABLE goods
MODIFY price NUMERIC(8,2);

-- Измените тип обратно на integer
ALTER TABLE goods
MODIFY price INTEGER;

-- 4. Переименуйте поле на item_price

ALTER TABLE goods
CHANGE price item_price INTEGER;
SELECT * FROM goods;
-- Удалите это поле 
ALTER TABLE goods
DROP COLUMN item_price;
SELECT * FROM goods;

-- 1. Создать таблицу students с полями:
-- name (не null)
-- lastname (не null)
-- avg_mark (от 0 до 5)
-- gender varchar(128) (или “M” или “F”)

CREATE TABLE students (
	name VARCHAR(128) NOT NULL,
	lastname VARCHAR(128) NOT NULL,
    avg_mark NUMERIC(2,1) CHECK (avg_mark BETWEEN 0 AND 5),
    gender VARCHAR(128) CHECK (gender in ('M', 'F'))
);
SELECT * FROM students;

-- 2. Добавить 5 записей студентов
-- Олег Петров 4.3 M
-- Семен Степанов 3.1 M 
-- Ольга Семенова 4.7 F 
-- Игорь Романов 3.1 M 
-- Ирина Иванова 2.2 F

INSERT INTO students (name, lastname, avg_mark, gender) VALUES
	('Олег', 'Петров', 4.3, 'M'),
	('Семен', 'Степанов', 3.1, 'M'),
	('Ольга', 'Семеновна', 4.7, 'F'),
	('Игорь', 'Романов', 3.1, 'M'),
	('Ирина', 'Иванова', 2.2, 'F');

-- 3. Добавить поле id integer primary key auto_increment

ALTER TABLE students
ADD COLUMN id INTEGER PRIMARY KEY AUTO_INCREMENT;
SELECT * FROM students;

-- 4. Поменять тип у gender на char(1)

ALTER TABLE students
MODIFY gender CHAR(1);

-- 5. переименовать поле name на firstname

ALTER TABLE students
CHANGE name firstname VARCHAR(128);

-- 6.
-- - найти учеников, у которых оценка больше 4
-- - найти учеников, у которых не входит в диапазон от 3 до 4
-- - найти учеников, у которых имя начинается на И
-- - найти учеников, у которых оценка 2.2 или 3.1 или 4.7   

SELECT * FROM students WHERE avg_mark > 4;
SELECT * FROM students WHERE avg_mark NOT BETWEEN 3 AND 4;
SELECT * FROM students WHERE firstname LIKE 'И%';
SELECT * FROM students WHERE avg_mark IN(2.2, 3.1, 4.7);

-- 7.Создать представление, которое содержит всех мужчин

CREATE VIEW v_students_m AS SELECT * FROM students WHERE gender = 'M';
SELECT * FROM v_students_m;

-- 8. Создать представление, которое содержит всех женщин

CREATE VIEW v_students_f AS SELECT * FROM students WHERE gender = 'F';
SELECT * FROM v_students_f;

-- 9.  Поменяйте у Олега Петрова фамилию на Сидоров

SELECT * FROM students;
UPDATE students
SET lastname = 'Сидоров'
WHERE firstname = 'Олег' AND lastname = 'Петров';
SELECT * FROM students;

-- 10. Увеличить всем учащимся оценку в 10 раз

ALTER TABLE students
MODIFY avg_mark DECIMAL(3, 1);

UPDATE students
SET avg_mark = avg_mark * 10;
SELECT * FROM students;

-- 11.  Для всех учеников, у которых оценка не больше 31 увеличить на 10

UPDATE students
SET avg_mark = avg_mark + 10
WHERE avg_mark < 31;

-- 12. Найти набор уникальных оценок

SELECT DISTINCT
	avg_mark 
FROM students;