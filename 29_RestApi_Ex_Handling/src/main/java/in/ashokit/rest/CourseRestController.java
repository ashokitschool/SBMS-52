package in.ashokit.rest;

import java.sql.Connection;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.exception.CourseNotFoundException;

@RestController
public class CourseRestController {

	@GetMapping("/course")
	public ResponseEntity<String> getCourseInfo(@RequestParam("name") String name) {

		String msg = null;

		if ("SBMS".equals(name)) {
			msg = "New SBMS will start jan ending..";
			return new ResponseEntity<>(msg, HttpStatus.OK);

		} else if ("JRTP".equals(name)) {
			msg = "New JRTP will start Feb first week..";
			return new ResponseEntity<>(msg, HttpStatus.OK);
		} else {
			throw new CourseNotFoundException("Course Not Found");
		}
	}
}
