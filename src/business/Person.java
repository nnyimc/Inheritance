package business;

public abstract class Person {
	protected String firstname;
	protected String name;
	protected int age;
	
	public Person() {
		super();
	}
	
	public Person(String firstname, String name, int age) {
		super();
		this.firstname = firstname;
		this.name = name;
		this.age = age;
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
	
	@Override
	public String toString() {
		return "My name is " + firstname + " " + name + ", I'm " + age + " years old.";
	}
	
}
