package Model;



import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

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
	
	public Vector<OpenCourse> getCourses() {
		return Database.getOpenCourses().stream().filter(c -> c.getTeachers().contains(this)).collect(Collectors.toCollection(Vector::new));
	}
    
    public int compareTo(Teacher o) {
    	if(faculty.compareTo(o.getFaculty()) == 0) {
    		if(teacherType.compareTo(o.getTeacherType()) == 0) {
    			if(rating > o.getRating()) return 1;
    			else if(rating < o.getRating()) return -1;
   				return 0;
   			}
   			return teacherType.compareTo(o.getTeacherType());
   		}
   		return faculty.compareTo(o.getFaculty()); 
    }
    
    public boolean equals(Object o) {
    	if(super.equals(o)) {
    		Teacher t = (Teacher) o;
    		return rating == t.getRating() && faculty.equals(t.getFaculty()) && teacherType.equals(t.getTeacherType());
    	}
    	return false;
    }
    
    public Object clone() throws CloneNotSupportedException{
    	Teacher copy = (Teacher) super.clone();

    	return copy;
    }
}
