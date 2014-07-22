package com.wifihi.persistance;

import java.util.Set;

/**
 * Goodsmanage entity. @author MyEclipse Persistence Tools
 */
public class Goodsmanage extends AbstractGoodsmanage implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Goodsmanage() {
	}

	/** full constructor */
	public Goodsmanage(Orderdetail orderdetail, Goodstype goodstype,
			Wspuser wspuser, String goodsName, String unit, Integer price,
			String description, String picture, Integer consumedTimes,
			Set orderdetails) {
		super(orderdetail, goodstype, wspuser, goodsName, unit, price,
				description, picture, consumedTimes, orderdetails);
	}

}
