package com.email;

import java.util.regex.Pattern;

public class EmailRegex {

	public static void main(String[] args) {
		
		String emailPattern = "abc"; //Pattern for usecase1
		String matcher = "^[a-zA-Z0-9]+"; //Regex for usecase1
		System.out.println(Pattern.matches(matcher, emailPattern));
	}

}
