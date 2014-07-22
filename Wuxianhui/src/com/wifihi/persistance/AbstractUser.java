package com.wifihi.persistance;

import java.sql.Time;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractUser entity provides the base persistence definition of the User
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUser implements java.io.Serializable {

	// Fields

	private Long userId;
	private String phoneNumber;
	private Long qqnumber;
	private String userName;
	private Date registrateDate;
	private Time registrateTime;
	private String password;
	private Set userwifivisitinghistories = new HashSet(0);
	private Set uservisitingsystemhistories = new HashSet(0);
	private Set ordermanages = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractUser() {
	}

	/** minimal constructor */
	public AbstractUser(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/** full constructor */
	public AbstractUser(String phoneNumber, Long qqnumber, String userName,
			Date registrateDate, Time registrateTime, String password,
			Set userwifivisitinghistories, Set uservisitingsystemhistories,
			Set ordermanages) {
		this.phoneNumber = phoneNumber;
		this.qqnumber = qqnumber;
		this.userName = userName;
		this.registrateDate = registrateDate;
		this.registrateTime = registrateTime;
		this.password = password;
		this.userwifivisitinghistories = userwifivisitinghistories;
		this.uservisitingsystemhistories = uservisitingsystemhistories;
		this.ordermanages = ordermanages;
	}

	// Property accessors

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getQqnumber() {
		return this.qqnumber;
	}

	public void setQqnumber(Long qqnumber) {
		this.qqnumber = qqnumber;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getRegistrateDate() {
		return this.registrateDate;
	}

	public void setRegistrateDate(Date string) {
		this.registrateDate = string;
	}

	public Time getRegistrateTime() {
		return this.registrateTime;
	}

	public void setRegistrateTime(Time registrateTime) {
		this.registrateTime = registrateTime;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set getUserwifivisitinghistories() {
		return this.userwifivisitinghistories;
	}

	public void setUserwifivisitinghistories(Set userwifivisitinghistories) {
		this.userwifivisitinghistories = userwifivisitinghistories;
	}

	public Set getUservisitingsystemhistories() {
		return this.uservisitingsystemhistories;
	}

	public void setUservisitingsystemhistories(Set uservisitingsystemhistories) {
		this.uservisitingsystemhistories = uservisitingsystemhistories;
	}

	public Set getOrdermanages() {
		return this.ordermanages;
	}

	public void setOrdermanages(Set ordermanages) {
		this.ordermanages = ordermanages;
	}

}