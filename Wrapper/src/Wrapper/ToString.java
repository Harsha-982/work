package Wrapper;

public class ToString {
//primitive , wrapper object to string
	public static void main(String[] args) {
		int a=10;
		Integer I =Integer.valueOf(a);
		String strInteger= I.toString();
		String strPrimitive= Integer.toString(a);
		
		// to check whether converted to string or not 
		
		System.out.println(strInteger.getClass().getSimpleName()); // converted to string class from Integer type
		System.out.println(strPrimitive.getClass().getSimpleName()); // converted to string from Primitive type
	} 
}
