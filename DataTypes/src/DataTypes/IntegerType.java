package DataTypes;

public class IntegerType {
	public static void main(String[] args) {
// automatic promotion in java is byte->short->int->long->float->double
		byte bytenum=10;
		short shortnum=bytenum;
		int intnum=shortnum;
		long longnum=intnum;
		float floatnum=longnum; // implicitly conveted to float
		double doublenum =floatnum;// implicitly conveted to double
		int intnum2=(int) doublenum; // explicit type conversion from "double==> int"
		System.out.println(intnum2);
		

	}
}
