package Controller;

import Model.User;
public class UserControl {
	private User user;
    
	public UserControl() {}
	
	public UserControl(User user) {
		this.user = user;
	}

    public User getUser() {
        return this.user;
    }

    public void changePassword() {
    }

    public boolean verify() {
        //TODO
        return false;
    }
}
