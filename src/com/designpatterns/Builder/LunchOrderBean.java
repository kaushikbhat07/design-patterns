package com.designpatterns.Builder;

// Issue: The below design is mutable
public class LunchOrderBean {
	private String bread;
	private String condiments;
	private String meat;
	private String dressing;

	public LunchOrderBean() {

	}

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public void setCondiments(String condiments) {
		this.condiments = condiments;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public String getDressing() {
		return dressing;
	}

	public void setDressing(String dressing) {
		this.dressing = dressing;
	}
}
