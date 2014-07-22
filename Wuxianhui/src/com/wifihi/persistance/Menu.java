package com.wifihi.persistance;

import java.util.Set;

/**
 * Menu entity. @author MyEclipse Persistence Tools
 */
public class Menu extends AbstractMenu implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Menu() {
	}

	/** minimal constructor */
	public Menu(String menuName, Long level) {
		super(menuName, level);
	}

	/** full constructor */
	public Menu(String menuName, Long level, Long parentId, Boolean isLeaf,
			Set menuusers) {
		super(menuName, level, parentId, isLeaf, menuusers);
	}

}
