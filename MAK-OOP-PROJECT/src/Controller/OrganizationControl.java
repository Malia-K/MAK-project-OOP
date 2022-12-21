package Controller;

import java.io.BufferedReader;
import java.io.IOException;

import Model.*;

public class OrganizationControl {
	BufferedReader br;
	
	private Organization organization;
	
	
	
	public OrganizationControl() {}
	
	
	public OrganizationControl(Organization o) {
		this.organization = o;
		
	}
	
	
	public void addMember() throws IOException {
		System.out.print(" Please enter the new member ID:");
		String newId = br.readLine();
		String ans;
		for(Student s : Database.getInstance().getStudents()) {
			if(s.getId().equals(newId)) {
				System.out.println(" Do you wanna add " + s.getLastName() + " " + s.getFirstName() + "?\n" +	
									"Y(yes) / N(no) ");
				ans = br.readLine();
				if(ans.toLowerCase().equals("y")) {
					organization.getMembers().add(s);
					System.out.println("New member successfully added.");
				}else {
					break;
				}
				
			}
		}
	}
		
	public void deleteMember() throws IOException {
		System.out.print(" Please enter the ex-member ID:");
		String newId = br.readLine();
		Student toDelete = new Student() ;
		boolean isFind = false;
		String ans;
		for(Student s : Database.getInstance().getStudents()) {
			if(s.getId().equals(newId)) {
				toDelete = s;
				isFind = true;
				
			}
		}
		
		if(isFind) {
			System.out.println(" Do you wanna delete " + toDelete.getLastName() + " " + toDelete.getFirstName() + "?\n" +	
					"Y(yes) / N(no) ");
			ans = br.readLine();
			if(ans.toLowerCase().equals("y")) {
				organization.getMembers().remove(toDelete);
				System.out.println("Member successfully removed.");
			}else {
				ManagerControl mc = new ManagerControl();
//				mc.viewMainPage();
			}
		}else {
			System.out.println("Member not found. Please try again");
			deleteMember();
		}
	}
	
	
	public void changeDescrription() throws IOException {
		System.out.print("Enter organization name:");
		String org = br.readLine();
		Organization toChange = new Organization();
		boolean isFind = false;
		for(Organization o : Database.getInstance().getOrganizations()) {
			if(o.getName().equals(org)) {
				toChange = o;
				isFind = true;
			}
		}
		
		if(isFind) {
			System.out.println("Enter new Description :");
			String newDesc = br.readLine();
			toChange.setDescription(newDesc);
		}else {
			System.out.println("Oops, there is no such organization. Try again");
			this.changeDescrription();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
}
