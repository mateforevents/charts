package com.vaadin.addon.charts.model;

import com.vaadin.addon.charts.model.AbstractConfigurationObject;
public class Side extends AbstractConfigurationObject {

	private static final long serialVersionUID = 1L;
	private Object color;
	private Number size;

	public Side() {
	}

	public Object getColor() {
		return color;
	}

	public void setColor(Object color) {
		this.color = color;
	}

	public Number getSize() {
		return size;
	}

	public void setSize(Number size) {
		this.size = size;
	}
}