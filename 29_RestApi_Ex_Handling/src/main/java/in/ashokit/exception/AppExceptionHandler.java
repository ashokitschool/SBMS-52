package in.ashokit.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = CourseNotFoundException.class)
	public ResponseEntity<ExInfo> handleCourseEx(CourseNotFoundException e) {

		String message = e.getMessage();

		ExInfo exinfo = new ExInfo();
		exinfo.setExCode("EX79797");
		exinfo.setExMsg(message);
		exinfo.setExDate(LocalDateTime.now());

		return new ResponseEntity<>(exinfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ExInfo> handleException(Exception e) {

		String message = e.getMessage();

		ExInfo exinfo = new ExInfo();
		exinfo.setExCode("EX12347");
		exinfo.setExMsg(message);
		exinfo.setExDate(LocalDateTime.now());

		return new ResponseEntity<>(exinfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
