package OneArray;

public class Basic {
	public static void main(String[] args) {
		int[] charvar=new int['s'];// accepts char because of auto promotion
		//System.out.println(charvar.length); // s for askii number is 115 
		
		int[] bytevar =new int[8];
	//	System.out.println(bytevar.getClass().getName()); // it gives u class name
		System.out.println(bytevar); // this is a reverse variable pointing to aray object
		// so it gives you combination of class + hashcode in hexadecimal form ==>[I@41a555e...
		
		System.out.println(bytevar[7]);// it is not refernce for anything so default value is obtained.."0"
		
		//EXAMPLE:1
		// in case of multidimentional array example twodimentional array
		char[][] twocharvar=new char[2][2];
		System.out.println(twocharvar); 
		System.out.println(twocharvar[0]); // it is also refernce of 1 dimentional array
		System.out.println(twocharvar[0][0]);
		
		//EXAMPLE:2
		//int[][] arr=new int[2][]; =>CE 
		//System.out.println(arr[0]); because its operating on null because of no size  for one dimention array 
		
	}
}
