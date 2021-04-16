package Reverse;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String string= sc.nextLine();
		String s="";
		for (int i=string.length()-1;i>0;i--) {
			s=s+string.charAt(i);		
		}
		System.out.println(s);
	}
}
