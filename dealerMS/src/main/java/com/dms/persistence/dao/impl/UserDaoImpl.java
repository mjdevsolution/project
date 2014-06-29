/**
 * 
 */
package com.dms.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.dms.persistence.dao.AbstractJpaDAO;
import com.dms.persistence.dao.UserDao;
import com.dms.persistence.entity.User;

/**
 * @author Jeyakaran
 * 
 */
@Repository
public class UserDaoImpl extends AbstractJpaDAO<User> implements UserDao {

	public UserDaoImpl() {
		super();

		setClazz(User.class);
	}

	@Override
	public void getUser() {
		getEntityManager().find(User.class, new Long(1));
	}

}
