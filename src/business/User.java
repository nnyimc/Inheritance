package business;
import static tools.AnswerBuilder.*;

import java.util.HashMap;

public class User extends Person {
	private String firstname;
	private String name;
	private int age;
	public static IUserForum forum = (IUserForum) new Forum();
	public static int warnings = 0;
	
	public User() {
		super();
	}
	
	public User(String firstname, String name, int age, Forum f) {
		super(firstname, name, age);
		this.firstname = firstname;
		this.name = name;
		this.age = age;
		setForum(f);
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public static void setForum(Forum forum) {
		User.forum = (IUserForum) forum;
	}

	public static Forum getForum() {
		return (Forum) User.forum;
	}
	
	@Override
	public String toString() {
		return "My name is " + firstname + " " + name + ", I'm " + age + " years old."
				+ "\r\nI'm affiliated to " + forum + ".";
	}
	
	public void createNews() {
		HashMap<String, News> news = inputFillerNews();
		news.forEach((key, value)-> getForum().addNews(value));
	}
	
	public void readNews(int i) {
		getForum().consultNews(Long.parseLong(""+i));
	}
	
	public void commentNews(int i) {
		getForum().answerNews(Long.parseLong(""+i));
	}

	public int getWarnings() {
		return warnings;
	}
	
}
