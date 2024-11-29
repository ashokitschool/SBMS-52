package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	@Id
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private String country;
}
