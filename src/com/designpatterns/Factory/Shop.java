package com.designpatterns.Factory;

import com.study.DesignPatterns.Factory.Pages.CartPage;
import com.study.DesignPatterns.Factory.Pages.CheckoutPage;
import com.study.DesignPatterns.Factory.Pages.ItemPage;
import com.study.DesignPatterns.Factory.Pages.SearchPage;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
		pages.add(new CheckoutPage());
	}
}
