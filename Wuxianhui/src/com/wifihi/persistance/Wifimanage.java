package com.wifihi.persistance;

import java.util.Set;

/**
 * Wifimanage entity. @author MyEclipse Persistence Tools
 */
public class Wifimanage extends AbstractWifimanage implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Wifimanage() {
	}

	/** full constructor */
	public Wifimanage(Wspuser wspuser, String wifiName, String macaddress,
			String password, Boolean authorise, String displayName,
			Set userwifivisitinghistories) {
		super(wspuser, wifiName, macaddress, password, authorise, displayName,
				userwifivisitinghistories);
	}

}
