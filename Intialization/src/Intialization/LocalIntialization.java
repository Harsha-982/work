package Intialization;
//"NO DEFAULT INSTIALIZATION FOR LOCAL VARIABLE"
class LocalIntialization {
	int doggieage() {
		// for local variable.."NO DEFAULT METHOD FOR LOCAL VARIABLE"
		int age;
		// age=age+7; compiler gives error and says that need to be intialized... this can be made correct 
		// int age =0;
		//age=age+7;
		age=10+7; // this compiles fine 
		return age;
	}
		
	public static void main(String[] args) {
		LocalIntialization li= new LocalIntialization();
		
		System.out.println(li.doggieage());
	}
}
//
// Instance variables can have default declaration.
class InstanceIntialization{
	String name;// are available for complete class
	int age;
	String doggiename(){
		name=name+"Dijango"; // it gives "nullDijango " ==> but compiles fine
		return name; 
	}
	int doggiage() {
		age=age+7;   
		return age; // returns 7 and no null object because int is primitive and null cannot be assigned to primitive..
	}
	public static void main(String[] args) {
		InstanceIntialization ii= new InstanceIntialization();
		System.out.println(ii.doggiename());
		System.out.println(ii.doggiage());
	}
}
