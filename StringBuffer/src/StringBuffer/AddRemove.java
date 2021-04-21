package StringBuffer;

public class AddRemove {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("Harshavardhini");
		sb.length();
		
		//"REPLACE IN PLACE OF OTHER
		// difference between replace and setChatAt in stringbuffer is
		sb.replace(14,14," Togaru"); // all three parameters are must and should..(int,int,string)
		System.out.println(sb);
		sb.setCharAt(1,'b'); //replaces character at a particular index..(int,char)
		System.out.println(sb);
		
		// "NOT TO REPLACE TO ADD SOMETHING NEW WITHOUT REPLACING WITH OTHER
		sb.append('i');// (any type).. thats yy overloaded method
		System.out.println(sb);
		sb.insert(0, 10.5); //overloded method
		System.out.println(sb);
		
		//TO DELETE 
		sb.delete(0,3);// deleted 10.(int,int)
		sb.deleteCharAt(0); //5(int)==>index of character..
		System.out.println(sb);
		
	}
}
