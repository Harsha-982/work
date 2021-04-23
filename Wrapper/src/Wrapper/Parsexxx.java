package Wrapper;

public class Parsexxx {
	// "Xxx.ParseXxx " ==> converts string to any primitive except char...
	int getradix(String num) {
		int i =Integer.parseInt(num,4); // always takes only string..
		return i;
	}
	public static void main(String[] args) {
		Parsexxx parse =new Parsexxx();
		System.out.println(parse.getradix("100"));
		String str= "100";
		int i= Integer.parseInt(str);
		float f=Float.parseFloat(str);
		double d= Double.parseDouble("10.5");
		short s= Short.parseShort("5");
		System.out.println(f);
		System.out.println(i);
		System.out.println(s);
		System.out.println(d);
	}
}
