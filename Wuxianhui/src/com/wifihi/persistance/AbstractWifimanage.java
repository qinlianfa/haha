package com.wifihi.persistance;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractWifimanage entity provides the base persistence definition of the
 * Wifimanage entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWifimanage implements java.io.Serializable {

	// Fields

	private Long wifiId;
	private Wspuser wspuser;
	private String wifiName;
	private String macaddress;
	private String password;
	private Boolean authorise;
	private String displayName;
	private Set userwifivisitinghistories = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractWifimanage() {
	}

	/** full constructor */
	public AbstractWifimanage(Wspuser wspuser, String wifiName,
			String macaddress, String password, Boolean authorise,
			String displayName, Set userwifivisitinghistories) {
		this.wspuser = wspuser;
		this.wifiName = wifiName;
		this.macaddress = macaddress;
		this.password = password;
		this.authorise = authorise;
		this.displayName = displayName;
		this.userwifivisitinghistories = userwifivisitinghistories;
	}

	// Property accessors

	public Long getWifiId() {
		return this.wifiId;
	}

	public void setWifiId(Long wifiId) {
		this.wifiId = wifiId;
	}

	public Wspuser getWspuser() {
		return this.wspuser;
	}

	public void setWspuser(Wspuser wspuser) {
		this.wspuser = wspuser;
	}

	public String getWifiName() {
		return this.wifiName;
	}

	public void setWifiName(String wifiName) {
		this.wifiName = wifiName;
	}

	public String getMacaddress() {
		return this.macaddress;
	}

	public void setMacaddress(String macaddress) {
		this.macaddress = macaddress;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getAuthorise() {
		return this.authorise;
	}

	public void setAuthorise(Boolean authorise) {
		this.authorise = authorise;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Set getUserwifivisitinghistories() {
		return this.userwifivisitinghistories;
	}

	public void setUserwifivisitinghistories(Set userwifivisitinghistories) {
		this.userwifivisitinghistories = userwifivisitinghistories;
	}

}