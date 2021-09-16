package com.email;

import java.util.regex.Pattern;

public class EmailRegex {

	public static void main(String[] args) {

		String emailPattern = "abc.xyz@bridgelabz.co.in"; // Pattern for usecase4
		String matcher = "^[a-zA-Z0-9+_.]+@[a-zA-Z]+\\.[a-z.-]+$"; // Regex for usecase4
		System.out.println(Pattern.matches(matcher, emailPattern));
	}
}
