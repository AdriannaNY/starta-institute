USE hr;
SELECT 
	salary 
FROM employees
WHERE first_name = 'Lex'
	AND last_name = 'De Haan';

SELECT 
	first_name,
    last_name
FROM employees
WHERE job_id = 'FI_ACCOUNT'
	AND salary < 8000;
    
SELECT 
    last_name
FROM employees
WHERE last_name like '%kk%' 
	OR last_name like '%ll%';
    
SELECT 
	first_name,
    last_name
FROM employees
WHERE commission_pct IS NULL;

SELECT 
	first_name,
    last_name
FROM employees
WHERE department_id != 80
	AND department_id != 110;
    
SELECT 
	first_name,
    last_name
FROM employees
WHERE salary >= 5000
	AND salary <= 7000;


    
    