package DataTypes;

import java.util.Scanner;

public class DataType {
	//Convertion of int to string and string to int 
	static Scanner sc= new Scanner(System.in);
	static int number=sc.nextInt();// integer type
	static String str=String.valueOf(number);// converted to string
	public static void main(String[] args) {
		if(number==Integer.parseInt(str)) { //checking whether it is int data type or not
			System.out.println("int data type number is converted to string:"+str);
		}
		else {
			System.out.println("int data type number is not converted to string");
		}
			
	}
}
