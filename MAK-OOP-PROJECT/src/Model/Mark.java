package Model;

public class Mark {
    private double firstAttestation;
    private double secondAttestation;
    private double finalExam;
    private String mark;
    private double gpa ;
    
    public double getFirstAttestation() {
        return this.firstAttestation;
    }

    public void setFirstAttestation(double firstAttestation) {
        this.firstAttestation = firstAttestation;
    }
    
    public double getSecondAttestation() {
        return this.secondAttestation;
    }
    
    public void setSecondAttestation(double secondAttestation) {
        this.secondAttestation = secondAttestation;
    }

    public double getFinal() {
        return this.finalExam;
    }

    public void setFinal(double finalExam) {
        this.finalExam = finalExam;
    }
    
    
    public String getMark() {
        return this.mark;
    }

    public double getGpa() {
        return this.gpa ;
    } 
}
