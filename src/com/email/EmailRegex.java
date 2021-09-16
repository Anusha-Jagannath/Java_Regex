package com.email;

import java.util.regex.Pattern;

public class EmailRegex {

	public static void main(String[] args) {

		String emailPattern = "@bridgelabz.com"; // Pattern for usecase3
		String matcher = "@[a-zA-Z]+\\.[a-z]{2,4}"; // Regex for usecase3
		System.out.println(Pattern.matches(matcher, emailPattern));
	}
}
