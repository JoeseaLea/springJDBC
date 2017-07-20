package com.joesea.springjdbc.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.joesea.springjdbc.dao.UserDao;
import com.joesea.springjdbc.model.User;


public class UserDaoImpl implements UserDao {
	
	private JdbcTemplate jdbcTemplate;

	@Override
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public Integer addUser(User user) {
		String sql = "INSERT INTO study.`T_USER` (name_cn, login_name, PASSWORD) VALUES (?, ?, ?);";
		return this.jdbcTemplate.update(sql, new Object[] {user.getNameCn(), user.getLoginName(), user.getPassword()});
	}
}
