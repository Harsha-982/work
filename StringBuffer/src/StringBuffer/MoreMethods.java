package StringBuffer;

public class MoreMethods {
	public static void main(String[] args) {
		
	
	StringBuffer sb= new StringBuffer("Harsha");
	sb.reverse();
	System.out.println(sb);
	
	// setLength==> till specified length the string gets returned and remaining is negleted...
	sb.setLength(4);
	System.out.println(sb);
	// to increase capacity dynamically...
	sb.ensureCapacity(199); // minimum capacity that our sb should have..
	System.out.println(sb.capacity()); // now our capacity is 199
	
	// to decrese capacity
	sb.trimToSize(); // ahsr
	System.out.println(sb.capacity());// output 4
	}
}
