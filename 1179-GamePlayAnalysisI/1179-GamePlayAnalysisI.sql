-- Last updated: 12/08/2026, 20:31:53
select player_id,min(event_date) as first_login
from Activity
group by player_id