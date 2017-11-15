package org.fage.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable{

	private Long id;
	private String username;
	private Date createDate;
	//一对多映射
	private Department department;
	//多对多映射
	private List<Role> roles;

	
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", createDate=" + createDate + ", department=" + department
				+ ", roles=" + roles + "]";
	}

	
}
