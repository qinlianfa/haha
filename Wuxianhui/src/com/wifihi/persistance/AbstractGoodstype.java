package com.wifihi.persistance;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractGoodstype entity provides the base persistence definition of the
 * Goodstype entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGoodstype implements java.io.Serializable {

	// Fields

	private String goodsType;
	private String goodsTypeDescribe;
	private String extends_;
	private Set goodsmanages = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractGoodstype() {
	}

	/** minimal constructor */
	public AbstractGoodstype(String goodsType) {
		this.goodsType = goodsType;
	}

	/** full constructor */
	public AbstractGoodstype(String goodsType, String goodsTypeDescribe,
			String extends_, Set goodsmanages) {
		this.goodsType = goodsType;
		this.goodsTypeDescribe = goodsTypeDescribe;
		this.extends_ = extends_;
		this.goodsmanages = goodsmanages;
	}

	// Property accessors

	public String getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
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

	public Set getGoodsmanages() {
		return this.goodsmanages;
	}

	public void setGoodsmanages(Set goodsmanages) {
		this.goodsmanages = goodsmanages;
	}

}