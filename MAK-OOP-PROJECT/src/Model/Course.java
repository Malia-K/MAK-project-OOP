package Model;

import java.util.Vector;
import enums.Faculty;

public class Course {
	private String id;
    private String name;
    private int credits;
    private Faculty faculty;
    private int formula[];
    private Vector<Course> prerequisites;
    
    {
    	formula = new int[3];
    	prerequisites = new Vector <Course>();
    }
    
    public Course() {}
    
    public Course(String id, String name, int credits, Faculty faculty) {
    	this.id = id;
    	this.name = name;
    	this.credits = credits;
    	this.faculty = faculty;
    }
    
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return this.credits ;
    }

    public void setCredits (Integer credits ) {
        this.credits  = credits ;
    }

    public Faculty getFaculty() {
        return this.faculty;
    }
    
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int[] getFormula() {
        return this.formula;
    }

    public void setFormula(int[] formula) {
        this.formula = formula;
    }

    public Vector <Course> getPrerequisites() {
        return this.prerequisites;
    }

    public void setPrerequisite(Course prerequisite) {
        this.prerequisites.add(prerequisite);
    } 
    
    public String toString() {
    	return id + " " + name + ' ' + credits + " " + faculty + " " + formula + " " + prerequisites;
    }
}
