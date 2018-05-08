package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "USER")
@Data
public class User implements Serializable {

	@Id
	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "USER_SEX")
	private String userSex;

	@Column(name = "USER_AGE")
	private Integer userAge;

	@Column(name = "USER_ADDRESS")
	private String userAddress;

}
