package Polymorphism;

public class Man {
	void pay() {
		System.out.println("common man paying bill");
	}
}
class Millionaire extends Man{
	void pay() {
		System.out.println("millionaire is paying bill");
	}
}
class Main2{
	public static void main(String[] args) {
		Man obj =new Millionaire();  // man reference but object is Millionaire so it calls derived class method
		obj.pay();
	}
}
