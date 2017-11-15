package org.fage.repository.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.fage.domain.Department;
import org.fage.domain.Role;
import org.fage.domain.User;
import org.fage.redis.dao.UserRedisDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTest {
	private final Logger log = LoggerFactory.getLogger(RepositoryTest.class);

	@Autowired
	UserRedisDao redisDao;
	
	@Before
	public void initData(){
		Department d = new Department();
		d.setId(1L);
		d.setName("开发部门");
		
		Role r = new Role();
		r.setId(1L);
		r.setName("部门经理");
		List<Role> roles = new ArrayList<Role>();
		roles.add(r);
		
		User u = new User();
		u.setId(1L);
		u.setRoles(roles);
		u.setCreateDate(new Date());
		u.setDepartment(d);
		u.setUsername("蔡智法");
		//插入
		redisDao.add("1", 1L, u);
	}
	
	@Test
	public void testGet(){
		log.info(redisDao.get("1").toString());
	}
	
	@Test
	public void testDelete(){
		redisDao.delete("1");
	}
		
}
