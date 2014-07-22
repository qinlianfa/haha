package com.wifihi.persistance;

import java.sql.Time;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractWspuser entity provides the base persistence definition of the
 * Wspuser entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWspuser implements java.io.Serializable {

	// Fields

	private Long wspuser;
	private String phoneNumber;
	private Long qqnumber;
	private String userName;
	private Date registrateDate;
	private Time registrateTime;
	private String email;
	private String country;
	private String province;
	private String city;
	private String district;
	private String detailAddress;
	private String password;
	private Set menuusers = new HashSet(0);
	private Set wifimanages = new HashSet(0);
	private Set goodsmanages = new HashSet(0);
	private Set wspuservisithistories = new HashSet(0);
	private Set ordermanages = new HashSet(0);
	private Set orderdetails = new HashSet(0);
	private Set tablemanages = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractWspuser() {
	}

	/** minimal constructor */
	public AbstractWspuser(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/** full constructor */
	public AbstractWspuser(String phoneNumber, Long qqnumber, String userName,
			Date registrateDate, Time registrateTime, String email,
			String country, String province, String city, String district,
			String detailAddress, String password, Set menuusers,
			Set wifimanages, Set goodsmanages, Set wspuservisithistories,
			Set ordermanages, Set orderdetails, Set tablemanages) {
		this.phoneNumber = phoneNumber;
		this.qqnumber = qqnumber;
		this.userName = userName;
		this.registrateDate = registrateDate;
		this.registrateTime = registrateTime;
		this.email = email;
		this.country = country;
		this.province = province;
		this.city = city;
		this.district = district;
		this.detailAddress = detailAddress;
		this.password = password;
		this.menuusers = menuusers;
		this.wifimanages = wifimanages;
		this.goodsmanages = goodsmanages;
		this.wspuservisithistories = wspuservisithistories;
		this.ordermanages = ordermanages;
		this.orderdetails = orderdetails;
		this.tablemanages = tablemanages;
	}

	// Property accessors

	public Long getWspuser() {
		return this.wspuser;
	}

	public void setWspuser(Long wspuser) {
		this.wspuser = wspuser;
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

	public void setRegistrateDate(Date registrateDate) {
		this.registrateDate = registrateDate;
	}

	public Time getRegistrateTime() {
		return this.registrateTime;
	}

	public void setRegistrateTime(Time registrateTime) {
		this.registrateTime = registrateTime;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}

	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set getMenuusers() {
		return this.menuusers;
	}

	public void setMenuusers(Set menuusers) {
		this.menuusers = menuusers;
	}

	public Set getWifimanages() {
		return this.wifimanages;
	}

	public void setWifimanages(Set wifimanages) {
		this.wifimanages = wifimanages;
	}

	public Set getGoodsmanages() {
		return this.goodsmanages;
	}

	public void setGoodsmanages(Set goodsmanages) {
		this.goodsmanages = goodsmanages;
	}

	public Set getWspuservisithistories() {
		return this.wspuservisithistories;
	}

	public void setWspuservisithistories(Set wspuservisithistories) {
		this.wspuservisithistories = wspuservisithistories;
	}

	public Set getOrdermanages() {
		return this.ordermanages;
	}

	public void setOrdermanages(Set ordermanages) {
		this.ordermanages = ordermanages;
	}

	public Set getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(Set orderdetails) {
		this.orderdetails = orderdetails;
	}

	public Set getTablemanages() {
		return this.tablemanages;
	}

	public void setTablemanages(Set tablemanages) {
		this.tablemanages = tablemanages;
	}

}