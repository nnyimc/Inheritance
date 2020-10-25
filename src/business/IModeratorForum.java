package business;

public interface IModeratorForum {
	boolean deleteNews(News n);
	void banUser( User u);
	Long addUser(User u);
	void listUsers();
	void giveWarning(User u);
}
