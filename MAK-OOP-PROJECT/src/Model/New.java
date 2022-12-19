package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class New{
	private String title;
	private User author;
	private LocalDateTime now;
	private String description;
	
		
	public New(String title, User author, LocalDateTime now, String description) {
		this.title = title;
		this.author = author;
		this.now = now;
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

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		now = LocalDateTime.now();
		return dtf.format(now);
	}

	public void setNow(LocalDateTime now) {
		this.now = now;
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
		System.out.println(formatDiv( "-".repeat(45) + '\n'));
	}
	
	
	public static String formatRow(String str){
	        return str.replace('|', '\u2502');
	}

    public static String formatDiv(String str){
        return str.replace('a', '\u250c')
                .replace('b', '\u252c')
                .replace('c', '\u2510')
                .replace('d', '\u251c')
                .replace('e', '\u253c')
                .replace('f', '\u2524')
                .replace('g', '\u2514')
                .replace('h', '\u2534')
                .replace('i', '\u2518')
                .replace('-', '\u2500');
    }
}

