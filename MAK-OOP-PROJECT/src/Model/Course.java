package Model;

import enums.*;

public class Course {
	private String id;
    private String name;
    private int credits;
    private Faculty faculty;
    private int formula[];
    private Course prerequisite;
    
    {
    	formula = new int[3];
    }
    
    public Course() {}
    
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

    public Course getPrerequisite() {
        return this.prerequisite;
    }

    public void setPrerequisite(Course prerequisite) {
        this.prerequisite = prerequisite;
    }   
}
