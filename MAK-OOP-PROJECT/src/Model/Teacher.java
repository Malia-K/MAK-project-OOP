package Model;

import java.sql.Date;

import enums.*;
public class Teacher extends Employee {
	private static final long serialVersionUID = 1L;
	private Faculty faculty;
	private TeacherType teacherType;
    private double rating;
    Schedule schedule;
    
    public Teacher() {}
    
    public Teacher(String firstName, String lastName, Gender gender, String birthDate, String password, String enrolled, String login, int experience, Faculty faculty, TeacherType teacherType) {
		super(firstName, lastName, gender, birthDate, password, enrolled, "T", "t" +String.format("%02d", Database.getInstance().getTeachers().size() % 100) + login, experience);
    	this.faculty = faculty;
    	this.teacherType = teacherType;
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

	public TeacherType getTeacherType() {
		return teacherType;
	}

	public void setTeacherType(TeacherType teacherType) {
		this.teacherType = teacherType;
	}
}
