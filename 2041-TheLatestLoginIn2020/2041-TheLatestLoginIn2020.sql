-- Last updated: 12/08/2026, 20:29:22
# Write your MySQL query statement below
select user_id,
max(time_stamp) as last_stamp
from logins 
where year(time_stamp)=2020
group by user_id;