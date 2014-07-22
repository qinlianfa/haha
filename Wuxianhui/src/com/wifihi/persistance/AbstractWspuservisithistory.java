package com.wifihi.persistance;

import java.sql.Time;
import java.util.Date;

/**
 * AbstractWspuservisithistory entity provides the base persistence definition
 * of the Wspuservisithistory entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWspuservisithistory implements
		java.io.Serializable {

	// Fields

	private Long wspvisitingId;
	private Wspuser wspuser;
	private Date wspvisitingDate;
	private Time wspvisitingTime;
	private String country;
	private String province;
	private String city;
	private String district;

	// Constructors

	/** default constructor */
	public AbstractWspuservisithistory() {
	}

	/** full constructor */
	public AbstractWspuservisithistory(Wspuser wspuser, Date wspvisitingDate,
			Time wspvisitingTime, String country, String province, String city,
			String district) {
		this.wspuser = wspuser;
		this.wspvisitingDate = wspvisitingDate;
		this.wspvisitingTime = wspvisitingTime;
		this.country = country;
		this.province = province;
		this.city = city;
		this.district = district;
	}

	// Property accessors

	public Long getWspvisitingId() {
		return this.wspvisitingId;
	}

	public void setWspvisitingId(Long wspvisitingId) {
		this.wspvisitingId = wspvisitingId;
	}

	public Wspuser getWspuser() {
		return this.wspuser;
	}

	public void setWspuser(Wspuser wspuser) {
		this.wspuser = wspuser;
	}

	public Date getWspvisitingDate() {
		return this.wspvisitingDate;
	}

	public void setWspvisitingDate(Date wspvisitingDate) {
		this.wspvisitingDate = wspvisitingDate;
	}

	public Time getWspvisitingTime() {
		return this.wspvisitingTime;
	}

	public void setWspvisitingTime(Time wspvisitingTime) {
		this.wspvisitingTime = wspvisitingTime;
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

}