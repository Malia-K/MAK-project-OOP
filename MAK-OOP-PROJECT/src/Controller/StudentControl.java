package Controller;

import Model.Student;
import Model.User;

public class StudentControl extends UserControl /*implements canSeeOrganizations, canViewCourses, canMakeRequest, viewCourseData, hasSchedule*/ {
	
	public StudentControl() {}
	
	public StudentControl(User user) {
		super(user);
	}
	
	public Student getStudent() {
		return (Student) super.getUser();
	}
	
	
	public void CourseRegistration() {}
	
	
	public void rateTeacher() {}
	
	public void viewTeachers() {}
	
	public void viewTranscipt() {}
	
	public void viewOrganizations() {}
	
	public void viewSchedule() {}
	
	public void viewStudentMark() {}
	
	public void makeRequest() {}
	
	public void viewCourses() {}
		

    public void viewMainPage() {
    	super.viewMainPage();
    	System.out.println("4.  Student schedule \n"
				 		 + "5.  Transcript \n"
				 		 + "6.  Student marks \n"
				 		 + "7.  Library \n"
				 		 + "8.  Make request \n"
				 		 + "9.  View Courses \n"
				 		 + "10. Organizations \n"
				 		 + "11. View Teachers \n"
				 		 + "12. Rate Teachers \n");

    }
}