package com.wifihi.persistance;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractMenu entity provides the base persistence definition of the Menu
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMenu implements java.io.Serializable {

	// Fields

	private Long menuId;
	private String menuName;
	private Long level;
	private Long parentId;
	private Boolean isLeaf;
	private Set menuusers = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractMenu() {
	}

	/** minimal constructor */
	public AbstractMenu(String menuName, Long level) {
		this.menuName = menuName;
		this.level = level;
	}

	/** full constructor */
	public AbstractMenu(String menuName, Long level, Long parentId,
			Boolean isLeaf, Set menuusers) {
		this.menuName = menuName;
		this.level = level;
		this.parentId = parentId;
		this.isLeaf = isLeaf;
		this.menuusers = menuusers;
	}

	// Property accessors

	public Long getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public Long getLevel() {
		return this.level;
	}

	public void setLevel(Long level) {
		this.level = level;
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Boolean getIsLeaf() {
		return this.isLeaf;
	}

	public void setIsLeaf(Boolean isLeaf) {
		this.isLeaf = isLeaf;
	}

	public Set getMenuusers() {
		return this.menuusers;
	}

	public void setMenuusers(Set menuusers) {
		this.menuusers = menuusers;
	}

}