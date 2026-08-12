-- Last updated: 12/08/2026, 20:35:34
# Write your MySQL query statement below
UPDATE Salary 
SET sex = (CASE WHEN sex = 'f' THEN 'm' ELSE 'f' END) 