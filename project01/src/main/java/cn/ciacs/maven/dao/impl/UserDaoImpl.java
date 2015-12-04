package cn.ciacs.maven.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.ciacs.maven.dao.UserDao;
import cn.ciacs.maven.dao.mapper.UserMapper;
import cn.ciacs.maven.module.User;
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserMapper mapper;
	
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return mapper.addUser(user);
	}
	
	
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		mapper.updateUser(user);
	}

	@Override
	public void deleteUserByUserId(int userId) {
		// TODO Auto-generated method stub
		mapper.deleteUserByUserId(userId);
	}

	@Override
	public User findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return mapper.findUserByUsername(username);
	}

}
