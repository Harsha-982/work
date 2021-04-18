package Static;

import java.util.Scanner;

public class StaticDemo {
	// we made every variable static so that main method can reference the variables without any object creation of class..
	static Scanner sc= new Scanner(System.in); // we must make Scanner static as well because we cannot reference the static variables.
	static int breath= sc.nextInt();
	static int height=sc.nextInt();
	public static void main(String[] args) {
		// to print area of  rectangle...
		if(breath>0 && height>0) {
			int area= breath*height;
			System.out.println("Area of a rectangle="+" "+area);
		}
	}
}
