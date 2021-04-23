package Wrapper;

public class Utility_valueOf {
// "valueOf()"==>string to corresponidng wrapper..
//-------------------------
	static Integer radix() {
		// (integral type, radix) 
		//it converts from decimal to base value given in radix..
		Integer I =Integer.valueOf("22",5); 
		return I;
	}
	public static void main(String[] args) {
	Integer I =Integer.valueOf("10");
	System.out.println(Utility_valueOf.radix());
	Float F =Float.valueOf("10.5f");
	Double D =Double.valueOf("10.5");
	Boolean B=Boolean.valueOf("false");
	
//Character C= Character.valueOf("c"); 
//will not work..because string to char conversion is not possible.. 
	}
}

 