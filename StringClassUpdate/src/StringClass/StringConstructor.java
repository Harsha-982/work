package StringClass;

public class StringConstructor {
	public static void main(String[] args) {
		String string= new String(); // empty string
		String string1= new String("Happy"); // string is intialized
		System.out.println(string1); //
		
		//stringbuffer
		StringBuffer strbuff=new StringBuffer("to"); 
		String string2= new String(strbuff);
		System.out.println(string2);
		
		//stringbuilder
		StringBuilder strbuil=new StringBuilder("learn");
		String string3= new String(strbuil);
		System.out.println(string3);
		
		//character
		char [] chvar = {'j','a','v','a'};
		String string4 =new String(chvar); // char array is passed
		System.out.println(string4);
		
		//boolean
		byte[] bytevar= {115,105,114};
		String string5 =new String(bytevar); // byte array
		System.out.println(string5); // converts to askii keyword...
	}
		
}
