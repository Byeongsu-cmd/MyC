-- 코드를 입력하세요
SELECT count(distinct NAME) as "c.name"
from ANIMAL_INS
where NAME is not null;