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
}