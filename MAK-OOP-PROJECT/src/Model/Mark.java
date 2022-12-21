package Model;

import java.io.Serializable;

public class Mark implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double firstAttestation;
    private double secondAttestation;
    private double finalExam;
    
    public Mark() {}
    
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

    public double getTotal() {
        return firstAttestation + secondAttestation + finalExam;
    } 
    
    public String toString() {
    	return "" + firstAttestation + " " + secondAttestation + " " + finalExam;
    }
}