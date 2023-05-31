USE hr;
USE air;

/*  Info: https://www.w3schools.com/mysql/mysql_min_max.asp
	The MAX() function returns the largest value of the selected column.  */
SELECT
department_id,
MAX(
CASE
    WHEN salary > 10000 
  THEN 1 
    ELSE 0 
END
) AS has_high_salary
FROM employees
GROUP BY department_id;

/*  Info: https://www.w3schools.com/mysql/mysql_min_max.asp
    The MIN() function returns the smallest value of the selected column.  */
SELECT
department_id,
MIN(
CASE
    WHEN salary > 10000 
  THEN 1 
    ELSE 0 
END
) AS has_high_salary
FROM employees
GROUP BY department_id;

select * from employees;

SELECT 
	last_name
FROM employees
ORDER BY last_name;

 SELECT 
	first_name,
    last_name,
    salary
FROM employees
ORDER BY salary DESC;

/*   Info: https://www.w3schools.com/mysql/mysql_in.asp
	 The IN operator allows you to specify multiple values in a WHERE clause.
	 The IN operator is a shorthand for multiple OR conditions.   */
SELECT 
    last_name
FROM employees  
WHERE department_id IN (60, 90, 110)
ORDER BY last_name;

SELECT 
    last_name,
    first_name,
    salary
FROM employees  
WHERE job_id LIKE 'ST_CLERK'
ORDER BY salary DESC;
    
SELECT 
    first_name,
    last_name
FROM employees  
WHERE first_name LIKE 'D%'
ORDER BY last_name;

/* ----------------------------------------------------------------- */
SELECT 
	id,
	service_class,
    price,
     CASE
		WHEN price BETWEEN 10000 AND 11000
			THEN 'Economy'
		WHEN price BETWEEN 20000 AND 30000
			THEN 'PremiumEconomy'
		WHEN price > 100000
			THEN 'Business'
 		ELSE '-'
 	END AS result_ticket_category
FROM tickets;

SELECT 
	side_number,
	production_year,
     CASE
		WHEN production_year < 2000 AND haut < 10000
			THEN 'Old'
		WHEN (production_year BETWEEN 2000 AND 2010) AND haut < 10000
			THEN 'Mid'
		WHEN production_year > 2010 AND haut < 10000
			THEN 'New'
		ELSE '-'
 	END AS result_age_class
FROM airliners
ORDER BY production_year;

SELECT 
	id,
	trip_code,
     CASE
		WHEN id like 'LL4S1G8PQW'
			THEN '15% discount'
		WHEN id like '0SE4S0HRRU' 
			THEN '10% discount '
		WHEN id like 'JQF04Q8I9G'
			THEN '20% discount '
 		ELSE '-'
 	END AS result_new_price
FROM  trips;

/* ----------------------------------------------------------------- */

CREATE TABLE goods(
id integer primary key auto_increment,
title varchar(128),
price integer DEFAULT 0,
discount decimal(2,1)
);

INSERT INTO goods(title, price, discount) values
('байк', 100000, 0.2),
('телефон', 1000, 0.1),
('самокат', default, 0.2),
('наушники', 200, 0.3),
('ролики', 350, 0.5);

SELECT * FROM goods;
SET SQL_SAFE_UPDATES = 0;
UPDATE goods
SET price = 1000
WHERE title = 'самокат';

truncate table goods;

CREATE TABLE new_table AS
SELECT * FROM goods
WHERE price < 100000;

SELECT * FROM new_table;

truncate table new_table;




