
public class Doctor extends Person {
	
	private String phdTopic = "Dr.";

	public Doctor(String firstName, String lastName, int yearOfBirth) {
		
		super(firstName, lastName, yearOfBirth);
		
	}

	public String getPhdTopic() {
		return phdTopic;
	}

	public void setPhdTopic(String phdTopic) {
		this.phdTopic = phdTopic;
	}

	public String getName() {
		return phdTopic+" "+super.getName();
	}
}
