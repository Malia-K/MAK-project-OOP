package Controller;

import java.time.LocalDateTime;

import Model.*;

public class ManagerControl extends EmployeeControl /*implements canSeeOrganizations, canViewCourses, canMakeReport*/ {
    private Manager manager;
    
    public Manager getManager() {
        return this.manager;
    }
    
    public void setManager(Manager manager) {
        this.manager = manager;
    } 
    
    
    public void manageNews() {
    	
    }
}
