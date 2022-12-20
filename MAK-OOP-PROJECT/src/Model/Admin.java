package Model;

import Controller.AddUsers;
import Controller.ManageUsers;
import enums.Gender;

public class Admin extends Employee {
	private static final long serialVersionUID = 1L;

	public Admin() {}
	
	public Admin(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, String login, int experience) {
		super(firstName, lastName, gender, birthDate, password, enrolled, "A", "a" +String.format("%02d", Database.getInstance().getAdmins().size() % 100) + login, experience);
	}
	
	
	

	
}
