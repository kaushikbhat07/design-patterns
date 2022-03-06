package com.designpatterns.Factory;

import com.study.DesignPatterns.Factory.Pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	public Website() {
		this.createWebsite();
	}

	protected List<Page> pages = new ArrayList<>();

	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}

	public abstract void createWebsite();
}
