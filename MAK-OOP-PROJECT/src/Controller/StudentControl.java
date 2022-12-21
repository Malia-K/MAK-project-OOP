package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Model.*;


public class StudentControl extends UserControl /*implements canSeeOrganizations, canViewCourses, canMakeRequest, viewCourseData, hasSchedule*/ {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
	public StudentControl() {}
	
	public StudentControl(User user) {
		super(user);
	}
	
	public Student getStudent() {
		return (Student) super.getUser();
	}
	
	
	public void courseRegistration() throws IOException, CloneNotSupportedException {
		System.out.println("choose group id of available course");
		viewRegistrationCourses();
		
		String id = br.readLine();
		
		for(OpenCourse oc: Database.getOpenCourses()) {
			if(oc.getGroupId().equals(id)) {
				if(oc.getCourse().getCredits() + getStudent().getCreditsTaken() < getStudent().getMaxAllowedCredits() && !getStudent().getRegisteredCourses().containsKey(oc)) {
					getStudent().addCourse(oc);
				}
			}
		}
	}
	
	
	public void rateTeacher() {}
	
	public void viewTeachers() {
		String list = "";
        list += Format.formatDiv("a-----------b---------------------------b----------b--------------c\n");
        list += Format.formatRow("|    ID     |        FULL NAME          | FACULTY  | TEACHER TYPE |\n");
        list += Format.formatDiv("d-----------e---------------------------e----------e--------------f\n");
        System.out.print(list);
    	for(Teacher t : Database.getTeachers()) {
    		String fullName = t.getLastName() + " "+ t.getFirstName();
    		String str1 = String.format("| %9s | %-25s | %-8s |%-14s |", 
    									t.getId(), fullName, t.getFaculty(), t.getTeacherType());
            System.out.println(Format.formatRow(str1));
    	}
    	System.out.println(Format.formatDiv("g-----------h---------------------------h----------h--------------i"));
	}
	
	public void viewTranscipt() {}
	
	public void viewOrganizations() {}
	
	public void viewSchedule() {}
	
	public void viewStudentMark() {}
	
	public void makeRequest() {}
	
	public void viewRegistrationCourses() {
		String list = "";
        list += Format.formatDiv("a-----------b---------------------------b----------b--------------c\n");
        list += Format.formatRow("|    ID     |        COURSE NAME        | FACULTY  |    LECTOR    |\n");
        list += Format.formatDiv("d-----------e---------------------------e----------e--------------f\n");
        System.out.print(list);
    	for(OpenCourse t : Database.getOpenCourses()) {
    		String teacherName = t.getTeachers()[0].getFirstName().charAt(0) + " "+ t.getTeachers()[0].getLastName();
    		String str1 = String.format("| %9s | %-25s | %-8s |%-14s |", 
    									t.getGroupId(), t.getCourse().getName(), t.getCourse().getFaculty(), teacherName);
            System.out.println(Format.formatRow(str1));
    	}
    	System.out.println(Format.formatDiv("g-----------h---------------------------h----------h--------------i"));	
	}
	
	public void viewMainPage() throws InterruptedException {
	      super.viewMainPage();
	      System.out.print(  " 4.  Student schedule \n"
	              + " 5.  Transcript \n"
	              + " 6.  Student marks \n"
	              + " 7.  Library \n"
	              + " 8.  Make request \n"
	              + " 9.  View Courses \n"
	              + " 10. Organizations \n"
	              + " 11. View Teachers \n"
	              + " 12. Rate Teachers \n");

	    }

}