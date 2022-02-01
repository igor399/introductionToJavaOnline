package by.epam.task6.library.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import by.epam.task6.library.entity.Book;
import by.epam.task6.library.entity.BookType;
import by.epam.task6.library.entity.User;
import by.epam.task6.library.entity.UserLevel;

public class FileHandler {
	private static String userFile = "D:\\Workspace\\JavaOnlineTrainig\\introductionToJavaOnline\\src\\by\\epam\\task6\\library\\data\\users.txt";
	private static String catalogFile = "D:\\Workspace\\JavaOnlineTrainig\\introductionToJavaOnline\\src\\by\\epam\\task6\\library\\data\\books.txt";

	public static List<User> loadUsers() {
		String line;
		String splitBy = " - ";
		List<User> users = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(userFile))) {
			
			while ((line = br.readLine()) != null) {
				String[] data = line.split(splitBy);
				User user = new UserBuilder(data[1], data[2]).setName(data[0]).setUserLevel(UserLevel.valueOf(data[3].toUpperCase())).build();
				users.add(user);

			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return users;
	}

	public static void saveUserList(List<User> users) {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(userFile))) {
			
			for (User user : users) {
				StringBuilder sb = new StringBuilder();
				sb.append(user.getUsername());
				sb.append(" - ");
				sb.append(user.getLogin());
				sb.append(" - ");
				sb.append(user.getPassword());
				sb.append(" - ");
				sb.append(user.getUserLevel().name().toLowerCase());
				bw.write(sb.toString());
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<Book> loadBooks() {
		String line;
		String splitBy = " - ";
		List<Book> books = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(catalogFile))) {

			while ((line = br.readLine()) != null) {
				String[] data = line.split(splitBy);
				Book book = new BookBuilder().setAuthor(data[0]).setTitle(data[1]).setYear(Integer.valueOf(data[2])).setType(BookType.valueOf(data[3].toUpperCase())).build();
				books.add(book);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return books;
	}

	public static void saveCatalog(List<Book> books) {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(catalogFile))) {
			
			for (Book book : books) {
				StringBuilder sb = new StringBuilder();
				sb.append(book.getAuthor());
				sb.append(" - ");
				sb.append(book.getTitle());
				sb.append(" - ");
				sb.append(book.getYear());
				sb.append(" - ");
				sb.append(book.getType().name().toLowerCase());

				bw.write(sb.toString());
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
