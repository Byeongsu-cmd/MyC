-- 코드를 입력하세요
SELECT 
    c.CAR_ID,
    c.CAR_TYPE,
    round(DAILY_FEE * 30 *(1 - DISCOUNT_RATE / 100), 0) as FEE
from CAR_RENTAL_COMPANY_CAR c
    inner join CAR_RENTAL_COMPANY_DISCOUNT_PLAN p
    on c.CAR_TYPE = p.CAR_TYPE and p.DURATION_TYPE = '30일 이상'
where c.CAR_TYPE in ('세단', 'SUV')
    and c.CAR_ID not in (
        select CAR_ID
        from CAR_RENTAL_COMPANY_RENTAL_HISTORY
        where not (
            END_DATE < '2022-11-01' or
            START_DATE > '2022-11-30'
        )
    )
    and round(DAILY_FEE * 30 *(1 - DISCOUNT_RATE / 100), 0) between 500000 and 1999999
order by 
    FEE desc,
    c.CAR_TYPE,
    c.CAR_ID desc;