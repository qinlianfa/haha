package com.wifihi.persistance;

import java.sql.Time;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractOrdermanage entity provides the base persistence definition of the
 * Ordermanage entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOrdermanage implements java.io.Serializable {

	// Fields

	private Long orderId;
	private Wspuser wspuser;
	private User user;
	private Tablemanage tablemanage;
	private Date orderDate;
	private Time orderTime;
	private Float expenditure;
	private String status;
	private Set orderdetails = new HashSet(0);
	private Set tablemanages = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractOrdermanage() {
	}

	/** full constructor */
	public AbstractOrdermanage(Wspuser wspuser, User user,
			Tablemanage tablemanage, Date orderDate, Time orderTime,
			Float expenditure, String status, Set orderdetails, Set tablemanages) {
		this.wspuser = wspuser;
		this.user = user;
		this.tablemanage = tablemanage;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.expenditure = expenditure;
		this.status = status;
		this.orderdetails = orderdetails;
		this.tablemanages = tablemanages;
	}

	// Property accessors

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Wspuser getWspuser() {
		return this.wspuser;
	}

	public void setWspuser(Wspuser wspuser) {
		this.wspuser = wspuser;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Tablemanage getTablemanage() {
		return this.tablemanage;
	}

	public void setTablemanage(Tablemanage tablemanage) {
		this.tablemanage = tablemanage;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Time getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Time orderTime) {
		this.orderTime = orderTime;
	}

	public Float getExpenditure() {
		return this.expenditure;
	}

	public void setExpenditure(Float expenditure) {
		this.expenditure = expenditure;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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