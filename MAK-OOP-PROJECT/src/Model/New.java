package Model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

public class New implements Serializable, Comparable<New>{
	private static final long serialVersionUID = 1L;
	private String title;
	private User author;
	private String time;
	private String description;
	
		
	public New(String title, User author, String description) {
		this.title = title;
		this.author = author;
		this.time = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES).toString().replace('T', ' ');
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
		return time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int compareTo(New o) {
		return time.compareTo(o.getTime());
	}
	
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		
		New nw = (New) o;
		return title.equals(nw.getTitle()) && author.equals(nw.getAuthor()) && time.equals(nw.getTime()) && description.equals(nw.getDescription());
	}
	
	public String toString() {
		String news = new String();
		StringTokenizer st = Format.getFormattedString(title, " ", 35);
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			news += " " + "=".repeat(10) + " ".repeat(4) + token + " ".repeat(35 - token.length()) + "=".repeat(10) + "\n";
		}
		
		news += Format.formatRow("|\n");
		st = Format.getFormattedString(description, " ", 54);
		
		while(st.hasMoreTokens()) {
			news += Format.formatRow("|") + " ".repeat(4) + st.nextToken() + "\n";
		}
		news += Format.formatRow("|\n" + "|" + " ".repeat(57 - getTime().length()) + getTime());
		
		return news;
	}
}

