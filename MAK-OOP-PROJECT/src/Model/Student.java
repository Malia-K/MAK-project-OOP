package Model;

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
    private Vector <Schedule> schedules;
    private Vector<Transcript> transcript;
    private Schedule schedule; 
    
    static {
    	maxAllowedCredits = 21;
    }
    
    {
    	yearOfStudy = 1;
    }
    
    public Student() {}
    
    public Student(String firstName, String lastName, String password) {
    	super(firstName, lastName, password, "S");
    }

	public Student(Faculty faculty, Degree degree) {
		this.faculty = faculty;
		this.degree = degree;
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


	public int getCreditsTaken() {
		return creditsTaken;
	}


	public void setCreditsTaken(int creditsTaken) {
		this.creditsTaken = creditsTaken;
	}

	public int getMaxAllowedCredits() {
		return maxAllowedCredits;
	}

	public Vector<Schedule> getSchedules() {
		return schedules;
	}

	public Vector<Transcript> getTranscript() {
		return transcript;
	}
	
	public Schedule getSchedule() {
		return schedule;
	}
}
