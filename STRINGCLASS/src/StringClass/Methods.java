package StringClass;

public class Methods {
	 public static void main(String[] args) {
		 String str ="happay1122 ";
		 String str1="   ";
		 System.out.println(str.codePointAt(0)); // gives askii value
		 System.out.println(str.trim().length());// trims the string and gives trimed string length
		 System.out.println(str.codePointBefore(1)); // gives askii value for before index
		 System.out.println(str.charAt(0)); // returns character t index
		 System.out.println(str.codePointCount(0, 4)); // returns int of number of different askii values in given range"hapy"==>4 ans 
		 System.out.println(str.endsWith(" ")); // checks ending charcter and returns boolean value
		 
		 // important
		 
		 
		 System.out.println(str.indexOf('a', 3)+" "+ str.indexOf('a')+" "+str.indexOf("ppa"));  // gives occurance from particular index
		 
		 System.out.println(str1.isBlank()+" " +str1.isEmpty()); // for blank it retrun true for empty it retuns false
		
		 }
}
