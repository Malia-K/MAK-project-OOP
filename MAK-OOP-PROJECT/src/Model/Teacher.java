package Model;

import enums.*;
public class Teacher extends Employee {
    private Faculty faculty;
    private double rating;
    Schedule schedule;
    
   public Faculty getFaculty() {
        return this.faculty;
    }
    
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    
   public double getRating() {
        return this.rating;
    }
    
    public void setRating(double rating) {
        this.rating = rating;
    }
    
    
}
