	USE hr;

	SELECT * FROM employees;
	SELECT * FROM departments;

	-- 1 уровень сложности: используя схему HR решите ряд задач
	-- 1. Найти количество сотрудников в каждом департаменте. Вывести departmentid и employeescnt

	SELECT 
		department_id,
		COUNT(employee_id) AS employees_cnt
	FROM employees
	WHERE department_id IS NOT NULL 
	GROUP BY department_id;
	
	-- 2. Найти количество сотрудников в каждом департаменте. Вывести departmentname и employeescnt

	SELECT 
		t1.department_name,
		t2.employees_cnt
	FROM departments t1
	INNER JOIN (
		SELECT 
			department_id,
			COUNT(employee_id) AS employees_cnt
		FROM employees
		WHERE department_id IS NOT NULL 
		GROUP BY department_id 
	) t2
	ON t1.department_id = t2.department_id;

	-- 3. Найти количество сотрудников у каждого менеджера. Вывести managerid и employeescnt

	SELECT 
		manager_id,
		COUNT(employee_id) AS employees_cnt
	FROM employees
	WHERE manager_id IS NOT NULL 
	GROUP BY manager_id;

	-- 4. Найти количество сотрудников у каждого менеджера. Вывести firstname,  lastname и employees_cnt
	
	SELECT 
		t1.first_name,
		t1.last_name,
		t2.employees_cnt
	FROM employees t1
	INNER JOIN(
		SELECT 
			manager_id,
			COUNT(employee_id) AS employees_cnt
		FROM employees
		WHERE manager_id IS NOT NULL 
		GROUP BY manager_id
	) t2
	ON t1.employee_id = t2.manager_id;

	-- 5. Найти максимальную зарплату в каждом департаменте. Вывести departmentid и maxsalary

	SELECT 
		department_id,
		MAX(salary) AS max_salary
	FROM employees
	WHERE department_id IS NOT NULL 
	GROUP BY department_id;

	-- 6. Найти сотрудников, у которых наибольшая зарплата в их департаменте

	SELECT 
		t1.first_name,
		t1.last_name,
		t2.max_salary
	FROM employees t1
	INNER JOIN (
		SELECT 
			department_id,
			MAX(salary) AS max_salary
		FROM employees
		WHERE department_id IS NOT NULL 
		GROUP BY department_id
	) t2
	ON t1.department_id = t2.department_id
	AND t1.salary = t2.max_salary;