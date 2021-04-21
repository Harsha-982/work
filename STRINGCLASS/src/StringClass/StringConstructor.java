package StringClass;

public class StringConstructor {
	public static void main(String[] args) {
		String str= new String();
		String str1=new String("happy");
		System.out.println(str1);
		
		// constructor with string buffer
		StringBuffer strbuffvar =new StringBuffer("to"); 
		String str2=new String(strbuffvar);
		System.out.println(str2);
		
		//constructor with string builder
		StringBuilder strbuilvar = new StringBuilder("learn");
		String str3= new String(strbuilvar);
		System.out.println(str3);
		
		//constructor with chartype
		char [] chvar = {'j','a','v','a'};
		String str4= new String(chvar);
		System.out.println(str4);
		
		//constructor with byte type
		byte[] bytevar = {115,105,114};
		String str5=new String(bytevar);
		System.out.println(str5);
		
	}
}
