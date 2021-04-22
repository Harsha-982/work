package OneArray;

public class Declaration {

	public static void main(String[] args) {
		//Declaration
		int arr1[]; //cannot assign value in declartion
		int arraftvar[];
		int[] arr_atdata;
		int []arrbefvar;
		
		// For Two Dimentional Array
		int[][]  twodimarr_atdata;
		int  [][]twodimarrbefvar;
		int  twodimarraftvar[][];
		
		//three moredifferent declarations
		int[] []arr;
		int[] ar1[];
		int  []arr2[];
		
		//Important array declarations which are valid
							      							
		int[] firstarr,secondarr; //dim(1,1) ==>1
		int[] firstar1r[],secondarr1[]; // (2,2) ==>2
		int[] firstarr2[],secondarr2; //(2,1) ==>3
		int[] []firstarr3,secondarr3; //(2,2) ==>4
//		int[] []firstarr4,[]secondarr4;CE-compiletiem error ==>
		/*because the compiler in case 4 the space between datatype and variable is ignored by the compiler and takes it as two 
			dimentional.. whereas in case 5 the compiler cannot consider till secondarr4 as space and ignore because
			firstarr3 is declared.."CASE 5 IN INVALID DECLARATION". so before variable array is declared only for first variable
			*/
	}

}
