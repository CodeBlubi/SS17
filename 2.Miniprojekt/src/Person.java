
public class Person {
	
	private String firstName;
	private String lastName;
	
	protected int yearOfBirth;
	
	public Person(String firstName, String lastName, int yearOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
}
