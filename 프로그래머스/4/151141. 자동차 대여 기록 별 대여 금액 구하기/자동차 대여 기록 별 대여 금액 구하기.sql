-- 코드를 입력하세요
SELECT h.HISTORY_ID,
round(
    (datediff(h.END_DATE, h.START_DATE) + 1) * c.DAILY_FEE * (1 - ifNull(DISCOUNT_RATE,0) / 100), 0) as 'FEE'
from CAR_RENTAL_COMPANY_RENTAL_HISTORY h 
inner join CAR_RENTAL_COMPANY_CAR c 
    on h.CAR_ID = c.CAR_ID
left Join CAR_RENTAL_COMPANY_DISCOUNT_PLAN p 
    on c.CAR_TYPE = p.CAR_TYPE
    and (
        (DATEDIFF(h.end_date, h.start_date) + 1 >= 90 and p.duration_type = '90일 이상') or
        (DATEDIFF(h.end_date, h.start_date) + 1 >= 30 and DATEDIFF(h.end_date, h.start_date) + 1 < 90 and p.duration_type = '30일 이상') or
        (DATEDIFF(h.end_date, h.start_date) + 1 >= 7 and DATEDIFF(h.end_date, h.start_date) + 1 < 30 and p.duration_type = '7일 이상')
        )
where c.CAR_TYPE = '트럭'
order by FEE desc, h.HISTORY_ID desc;