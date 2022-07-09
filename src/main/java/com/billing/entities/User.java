package com.billing.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long user_id;
	
	@NotEmpty
	@Size(min= 4, message = "first name must be minimun 4 character")
	@Column(name = "first_name")
	private String firstname;
	
	@NotEmpty
	@Size(min= 4, message = "last name must be minimun 4 character")
	@Column(name = "last_name")
	private String lastname;
	
	@NotEmpty
	@Column(name = "user_name")
	private String username;
	
	@NotEmpty
	@Size(min= 6, message = "password must be minimun 6 character")
	@Column(name = "password")
	private String password;
	
	@NotEmpty
	@Size(min= 10, message = "mobile number must be of 10 character")
	@Column(name = "mobile_no")
	private String mobileno;

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
