package Wrapper;

public class ToString {
//primitive , wrapper object to string
	public static void main(String[] args) {
		int a=10;
		Integer I =Integer.valueOf(a);
		String strInteger= I.toString(); // converted to string class from Integer type
		String strPrimitive= Integer.toString(a,3); // converted to string from Primitive type
		
		// to check whether converted to string or not 
		
		System.out.println(strInteger.getClass().getSimpleName()); 
		System.out.println(strPrimitive.getClass().getSimpleName());
		// converting to base3 string.. only in integer and long 
		System.out.println(strPrimitive);
	} 
}
