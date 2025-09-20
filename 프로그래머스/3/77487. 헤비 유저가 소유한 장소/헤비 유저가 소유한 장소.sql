-- 코드를 입력하세요
SELECT p.ID,
p.Name,
p.HOST_ID
from PLACES p
where p.HOST_ID in (
    select HOST_ID
    from places
    group by HOST_ID
    having count(*) >= 2
)
order by p.ID;