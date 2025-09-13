-- 코드를 입력하세요
SELECT a.APNT_NO,
p.PT_NAME,
p.PT_NO,
a.MCDP_CD,
d.DR_NAME,
a.APNT_YMD
from PATIENT p inner join APPOINTMENT a on p.PT_NO = a.PT_NO 
inner join DOCTOR d on a.MDDR_ID = d.DR_ID
where date(a.APNT_YMD) = '2022-04-13' and a.APNT_CNCL_YN = 'N' and a.MCDP_CD = 'CS'
order by APNT_YMD