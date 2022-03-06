package com.designpatterns.Factory;


import com.designpatterns.Factory.Pages.CartPage;
import com.designpatterns.Factory.Pages.CheckoutPage;
import com.designpatterns.Factory.Pages.ItemPage;
import com.designpatterns.Factory.Pages.SearchPage;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
		pages.add(new CheckoutPage());
	}
}
