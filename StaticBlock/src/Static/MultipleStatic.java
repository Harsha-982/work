package Static;

public class MultipleStatic {
//Execution order of static block is in the that they are intialized..
		static int num;
		static String mystr;	
	   
	   //First Static block
	   static{
	      System.out.println("Static Block 1");
	      num = 68;
	      mystr = "Block1";
	  } 
	  //Second static block
	  static{
	      System.out.println("Static Block 2");
	      num = 98;
	      mystr = "Block2";
	  }
	  public static void main(String args[])
	  {
		  System.out.println("value of mystr"+mystr);//98
		  System.out.println("value of num"+num);//Block2 
		 }
}


