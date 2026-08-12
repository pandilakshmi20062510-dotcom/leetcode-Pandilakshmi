-- Last updated: 12/08/2026, 20:35:42
# Write your MySQL query statement below
# Write your MySQL query statement below

SELECT *, IF(x+y>z and y+z>x and z+x>y, "Yes", "No") as triangle FROM Triangle