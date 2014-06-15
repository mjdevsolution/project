/**
 * 
 */
package com.dms.persistence.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author Jeyakaran
 * 
 */
@MappedSuperclass
public abstract class BaseUser extends BaseEntity {

	@Column(name = "NAME")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
