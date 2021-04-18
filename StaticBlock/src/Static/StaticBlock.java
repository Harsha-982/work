package Static;

import java.util.Scanner;

public class StaticBlock {
	static Scanner sc=new Scanner(System.in);
    static int breath= sc.nextInt();
    static int height= sc.nextInt();
    static boolean flag=true;
    //if this block of code is replaced by static block then this wont get executed...because it is not called by main method
	/*
	  void sum() { if(B<0 || H<0){ flag=false;
	  System.out.println("java.lang.Exception: Breadth and height must be positive"
	  ); } }
	 */
    
    // even if static block is not called by the main method it gets executed when the class is loaded into the memory...
    // prints excetion if breath or height of an object is negative...
    static{
        if(breath<0 || height<0){
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    
    
	public static void main(String[] args){
			if(flag){
				int area=breath*height;
				System.out.print(area);
			}
		
	}
}
