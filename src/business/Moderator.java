package business;

public class Moderator extends Person{
	private String firstname;
	private String name;
	private int age;
	public static IModeratorForum forum = (IModeratorForum) new Forum();
	
	public Moderator() {
		super();
	}

	public Moderator(String firstname, String name, int age, Forum f) {
		super(firstname, name, age);
		this.firstname = firstname;
		this.name = name;
		this.age = age;
		Moderator.forum = (IModeratorForum) f;
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

	public static Forum getForum() {
		return (Forum) forum;
	}

	public static void setForum(Forum forum) {
		Moderator.forum = (IModeratorForum) forum;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\r\nI moderate " + forum + ".";
	}
	
	public Long addUser(User u) {
		return getForum().addUser(u);
	}
	
	public void removeUser(User u) {
		getForum().banUser(u);
	}
	
	public void deleteNews(News n) {
		getForum().deleteNews(n);
	}
	
	public void listUsers() {
		getForum().listUsers();
	}
	
	public void warnUser(User u) {
		getForum().giveWarning(u);
	}
}
