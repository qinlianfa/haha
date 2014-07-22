package com.wifihi.persistance;

import java.sql.Time;
import java.util.Date;
import java.util.Set;

/**
 * Ordermanage entity. @author MyEclipse Persistence Tools
 */
public class Ordermanage extends AbstractOrdermanage implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ordermanage() {
	}

	/** full constructor */
	public Ordermanage(Wspuser wspuser, User user, Tablemanage tablemanage,
			Date orderDate, Time orderTime, Float expenditure, String status,
			Set orderdetails, Set tablemanages) {
		super(wspuser, user, tablemanage, orderDate, orderTime, expenditure,
				status, orderdetails, tablemanages);
	}

}
