package Interface;

interface Interface {
	public static void main(String[] args) {
		Money mc= new Credit();
		mc.operation();
		Money md = new Debit();
		md.operation();
	}
}
