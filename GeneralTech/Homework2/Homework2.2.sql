USE air;

SELECT 
	model_name,
     CASE
		WHEN haut BETWEEN 1000 AND 2500
			THEN 'short-haul'
		WHEN haut BETWEEN 2500 AND 6000
			THEN 'medium-haul'
		WHEN haut > 6000
			THEN 'long-haut'
 		ELSE 'UNDEFINED'
 	END AS category
FROM airliners;

