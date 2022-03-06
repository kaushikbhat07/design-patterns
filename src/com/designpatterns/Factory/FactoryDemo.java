package com.designpatterns.Factory;

public class FactoryDemo {
	public static void main(String[] args) {

		Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);

		System.out.println(website.getPages());

		website = WebsiteFactory.getWebsite(WebsiteType.SHOP);

		System.out.println(website.getPages());
	}
}
