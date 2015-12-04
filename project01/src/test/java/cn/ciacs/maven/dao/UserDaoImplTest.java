package cn.ciacs.maven.dao;

import static org.junit.Assert.assertTrue;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.ciacs.maven.module.User;
import cn.ciacs.maven.service.UserService;
/**
 * 
 * @author CIACs
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/spring-config.xml"})
public class UserDaoImplTest {
//	//添加用户
//	int addUser(User user);
//	//更新用户信息
//	void updateUser(User user);
//	//删除用户信息
//	void deleteUserByUserId(int userId);
//	//根据用户名查找用户
//	User findUserByUsername(String username);
	
	@Autowired
	private UserDao userDao;
	
	public User getUser()
	{
		User user = new User();
		user.setUsername("ciacs");
		user.setPassword("123");
		user.setRegistDate(new Date(System.currentTimeMillis()));
		return user;
	}
	
	@Test
	public void testAddUser()
	{
		User user = getUser();
		int status = userDao.addUser(user);
		assertTrue(status > 0);
	}
	
	@Test
	public void testFindUserByUsername()
	{
		User user = userDao.findUserByUsername("123");
		System.out.println(user.getUsername());
		assertTrue(user.getPassword().equals("123"));
	}
	
	@Test
	public void testUpdateUser()
	{
		User user = userDao.findUserByUsername("123");
		user.setPassword("111");
		userDao.updateUser(user);
		User user1 = userDao.findUserByUsername("123");
		assertTrue(user1.getPassword().equals("111"));
	}
	
	@Test
	public void testDeleteUserByUserId()
	{
		userDao.deleteUserByUserId(1);
		assertTrue(userDao.findUserByUsername("111") == null);
	}
}
