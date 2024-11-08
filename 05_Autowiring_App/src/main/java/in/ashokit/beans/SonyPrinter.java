package in.ashokit.beans;

public class SonyPrinter implements IPrinter {

	public SonyPrinter() {
		System.out.println("SonyPrinter :: Constructor");
	}
	
	@Override
	public void print() {
		System.out.println("Sony Printer - printing...");
	}

}
