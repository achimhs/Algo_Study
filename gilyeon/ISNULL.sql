-- 이름이 없는 동물의 아이디
SELECT ANIMAL_ID
from ANIMAL_INS
where NAME IS NULL
ORDER BY ANIMAL_ID ASC;

-- 이름이 있는 동물의 아이디
SELECT ANIMAL_ID
from ANIMAL_INS
where NAME IS NOT NULL
ORDER BY ANIMAL_ID ASC;

-- NULL 처리하기 * IFNULL(컬럼명, NULL시 값)
SELECT ANIMAL_TYPE, IFNULL(NAME, 'No name') as NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS;
