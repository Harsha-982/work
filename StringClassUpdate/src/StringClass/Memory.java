package StringClass;

public class Memory {
	public static void main(String[] arggs) {
		String str="Harsha"; //creates object in string constant pool
		String str1= new String("Harsha"); // creates object in heap and refers old object in scp
		
		String str2= "Harsha"; // refers to old one in scp because content is same..
		 
		System.out.println(str==str1);
		System.out.println(str==str2);
		
		String wishes ="Have a great day"; // creates a new object in scp 
		String wishes1= "Have a "+"great day"; // operation is carried out in compile time so it refers to old object
		System.out.println(wishes==wishes1);
		
		String wishes2= "Have a ";
		String wishes3=wishes2+"great day";// eventhough content is same we are using a variable so creates a new object
		System.out.println(wishes2==wishes);
		
		final String wishes4="Have a "; // operation of any final keyword is done at compile time
		String wishes5= wishes4+"great day"; 
		System.out.println(wishes5==wishes); // so wishes5 refers to same old object in scp..
	}
}
