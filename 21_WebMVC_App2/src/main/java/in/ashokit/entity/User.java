package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "user_tbl")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;

	@NotEmpty(message = "Name is mandatory")
	private String name;

	@NotEmpty(message = "Email is mandatory")
	@Email(message = "Enter valid email id")
	private String email;

	@NotNull(message = "Phno is mandatory")
	private Long phno;

}
