/**
 * 
 */
package com.dms.persistence.dao;

import java.util.List;

import com.dms.persistence.entity.User;

/**
 * @author Jeyakaran
 * 
 */

public interface UserDao {

	public abstract void getUser();

	User findOne(long id);

	List<User> findAll();

	void create(User entity);

	User update(User entity);

	void delete(User entity);

	void deleteById(long entityId);

}