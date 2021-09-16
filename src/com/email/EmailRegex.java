package com.email;

import java.util.regex.Pattern;

public class EmailRegex {

	public static void main(String[] args) {

		String emailPattern = "@bridgelabz"; // Pattern for usecase2
		String matcher = "@[a-zA-Z]+"; // Regex for usecase2
		System.out.println(Pattern.matches(matcher, emailPattern));
	}

}
