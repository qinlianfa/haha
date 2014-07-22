package com.wifihi.persistance;

/**
 * AbstractMenuuser entity provides the base persistence definition of the
 * Menuuser entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMenuuser implements java.io.Serializable {

	// Fields

	private MenuuserId id;

	// Constructors

	/** default constructor */
	public AbstractMenuuser() {
	}

	/** full constructor */
	public AbstractMenuuser(MenuuserId id) {
		this.id = id;
	}

	// Property accessors

	public MenuuserId getId() {
		return this.id;
	}

	public void setId(MenuuserId id) {
		this.id = id;
	}

}