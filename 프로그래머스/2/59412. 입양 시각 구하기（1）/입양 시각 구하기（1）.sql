-- 코드를 입력하세요
SELECT hour(DATETIME) as "HOUR",
count(*) as "COUNT"
from ANIMAL_OUTS
where hour(DATETIME) between "9:00" and "19:59"
group by hour(DATETIME)
order by hour(DATETIME)