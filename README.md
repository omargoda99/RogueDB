# RogueDB
Rogue planets are starless planets, scientifically adrift in the cosmic dark alone




SQL Parser (DML) TEST CASE :

```sql
WITH RECURSIVE employee_hierarchy AS (
    SELECT id, name, manager_id, 1 AS level
    FROM employees
    WHERE manager_id IS NULL

    UNION ALL

    SELECT e.id, e.name, e.manager_id, eh.level + 1
    FROM employees e
    JOIN employee_hierarchy eh ON e.manager_id = eh.id
)
SELECT 
    e.name AS employee_name,
    m.name AS manager_name,
    eh.level,
    AVG(s.salary) OVER (
        PARTITION BY e.department_id 
        ORDER BY s.effective_date 
        ROWS BETWEEN 3 PRECEDING AND CURRENT ROW
    ) AS avg_salary,
    RANK() OVER (
        PARTITION BY e.department_id 
        ORDER BY s.salary DESC
    ) AS salary_rank,
    
    CASE 
        WHEN s.salary >= 100000 THEN 'High'
        WHEN s.salary >= 50000 THEN 'Medium'
        ELSE 'Low'
    END AS salary_category

FROM employee_hierarchy eh
JOIN employees e ON eh.id = e.id
LEFT JOIN employees m ON eh.manager_id = m.id
JOIN salaries s ON e.id = s.employee_id
WHERE e.active = TRUE
GROUP BY 
    e.id, e.name, m.name, eh.level, s.salary, e.department_id, s.effective_date
HAVING COUNT(s.id) > 1
ORDER BY eh.level, e.name
LIMIT 100 OFFSET 10
FOR UPDATE SKIP LOCKED;
```



