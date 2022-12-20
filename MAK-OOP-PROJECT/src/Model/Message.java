package Model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Message {
    private Employee sender;
    private Employee recipient;
    private String topic;
    private String message;
    private LocalDateTime sendTime;
    private boolean edited = false;
    
    {
    	topic = "Topic: ";
    }
    
    public Message() {}
    
    public Message(Employee sender, String message, Employee recipient) {
      this.sender = sender;
      this.recipient = recipient;
      this.message = message;
      sendTime = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);
      topic += "No topic";
    }
    
    public Employee getSender() {
        return this.sender;
    }
    
    public Employee getRecipient() {
        return this.recipient;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    private void setEdited() {
    	edited = true;
    }
    public void setMessage(String message) {
    	this.message = message;
    	setEdited();
    }
    
    public LocalDateTime getSendTime() {
        return this.sendTime;
    }

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = "Topic: " + topic;
		setEdited();
	}
    
    public String toString() {
      String mess = new String();
      String empty = Format.formatRow("|" + " ".repeat(62) + "|\n");
      mess += Format.formatDiv("a" + "-".repeat(62) + "c" + "\n");
      for(int i = 0; i < topic.length(); i++) {
    	  if(i + 27 > topic.length()) {
    		  mess += Format.formatRow("|" + " ".repeat(31) + topic.substring(i, topic.length()) + " ".repeat(31 - topic.length() + i) + "|\n");
    	  }
    	  else mess += Format.formatRow("|" + " ".repeat(31) + topic.substring(i, i + 27) + " ".repeat(4) + "|\n");
    	  i += 26;
      }
      String senderInfo = "sent to: " + String.format("%.1s. %s", recipient.getFirstName(), recipient.getLastName());
      mess += Format.formatRow(("|" + " ".repeat(62 - senderInfo.length() - 4) + senderInfo +" ".repeat(4) + "|\n"));
      mess += Format.formatDiv("a" + "-".repeat(62) + "c" + "\n") + empty;
      
      for(int i = 0; i < message.length(); i++) {
        if(i + 50 > message.length()) {
        	mess += Format.formatRow("|" + " ".repeat(6) + message.substring(i, message.length()) + " ".repeat(56 - message.length() + i) + "|\n");
        }
        else {
        	mess += Format.formatRow("|" + " ".repeat(6) + message.substring(i, i + 50) + " ".repeat(6) + "|\n");
        }
        i += 49;
      }
      
      String recipientInfo = String.format("%.1s. %s", sender.getFirstName(), sender.getLastName());
      mess += empty + Format.formatRow(("|" + " ".repeat(62 - recipientInfo.length() - 4) + recipientInfo + " ".repeat(4) + "|\n"));  
      String time = sendTime.toString().replace('T', ' ');
      mess += (edited) ? Format.formatRow("|" + " ".repeat(51 - time.length()) + "edited " + time + " ".repeat(4) + "|\n") : Format.formatRow("|" + " ".repeat(62 - time.length() - 4) + time + " ".repeat(4) + "|\n");
      
      mess += Format.formatDiv("a" + "-".repeat(62) + "c" + "\n");
      
      return mess;
    }

}