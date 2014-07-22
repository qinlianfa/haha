package com.wifihi.persistance;

import java.sql.Time;
import java.util.Date;
import java.util.Set;

/**
 * Wspuser entity. @author MyEclipse Persistence Tools
 */
public class Wspuser extends AbstractWspuser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Wspuser() {
	}

	/** minimal constructor */
	public Wspuser(String phoneNumber) {
		super(phoneNumber);
	}

	/** full constructor */
	public Wspuser(String phoneNumber, Long qqnumber, String userName,
			Date registrateDate, Time registrateTime, String email,
			String country, String province, String city, String district,
			String detailAddress, String password, Set menuusers,
			Set wifimanages, Set goodsmanages, Set wspuservisithistories,
			Set ordermanages, Set orderdetails, Set tablemanages) {
		super(phoneNumber, qqnumber, userName, registrateDate, registrateTime,
				email, country, province, city, district, detailAddress,
				password, menuusers, wifimanages, goodsmanages,
				wspuservisithistories, ordermanages, orderdetails, tablemanages);
	}

}
