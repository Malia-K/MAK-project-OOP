package Model;


import enums.Gender;
/**
 * 
 * Class describing the common employee.
 * @author Miras
 *
 */
public class Employee extends User {
    private static final long serialVersionUID = 1L; 
	private int experience;
    /**
     * 
     * Default constructor.
     * 
     */
    public Employee() {}
    
    /**
     * 
     * Class constructor.
     * @param firstName
     * @param lastName
     * @param gender
     * @param birthDate
     * @param password
     * @param enrolled
     * @param id
     * @param login
     * @param experience
     */
    public Employee(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, String id, String login, int experience) {
    	super(firstName, lastName, gender, birthDate, password, enrolled, id, login);
    	this.experience = experience;
    }
    
    /**
     * 
     * Returns the employee's experience.
     * @return int
     */
    public int getExperience() {
		return experience;
	}
    
    /**
     * 
     * Sets the employee's experience.
     * @param experience
     */
	public void setExperience(int experience) {
		this.experience = experience;
	}
	/**
	 * 
	 * Simple comparison of employees by user's attributes and employee's experience.
	 * 
	 */
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
	/**
	 * 
	 * Comparisons of two employees in every possible parameters.
	 * 
	 */
	public boolean equals(Object o) {
		if(super.equals(o)) {
			Employee e = (Employee) o;
			return experience == e.getExperience();
		}
		return false;
	}
	/**
	 * 
	 * ToString method to display all employee's parameters correctly.
	 * 
	 */
	public String toString() {
		return super.toString() + "\nExperience: " + experience;
	}
	
	/**
	 * 
	 * Create an employee's clone.
	 * 
	 */
	public Object clone() throws CloneNotSupportedException {
		Employee e = (Employee) super.clone();
		return e;
	}
}
