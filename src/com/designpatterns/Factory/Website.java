package com.designpatterns.Factory;

import com.designpatterns.Factory.Pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	protected List<Page> pages = new ArrayList<>();

	public Website() {
		this.createWebsite();
	}

	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}

	public abstract void createWebsite();
}
