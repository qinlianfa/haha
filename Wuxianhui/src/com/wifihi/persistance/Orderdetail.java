package com.wifihi.persistance;

import java.util.Set;

/**
 * Orderdetail entity. @author MyEclipse Persistence Tools
 */
public class Orderdetail extends AbstractOrderdetail implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Orderdetail() {
	}

	/** minimal constructor */
	public Orderdetail(Integer number) {
		super(number);
	}

	/** full constructor */
	public Orderdetail(Goodsmanage goodsmanage, Wspuser wspuser,
			Ordermanage ordermanage, Integer number, Set goodsmanages) {
		super(goodsmanage, wspuser, ordermanage, number, goodsmanages);
	}

}
