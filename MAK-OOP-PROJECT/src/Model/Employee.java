package Model;


import enums.Gender;

public class Employee extends User {
    private static final long serialVersionUID = 1L; 
	private int experience;
    
    public Employee() {}
    
    public Employee(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, String id, String login, int experience) {
    	super(firstName, lastName, gender, birthDate, password, enrolled, id, login);
    	this.experience = experience;
    }
    
    public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public int compareTo(User o) {
		if (super.compareTo(o) == 0) {
			Employee e = (Employee)o;
			if(this.experience > e.experience) return 1;
			if(this.experience < e.experience) return -1;
			return 0;
		}else {
			return super.compareTo(o);
		}
	}
	
	public boolean equals(Object o) {
		if(super.equals(o)) {
			Employee e = (Employee) o;
			return experience == e.getExperience();
		}
		return false;
	}
	
	public String toString() {
		return super.toString() + "\nExperience: " + experience;
	}
}
