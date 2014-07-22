package com.wifihi.persistance;

import java.sql.Time;
import java.util.Date;

/**
 * AbstractUserwifivisitinghistory entity provides the base persistence
 * definition of the Userwifivisitinghistory entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractUserwifivisitinghistory implements
		java.io.Serializable {

	// Fields

	private Long wifiVisitingId;
	private User user;
	private Wifimanage wifimanage;
	private Boolean authorizedResult;
	private Date wifiVisitingDate;
	private Time startTime;
	private Time endTime;

	// Constructors

	/** default constructor */
	public AbstractUserwifivisitinghistory() {
	}

	/** full constructor */
	public AbstractUserwifivisitinghistory(User user, Wifimanage wifimanage,
			Boolean authorizedResult, Date wifiVisitingDate, Time startTime,
			Time endTime) {
		this.user = user;
		this.wifimanage = wifimanage;
		this.authorizedResult = authorizedResult;
		this.wifiVisitingDate = wifiVisitingDate;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	// Property accessors

	public Long getWifiVisitingId() {
		return this.wifiVisitingId;
	}

	public void setWifiVisitingId(Long wifiVisitingId) {
		this.wifiVisitingId = wifiVisitingId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Wifimanage getWifimanage() {
		return this.wifimanage;
	}

	public void setWifimanage(Wifimanage wifimanage) {
		this.wifimanage = wifimanage;
	}

	public Boolean getAuthorizedResult() {
		return this.authorizedResult;
	}

	public void setAuthorizedResult(Boolean authorizedResult) {
		this.authorizedResult = authorizedResult;
	}

	public Date getWifiVisitingDate() {
		return this.wifiVisitingDate;
	}

	public void setWifiVisitingDate(Date wifiVisitingDate) {
		this.wifiVisitingDate = wifiVisitingDate;
	}

	public Time getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

}