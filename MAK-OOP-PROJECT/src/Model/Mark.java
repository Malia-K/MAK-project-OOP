package Model;

import java.util.Vector;

public class Mark {
	private static final String marks[];
	private OpenCourse course;
    private double firstAttestation;
    private double secondAttestation;
    private double finalExam;
    private String mark;
    
    static {
    	marks = new String[]{"F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "D", "D+", "C-", "C", "C+", "B-", "B", "B+", "A-", "A"};
    }
    
    public Mark() {}
    
    public Mark(OpenCourse course) {
    	this.course = course;
    }
    
    public double getFirstAttestation() {
        return this.firstAttestation;
    }

    public void setFirstAttestation(double firstAttestation) {
        this.firstAttestation = firstAttestation % 30;
        this.secondAttestation = Math.max(0, firstAttestation - 30);
    }
    
    public double getSecondAttestation() {
        return this.secondAttestation;
    }
    
    public void setSecondAttestation(double secondAttestation) {
        this.secondAttestation = (this.secondAttestation + secondAttestation) % 30;
    }

    public double getFinal() {
        return this.finalExam;
    }

    public void setFinal(double finalExam) {
        this.finalExam = finalExam;
    }
    
    public String getMark() {
        return marks[(int)(Math.round((firstAttestation + secondAttestation + finalExam) / 5))];
    }

    public double getGpa() {
        return 0;
    } 
}
