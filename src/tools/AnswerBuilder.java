package tools;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import business.News;

import static javax.swing.JOptionPane.*;

import static tools.ConsoleDisplayer.*;

public class AnswerBuilder {
	static Map<String, News> news = new HashMap<String, News>();
	public AnswerBuilder() {}
	
	public static HashMap<String, News> getNews() {
		return (HashMap<String, News>) news;
	}

	public static void setNews(HashMap<String, News> news) {
		AnswerBuilder.news = news;
	}

	public static String keyboardParser() {
		return printConsolePrompt();
	}

	private static String printConsolePrompt() {
		String input = "";
		try {
			project("Type in your answer: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input += br.readLine();
		} catch (Exception ex) {
			ex.printStackTrace();
		}		
		return input;
	}
	
	public static String inputFillerForum() {
		String forumName = showInputDialog(null, "What's the forum name?", "Example");
		return forumName;
	}
	
	public static HashMap<String, News> inputFillerNews() {
		String title = showInputDialog(null,"What's the piece of news' title?", "Title");
		String content = showInputDialog(null, "What are the details?", "Subject");
		
		News n = new News(title,content);
		news.put(title, n);
		setNews((HashMap<String, News>) news);
		return (HashMap<String, News>) news;
	}
	
}
