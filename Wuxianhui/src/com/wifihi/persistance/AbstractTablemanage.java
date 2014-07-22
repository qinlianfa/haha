package com.wifihi.persistance;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractTablemanage entity provides the base persistence definition of the
 * Tablemanage entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTablemanage implements java.io.Serializable {

	// Fields

	private Long tableId;
	private Wspuser wspuser;
	private Ordermanage ordermanage;
	private String goodsTypeDescribe;
	private String extends_;
	private Set ordermanages = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTablemanage() {
	}

	/** full constructor */
	public AbstractTablemanage(Wspuser wspuser, Ordermanage ordermanage,
			String goodsTypeDescribe, String extends_, Set ordermanages) {
		this.wspuser = wspuser;
		this.ordermanage = ordermanage;
		this.goodsTypeDescribe = goodsTypeDescribe;
		this.extends_ = extends_;
		this.ordermanages = ordermanages;
	}

	// Property accessors

	public Long getTableId() {
		return this.tableId;
	}

	public void setTableId(Long tableId) {
		this.tableId = tableId;
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

	public String getGoodsTypeDescribe() {
		return this.goodsTypeDescribe;
	}

	public void setGoodsTypeDescribe(String goodsTypeDescribe) {
		this.goodsTypeDescribe = goodsTypeDescribe;
	}

	public String getExtends_() {
		return this.extends_;
	}

	public void setExtends_(String extends_) {
		this.extends_ = extends_;
	}

	public Set getOrdermanages() {
		return this.ordermanages;
	}

	public void setOrdermanages(Set ordermanages) {
		this.ordermanages = ordermanages;
	}

}