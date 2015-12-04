package cn.ciacs.maven.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ciacs.maven.dao.UserDao;
import cn.ciacs.maven.module.User;
import cn.ciacs.maven.service.UserService;
/**
 * 
 * @author CIACs
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}
	
	@Override
	public void deleteUserByUserId(int userId) {
		// TODO Auto-generated method stub
		userDao.deleteUserByUserId(userId);
	}
	
	@Override
	public User findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return userDao.findUserByUsername(username);
	}
	
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}

}
