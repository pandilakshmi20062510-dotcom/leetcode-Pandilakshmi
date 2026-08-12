-- Last updated: 12/08/2026, 20:32:05
# Write your MySQL query statement below
SELECT 
    p.product_name, 
    s.year, 
    s.price
FROM 
    Sales s
JOIN 
    Product p ON s.product_id = p.product_id;