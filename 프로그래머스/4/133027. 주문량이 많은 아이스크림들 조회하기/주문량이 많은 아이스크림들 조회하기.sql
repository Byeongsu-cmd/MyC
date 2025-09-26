-- 코드를 입력하세요
SELECT h.FLAVOR as 'FLAVOR'
from FIRST_HALF h join JULY j on h.FLAVOR = j.FLAVOR
group by FLAVOR
order by sum(h.TOTAL_ORDER+j.TOTAL_ORDER) desc limit 3;