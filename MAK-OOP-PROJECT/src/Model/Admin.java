package Model;

import java.sql.Date;

import enums.Gender;

public class Admin extends Employee {
	private static final long serialVersionUID = 1L;

	public Admin() {}
	
	public Admin(String firstName, String lastName, Gender gender, Date birthDate, String id, String login, int experience) {
		super(firstName, lastName, gender, birthDate, id, login, experience);
	}
}
