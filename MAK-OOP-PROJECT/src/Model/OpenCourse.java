package Model;

import java.io.Serializable;
import java.util.Vector;
import enums.*;

public class OpenCourse implements Serializable {
	private static final long serialVersionUID = 1L;
	private int maxNumOfStudents;
	private Course course;
	private String groupId;
	private Vector <Teacher> teachers;
	private Vector <Student> students;
    private StudyPeriod studyPeriod;
    
    {
    	teachers = new Vector <Teacher>();
    	students = new Vector <Student>();
    }
    
    public OpenCourse() {
    	maxNumOfStudents = 50;
    }
    
    public OpenCourse(Course course, StudyPeriod studyPeriod) {
    	this();
    	this.course = course;
    	this.studyPeriod = studyPeriod;
    	groupId = "" + (studyPeriod.getYear() % 100) + studyPeriod.getSemester().name().charAt(0) + "_" + course.getId();
    }
    
    public OpenCourse(Course course, StudyPeriod studyPeriod, int maxNumOf) {
    	this(course, studyPeriod);
    	maxNumOfStudents = maxNumOf;
    }
    
    public Course getCourse() {
    	return course;
    }

	public StudyPeriod getStudyPeriod() {
		return studyPeriod;
	}

	public String getGroupId() {
		return groupId;
	}
	
	public Vector <Teacher> getTeachers() {
		return teachers;
	}
	
	public Vector <Student> getStudents() {
		return students;
	}
	
	public boolean addStudent(Student s) {
		if(students.size() < maxNumOfStudents && !students.contains(s)) {
			students.add(s);
			return true;
		}
		return false;
	}
	
	public boolean addTeacher(Teacher t) {
		if(teachers.size() < 2 && !teachers.contains(t)) {
			teachers.add(t);
			return true;
		}
		return false;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		
		OpenCourse oc = (OpenCourse) o;
		return course.equals(oc.getCourse()) && groupId.equals(oc.getGroupId()) && studyPeriod.equals(oc.getStudyPeriod()) && teachers.equals(oc.getTeachers()) && students.equals(oc.getStudents());                             
	}
	
	public String toString() {
		String teachs = new String();
		for(Teacher t: teachers) {
			teachs += t.getFirstName().toUpperCase().charAt(0) + "." + t.getLastName() + " ";
		}
		return "id: " + course.getId() + "\nname: " + course.getName() + "\ngroup id: " + groupId + "\nteachers: " + ((teachers.isEmpty()) ? "" : teachs);
	}
}