package com.designpatterns.Factory;

import com.designpatterns.Factory.Pages.AboutPage;
import com.designpatterns.Factory.Pages.CommentPage;
import com.designpatterns.Factory.Pages.ContactPage;
import com.designpatterns.Factory.Pages.PostPage;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new AboutPage());
		pages.add(new PostPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}
}
