package Model;

import java.util.Objects;

import enums.Faculty;
import enums.Gender;
import enums.ManagerType;
import enums.TeacherType;

public class Manager extends Employee {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ManagerType managerType;
	
	public Manager() {}
	
	public Manager(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, String login, int experience, ManagerType managerType) {
		super(firstName, lastName, gender, birthDate, password, enrolled, "M", "m" + String.format("%02d", Database.getInstance().getManagers().size() % 100) + login, experience);
		this.managerType = managerType;
	}
	
	
	public ManagerType getManagerType() {
		return managerType;
	}

	public void setManagerType(ManagerType managerType) {
		this.managerType = managerType;
	}

	public String toString() {
		return super.toString() + "\nManager type: " + managerType;
	}
	

    public int compareTo(Manager m) {
    	if(super.compareTo(m) == 0) {
    		return this.managerType.compareTo(m.managerType);
    	}
    	return super.compareTo(m);
    }
    
    public boolean equals(Object o) {
    	if(super.equals(o)) {
    		Manager t = (Manager) o;
    		return this.managerType.equals(t.managerType);
    	}
    	return false;
    }
    
    public Object clone() throws CloneNotSupportedException{
    	Manager copy = (Manager) super.clone();
    	copy.managerType= (ManagerType)this.managerType; 			
    	return copy;
    }
    
	public int hashCode() {
		return Objects.hash(this.getFirstName(), this.getLastName(), this.managerType);
	}
	
}
