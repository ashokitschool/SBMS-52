package in.ashokit.beans;

public class DieselEngine implements IEngine{

	public DieselEngine() {
		System.out.println("DieselEngine :: Constructor");
	}

	@Override
	public int start() {
		// logic
		System.out.println("DieselEngine started...");
		return 1;
	}

}
