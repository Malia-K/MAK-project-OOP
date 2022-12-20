package Controller;

import java.io.*;

import Model.*;

public class ManagerControl extends EmployeeControl /*implements canSeeOrganizations, canViewCourses, canMakeReport*/ {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
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
				if(newCourse != null && !Database.getInstance().getCourses().contains(newCourse)) {
					Database.getInstance().getCourses().add(newCourse);
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
        list += formatDiv("a-----------b---------------------------b-----------b-------c\n");
        list += formatRow("|    ID     |        FULL NAME          |  FACULTY  |  GPA  |\n");
        list += formatDiv("d-----------e---------------------------e-----------e-------f\n");
        System.out.print(list);
    	for(Student s : Database.getInstance().getStudents()) {
    		String fullName = s.getLastName() + " "+ s.getFirstName();
    		String str1 = String.format("| %9s | %25s | %9s | %5x |", 
    									s.getId(), fullName, s.getFaculty(), 4);
            System.out.println(formatRow(str1));
    	}
    	System.out.println(formatDiv("g-----------h---------------------------h-----------h-------i"));
    	
    }
}
