package in.ashokit.beans;

public class ATM {

	private IPrinter printer;

	public ATM() {
		System.out.println("ATM - Constructor");
	}

	public void setPrinter(IPrinter printer) {
		this.printer = printer;
	}

	public void withdraw() {
		System.out.println("withdraw successfull..");
		printer.print();
	}

}
