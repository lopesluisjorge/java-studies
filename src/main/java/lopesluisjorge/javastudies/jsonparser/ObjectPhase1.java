package lopesluisjorge.javastudies.jsonparser;

public class ObjectPhase1 {

	private String name;
	private String email;
	private String birthdate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public ObjectPhase2 toPhase2() {
		return new ObjectPhase2(this);
	}

	@Override
	public String toString() {
		return "ObjectPhase1 [name=" + name + ", email=" + email + ", birthdate=" + birthdate + "]";
	}

}
