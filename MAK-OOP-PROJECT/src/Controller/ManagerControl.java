package Controller;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import Model.*;
import enums.Faculty;
import enums.Gender;


public class ManagerControl extends EmployeeControl /*implements canSeeOrganizations, canViewCourses, canMakeReport*/ {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    public ManagerControl() {}
    
    public ManagerControl(User user) {
    	super(user);
    }
    
    public Manager getManager() {
        return (Manager) super.getUser();
    }
    
    public void manageCourses() throws IOException {
    	try{
    		System.out.println("Choose action");
			int action = Integer.parseInt(br.readLine());
			if(action == 0) {
//				new AdminControl(activeAdmin).manageUsers();
				return;
			}
			else if(action == 1) {
				Course newCourse = (new CourseControl(getManager())).createCourse();
				if(newCourse != null && !Database.getCourses().contains(newCourse)) {
					Database.getCourses().add(newCourse);
				}
			}
			else if(action == 2) {
				(new CourseControl(getManager())).deleteCourse();
			}
			Database.databaseSave();
		} catch (NumberFormatException nfe) {
			System.err.println("Invalid input, please, try again!");
			manageCourses();
		}
    }

    public void viewAllStudents() {
    	String list = "";
        list += Format.formatDiv("a-----------b---------------------------b----------b-----------b------------b-------c\n");
        list += Format.formatRow("|    ID     |        FULL NAME          | FACULTY  |  DEGREE   | STUDY YEAR |  GPA  |\n");
        list += Format.formatDiv("d-----------e---------------------------e----------e-----------e------------e-------f\n");
        System.out.print(list);
    	for(Student s : Database.getStudents()) {
    		String fullName = s.getLastName() + " "+ s.getFirstName();
    		String str1 = String.format("| %9s | %-25s | %-8s | %-9s | %10x | %5x |", 
    									s.getId(), fullName, s.getFaculty(), s.getDegree(), s.getYearOfStudy(), 4);
            System.out.println(Format.formatRow(str1));
    	}
    	System.out.println(
    			Format.formatDiv("g-----------h---------------------------h----------h-----------h------------h-------i"));
    	
    }
    
    
    
    public void viewAllTeachers() {
    	String list = "";
        list += Format.formatDiv("a-----------b---------------------------b----------b--------------c\n");
        list += Format.formatRow("|    ID     |        FULL NAME          | FACULTY  | TEACHER TYPE |\n");
        list += Format.formatDiv("d-----------e---------------------------e----------e--------------f\n");
        System.out.print(list);
    	for(Teacher t : Database.getInstance().getTeachers()) {
    		String fullName = t.getLastName() + " "+ t.getFirstName();
    		String str1 = String.format("| %9s | %-25s | %-8s |%-14s |", 
    									t.getId(), fullName, t.getFaculty(), t.getTeacherType());
            System.out.println(Format.formatRow(str1));
    	}
    	System.out.println(
    			Format.formatDiv("g-----------h---------------------------h----------h--------------i"));
    }
    
    
    
    public void viewAllOrganizations() {
    	String list = "";

        list += Format.formatDiv("a-------------b---------------------------b----------b-------------------c\n");
        list += Format.formatRow("|    NAME     |       DESCRIPTION         | FACULTY  | ORGANIZATION HEAD |\n");
        list += Format.formatDiv("d-------------e---------------------------e----------e-------------------f\n");
        System.out.print(list);
    	for(Organization o : Database.getInstance().getOrganizations()) {
    		String str1 = String.format("| %9s | %-25s | %-8s |%-20s |", 
    									o.getName(), o.getDescription(), o.getFaculty(), o.getHead());
            System.out.println(Format.formatRow(str1));
    	}
    	System.out.println(
    			Format.formatDiv("g-------------h---------------------------h----------h-------------------i"));

        list += Format.formatDiv("a-------------b---------------------------b----------b-------------------c\n");
        list += Format.formatRow("|    NAME     |       DESCRIPTION         | FACULTY  | ORGANIZATION HEAD |\n");
        list += Format.formatDiv("d-------------e---------------------------e----------e-------------------f\n");
        System.out.print(list);
    	for(Organization o : Database.getOrganizations()) {
    		String str1 = String.format("| %9s | %-25s | %-8s |%-20s |", 
    									o.getName(), o.getDescription(), o.getFaculty(), o.getHead());
            System.out.println(Format.formatRow(str1));
    	}
    	System.out.println(
    			Format.formatDiv("g-------------h---------------------------h----------h-------------------i"));

    }
    
    
    
    
    public void addNewOrganization() throws IOException {
    	System.out.println("Please, add following information of a new organization in one line separated by space\n" 
				+ "\n\tName of organization:\n\tFaculty:\n\t"
				+ "Date of creation(YYYY-MM-DD):\n\tID of head of organization\n\t");
		try {
			String input = br.readLine();
//			if(goBack(input)) {
//				createUser();
//				return null;
//			}
			st = new StringTokenizer(input, " ");
			String name = st.nextToken();
			Faculty faculty = Faculty.valueOf(st.nextToken().toUpperCase());
			String dateOfCreation = st.nextToken();
			String headId = st.nextToken();
			
			Student head = new Student();
			for(Student s : Database.getInstance().getStudents()) {
				if(s.getId().equals(headId)) {
					head = s;
				}
			}
			
			if(!checkDateFormat(dateOfCreation)) {
				System.out.println("Date format is not correct, please, try again!");
				addNewOrganization();
			}
			
			System.out.println("Please, add a description");
			String description = br.readLine();
			
			Organization newOne = new Organization(name, description, head, dateOfCreation, faculty);
			Database.getInstance().getOrganizations().add(newOne);
		}  catch(IllegalArgumentException iae) {
			System.out.println("Format is not the same! Please, try again");
		}catch(NoSuchElementException nsee) {
			System.out.println("You forgot some inputs! Please, try again!");
		}

    }
    
    
    public void deleteOrganization() throws IOException {
    	System.out.println("Please enter the name of an organization to delete:");
    	String name = br.readLine();
    	boolean isFind = false;
    	Organization toDelete = new Organization();
    	for(Organization o : Database.getInstance().getOrganizations()) {
    		if(o.getName().equals(name)) {
    			toDelete = o;
    			isFind = true;
    		}
    	}
    	
    	if(isFind) {
    		Database.getInstance().getOrganizations().remove(toDelete);
    		System.out.println("Organization " + toDelete.getName() + " is deleted.");
    	}else {
    		System.out.println("Error! There is no such organization. Please try again");
    		deleteOrganization();
    	}
    }
    
	private boolean checkDateFormat(String date) {
		Pattern p = Pattern.compile("^[0-9]{4}-(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9])$");
		return p.matcher(date).matches();
	}
    
    
    
    
}