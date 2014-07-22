package com.wifihi.persistance;

import java.sql.Time;
import java.util.Date;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String phoneNumber) {
		super(phoneNumber);
	}

	/** full constructor */
	public User(String phoneNumber, Long qqnumber, String userName,
			Date registrateDate, Time registrateTime, String password,
			Set userwifivisitinghistories, Set uservisitingsystemhistories,
			Set ordermanages) {
		super(phoneNumber, qqnumber, userName, registrateDate, registrateTime,
				password, userwifivisitinghistories,
				uservisitingsystemhistories, ordermanages);
	}

}
