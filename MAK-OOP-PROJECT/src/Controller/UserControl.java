package Controller;

import Model.User;
public class UserControl{
	
	private User user;
    
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    
    public void login() {
    	
    }
    
    public void logOut() {}
    
    
    public void changePassword() {
    	
    }

    public boolean verify() {
        return false;
    }
    
    public void saveLogs() {}
    
    
    public void session() {
    	login();
    }
    
    
    public void viewUserInfo() {
    	System.out.println(user.toString());
    }
    
    
    public void viewBooks() {}
    
    
    public void viewNews() {}

    public void viewRegisterPage() {}

    public void viewMainPage() {}
    
    
    
    
}
