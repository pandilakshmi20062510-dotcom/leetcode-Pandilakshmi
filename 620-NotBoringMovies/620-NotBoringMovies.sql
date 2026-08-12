-- Last updated: 12/08/2026, 20:35:37
# Write your MySQL query statement below
# Write your MySQL query statement below

SELECT *
FROM cinema c
WHERE c.id % 2 =1 
    AND 
    c.description != 'boring'
ORDER BY c.rating DESC;