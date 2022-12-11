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
    private Database database;
    private Schedule schedule; 
    
    static {
    	maxAllowedCredits = 21;
    }
    
    public Student() {}
    

	public Student(Faculty faculty, Degree degree, int yearOfStudy, Organization organization, int creditsTaken,
			Vector<Schedule> schedules, Vector<Transcript> transcript, Database database,
			Schedule schedule) {
		this.faculty = faculty;
		this.degree = degree;
		this.yearOfStudy = yearOfStudy;
		this.organization = organization;
		this.creditsTaken = creditsTaken;
		this.schedules = schedules;
		this.transcript = transcript;
		this.database = database;
		this.schedule = schedule;
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


	public void setSchedules(Vector<Schedule> schedules) {
		this.schedules = schedules;
	}


	public Vector<Transcript> getTranscript() {
		return transcript;
	}


	public void setTranscript(Vector<Transcript> transcript) {
		this.transcript = transcript;
	}


	public Database getDatabase() {
		return database;
	}


	public void setDatabase(Database database) {
		this.database = database;
	}


	public Schedule getSchedule() {
		return schedule;
	}


	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
    


 
    
    
}
