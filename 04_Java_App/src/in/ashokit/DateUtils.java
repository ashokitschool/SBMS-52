package in.ashokit;

public class DateUtils {

	private static DateUtils instance = null;

	// Step-1 : Make constructor as private
	private DateUtils() {
		System.out.println("DateUtils :: Constructor");
	}

	// Step-2 : Create static method to give same obj
	public static DateUtils getInstance() {
		if (instance == null) {
			instance = new DateUtils();
		}
		return instance;
	}
}
