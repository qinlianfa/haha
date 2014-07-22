package com.wifihi.persistance;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractOrderdetail entity provides the base persistence definition of the
 * Orderdetail entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOrderdetail implements java.io.Serializable {

	// Fields

	private Long detailId;
	private Goodsmanage goodsmanage;
	private Wspuser wspuser;
	private Ordermanage ordermanage;
	private Integer number;
	private Set goodsmanages = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractOrderdetail() {
	}

	/** minimal constructor */
	public AbstractOrderdetail(Integer number) {
		this.number = number;
	}

	/** full constructor */
	public AbstractOrderdetail(Goodsmanage goodsmanage, Wspuser wspuser,
			Ordermanage ordermanage, Integer number, Set goodsmanages) {
		this.goodsmanage = goodsmanage;
		this.wspuser = wspuser;
		this.ordermanage = ordermanage;
		this.number = number;
		this.goodsmanages = goodsmanages;
	}

	// Property accessors

	public Long getDetailId() {
		return this.detailId;
	}

	public void setDetailId(Long detailId) {
		this.detailId = detailId;
	}

	public Goodsmanage getGoodsmanage() {
		return this.goodsmanage;
	}

	public void setGoodsmanage(Goodsmanage goodsmanage) {
		this.goodsmanage = goodsmanage;
	}

	public Wspuser getWspuser() {
		return this.wspuser;
	}

	public void setWspuser(Wspuser wspuser) {
		this.wspuser = wspuser;
	}

	public Ordermanage getOrdermanage() {
		return this.ordermanage;
	}

	public void setOrdermanage(Ordermanage ordermanage) {
		this.ordermanage = ordermanage;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Set getGoodsmanages() {
		return this.goodsmanages;
	}

	public void setGoodsmanages(Set goodsmanages) {
		this.goodsmanages = goodsmanages;
	}

}