package com.designpatterns.Factory;

import com.study.DesignPatterns.Factory.Pages.AboutPage;
import com.study.DesignPatterns.Factory.Pages.CommentPage;
import com.study.DesignPatterns.Factory.Pages.ContactPage;
import com.study.DesignPatterns.Factory.Pages.PostPage;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new AboutPage());
		pages.add(new PostPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}
}
