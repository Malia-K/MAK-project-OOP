package Model;

import java.util.Date;
import java.util.Set;
import java.util.Vector;

import enums.Faculty;

public class Organization {
    private String name;
    private String description;
    private Student head;
    private Vector<Student> members;
    private Date dateOfCreation;
    private Faculty faculty;
    private Set<Student> student;
    
  
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
    
    public Date getDateOfCreation() {
        return this.dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
    
    public Faculty getFaculty() {
        return this.faculty;
    }

}
