package com.designpatterns.Builder;

public class LunchOrder {
	private final String bread;
	private final String condiments;
	private final String meat;
	private final String dressing;

	private LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.meat = builder.meat;
		this.dressing = builder.dressing;
	}

	public String getBread() {
		return bread;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getMeat() {
		return meat;
	}

	public String getDressing() {
		return dressing;
	}

	@Override
	public String toString() {
		return "LunchOrder{" +
				"bread='" + bread + '\'' +
				", condiments='" + condiments + '\'' +
				", meat='" + meat + '\'' +
				", dressing='" + dressing + '\'' +
				'}';
	}

	// could also be an external class
	public static class Builder {
		private String bread;
		private String condiments;
		private String meat;
		private String dressing;

		public Builder() {

		}

		public LunchOrder build() {
			return new LunchOrder(this);
		}

		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public Builder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}

		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}

		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}
	}
}
