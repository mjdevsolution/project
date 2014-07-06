package com.dms.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dms.persistence.dao.UserDao;
import com.dms.persistence.entity.User;
import com.dms.persistence.entity.UserRole;

@Service
public class LoginServiceImpl implements UserDetailsService {

	@Resource
	private UserDao userDao;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {

		UserDetails userDetails = null;
		User user = userDao.findByUsername(username);
		if (user == null)
			throw new UsernameNotFoundException("user not found");

		return buildUserFromUserEntity(user);
	}

	@Transactional(readOnly = true)
	org.springframework.security.core.userdetails.User buildUserFromUserEntity(
			User user) {

		String username = user.getName();
		String password = user.getPassword();
		// boolean enabled = userEntity.isActive();
		// boolean accountNonExpired = userEntity.isActive();
		// boolean credentialsNonExpired = userEntity.isActive();
		// boolean accountNonLocked = userEntity.isActive();

		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (UserRole role : user.getUserRoles()) {
			authorities.add(new GrantedAuthorityImpl(role.getUserRole()
					.getUserRole()));
		}

		org.springframework.security.core.userdetails.User sUser = new org.springframework.security.core.userdetails.User(
				username, password, authorities);
		return sUser;
	}
}