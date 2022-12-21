package Model;


import java.util.Vector;

import enums.Faculty;

public class Organization implements Cloneable{
    private String name;
    private String description;
    private Student head;
    private Vector<Student> members;
    private String dateOfCreation;
    private Faculty faculty;
    
    
    public Organization() {}
    
  
    public Organization(String name, String description, Student head, String dateOfCreation2, Faculty faculty) {
		super();
		this.name = name;
		this.description = description;
		this.head = head;
		this.dateOfCreation = dateOfCreation2;
		this.faculty = faculty;
	}

	public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student getHead() {
        return this.head;
    }
    
    public void setHead(Student head) {
        this.head = head;
    }

    public Vector<Student> getMembers() {
        return this.members;
    }
    
    public String getDateOfCreation() {
        return this.dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
    
    public Faculty getFaculty() {
        return this.faculty;
    }
    
    
    public Object clone() throws CloneNotSupportedException {
    	Organization copy = (Organization)super.clone();
    	copy.members.addAll(this.members);
		return copy;
    }
    
    

    

}
