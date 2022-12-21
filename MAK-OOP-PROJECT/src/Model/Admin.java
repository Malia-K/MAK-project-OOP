package Model;

import java.util.Objects;

import enums.Gender;

public class Admin extends Employee {
	private static final long serialVersionUID = 1L;

	public Admin() {}
	
	public Admin(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, String login, int experience) {
		super(firstName, lastName, gender, birthDate, password, enrolled, "A", "a" +String.format("%02d", Database.getAdmins().size() % 100) + login, experience);
	}
	
	

    public int compareTo(Admin o) {
    	return super.compareTo(o);
    }
    
    public boolean equals(Object o) {
    	Admin a = (Admin)o;
    	return super.equals(a);
    }
    
    public Object clone() throws CloneNotSupportedException{
    	Admin copy = (Admin) super.clone();		
    	return copy;
    }
    
	public int hashCode() {
		return Objects.hash(this.getFirstName(), this.getLastName(), this.getExperience());
	}
}
