package presentation;

import business.Forum;
import business.Moderator;
import business.User;

import static tools.ConsoleDisplayer.*;
import static tools.AnswerBuilder.*;

public class Application {

	public static void main(String[] args) {
		try {
			Forum elForum = (Forum) Class
								.forName("business.Forum")
								.newInstance();
			elForum.setName(inputFillerForum());
			project("Your forum has been named " + elForum.toString()+".");
			
			User louis = (User) Class
							.forName("business.User")
							.newInstance();
			louis.setAge(25);
			louis.setFirstname("Louis");
			louis.setName("de Funès");
			User.setForum(elForum);
			elForum.addUser(louis);
			
			User sara = (User) Class
					.forName("business.User")
					.newInstance();
			sara.setAge(31);
			sara.setFirstname("Sara");
			sara.setName("Lancaster");
			User.setForum(elForum);
			
			User john = (User) Class
					.forName("business.User")
					.newInstance();
			john.setAge(42);
			john.setFirstname("John");
			john.setName("Malkovich");
			User.setForum(elForum);
			
			User jane = (User) Class
					.forName("business.User")
					.newInstance();
			jane.setAge(28);
			jane.setFirstname("Jane");
			jane.setName("Austen");
			User.setForum(elForum);
			
			Moderator marlene = (Moderator) Class
					.forName("business.Moderator")
					.newInstance();
			marlene.setAge(33);
			marlene.setFirstname("Marlène");
			Moderator.setForum(elForum);
			
			
			elForum.addUser(sara);
			elForum.addUser(jane);
			elForum.addUser(john);
			
			jane.createNews();
			elForum.listUsers();
			System.out.println("----------------------");
			marlene.removeUser(jane);
			marlene.warnUser(louis);
			marlene.warnUser(louis);
			marlene.warnUser(louis);
			elForum.listUsers();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
