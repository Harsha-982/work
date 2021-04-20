package Reverse;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
// 		String string= sc.nextLine();
// 		String s=" ";
		StringBuffer sb= new StringBuffer(sc.nextLine());
		StringBuffer sb = new StringBuffer();
		for (int i=string.length()-1;i>=0;i--) {
			sb.append(string.charAt(i));
		}
		System.out.println(sb);
	}
}
