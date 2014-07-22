package com.wifihi.persistance;

import java.util.Set;

/**
 * Goodstype entity. @author MyEclipse Persistence Tools
 */
public class Goodstype extends AbstractGoodstype implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Goodstype() {
	}

	/** minimal constructor */
	public Goodstype(String goodsType) {
		super(goodsType);
	}

	/** full constructor */
	public Goodstype(String goodsType, String goodsTypeDescribe,
			String extends_, Set goodsmanages) {
		super(goodsType, goodsTypeDescribe, extends_, goodsmanages);
	}

}
