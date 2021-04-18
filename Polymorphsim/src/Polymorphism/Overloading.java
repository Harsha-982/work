package Polymorphism;

public class Overloading {
	//methodoverloading methods are called by main method can be differenciated by method signature
	void methodoverloading(int x,int y) { // 1
		System.out.println(x+y);
	}
	void methodoverloading(int x) { // 2
		System.out.println(x);;
	}
}
class Main{
	public static void main(String[] args) {
		Overloading ml= new Overloading();
		ml.methodoverloading(10,20); // here the method signature is m1(int,int).. this calls==> 1
		ml.methodoverloading(10); // here method signature is m1(int)... this calls==>2
		
	}
}
