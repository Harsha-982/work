package ToInteger;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		int m=string.length();
		boolean flag=false;
		for(int i=0;i<m/2;i++) {
			if(string.charAt(i)==string.charAt(m-1-i)) {
				flag=true;
			
			}
		}
		if(flag==true) 
			System.out.println("Given String "+ string +" is Palindrome");
		else 
			System.out.println("Given String "+string + " is Not Palindrome");
	
	}
	
}
