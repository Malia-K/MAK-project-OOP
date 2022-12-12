package Model;

import java.sql.Date;

import enums.*;
public class Teacher extends Employee {
	private static final long serialVersionUID = 1L;
	private Faculty faculty;
    private double rating;
    Schedule schedule;
    
    public Teacher() {}
    
    public Teacher(String firstName, String lastName, Gender gender, Date birthDate, String id, String login, int experience, Faculty faculty) {
    	super(firstName, lastName, gender, birthDate, id, login, experience);
    	this.faculty = faculty;
    }
    
    
   public Faculty getFaculty() {
        return this.faculty;
    }
    
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    
   public double getRating() {
        return this.rating;
    }
    
    public void setRating(double rating) {
        this.rating = rating;
    }
    
    
}
