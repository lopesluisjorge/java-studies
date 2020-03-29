package lopesluisjorge.javastudies.jsonparser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ObjectPhase2 {

	private String name;
	private String email;
	private LocalDate birthdate;

	public ObjectPhase2(ObjectPhase1 phase1) {
		this.name = phase1.getName();
		this.email = phase1.getEmail();
		this.birthdate = LocalDate.parse(phase1.getBirthdate(), DateTimeFormatter.ofPattern("DD/mm/yyyy"));
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	@Override
	public String toString() {
		return "ObjectPhase2 [name=" + name + ", email=" + email + ", birthdate=" + birthdate + "]";
	}

}
