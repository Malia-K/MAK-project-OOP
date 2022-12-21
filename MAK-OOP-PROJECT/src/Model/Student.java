package Model;

import java.util.HashMap;
import java.util.Vector;
import enums.*;

public class Student extends User {
    private static final long serialVersionUID = 1L;
	private Faculty faculty;
    private Degree degree;
    private int yearOfStudy;
    private Organization organization;
    private int creditsTaken;
    private static final int maxAllowedCredits;
    private HashMap <OpenCourse, Mark> registeredCourses;
    
    static {
    	maxAllowedCredits = 21;
    }
    
    {
    	yearOfStudy = 1;
    	creditsTaken = 0;
    	registeredCourses = new HashMap <OpenCourse, Mark>();
    }
    
    public Student() {}
    
    public Student(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, String login, Faculty faculty, Degree degree, int yearOfStudy) {
    	super(firstName, lastName, gender, birthDate, password, enrolled, "S", "s" + String.format("%02d", Database.getInstance().getStudents().size() % 100) + login);
    	this.faculty = faculty;
    	this.degree = degree;
    	this.yearOfStudy = yearOfStudy;
    }

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree degree) {
		this.degree = degree;
	}

	public HashMap <OpenCourse, Mark> getRegisteredCourses() {
		return registeredCourses;
	}
	
	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}


	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public void addCourse(OpenCourse oc) throws CloneNotSupportedException {
		registeredCourses.put((OpenCourse) oc.clone(), new Mark());
		creditsTaken += oc.getCourse().getCredits();
	}

	public int getCreditsTaken() {
		return creditsTaken;
	}

	public int getMaxAllowedCredits() {
		return maxAllowedCredits;
	}

	public String toString() {
		return super.toString() + "\nfaculty: " + faculty + "\ndegree: " + degree 
				+ "\nyear of study: " + yearOfStudy;
	}

}
