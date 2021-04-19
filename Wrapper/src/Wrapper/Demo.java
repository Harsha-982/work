package Wrapper;
// ALL WRAPPER CLASSES HAVE TWO CONSTRUCTORS..EXCEPT 2
// FLOAT HAS THREE CONSTRUCTORS...
// CHARACTER HAS ONLY ONE CONSTRUCTOR...
public class Demo {
	public static void main(String[] args) {
		 byte b=10; 
		 Byte B =new Byte(b);
		 System.out.println(B);
		 short s = 20;
		 Short S =new Short("20");
		 System.out.println(S);
		 long l= 30;
//CE     Long L= new Long("thirty");  // compiles fine but gets number format exception
		 float f =10.5f;
		 Float F =new Float(10.5); // float has three constrctors..
		 Float F1= new Float("10.5");
		 System.out.println(F);
		 double d=10.5;
		 Double D =new Double(d);
		 System.out.println(D);
		 char ch='a';
		 Character CH =new Character('a');
		 Boolean Bool= new Boolean("true");
		 Boolean Bool1 =new Boolean("False");
		 Boolean Bool2= new Boolean("yes"); 
		// gives true because it dosen't see if it is lower or upper but sees only whether the given sring is true of false
		 System.out.println(Bool2.equals(Bool1));   
	 }
}

