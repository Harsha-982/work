package Wrapper;

public class StandardRadix {
	public static void main(String[] args) {
		String str =Integer.toString(10,2);
		System.out.println(Integer.toBinaryString(16));
		String standardoctal =Integer.toOctalString(16);
		String standardhex =Integer.toHexString(16);
		System.out.println(standardoctal);
		System.out.println(standardhex);
	}
}
