 package Reverse;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		StringBuffer string= new StringBuffer(sc.nextLine());
//		System.out.println(string.reverse());
//		String string =sc.nextLine();
		StringBuffer s=new StringBuffer();
		for (int i=string.length()-1;i>=0;i--) {
			s.append(string.charAt(i));
			
			
		}
		System.out.println(s);
	}

}
//class Rev{
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		String string =sc.nextLine();
//		
//	}
//}
