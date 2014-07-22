package com.wifihi.persistance;

import java.sql.Time;
import java.util.Date;

/**
 * Userwifivisitinghistory entity. @author MyEclipse Persistence Tools
 */
public class Userwifivisitinghistory extends AbstractUserwifivisitinghistory
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Userwifivisitinghistory() {
	}

	/** full constructor */
	public Userwifivisitinghistory(User user, Wifimanage wifimanage,
			Boolean authorizedResult, Date wifiVisitingDate, Time startTime,
			Time endTime) {
		super(user, wifimanage, authorizedResult, wifiVisitingDate, startTime,
				endTime);
	}

}
