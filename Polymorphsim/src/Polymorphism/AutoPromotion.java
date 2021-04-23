package Polymorphism;

public class AutoPromotion {
	void overload1(float f,int x)
	{
		System.out.println(f+x);
	}
	void overload2(int x) {
		System.out.println(x);
	}
}
class Main1{
	public static void main(String[] args) {
		AutoPromotion ap= new AutoPromotion();
// method signature here is (int,int) but we have (float,int) but we wont have any compile time error because of datatype promotion to float

		ap.overload1(10,10); 
//		ap.overload1(10.0); this will give compile time error cant convert float to int implicitly..
	}
}
