package Wrapper;

public class Utility_xxValue {
	//"xxxValue()" ==> converts wrapper object to Primitive value...
	public static void main(String[] args) {
		// byte- short-int-long-float-double in all 6 wrapper classes we have all six primitive typecasting me 	thods.. 
		Integer I = Integer.valueOf(32);
		System.out.println(I.byteValue());
		System.out.println(I.intValue());
		System.out.println(I.floatValue());
		System.out.println(I.shortValue());
		System.out.println(I.longValue());
		System.out.println(I.doubleValue());
		
		
		// character and boolean wrapper can convert only to respective primitive types.. 	
		
		Character c= new Character('a');
		char ch =c.charValue();
		System.out.println(ch);
		Boolean b =new Boolean("true");
		boolean bool=b.booleanValue();
		System.out.println(bool);
		}
}
