package in.ashokit.exception;

public class CourseNotFoundException extends RuntimeException {

	public CourseNotFoundException() {

	}

	public CourseNotFoundException(String msg) {
		super(msg);
	}

}
