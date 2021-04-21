package StringClass;

final class Immutable { // we make anything as final so that reassignment is not possible for that..	.
	int i;
	Immutable(int i){
		
		this.i=i; // refers to current object
	}
	public Immutable update(int value) 
	{
		if(this.i==value) {
			return this;
		}
		else { 
			return new Immutable(value);
		}
	}
	public static void main(String[] args) {
		Immutable im= new Immutable(10);
		Immutable im2=im.update(100);
		Immutable im3=im.update(10);
		System.out.println(im==im2);
		System.out.println(im==im3);
	}
}
