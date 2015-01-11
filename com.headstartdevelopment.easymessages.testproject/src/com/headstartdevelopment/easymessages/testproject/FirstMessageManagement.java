package com.headstartdevelopment.easymessages.testproject;

import java.util.Locale;
import java.util.ResourceBundle;

class FirstMessageManagement {

	public static String MSG1 = "MSG1";
	public static String MSG2 = "MSG2";
	
	public static String createMessage(String msgId, String... params) {
		ResourceBundle messages = ResourceBundle.getBundle("com.headstartdevelopment.easymessages.testproject.FirstMessageManagement", Locale.getDefault());
		return messages.getString(msgId);
	}
}
