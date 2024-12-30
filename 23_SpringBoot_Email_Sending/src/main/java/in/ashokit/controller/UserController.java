package in.ashokit.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.mail.internet.MimeMessage;

@Controller
public class UserController {

	@Autowired
	private JavaMailSender mailSender;

	@GetMapping("/email")
	@ResponseBody
	public String sendEmail() throws Exception {

		MimeMessage msg = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(msg);
		
		helper.setTo("ashokit.classes@gmail.com");
		helper.setSubject("Welcome to Ashok IT");
		helper.setText("<h1>This is heading</h1>", true);
		helper.addAttachment("Image", new File("file-path"));

		mailSender.send(msg);

		return "Email sent successfully";
	}
}
