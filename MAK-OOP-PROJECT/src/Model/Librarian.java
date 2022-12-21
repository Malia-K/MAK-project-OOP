package Model;

import java.util.Objects;

import enums.Faculty;
import enums.Gender;
import enums.TeacherType;

public class Librarian extends Employee {
	private static final long serialVersionUID = 1L;

	public Librarian() {}
    
	public Librarian(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, String login, int experience) {
		super(firstName, lastName, gender, birthDate, password, enrolled, "L", "l" + String.format("%02d", Database.getInstance().getLibrarians().size() % 100) + login, experience);
	}
	

    public int compareTo(Librarian o) {
    	return super.compareTo(o);
    }
    
    public boolean equals(Object o) {
    	Librarian l = (Librarian)o;
    	return super.equals(l);
    }
    
    public Object clone() throws CloneNotSupportedException{
    	Librarian copy = (Librarian) super.clone();		
    	return copy;
    }
    
	public int hashCode() {
		return Objects.hash(this.getFirstName(), this.getLastName(), this.getExperience());
	}
	
	

	
	
	
	
	
}
