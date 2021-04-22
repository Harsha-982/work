package OneArray;

public class DeclCretIntial {
	public static void main(String[] args) {
		char []ch= {'a','b','m','n'};
		int []integer= {1,2,3,4};
		String[] str= {"abcd","efgh","ijkl"};
		
		// cannot split into two lines
		char charvar[]; // valid ==> we delared
//		ch= {'i','j','k'}; this is invalid
		
		// multi dimentional arrays
		byte[][] bytevar = {{1,2},{2,3}};
		
		// length vs length() 
		String[] strval=new String[3];
		strval[0]="harsha";
		int n=strval.length; // length of array... 
		System.out.println(n);
		System.out.println(strval[0].length()); //length of string inside array...
		
		}
}
