/**
 * 
 */
package com.dms.presentation;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Component;

import com.dms.service.UserService;

/**
 * @author Jeyakaran
 * 
 */
@Component
@ManagedBean
@SessionScoped
public class UserBean implements Serializable {

	@Resource
	private UserService userService;

	public String helloWorld() {
		userService.getUser();
		return "Hello World";
	}

}
