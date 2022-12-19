package Controller;

import Model.*;


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
	
	public void viewTeachers() {
		for(Teacher t: Database.getTeachers()) {
			
			System.out.println(t);
		}
	}
	
	public void viewTranscipt() {}
	
	public void viewOrganizations() {}
	
	public void viewSchedule() {}
	
	public void viewStudentMark() {}
	
	public void makeRequest() {}
	
	public void viewCourses() {}
		

}