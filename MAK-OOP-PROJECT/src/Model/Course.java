package Model;

import java.io.Serializable;
import java.util.Vector;
import enums.Faculty;

public class Course implements Serializable, Cloneable, Comparable<Course> {
	private static final long serialVersionUID = 1L;
	private String id;
    private String name;
    private int credits;
    private Faculty faculty;
    private String formula;
    private Vector<Course> prerequisites;
    
    {
    	prerequisites = new Vector <Course>();
    }
    
    public Course() {}
    
    public Course(String id, String name, int credits, Faculty faculty, String formula) {
    	this.id = id;
    	this.name = name;
    	this.credits = credits;
    	this.faculty = faculty;
    	this.formula = formula;
    }
    public Course(String id, String name, int credits, Faculty faculty, String formula, Vector <Course> prerequisites) {
    	this(id, name, credits, faculty, formula);
    	this.prerequisites = prerequisites;
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

    public void setCredits(Integer credits ) {
        this.credits  = credits ;
    }

    public Faculty getFaculty() {
        return this.faculty;
    }
    
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getFormula() {
        return this.formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Vector <Course> getPrerequisites() {
        return this.prerequisites;
    }

    public void setPrerequisite(Course prerequisite) {
        this.prerequisites.add(prerequisite);
    } 

	public int compareTo(Course o) {
		return id.compareTo(o.getId());
	}
    
    public boolean equals(Object o) {
    	if(this == o) return true;
    	if(o == null) return false;
    	if(this.getClass() != o.getClass()) return false;
    	
    	Course c = (Course) o;
    	return credits == c.getCredits() && faculty == c.getFaculty() && id.equals(c.getId()) && name.equals(c.getName()) && formula.equals(c.getFormula()) && prerequisites.equals(c.getPrerequisites()); 
    }
    
    public String toString() {
    	String prereqs = new String();
    	for(Course c: prerequisites) {
    		prereqs += c.getId() + " ";
    	}
    	return "id: " + id + "\nname: " + name + "\ncredits: " + credits + "\nfaculty: " + faculty + "\nformula: " + formula + "\nprerequisites: " + ((prerequisites.isEmpty()) ? "" : prereqs);
    }

}