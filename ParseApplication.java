package com.parse.starter;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;

import com.parse.ParseUser;

import android.app.Application;

public class ParseApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		// Add your initialization code here
		Parse.initialize(this, "oA9wUzpvHPraWoecGeReHYXGPXPvOZOuJyTO4AYS", "vZ3zftVzrf40PvxIF7g8qZ0luunvfNrGblk4ghGR"); 

		ParseObject testObject = new ParseObject("TestObject");
		testObject.put("foo", "no");
		testObject.saveInBackground();
		
		System.out.println("Hello, Testing!");
		
		
		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
	    
		// If you would like all objects to be private by default, remove this line.
		defaultACL.setPublicReadAccess(true);
		ParseACL.setDefaultACL(defaultACL, true);
		
	}

}
