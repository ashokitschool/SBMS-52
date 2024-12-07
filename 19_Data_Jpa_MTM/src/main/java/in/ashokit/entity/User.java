package in.ashokit.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String uname;
	private String gender;
	
	@ManyToMany
	@JoinTable(
			name="user_roles",
			joinColumns = {
		        @JoinColumn(name = "user_id")
		    },
		    inverseJoinColumns = {
		        @JoinColumn(name = "role_id")
		    }
	)
	private List<Role> roles;

}





