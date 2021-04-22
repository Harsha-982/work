package OneArray;

public class CreationOfArray {
	public static void main(String[] args) {
		//"CREATION "
		int[] arr=new int[8];
		// int[] a =new int[]; size cannot be empty
		int[] arr1=new int[0];// size can be zero
		
		
		// negative size
		int[] arr2=new int[-1]; // RE- NEGATIVE ARRAY SIZE EXCEPTION
//		System.out.println(arr);
		
		// "For two dimentional 
		int[][] twoarr= new int[2][]; // assigning size for first array is enough
//		multidimenstional array is developed as "array of array" concept ...not as matrix for memory issue
		twoarr[0] =new int[2];
		twoarr[1]=new int[3];
		
		//three dimentional array
		int [][][] threearr=new int[2][][];
		threearr[0]= new int[2][];//1
		threearr[0][0]=new int[2];//2
		threearr[0][1]=new int[1];//3
		threearr[1][0]=new int[2];//4
		threearr[1][1]=new int[2];//5
		// in line 4,5 the size is same for both arrays so that we can write it in other way even 
		threearr[1]=new int[2][2];// no need of writing it in two lines
		
	}
}
