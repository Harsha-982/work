package Static;

public class StaticVariable {
//proof that static variables are created one per class
		static int nonStatic;
		static String mystr;
		static int num;
	public static void main(String[] args) {
		StaticVariable sv= new StaticVariable();
		StaticVariable sv1= new StaticVariable();
		  sv.nonStatic=30;
		  sv.mystr="harsha";
		  sv.num=44;
		  sv1.nonStatic=55;
		  sv1.mystr="togaru";
		  sv1.num=50;
		 // value of static variable is same for every instance.. i.e,.value of sv.num and sv1.num is same 
		  System.out.println("Value of num: "+sv.num);// 50 
		  System.out.println("Value of mystr: "+sv.mystr);// togaru
		  System.out.println("Value of nonStatic:"+ sv.nonStatic);//30
		
		  System.out.println("Value of num in ms1: "+sv1.num);//50 
		  System.out.println("Value of mystrin ms1: "+sv1.mystr);// togaru
		  //value for non-static variable keep on changing for every instance
		  System.out.println("Value of nonStatic in ms1:"+ sv1.nonStatic);//55 output changes
			   }
		
		}

