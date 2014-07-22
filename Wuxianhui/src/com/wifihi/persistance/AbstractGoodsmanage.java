package com.wifihi.persistance;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractGoodsmanage entity provides the base persistence definition of the
 * Goodsmanage entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGoodsmanage implements java.io.Serializable {

	// Fields

	private Long goodsId;
	private Orderdetail orderdetail;
	private Goodstype goodstype;
	private Wspuser wspuser;
	private String goodsName;
	private String unit;
	private Integer price;
	private String description;
	private String picture;
	private Integer consumedTimes;
	private Set orderdetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractGoodsmanage() {
	}

	/** full constructor */
	public AbstractGoodsmanage(Orderdetail orderdetail, Goodstype goodstype,
			Wspuser wspuser, String goodsName, String unit, Integer price,
			String description, String picture, Integer consumedTimes,
			Set orderdetails) {
		this.orderdetail = orderdetail;
		this.goodstype = goodstype;
		this.wspuser = wspuser;
		this.goodsName = goodsName;
		this.unit = unit;
		this.price = price;
		this.description = description;
		this.picture = picture;
		this.consumedTimes = consumedTimes;
		this.orderdetails = orderdetails;
	}

	// Property accessors

	public Long getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public Orderdetail getOrderdetail() {
		return this.orderdetail;
	}

	public void setOrderdetail(Orderdetail orderdetail) {
		this.orderdetail = orderdetail;
	}

	public Goodstype getGoodstype() {
		return this.goodstype;
	}

	public void setGoodstype(Goodstype goodstype) {
		this.goodstype = goodstype;
	}

	public Wspuser getWspuser() {
		return this.wspuser;
	}

	public void setWspuser(Wspuser wspuser) {
		this.wspuser = wspuser;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Integer getConsumedTimes() {
		return this.consumedTimes;
	}

	public void setConsumedTimes(Integer consumedTimes) {
		this.consumedTimes = consumedTimes;
	}

	public Set getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(Set orderdetails) {
		this.orderdetails = orderdetails;
	}

}