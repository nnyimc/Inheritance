package business;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import static tools.ConsoleDisplayer.*;
import static tools.AnswerBuilder.*;
public class Forum implements IUserForum, IModeratorForum{
	private long userCounter = 0;
	private String name;
	private Date dateCreation;
	private List<User> users = new ArrayList<User>();
	private List<News> news = new ArrayList<News>();
	
	public Forum() {
		super();
		this.dateCreation = new Date();
	}

	public Forum(String name) {
		super();
		this.name = name;
		this.dateCreation = new Date();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDateCreation() {
		return dateCreation;
	}
	
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<News> getNewsList() {
		return news;
	}

	public void setNewsList(List<News> newsList) {
		this.news = newsList;
	}

	@Override
	public boolean deleteNews(News n) {
		news.remove(n);
		return false;
	}

	@Override
	public void banUser(User u) {
		users.remove(u);
	}

	@Override
	public Long addUser(User u) {
		userCounter++;
		users.add(u);
		return userCounter;
	}

	@Override
	public void listUsers() {
		Iterator<User> iteratorUser = users.iterator();
		while(iteratorUser.hasNext()) {
			project(iteratorUser.next());
		}

	}

	@Override
	public boolean addNews(News n) {
			news.add(n);
		return false;
	}

	@Override
	public void consultNews(Long i) {
		Iterator<News> iteratorNews = news.iterator();
		while(iteratorNews.hasNext()) {
			project(iteratorNews.next());
		}
		
	}

	@Override
	public void answerNews(Long i) {
		addNews(new News("Answer to #"+i, keyboardParser()));
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public void giveWarning(User u) {
		if(User.warnings < 2) {
			User.warnings++;
		} else {
			banUser(u);
		}
		
	}
	
}
