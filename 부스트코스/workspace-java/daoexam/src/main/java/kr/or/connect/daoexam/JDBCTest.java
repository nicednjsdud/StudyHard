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
		
		Role resultRole = dao.selectById(201);
		System.out.println(resultRole);
		
		int deleteCount = dao.deleteById(500);
		System.out.println(deleteCount + "건 삭제하였습니다.");
		
		Role resultRole2 = dao.selectById(500);
		System.out.println(resultRole2);
		
	}
}
