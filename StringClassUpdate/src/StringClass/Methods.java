package StringClass;

import java.util.stream.IntStream;

public class Methods {
	public static void main(String[] args) {
		String str= new String("Happy");
		str.concat("p"); // object will create at runtime in heap and string literal in scp
		
		str.charAt(0); // takes int value and returns chartype
		// TO FIND ASKII CODE
		
		int value=str.codePointAt(1);// returns askii value for the character at index 
		System.out.println(value); 
		
		System.out.println(str.codePointBefore(1)); 
		
		// "TO FIND INDEX
		System.out.println(str.indexOf('h')); //gives =>-1 because of small letter h is not there
		System.out.println(str.toLowerCase().indexOf('h')); // gives => 0 because we conveted to lower case and then update
		System.out.println(str.indexOf('p',1)); // from particular index
		
		 System.out.println(str.lastIndexOf('p')); // string is immutable so eveen we concat with p at last it checks with past str object
		 System.out.println(str.lastIndexOf('p',3)); 
		 
		//
		 String str2="Happy";
		 System.out.println(str==str2);// both points to different objects 
		 System.out.println(str.equals(str2));// checks content so returns true
	}
}
