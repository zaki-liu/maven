package cn.ciacs.maven.service;

import cn.ciacs.maven.module.User;

/**
 * 
 * @author CIACs
 * 
 */
public interface UserService {
	//添加用户
	int addUser(User user);
	//更新用户信息
	void updateUser(User user);
	//删除用户信息
	void deleteUserByUserId(int userId);
	//根据用户名查找用户
	User findUserByUsername(String username);
}
