-- Last updated: 12/08/2026, 20:32:01
select product_id, year as first_year, quantity, price 
from sales where (product_id, year) in 
(
    select product_id, min(year)
    from sales
    group by product_id
)