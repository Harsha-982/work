package StringBuffer;

public class DefaultCapacity{
	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer(); //16
		sb.append("abcdefghijklmnopbva"); 	 // 18 charcaters so -(16+1)*2=34
		System.out.println(sb.capacity());
		
		// if default is intialized
		StringBuffer sb1= new StringBuffer("abcd"); // 16+length(4)=20 
	//  already 4 got occupied 16 remaining now ...
		sb1.append("abcdefghijklmnopqrst"); // appending 20 more characters so now capacity is (20+1)*2= 42
		System.out.println(sb1.capacity());
		
		// assign intial capacity
		StringBuffer sb2 =new StringBuffer(10);
		System.out.println(sb2.capacity()); // its only 10... not 16+10..	
	}

}
