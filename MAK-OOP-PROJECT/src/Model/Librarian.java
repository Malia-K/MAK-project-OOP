package Model;

import enums.Gender;

public class Librarian extends Employee {
	private static final long serialVersionUID = 1L;

	public Librarian() {}
    
	public Librarian(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, String login, int experience) {
		super(firstName, lastName, gender, birthDate, password, enrolled, "L", "l" + String.format("%02d", Database.getInstance().getLibrarians().size() % 100) + login, experience);
	}
	
	
	
}
