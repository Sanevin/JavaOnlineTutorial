package javaLessonThirteen;

//Strings and String builders

import java.util.Arrays;
@SuppressWarnings("unused")
public class JavaLessonThirteen {
	public static void main(String[] args){
	
	String randomString = "I'm just a randomString";
	
	String goToQuote = "He said, \"I'm here\"";
	
	int numTwo = 2;
	
	System.out.println(randomString + " " + goToQuote + numTwo);
	
	String upperCaseString = "BIG";
	String lowerCaseString = "big";
	
	if(upperCaseString.equalsIgnoreCase(lowerCaseString))
		{
			System.out.println("They're equal");
		}
	
		String letters = "abcde";
		String moreLetters = "fghijk";
		
		System.out.println("2nd char: " + letters.charAt(1));
		
		System.out.println(letters.compareTo(moreLetters));
		
		System.out.println(letters.contains("abc"));
		
		System.out.println(letters.endsWith("de"));
		
	}
}
