-- 코드를 입력하세요
SELECT year(o.SALES_DATE) as 'YEAR',
month(o.SALES_DATE) as 'MONTH',
u.GENDER as 'GENDER',
count(distinct(u.USER_ID)) as 'USERS'
from USER_INFO u inner join ONLINE_SALE o on u.USER_ID = o.USER_ID
where GENDER is not null
group by YEAR, MONTH, GENDER
order by YEAR, MONTH, GENDER