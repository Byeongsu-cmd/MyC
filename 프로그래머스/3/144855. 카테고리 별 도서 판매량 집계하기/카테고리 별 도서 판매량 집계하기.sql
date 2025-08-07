-- 코드를 입력하세요
SELECT b.CATEGORY as "CATEGORY",
sum(bs.SALES) as "TOTAL_SALES"
from BOOK as b left join BOOK_SALES as bs ON b.BOOK_ID = bs.BOOK_ID 
where date_format(bs.SALES_DATE,"%Y-%m") = "2022-01"
group by CATEGORY
order by CATEGORY;