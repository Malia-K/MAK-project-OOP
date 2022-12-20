package Controller;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.Vector;

import Model.*;
import enums.Faculty;

public class CourseControl {
	BufferedReader br;
	StringTokenizer st;
	private Manager activeManager;
	
	{
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public CourseControl() {}
	
	public CourseControl(Manager m) {
		activeManager = m;
	}
	
	private Vector <Course> prereqs(String ids) {
		Vector <Course> prereqs = new Vector <Course>();
		st = new StringTokenizer(ids, " ");
		while(st.hasMoreTokens()) {
			for(Course c: Database.getInstance().getCourses()) {
				if(c.getId().equals(st.nextToken())) {
					prereqs.add(c);
				}
			}
		}
		return prereqs;
	}
	
	private boolean goBack(String input) throws IOException {
		if(input.equals("0")) {
			(new ManagerControl(activeManager)).manageCourses();
			return true;
		}
		return false;
	}
	
	public Course createCourse() throws IOException {
		System.out.println("Print 0 to go back\n\nTo add course add following information separated by space:"
				+ "\n\tcourse id\n\tcourse name\n\tcredits\n\tfaculty: \n\tformula: hours of lecture/hours of practice\n\tprerequisite id");
		try {
			String input = br.readLine();
			if(goBack(input)) {
				return null;
			}
			
			StringTokenizer st = new StringTokenizer(input, " ");
			String id = st.nextToken();
			String name = st.nextToken();
			int credits = Integer.parseInt(st.nextToken());
			String faculty = st.nextToken().toUpperCase();
			String formula = st.nextToken();
			String prereqsId = new String();
			while(st.hasMoreTokens()) {
				prereqsId += st.nextToken() + " ";
			}
			
			System.out.println(prereqsId + "sdsd");
			
			if(prereqsId.length() != 0) {
				Vector <Course> prerequisites = prereqs(prereqsId);
				
				return new Course(id, name, credits, Faculty.valueOf(faculty), formula, prerequisites);
			}
			
			return new Course(id, name, credits, Faculty.valueOf(faculty), formula);
			
		} catch(NumberFormatException nfe) {
			System.out.println("Not an integer! Please, try again");
		}catch(IllegalArgumentException iae) {
			System.out.println("Format is not the same! Please, try again");
			}
		catch(NoSuchElementException nsee) {
			System.out.println("You forgot some inputs! Please, try again!");
			}
		return createCourse();
	}
	
	public void deleteCourse() throws IOException {
		System.out.println("Print 0 to go back\n\nPlease, give the ID of course that you want to delete");
		String id = br.readLine();
		if(id.length() == 0) {
			System.out.println("The input is empty, please try again");
			deleteCourse();
			return;
		}
		if(goBack(id)) {
			return;
		}
		for(Course c: Database.getInstance().getCourses()) {
			if(c.getId().equals(id)) {
				Database.getInstance().getCourses().remove(c);
				System.out.println("Course " + id + " deleted");
				return;
			}
		}
		System.out.println("Course " + id + " wasn't found");
	}
}