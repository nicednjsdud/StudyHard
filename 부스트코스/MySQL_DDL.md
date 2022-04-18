데이터 정의어(DDL)
=================

## MySQL 데이터 타입 

![alt](https://cphinf.pstatic.net/mooc/20180131_89/1517386938999sf3SM_PNG/2_8_3_MySQL__-1.PNG?type=w760)

![alt](https://cphinf.pstatic.net/mooc/20180131_46/1517386952668I67cM_PNG/2_8_3_MySQL__-2.PNG?type=w760)

## 테이블 생성

```SQL

    create table 테이블명(
        필드명 1 타입 [NULL | NOT NULL][DEFAULT][AUTO_INCREMENT],
        필드명 2 타입 [NULL | NOT NULL][DEFAULT][AUTO_INCREMENT],
        ..........
        PRIMARY KEY (필드명)
    );

```

* 데이터 형 외에도 속성값의 빈 값 허용 여부는 NULL 또는 NOT NULL로 설정
* DEFAULT 키워드와 함께 입력하지 않았을 때의 초기값을 지정할 수 있다.
* 입력하지 않고 자동으로 1씩 증가하는 번호를 위한 AUTO_INCREMENT

## 테이블 생성 실습

* EMPLOYEE와 같은 구조를 가진 EMPLOYEE2 테이블을 생성하라

```SQL
    create table EMPLOYEE2(
        empno INTEGER(11) NOT NULL ,
        name VARCHAR(10),
        job VARCHAR(9),
        boss INTEGER(11),
        hiredate VARCHAR(12),
        salary DECIMAL(7,2),
        comm DECIMAL(7,2),
        deptno INTEGER(11),
        PRIMARY KEY(empno)
    );
```

![alt](https://cphinf.pstatic.net/mooc/20180131_144/1517387104021xnStV_PNG/2_8_3___.png?type=w760)

* book 테이블 생성

```SQL
    create table book(
        isbn varchar(10) primary key,
        title varchar(20) not null,
        price integer(20) not null,
        author varchar(10)

    );
```

## 테이블 수정(컬럼추가/ 삭제)

### 추가
```SQL
    alter table 테이블명
            add 필드명 타입 [null | not null][default][auto_increment];
```

* 예제 : employee2 테이블에 생일(birthdate)칼럼을 varchar(12)형식으로 추가

```sql
    alter table employee2
            add birthdate varchar(12);
```

![alt](https://cphinf.pstatic.net/mooc/20180131_255/15173873316052tWyD_PNG/2_8_3___%28%29.png?type=w760)

### 삭제

```SQL
    alter table 테이블명
            drop 필드명
```

### 변경

* 예제 : employee2 테이블의 부서번호(deptno)를 dept_no로 수정

```sql
    alter table employee2
        change deptno dept_no;
```

![alt](https://cphinf.pstatic.net/mooc/20180131_244/15173875762404JQ0U_PNG/2_8_3___%28%29.png?type=w760)

### 테이블 이름 변경

```sql
    alter table 테이블명 rename 변경이름
```

```sql
    alter table employee2 rename EMPLOYEE3;
```

![alt](https://cphinf.pstatic.net/mooc/20180131_40/1517387645188A8ER4_PNG/2_8_3____.png?type=w760)

### 테이블 삭제

```sql
    drop table 테이블이름;
```

* 제약 조건이 있는 경우에는 drop table 명령으로 테이블 삭제가 안될 수 있다.
* 그럴 경우는 테이블을 생성한 반대 순서로 삭제 해야함.
* foreign key

```sql
    drop table employee2;
```

![alt](https://cphinf.pstatic.net/mooc/20180131_181/15173877575931jc56_PNG/2_8_3___.png?type=w760)

## 생각해보기

* 칼럼의 길이가 10인데, 해당 칼럼에 값이 저장되어 있습니다.    
  이 때 칼럼의 길이를 5로 바꾼다면 어떤 일이 벌어질까요?

```sql
   - ERROR 1265 (01000): Data truncated for column 'name' at row 1
     데이터가 잘리기때문에 이런 에러가 발생 실행도 x
```

* 문자열을 저장하는 데이터 타입인 CHAR와 VARCHAR 차이점에 대해 알아보고  
  어떤 상황에서 CHAR 또는 VARCHAR 를 선택하는 것이 효율적인지 생각해봅시다.

```
    - varchar는 지정한 최대 길이 내에서 각 데이터 크기에 맞게 가변적으로 저장 공간을 준다.
    - char은 지정한 길이 만큼 공백을 채워 고정된 저장 공간을 할당한다.
    - 길이가 일정하면 char연산이 좋고 일정하지 않으면 varchar이 좋다.
```

* 문자열 데이터 타입에는 문자셋을 지정할 수 있습니다. 문자셋에 따라 해당 필드가 차지하는  
  공간 크기를 한번 계산해보자. (예: VARCHAR(10) CHARACTER SET UTF8; 은 몇 Byte   
  크기를 차지할까요? ASCII 일때는 또 몇 Byte 크기를 가질까요?

```
    - VARCHAR(10) CHARACTER SET UTF8;은 30바이트의 크기를 가지며   
      ASCII 일 때는 10바이트의 크기를 가집니다.
```
