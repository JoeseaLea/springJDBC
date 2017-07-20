package com.joesea.springjdbc.dao;

import javax.sql.DataSource;

import com.joesea.springjdbc.model.User;

public interface UserDao {
	public void setDataSource(DataSource dataSource);
	public Integer addUser(User user);
}
