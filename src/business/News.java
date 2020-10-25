package business;

import java.util.Date;

public class News {
	private String subject;
	private String text;
	private Date dateCreation;
	
	public News() {
		super();
	}
	
	
	public News(String subject, String text) {
		super();
		this.subject = subject;
		this.text = text;
		this.dateCreation = new Date();
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	
}
