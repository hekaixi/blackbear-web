package com.blackbear.myBatisMapper;

import java.util.List;

import com.blackbear.entity.UserBean;

public interface UserMapper {
	void save(UserBean user);
	boolean update(UserBean user);
	boolean delete(int id);
	UserBean findById(int id);
	List<UserBean> findAll();
}
