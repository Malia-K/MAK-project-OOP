package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

public class New{
	private String title;
	private User author;
	private LocalDateTime time;
	private String description;
	
		
	public New(String title, User author, String description) {
		this.title = title;
		this.author = author;
		this.time = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
		this.description = description;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getAuthor() {
		return author;
	}

	public String getTime() {
		return time.toString().replace('T', ' ');
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
		
	public void printNew() {
		System.out.print(" ========  " + this.getTitle() + "  ========" + "\n ");
		System.out.println(this.getDescription() + "\n");
		System.out.println(" ".repeat(15) + this.getAuthor().getFirstName() + " " + this.getAuthor().getLastName() + "  "+ this.getTime());
		System.out.println(Format.formatDiv( "-".repeat(45) + '\n'));
	}
	
	public StringTokenizer getFormattedString(String s, String delimiter, int size) {
		StringTokenizer st = new StringTokenizer(s, delimiter);
		String formatted = new String();
		String temp = new String();
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			if(temp.length() + token.length() < size) {
				temp += token + " "; 
			}
			else {
				formatted += temp + "\n";
				temp = token + " ";
			}
			if(!st.hasMoreTokens()) {
				formatted += temp;
			}
		}
		return new StringTokenizer(formatted, "\n");
	}
	
	public String toString() {
		String news = new String();
		StringTokenizer st = getFormattedString(title, " ", 35);
		int maxLength = 0;
		while(st.hasMoreTokens()) {
			String token = st.nextToken();

			maxLength = Math.max(token.length(), maxLength);
			int s = 49 - maxLength;
			news += " " + "=".repeat(10) + " ".repeat(4) + token + " ".repeat((11 + 10 + s + s + token.length()) - s - token.length()) + "=".repeat(10) + "\n";
		}
		news +=  Format.formatRow("|\n");
		st = getFormattedString(description, " ", 54);
		while(st.hasMoreTokens()) {
			news += Format.formatRow("|") + " ".repeat(4) + st.nextToken() + "\n";
		}
		
//		for(int i = 0; i < description.length(); i++) {
//			if(i + 54 > description.length()) {
//				news += Format.formatRow("|") + " ".repeat(4) + description.substring(i, description.length());
//			}
//			else {
//				news += Format.formatRow("|") + " ".repeat(4) + description.substring(i, i + 54) + "\n";
//			}
//			i += 53;
//		}
		return news;
	}
}

