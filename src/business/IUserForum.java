package business;

public interface IUserForum {
	boolean addNews(News n);
	void consultNews(Long i);
	void answerNews(Long i);
}
