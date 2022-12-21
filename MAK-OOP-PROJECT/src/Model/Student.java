package Model;

import java.util.HashMap;
import java.util.Objects;
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
		return super.toString() + "\nFaculty: " + faculty + "\nDegree: " + degree 
				+ "\nYear of study: " + yearOfStudy;
	}
	
	
	public int compareTo(User o) {
		if (super.compareTo(o) == 0) {
			Student s = (Student)o;
			if(this.yearOfStudy > s.yearOfStudy) return 1;
			if(this.yearOfStudy < s.yearOfStudy) return -1;
			return 0;
		}else {
			return super.compareTo(o);
		}
	}
	
	public boolean equals(Object o) {
		if(super.equals(o)) {
			Student s = (Student) o;
			return yearOfStudy == s.yearOfStudy &&
				   creditsTaken == s.creditsTaken &&
				   faculty.equals(s.getFaculty()) &&
				   degree.equals(s.getDegree());
				   
		}
		return false;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Student s = (Student)super.clone();
		s.faculty = (Faculty)this.faculty;
		s.degree = (Degree)this.degree;
		s.organization = (Organization) this.organization;
		s.registeredCourses = (HashMap<OpenCourse, Mark>) this.registeredCourses.clone();
		return s;
	}
	public int hashCode() {
		return Objects.hash(this.getFirstName(), this.getLastName(), this.faculty, this.yearOfStudy, this.degree);
	}

}