package StringClass;

public class StringNewObject {
	public static void main(String[] args) {
		//concat
		String name="Harsha"; // creates an string constant pool
		String name1="Harsha"; //refers to the object that has been already created
		String name2=new String("Harsha");// heap area and refers to old one
		String name3=new String("Harsha"); // heap and refers to old one
		// at runtime
		name.concat(name3); // in heap with no refernce variable and eligible for garbage collection in scp not eligible for garbage collecion.
		
//		String initialname= name.concat("Togaru"); // immutable so need to assign a new variable..
//		System.out.println(initialname+" "+name);
		
		// for double == operator it checks reference of an object..
		System.out.println(name==name1); // true
		System.out.println(name==name2); // false
		System.out.println(name2==name3); // false

	}
}

 class StringClass{
	public static void main (String[] args) {
		String wishes ="Have a great day";
		String wishes1 = "Have a "+"great day";
		//compiler converts it to "Have a great day" ==> 
		//operation is performed at copile timeso refers to old object in scp.. so true..
		System.out.println(wishes==wishes1); // true 
		
		
	// variable +string literal
		String wishes2= "Have a";
		String wishes3= wishes2+"great day";
		System.out.println(wishes1==wishes3); // "false" even for one variable==> then operation is performed at run time 
		
		// if variable is final 
		final String wishes4="Have a";
		String wishes5=wishes4+" great day";
		System.out.println(wishes5==wishes1); // true
		// for final variable operation is performed at compile time
		// so ans is true here
	}
	
}