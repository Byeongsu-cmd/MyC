-- 코드를 입력하세요
SELECT MONTH(START_DATE) as 'MONTH',
CAR_ID,
COUNT(*) as 'RECORDS'
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where CAR_ID IN (SELECT CAR_ID
                from CAR_RENTAL_COMPANY_RENTAL_HISTORY
                where START_DATE >= '2022-08-01' and START_DATE <= '2022-10-31'
                group by CAR_ID
                having count(*)>=5 and START_DATE between '2022-08-01' and '2022-10-31')
group by MONTH(START_DATE), CAR_ID having count(*) <> 0
order by MONTH, CAR_ID desc;