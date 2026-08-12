-- Last updated: 12/08/2026, 20:30:45
# Write your MySQL query statement below

# Write your MySQL query statement below
select eu.unique_id, e.name from EmployeeUNI as eu 
right join Employees as e on eu.id = e.id;