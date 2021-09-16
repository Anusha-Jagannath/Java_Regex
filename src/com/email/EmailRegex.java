package com.email;

import java.util.regex.Pattern;

public class EmailRegex {

	public static void main(String[] args) {

		String emailPattern = "abc.xyz@bridgelabz.co.in"; // Pattern for valid email id
		String emailPatternValid = "abc@bridgelabz.com";
		String valid1 = "abc@yahoo.com";
		String emailPatternInvalid = "abc@bridgelabzcom"; 
		String invalid1 = "abc";
		String invalid2 = "abc@.com.my";
		String invalid3 = "abc123@gmail.a";
		String invalid5 = "abc123@.com.com";
		String invalid6 = ".abc@abc.com";
		String invalid7 = "abc()*@gmail.com";
		String invalid8 = "abc@%*.com";
		String invalid9 = "abc..2002@gmail.com";
		String invalid10 = "abc.@gmail.com";
		String matcher = "^[a-zA-Z0-9+_.]+@[a-zA-Z]+\\.[a-z.-]+$"; // Regex for email id
		System.out.println(Pattern.matches(matcher, emailPattern)); //true
	    System.out.println(Pattern.matches(matcher, emailPatternValid)); //true
		System.out.println(Pattern.matches(matcher, valid1));
	    
	    System.out.println(Pattern.matches(matcher, emailPatternInvalid)); //false
		System.out.println(Pattern.matches(matcher, invalid1));
		System.out.println(Pattern.matches(matcher, invalid2));
		System.out.println(Pattern.matches(matcher, invalid3));
		System.out.println(Pattern.matches(matcher, invalid5));
		System.out.println(Pattern.matches(matcher, invalid6));
		System.out.println(Pattern.matches(matcher, invalid8));
		System.out.println(Pattern.matches(matcher, invalid9));
		System.out.println(Pattern.matches(matcher, invalid10));
		
	}
}

