-- 코드를 입력하세요
with recursive full_hours as (
select 0 as hour
union all
select hour + 1 from full_hours where hour < 23
)
select h.hour,
count(a.ANIMAL_ID) as count
from full_hours h left join ANIMAL_OUTS a on h.hour = hour(a.DATETIME)
group by h.hour
order by h.hour