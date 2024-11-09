package in.ashokit.beans;

public class ATM {

	private IPrinter printer;

	public ATM() {
		System.out.println("ATM - 0-param Constructor");
	}

	public ATM(IPrinter printer) {
		System.out.println("ATM - param - Constructor");
		this.printer = printer;
	}

	public void setPrinter(IPrinter printer) {
		this.printer = printer;
		System.out.println("setPrinter() method called..");
	}

	public void withdraw() {
		System.out.println("withdraw successfull..");
		printer.print();
	}

}
