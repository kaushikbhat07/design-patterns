package com.designpatterns.Builder;

public class LunchOrderBeanDemo {
	public static void main(String[] args) {
		// Issue: The below design is mutable
		LunchOrderBean lunchOrderBean = new LunchOrderBean();

		lunchOrderBean.setBread("Wheat");
		lunchOrderBean.setCondiments("Lettuce");
		lunchOrderBean.setDressing("Mustard");
		lunchOrderBean.setMeat("Ham");

		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiments());
		System.out.println(lunchOrderBean.getDressing());
		System.out.println(lunchOrderBean.getMeat());

		// Builder

		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread("Bread").condiments("Lettuce").meat("Ham").dressing("Salad");

		LunchOrder lunchOrder = builder.build();
		System.out.println(lunchOrder);
	}
}
