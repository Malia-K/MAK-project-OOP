package MAK-project21;


/**
* @generated
*/
public class Mark {
    
    /**
    * @generated
    */
    private double firstAttestation;
    
    /**
    * @generated
    */
    private double secondAttestation;
    
    /**
    * @generated
    */
    private double final;
    
    /**
    * @generated
    */
    private  mark;
    
    /**
    * @generated
    */
    private double gpa ;
    
    
    /**
    * @generated
    */
    private Set<RegisteredCourse> registeredCourse;
    
    

    /**
    * @generated
    */
    private double getFirstAttestation() {
        return this.firstAttestation;
    }
    
    /**
    * @generated
    */
    private double setFirstAttestation(Real firstAttestation) {
        this.firstAttestation = firstAttestation;
    }
    
    
    /**
    * @generated
    */
    private double getSecondAttestation() {
        return this.secondAttestation;
    }
    
    /**
    * @generated
    */
    private double setSecondAttestation(Real secondAttestation) {
        this.secondAttestation = secondAttestation;
    }
    
    
    /**
    * @generated
    */
    private double getFinal() {
        return this.final;
    }
    
    /**
    * @generated
    */
    private double setFinal(Real final) {
        this.final = final;
    }
    
    
    /**
    * @generated
    */
    private  getMark() {
        return this.mark;
    }
    
    /**
    * @generated
    */
    private  setMark(invalid mark) {
        this.mark = mark;
    }
    
    
    /**
    * @generated
    */
    private double getGpa () {
        return this.gpa ;
    }
    
    /**
    * @generated
    */
    private double setGpa (Real gpa ) {
        this.gpa  = gpa ;
    }
    
    
    
    /**
    * @generated
    */
    public Set<RegisteredCourse> getRegisteredCourse() {
        if (this.registeredCourse == null) {
            this.registeredCourse = new HashSet<RegisteredCourse>();
        }
        return this.registeredCourse;
    }
    
    /**
    * @generated
    */
    public Set<RegisteredCourse> setRegisteredCourse(RegisteredCourse registeredCourse) {
        this.registeredCourse = registeredCourse;
    }
    
    
    

    //                          Operations                                  
    
    
}
