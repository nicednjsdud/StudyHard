Spring
========

## Insert, Update

* RoleDaoSqls.java 추가

```java
public static final String UPDATE = "UPDATE role SET description = 
                                    :description WHERE ROLE_ID = :roleId";
```

* RoleDao.java

```java
package kr.or.connect.daoexam.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.EmptySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import kr.or.connect.daoexam.dto.Role;
import static kr.or.connect.daoexam.dao.RoleDaoSqls.*;

@Repository
public class RoleDao {
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertAction;
	private RowMapper<Role> rowMapper= BeanPropertyRowMapper.newInstance(Role.class);
	
	public RoleDao(DataSource dataSource) {
		this.jdbc=new NamedParameterJdbcTemplate(dataSource);
		this.insertAction = new SimpleJdbcInsert(dataSource).withTableName("role");
	}
	
	public List<Role> selectAll(){
		return jdbc.query(SELECT_ALL,EmptySqlParameterSource.INSTANCE,rowMapper);
	}
	public int insert(Role role) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(role);
		return insertAction.execute(params);
	}
	public int update(Role role) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(role);
		return jdbc.update(UPDATE, params);
	}
}

```

* JDBCTest.java

```java
package kr.or.connect.daoexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.daoexam.config.ApplicationConfig;
import kr.or.connect.daoexam.dao.RoleDao;
import kr.or.connect.daoexam.dto.Role;

public class JDBCTest {
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		RoleDao dao = ac.getBean(RoleDao.class);
		
		Role role = new Role();
		
		role.setRoleId(200);
		role.setDescription("PROGRAMMER");
		
//		int count = dao.insert(role);
//		System.out.println(count + "건 입력하였습니다.");
		
		int count = dao.update(role);
		System.out.println(count + "건 수정하였습니다.");
	}
}

```

![alt](/assets/image/3.png)

## SELECT, DELETE

* RoleDaoSqls.java 추가

```java
public static final String SELECT_BY_ROLE_ID = "SELECT role_id, description 
                                                    FROM role where role_id = :roleId";
public static final String DELETE_BY_ROLE_ID = "DELETE FROM role WHERE role_id = :roleId";
```

* RoleDao.java

```java
	public int deleteById(Integer id) {
		Map<String, ?> params = Collections.singletonMap("roleId", id);
		return jdbc.update(DELETE_BY_ROLE_ID, params);
	}
	
	public Role selectById(Integer id) {
		try {
			Map<String, ?> params = Collections.singletonMap("roleId", id);
			return jdbc.queryForObject(SELECT_BY_ROLE_ID, params, rowMapper);		
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}
```

* JDBCTest.java

```java
Role resultRole = roleDao.selectById(201);
System.out.println(resultRole);
		
int deleteCount = roleDao.deleteById(500);
System.out.println(deleteCount + "건 삭제하였습니다.");
	
Role resultRole2 = roleDao.selectById(500);
System.out.println(resultRole2);
```

## 생각해보기

* JdbcTemplate을 이용하지 않고 NamedParameterJdbcTemplate를 이용하여  
   DAO를 작성한 이유는 무엇이라고 생각하나요?

JdbcTemplate을 사용하면 자바에 존재하는 쿼리문과 DB 연산으로 부터 발생하는     
값 객체의 파라미터를 관리하기 매우 힘들어진다.

대표적인 예로, Java는 클래스의 인스턴스 변수에 camelCase를 주로 사용하고 sql은 Column명으로  
snake case를 주로 사용하기 때문에 서로 통신하기 위해서 Parsing 하는 작업이 필요 하고   
이러한 작업들을 NamedParameterJdbcTemplate이  지원해준다.

만약 JdbcTemplate을 직접 사용한다면 NamedParameterJdbcTemplate가 재공해주는   
Parsing 작업들을 개발자가 직접해줘야만 하고 이는 Type Safe하지 못할 뿐더러   
많은 중복된 코드를 발생시킨다.

이러한 중복된 코드는 모든 에러의 근원이며 이를 없애기 위해서 JdbcTemplate 대신  
NamedParameterJdbcTemplate를 사용할 것을 권장한다.   

