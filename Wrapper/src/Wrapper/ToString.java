package Wrapper;

public class ToString {
//primitive , wrapper object to string
	public static void main(String[] args) {
		int a=10;
		Integer I =Integer.valueOf(a);
		String strInteger= I.toString(); // converted to string class from Integer type
		String strPrimitive= Integer.toString(a,2); // converted to string from Primitive type
		
		// to check whether converted to string or not 
		
		System.out.println(strInteger.getClass().getSimpleName()); 
		System.out.println(strPrimitive.getClass().getSimpleName());
		// to print string of binary
		System.out.println(strPrimitive);
	} 
}
