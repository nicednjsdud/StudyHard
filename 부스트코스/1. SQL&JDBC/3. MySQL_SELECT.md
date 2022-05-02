SELECT 구문
=============

## CAST 형변환

* CAST 함수는 type을 변경(지정)하는데 유용하다

* CAST 함수의 사용법

```SQL
    CAST (expression AS type)또는
    CONVERT(expression, type)
    CONVERT(expr USING transcoding_name)
```

## 그룹 함수

![alt](https://cphinf.pstatic.net/mooc/20180131_87/151738015308653Cmb_PNG/2_8_2_select_%28%29.PNG?type=w760)

* 예제 : employee 테이블에서 부서번호가 30인 직원의 급여 평균과 총합계 출력

```SQL
    select avg(salary),sum(salary) from employee where deptno =30;
```

![alt](https://cphinf.pstatic.net/mooc/20180131_263/1517380309278sUNR3_PNG/2_8_2_select__%28%29.png?type=w760)

* 예제 : employee 테이블에서 부서별 직원의 부서번호, 급여 평균과 총합계를 출력

```SQL
    select deptno,avg(salary),sum(salary) from employee group by deptno;
```

![alt](https://cphinf.pstatic.net/mooc/20180131_9/1517380488029v1nbz_PNG/2_8_2_select__%28_groupby_%29.png?type=w760)

