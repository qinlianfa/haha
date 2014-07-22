package com.wifihi.persistance;

import java.sql.Time;
import java.util.Date;

/**
 * Uservisitingsystemhistory entity. @author MyEclipse Persistence Tools
 */
public class Uservisitingsystemhistory extends
		AbstractUservisitingsystemhistory implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Uservisitingsystemhistory() {
	}

	/** full constructor */
	public Uservisitingsystemhistory(User user, Date wspvisitingDate,
			Time wspvisitingTime, String country, String province, String city,
			String district) {
		super(user, wspvisitingDate, wspvisitingTime, country, province, city,
				district);
	}

}
