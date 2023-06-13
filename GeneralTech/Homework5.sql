CREATE DATABASE courses;
USE courses;

CREATE TABLE Students(
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    age INTEGER
    );
    
CREATE TABLE Teachers(
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    age INTEGER
    );
    
CREATE TABLE Competencies(
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(128) NOT NULL
    );
    
CREATE TABLE Teachers2Competencies(
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
    teacher_id INTEGER,
    competencies_id INTEGER
    );
    
CREATE TABLE Courses(
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
    teacher_id INTEGER,
    title VARCHAR(128) NOT NULL,
    headman_id INTEGER
    );
    
CREATE TABLE Students2Courses(
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
    student_id INTEGER,
    course_id INTEGER
    );
    
INSERT INTO Students (name, age) VALUES
	('Анатолий', 29),
    ('Олег', 25),
    ('Семен', 27),
    ('Олеся', 28),
    ('Ольга', 31),
    ('Иван', 22);
SELECT * FROM Students;

INSERT INTO Teachers (name, age) VALUES
	('Петр', 39),
    ('Максим', 35),
    ('Антон', 37),
    ('Всеволод', 38),
    ('Егор', 41),
    ('Светлана', 32);
SELECT * FROM Teachers;

INSERT INTO Competencies (title) VALUES
	('Математика'),
    ('Информатика'),
    ('Программирование'),
    ('Графика');
SELECT * FROM Competencies;

INSERT INTO Teachers2Competencies (teacher_id, competencies_id) VALUES
	(1, 1), 
    (2, 1), 
    (2, 3), 
    (3, 2), 
    (4, 1), 
    (5, 3);
SELECT * FROM Teachers2Competencies;

INSERT INTO Courses (teacher_id, title, headman_id) VALUES
	(1, 'Алгебра логики', 2),
    (2, 'Математическая статистика', 3),
    (4, 'Высшая математика', 5),
    (5, 'Javascript', 1),
    (5, 'Базовый Python', 1);
SELECT * FROM Courses;

INSERT INTO Students2Courses (student_id, course_id) VALUES
	(1, 1),
    (2, 1),
    (3, 2),
    (3, 3),
    (4, 5);
SELECT * FROM Students2Courses;
    
-- ЗАДАЧИ

-- 1) Вывести имена студентов и курсы, которые они проходят

SELECT
	t1.name
FROM Students t1
INNER JOIN Students2Courses t2
ON t1.id = t2.student_id

UNION ALL

SELECT
	t1.title
FROM Courses t1
INNER JOIN Students2Courses t2
ON t1.id = t2.course_id

-- 2) Вывести имена всех преподавателей с их компетенциями

SELECT
	t1.name
FROM Teachers t1
INNER JOIN Teachers2Competencies t2
ON t1.id = t2.teacher_id

UNION ALL

SELECT
	t1.title
FROM Competencies t1
INNER JOIN Teachers2Competencies t2
ON t1.id = t2.competencies_id

-- 3) Найти преподавателя, у которого нет компетенций

SELECT 
	name 
FROM Teachers
WHERE name NOT IN(
SELECT
	t1.name
FROM Teachers t1
INNER JOIN Teachers2Competencies t2
ON t1.id = t2.teacher_id
);

-- 4) Найти имена студентов, которые не проходят ни один курс

SELECT 
	name 
FROM Students
WHERE name NOT IN(
SELECT
	t1.name
FROM Students t1
INNER JOIN Students2Courses t2
ON t1.id = t2.student_id
);

-- 5) Найти курсы, которые не посещает ни один студент

SELECT 
	title 
FROM Courses
WHERE title NOT IN(
SELECT
	t1.title
FROM Courses t1
INNER JOIN Students2Courses t2
ON t1.id = t2.course_id
);

-- 6) Найти компетенции, которых нет ни у одного преподавателя

SELECT 
	title 
FROM Competencies 
WHERE title NOT IN(
SELECT
	t1.title
FROM Competencies t1
INNER JOIN Teachers2Competencies t2
ON t1.id = t2.competencies_id
);

-- 7) Вывести название курса и имя старосты

SELECT
	t1.title,
	t2.name
FROM Courses t1
INNER JOIN Students t2
ON t1.headman_id = t2.id;


-- 8) Вывести имя студента и имена старост, которые есть на курсах, которые он проходит







