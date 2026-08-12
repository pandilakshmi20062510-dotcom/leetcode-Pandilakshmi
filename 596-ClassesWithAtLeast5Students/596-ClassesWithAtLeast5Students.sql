-- Last updated: 12/08/2026, 20:35:55
# Write your MySQL query statement below
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) > 4;