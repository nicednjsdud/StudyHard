Spring JDBC
====================

## Spring JDBC

* JDBC 프로그래밍을 보면 반복되는 개발 요소가 있다.
* 이러한 반복적인 요소는 개발자를 지루하게 만든다.
* 개발하기 지루한 JDBC의 모든 저수준 세부사항을 스프링 프레임워크가 처리해준다.
* 개발자는 필요한 부분만 개발하면 된다.

## Spring JDBC - 개발자가 해야 할 일은?

![alt](https://cphinf.pstatic.net/mooc/20180205_176/1517797019977L6ygq_PNG/2_11_2_springJDBC.PNG?type=w760)

## Spring JDBC 패키지

* org.springframework.jdbc.core
* org.springframework.jdbc.datasource
* org.springframework.jdbc.object
* org.springframework.jdbc.support

## JdbcTemplate

* org.springframework.jdbc.core에서 가장 중요한 클래스
* 리소스 생성,해지를 처리해서 연결을 닫는 것을 잊어 발생하는 문제등을 피할수  
  있도록 한다.
* 스테이먼트(Statement)의 생성과 실행을 처리한다.
* SQL조회,업데이타,저장 프로시저 호출,ResultSet 반복호출 등을 실행한다.
* JDBC예외가 발생할 경우 org.springframework.dao 패키지에 정의되어 있는  
  일반적인 예외로 변환시킨다.

## JdbcTemplate외의 접근 방법

* NamedParameterJdbcTemplate
* SimpleJdbcTemplate
* SimpleJdbcInsert

## 생각 해보기

* JDBC 프로그래밍이 불편해서 이를 해결하기 위해서 등장한 기술에는 Spring   
  JDBC 외에도 다양한 기술들이 존재한다. 대표적으로 JPA,MyBatis가 그러한   
  기술이다. 문제를 해결하는 방법이 왜 여러가지가 존재할까요?

* 개발자를 위한 쫌더 간편하고 재사용성이 높은것을 추구하기 때문이다.

## DTO 란?

* DTO란 Data Teansfer Object의 약자이다.
* 계층간 데이터 교환을 위한 자바빈즈이다.
* 여기서의 계층이란 컨트럴뷰, 비지니스 계층, 퍼시스턴스 계층을 의미한다.
* 일반적으로 DTO는 로직을 가지고 있지않고, 순수한 데이터 객체이다.

## DAO 란?

* DAO란 Data Access Object의 약자로 데이터를 조회하거나 조작하는 기능을  
  전담하도록 만든 객체이다.
* 보통 데이터베이스를 조작하는 기능을 전담하는 목적으로 만들어진다.

## ConnectionPool 이란?

* DB연결은 비용이 많이든다.
* 커넥션 풀은 미리 커넥션을 여러 개 맺어둔다.
* 커넥션이 필요하면 커넥션 풀에게 빌려서 사용한 후 반납한다.

![alt](https://cphinf.pstatic.net/mooc/20180208_14/15180684447693OANG_JPEG/3_8_2_ConnectionPool.jpg?type=w760)

## DataSource 란?

* DataSource는 커넥션 풀을 관리하는 목적으로 사용되는 객체이다.
* DataSource를 이요해 커넥션을 얻어오고 반납하는 등의 작업을 수행한다.

## Spring JDBC를 이용한 DAO작성 실습

![alt](https://cphinf.pstatic.net/mooc/20180208_103/1518068520531pRbvK_PNG/3_8_2_Spring_JDBC__DAO_.png?type=w760)

* ApplicationConfig.java

```java
package kr.or.connect.daoexam.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DBConfig.class})
public class ApplicationConfig {
	
}

```

* DBConfig.java

```java
@Configuration
@EnableTransactionManagement
public class DBConfig {
	private String driverClassName="com.mysql.cj.jdbc.Driver";
	private String url= "jdbc:mysql://localhost:3306/connectdb?useUnicode=true&characterEncoding=utf8";
	
	private String username="connectuser";
	private String password="connect123!@#";
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
		
	}
```

* DataSourceTest.java

```java
import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.daoexam.config.ApplicationConfig;
import kr.or.connect.daoexam.config.DBConfig;

public class DataSourceTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext
        (ApplicationConfig.class);
		DataSource ds = ac.getBean(DataSource.class);
		Connection conn = null;
		try {
			conn = ds.getConnection();
			if(conn !=null) {
				System.out.println("접속 성공");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
```

![alt](/assets/image/1.png)

## Select ALL 실습

* Role.java

```java
package kr.or.connect.daoexam.dto;

public class Role {
	private int roleId;
	private String description;
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", description=" + description + "]";
	}
	
}
```

* RoleDaoSqls.java

```java
package kr.or.connect.daoexam.dao;

public class RoleDaoSqls {
	public static final String SELECT_ALL = "SELECT role_id, description FROM role order by role_id";
}
```

* RoleDao.java

```java
package kr.or.connect.daoexam.dao;

import static kr.or.connect.daoexam.dao.RoleDaoSqls.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import kr.or.connect.daoexam.dto.Role;
@Repository
public class RoleDao {
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertAction;
	private RowMapper<Role> rowMapper = BeanPropertyRowMapper.newInstance(Role.class);

	public RoleDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insertAction = new SimpleJdbcInsert(dataSource)
                .withTableName("role");
	}
	
	public List<Role> selectAll(){
		return jdbc.query(SELECT_ALL,EmptySqlParameterSource.INSTANCE,rowMapper);
	}

}
```

* ApplicationConfig.java 추가

```java
@ComponentScan(basePackages = { "kr.or.connect.daoexam.dao" })
```

* SelectAllTest.java

```java
package kr.or.connect.daoexam.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.daoexam.config.ApplicationConfig;
import kr.or.connect.daoexam.dao.RoleDao;
import kr.or.connect.daoexam.dto.Role;

public class SelectAllTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class); 
		
		RoleDao roleDao =ac.getBean(RoleDao.class);

		List<Role> list = roleDao.selectAll();
		
		for(Role role: list) {
			System.out.println(role);
		}

	}

}
```

* result

![alt](/assets/image/2.png)