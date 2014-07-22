package com.wifihi.persistance;

/**
 * AbstractMenuuserId entity provides the base persistence definition of the
 * MenuuserId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMenuuserId implements java.io.Serializable {

	// Fields

	private Wspuser wspuser;
	private Menu menu;

	// Constructors

	/** default constructor */
	public AbstractMenuuserId() {
	}

	/** full constructor */
	public AbstractMenuuserId(Wspuser wspuser, Menu menu) {
		this.wspuser = wspuser;
		this.menu = menu;
	}

	// Property accessors

	public Wspuser getWspuser() {
		return this.wspuser;
	}

	public void setWspuser(Wspuser wspuser) {
		this.wspuser = wspuser;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractMenuuserId))
			return false;
		AbstractMenuuserId castOther = (AbstractMenuuserId) other;

		return ((this.getWspuser() == castOther.getWspuser()) || (this
				.getWspuser() != null
				&& castOther.getWspuser() != null && this.getWspuser().equals(
				castOther.getWspuser())))
				&& ((this.getMenu() == castOther.getMenu()) || (this.getMenu() != null
						&& castOther.getMenu() != null && this.getMenu()
						.equals(castOther.getMenu())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getWspuser() == null ? 0 : this.getWspuser().hashCode());
		result = 37 * result
				+ (getMenu() == null ? 0 : this.getMenu().hashCode());
		return result;
	}

}