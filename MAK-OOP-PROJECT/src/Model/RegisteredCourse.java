package Model;

import java.util.Vector;
import enums.*;

public class RegisteredCourse extends Course {
	private static final long serialVersionUID = 1L;
	private String groupId;
	private Vector <Teacher> teachers;
    private Mark mark;
    private StudyPeriod studyPeriod;
    
    {
    	teachers = new Vector <Teacher>();
    }
    
    public RegisteredCourse() {}
    
    public RegisteredCourse(String id, String name, int credits, Faculty faculty, String formula, StudyPeriod studyPeriod) {
    	super(id, name, credits, faculty, formula);
    	this.studyPeriod = studyPeriod;
    	groupId = "" + (studyPeriod.getYear() % 100) + studyPeriod.getSemester().name().charAt(0) + "_" + name;
    }
    
    public Mark getMark() {
    	
    	return mark;
    }

	public StudyPeriod getStudyPeriod() {
		return studyPeriod;
	}

	public void setStudyPeriod(StudyPeriod studyPeriod) {
		this.studyPeriod = studyPeriod;
	}
    
    public void setStudyPeriod(Semester semester, int year) {
    	setStudyPeriod(new StudyPeriod(semester, year));
    }

	public String getGroupId() {
		return groupId;
	}
	
	public String toString() {
		String teachs = new String();
		for(Teacher t: teachers) {
			teachs += t.getFirstName().toUpperCase().charAt(0) + "." + t.getLastName() + " ";
		}
		return super.toString() + "\ngroup id: " + groupId + "\nteachers: " + ((teachers.isEmpty()) ? "" : teachs);
	}
}