/**
 * 
 */
package com.joesea.springjdbc.dao.impl;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.joesea.springjdbc.dao.UserDao;
import com.joesea.springjdbc.model.User;

/**
 * @author joesealea
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserDaoImplTest {
	
	@Autowired
	UserDao userDao;

	/**
	 * Test method for {@link com.joesea.springjdbc.dao.impl.UserDaoImpl#setDataSource(javax.sql.DataSource)}.
	 */
//	@Test
	public void testSetDataSource() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.joesea.springjdbc.dao.impl.UserDaoImpl#addUser(com.joesea.springjdbc.model.User)}.
	 */
	@Test
	public void testAddUser() {
		User user = new User();
		user.setNameCn("张三");
		user.setLoginName("zhangsan");
		user.setPassword("123456");
		userDao.addUser(user);
	}

}
