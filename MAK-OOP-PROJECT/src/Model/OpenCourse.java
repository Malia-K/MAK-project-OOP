package Model;

import java.io.Serializable;
import java.util.Vector;
import enums.*;

public class OpenCourse implements Serializable, Comparable<OpenCourse>, Cloneable {
	private static final long serialVersionUID = 1L;
	private Course course;
	private String groupId;
	private Teacher teachers[];
	private Vector <Student> students;
    private StudyPeriod studyPeriod;
    
    {
    	teachers = new Teacher[2];
    	students = new Vector <Student>();
    }
    
    public OpenCourse() {}
    
    public OpenCourse(Course course, StudyPeriod studyPeriod, Teacher[] teachers) {
    	this();
    	this.course = course;
    	this.studyPeriod = studyPeriod;
    	groupId = "" + (studyPeriod.getYear() % 100) + studyPeriod.getSemester().name().charAt(0) + "_" + course.getId();
    	this.teachers = teachers;
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
	
	public Teacher[] getTeachers() {
		return teachers;
	}
	
	public Vector <Student> getStudents() {
		return students;
	}
	
	public boolean addStudent(Student s) {
		if(!students.contains(s)) {
			students.add(s);
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
	
	 public Object clone() throws CloneNotSupportedException {
			OpenCourse c = (OpenCourse) super.clone();
			c.course = (Course) course.clone();
			c.teachers = (Teacher[]) teachers.clone();
			c.studyPeriod = (StudyPeriod) studyPeriod.clone();
			return c;
	}

	public int compareTo(OpenCourse o) {
		if(studyPeriod.compareTo(o.getStudyPeriod()) == 0)  {
			if(course.compareTo(o.getCourse()) == 0) {
				return groupId.compareTo(o.getGroupId());
			}
			return course.compareTo(o.getCourse());
		}
		return studyPeriod.compareTo(o.getStudyPeriod());
	}
	
	public String toString() {
		String teachs = new String();
		for(Teacher t: teachers) {
			teachs += t.getFirstName().toUpperCase().charAt(0) + "." + t.getLastName() + " ";
		}
		return "id: " + course.getId() + "\nname: " + course.getName() + "\ngroup id: " + groupId + "\nteachers: " + ((teachers[0] == null) ? "" : teachs);
	}
}