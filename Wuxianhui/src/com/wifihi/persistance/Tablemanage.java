package com.wifihi.persistance;

import java.util.Set;

/**
 * Tablemanage entity. @author MyEclipse Persistence Tools
 */
public class Tablemanage extends AbstractTablemanage implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Tablemanage() {
	}

	/** full constructor */
	public Tablemanage(Wspuser wspuser, Ordermanage ordermanage,
			String goodsTypeDescribe, String extends_, Set ordermanages) {
		super(wspuser, ordermanage, goodsTypeDescribe, extends_, ordermanages);
	}

}
