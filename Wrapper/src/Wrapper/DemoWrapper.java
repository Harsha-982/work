package Wrapper;

public class DemoWrapper {
	public static void main(String[] args) {
		int a=10;
		Integer integer1 =new Integer(a); // boxing==> converting int to Integer
		int int1 =integer1.intValue(); //unboxing==> converting back from Integer to int
		// compiler automatically converts primitive data type to wrapper viceversa..
		Integer integer2= a; //autoboxing 
		int int2= integer2; // autounboxing
		System.out.println(integer1.getClass().getSimpleName());
	}
}