package DataTypes;

public class DataType {

	public static void main(String[] args) {
		int rollnumber=2;
		String s= new String("Harsha");
		float cgpa =3.0f;
		boolean iseligible=cgpa>6?true:false;
		if(iseligible) {
			System.out.println(s);
			System.out.println(rollnumber);
			System.out.println(cgpa);			
		}
		else {
			System.out.println("Not Eligible to next level of Exam");
		}

	}

}
