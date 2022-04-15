## 1. 데이터 입력 (INSERT문)

```
INSERT INTO 테이블명(필드1, 필드2, 필드3,필드4,...)
    VALUES (필드1의 값, 필드2의 값, 필드3의 값, 필드4의 값,...)

INSERT INTO 테이블명
    VALUES (필드1의 값, 필드2의 값, 필드3의 값, 필드4의 값,...)
```

* 필드명을 지정해주는 방식은 **디폴트 값이 세팅되는 필드**는 생략할 수 있다.
* 필드명을 지정해주는 방식은 추 후 , 필드가 추가/변경/수정 되는 변경에 유연하게 대처 가능
* 필드명을 생략했을 경우에는 모든 필드 값을 반드시 입력해야 한다.

#### 데이터 입력 실습 (INSERT 문)

* ROLE테이블에 role_id는 200,description에는 'CEO'로 한건의 데이터를 저장하시오.

```
    insert into ROLE(role_id,description) values (200,'CEO');
```

### 데이터 입력(UPDATE문)

```
UPDATE 테이블명
    SET 필드1 =필드1의 값, 필드2=필드2의값, 필드3=필드3의 값,...
WHERE 조건식    
```

* 조건식을 통해 특정 row만 변경할 수 있다.
* 조건식을 주지 않으면 전체 로우가 영향을 미치니 조심해서 사용한다.

#### 데이터 입력 실습 (UPDATE 문)
* ROLE 테이블에 role_id가 200일 경우 description을 'CTO'로 수정하시오.

```
    UPDATE ROLE
        SET description = 'CTO'
        where role_id = 200;
```

### 데이터 삭제 (DELETE문)

```
    DELETE
        FROM 테이블명
    WHERE 조건식
```

* 조건식을 통해 특정 row만 삭제할 수 있다.
* 조건식을 주지 않으면 전체 로우가 영향을 미치니 조심해서 사용

#### 데이터 입력 실습 (DELETE 문)
* ROLE테이블에서 role_id가 200번인사람 삭제

```
    delete from ROLE where role_id = 200;
```

### 생각해보기

* 사원의 이름과 그사원이 속한 부서명을 구하려면 어떻게 해야하나요?

```
    sql에서 join은 cross join, inner join, outer join이 있는데 
    cross join은 테이블 a,b 전부를 select 함 
    inner join은 테이블 a,b에 특정 데이터가 일치할 경우만 select하며 from절과 where 사용가능
    outer join은 inner join에서 일치하지 않은 데이터까지 select한다.
```

## 테이블(table)의 구성 요소

* 테이블 : RDBMS의 기본적 저장구조. 한개 이상의 column과 0개 이상의 row 구성
* 열 : 테이블 상에서의 단일 종류의 데이터를 나타냄 특정 데이터 타입 및 크기를 가지고 있음
* 행 : Column들의 값의 조합, 레코드라고 불린다.  
       기본키(PK)에 의해 구분된다. 기본키는 중복을 허용하지 않으며 없어서는 안된다.

* Field : Row 와 Column의 교차점으로 Field는 데이터를 포함할 수 있고 없을 때는 NULL 값을  
  가지고 있다고 한다.

