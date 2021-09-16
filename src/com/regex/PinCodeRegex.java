package com.regex;

import java.util.regex.Pattern;

public class PinCodeRegex {

	public static void main(String[] args) {
      
		System.out.println("Welcome to Java regex program");
		String postalPattern = "567895"; //string to be validated
		String matcher = "[1-9]{1}[0-9]{5}"; //regular expression
		System.out.println(Pattern.matches(matcher,postalPattern));
	}

}
