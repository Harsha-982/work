package OneArray;

public class Loop {
	public static void main(String[] args) {
		int[] array= new int[3]; // one object
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array= new int[4];// here one more object...==> total 2 objects but variable array is pointed to new object 
		// so the first object is for"GC"
		System.out.println(array.length); //  
		
		//object class array can have multiple data types...
		 Object[] obj= new Object[3];
		 obj[0]= new String("Harsha");
		 obj[1]= Integer.valueOf(1);
		 obj[2] =Integer.parseInt("121");
		 for(Object iter:obj) {
			 System.out.println(iter);
		 }
		 
		 //array can have its declared type or its subclass type..
		 Number[] num=new Number[3];
		 num[0]=1;
		 num[1]=10.4;
//		 num[2] ="String"; //invalid because there is no method of string in number class
		 
	}
}
