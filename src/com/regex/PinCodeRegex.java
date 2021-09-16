package com.regex;

import java.util.regex.Pattern;

public class PinCodeRegex {

	public static void main(String[] args) {

		System.out.println("Welcome to Java regex program");
		String postalPattern = "400 088"; // string to be validated
		String matcher = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$"; // regular expression to restrict character at end, beginning,space validity
		System.out.println(Pattern.matches(matcher, postalPattern));//prints true for 400 088 and 400088
	}

}
