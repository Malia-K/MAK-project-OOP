package Model;

import enums.Gender;
import enums.ManagerType;

public class Manager extends Employee {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ManagerType managerType;
	
	public Manager() {}
	
	public Manager(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, String login, int experience, ManagerType managerType) {
		super(firstName, lastName, gender, birthDate, password, enrolled, "M", "m" + String.format("%02d", Database.getInstance().getManagers().size() % 100) + login, experience);
		this.managerType = managerType;
	}
	
	public String toString() {
		return super.toString() + "\nmanager type: " + managerType;
	}
}
