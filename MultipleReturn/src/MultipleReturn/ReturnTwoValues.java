package MultipleReturn;

public class ReturnTwoValues {
	public int [] getarray(int a, int b) {
		int[] array= new int[2];
		array[0] =a; // stores a in index 0
		array[1]=b; // stores b in index 1
		return array; // returns an array
	}
	public static void main(String[] args) {
		 ReturnTwoValues rtv = new ReturnTwoValues();
		 int [] array = rtv.getarray(10,20); //passing values to getarray method
		 System.out.println(array[0]); 
		 System.out.println(array[1]);
		
	}
}
class Multiple {
	int mul; // to store multiplication
	double div; // to store division
	int add; // to store addition
	Multiple(int m, double d, int a)
	{
		mul = m;
		div = d;
		add = a;
	}
}

class Test {
	 Multiple getMultDivAdd(int a, int b)
	{
		// Returning multiple values of different
		// types by returning an object
		return new Multiple(a*b, a/b,a+b);
		
	}

	
	public static void main(String[] args)
	{
		Test t =new Test();
		Multiple ans = t.getMultDivAdd(10, 20);
		System.out.println("Multiplication = " + ans.mul);
		System.out.println("Division = " + ans.div);
		System.out.println("Addition = " + ans.add);
	}
}



