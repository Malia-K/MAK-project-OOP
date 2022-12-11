package MAK-project21;


/**
* @generated
*/
public class Message {
    
    /**
    * @generated
    */
    private Employee sender;
    
    /**
    * @generated
    */
    private  attribute;
    
    /**
    * @generated
    */
    private Employee recipient;
    
    /**
    * @generated
    */
    private String message;
    
    /**
    * @generated
    */
    private Date sendTime;
    
    
    /**
    * @generated
    */
    private Set<Employee> employee;
    
    

    /**
    * @generated
    */
    private Employee getSender() {
        return this.sender;
    }
    
    /**
    * @generated
    */
    private Employee setSender(Employee sender) {
        this.sender = sender;
    }
    
    
    /**
    * @generated
    */
    public  getAttribute() {
        return this.attribute;
    }
    
    /**
    * @generated
    */
    public  setAttribute(invalid attribute) {
        this.attribute = attribute;
    }
    
    
    /**
    * @generated
    */
    private Employee getRecipient() {
        return this.recipient;
    }
    
    /**
    * @generated
    */
    private Employee setRecipient(Employee recipient) {
        this.recipient = recipient;
    }
    
    
    /**
    * @generated
    */
    private String getMessage() {
        return this.message;
    }
    
    /**
    * @generated
    */
    private String setMessage(String message) {
        this.message = message;
    }
    
    
    /**
    * @generated
    */
    private Date getSendTime() {
        return this.sendTime;
    }
    
    /**
    * @generated
    */
    private Date setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
    
    
    
    /**
    * @generated
    */
    public Set<Employee> getEmployee() {
        if (this.employee == null) {
            this.employee = new HashSet<Employee>();
        }
        return this.employee;
    }
    
    /**
    * @generated
    */
    public Set<Employee> setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
    
}
