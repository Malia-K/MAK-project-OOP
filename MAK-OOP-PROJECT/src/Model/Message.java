package Model;

import java.sql.Date;

public class Message {
    private Employee sender;
    private Employee recipient;
    private String message;
    private Date sendTime;
    
    
    public Employee getSender() {
        return this.sender;
    }
    
    public void setSender(Employee sender) {
        this.sender = sender;
    }
    
    public Employee getRecipient() {
        return this.recipient;
    }

    public void setRecipient(Employee recipient) {
        this.recipient = recipient;
    }
    
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public Date getSendTime() {
        return this.sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
}
