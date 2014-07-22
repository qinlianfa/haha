package com.wifihi.persistance;

/**
 * MenuuserId entity. @author MyEclipse Persistence Tools
 */
public class MenuuserId extends AbstractMenuuserId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public MenuuserId() {
	}

	/** full constructor */
	public MenuuserId(Wspuser wspuser, Menu menu) {
		super(wspuser, menu);
	}

}
