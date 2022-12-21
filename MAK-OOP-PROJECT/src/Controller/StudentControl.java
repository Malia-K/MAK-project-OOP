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
		String list = "";
        list += formatDiv("a-----------b---------------------------b----------b--------------c\n");
        list += formatRow("|    ID     |        FULL NAME          | FACULTY  | TEACHER TYPE |\n");
        list += formatDiv("d-----------e---------------------------e----------e--------------f\n");
        System.out.print(list);
    	for(Teacher t : Database.getInstance().getTeachers()) {
    		String fullName = t.getLastName() + " "+ t.getFirstName();
    		String str1 = String.format("| %9s | %-25s | %-8s |%-14s |", 
    									t.getId(), fullName, t.getFaculty(), t.getTeacherType());
            System.out.println(formatRow(str1));
    	}
    	System.out.println(
    			formatDiv("g-----------h---------------------------h----------h--------------i"));
	}
	
	public void viewTranscipt() {}
	
	public void viewOrganizations() {}
	
	public void viewSchedule() {}
	
	public void viewStudentMark() {}
	
	public void makeRequest() {}
	
	public void viewCourses() {}
		

}