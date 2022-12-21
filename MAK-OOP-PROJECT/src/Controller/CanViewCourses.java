package Controller;

import java.util.Vector;
import Model.*;
import enums.Faculty;

public interface CanViewCourses {
	public Vector <Course> getAllCourses();
	
	public Vector <Course> getFacultyCourses(Faculty faculty);
	
	public Vector <OpenCourse> getAllOpenCourses();
	
	public Vector <OpenCourse> getFacultyOpenCourses(Faculty faculty);
	
	public Vector <Course> viewCourse();
	
	
}
