package com.wifihi.persistance;

import java.sql.Time;
import java.util.Date;

/**
 * Wspuservisithistory entity. @author MyEclipse Persistence Tools
 */
public class Wspuservisithistory extends AbstractWspuservisithistory implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Wspuservisithistory() {
	}

	/** full constructor */
	public Wspuservisithistory(Wspuser wspuser, Date wspvisitingDate,
			Time wspvisitingTime, String country, String province, String city,
			String district) {
		super(wspuser, wspvisitingDate, wspvisitingTime, country, province,
				city, district);
	}

}
