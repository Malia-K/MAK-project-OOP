package Controller;

import Model.Teacher;
import Model.User;

public class TeacherControl extends EmployeeControl /*implements canViewCourses, canMakeRequest, viewCourseData, hasSchedule, canMakeReport*/ {
    public TeacherControl() {}
    
    public TeacherControl(User u) {
    	super(u);
    }

}