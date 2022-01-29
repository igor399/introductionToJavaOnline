package by.epam.task6.notebook.console;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

import by.epam.task6.notebook.handler.NoteHandler;
import by.epam.task6.notebook.note.Note;
import by.epam.task6.notebook.view.View;

public class Console {
	private static Console instance = new Console();
	private Scanner scanner = new Scanner(System.in);
	private NoteHandler noteHandler = NoteHandler.getInstance();
	private View view = new View();

	private static final Pattern EMAIL_PATTERN = Pattern.compile("^(.+)@(.+)$");

	public static Console getInstance() {
		return instance;
	}

	private void runConsoleSearch() {

		int choice;

		do {
			System.out.println(">>>SEARCH<<<");
			System.out.println(
					"1 - find notes by topic\n" + "2 - find notes by date of creation\n" + "3 - find notes by email\n"
							+ "4 - find notes by message\n" + "5 - find notes by topic and email\n"
							+ "6 - find note by message and date of creation\n" + "exit - to quit from notepad");
			while (!scanner.hasNextInt()) {

				if (scanner.next().equals("exit")) {
					noteHandler.saveNotesToFile();
					System.exit(0);
				}

				System.out.println("Choose correct option");
			}

			choice = scanner.nextInt();
			scanner.nextLine();

		} while (choice < 1 || choice > 6);

		switch (choice) {

		case 1:
			view.displayNotes(noteHandler.findNotesByTopic(topicConsole()));
			break;

		case 2:
			view.displayNotes(noteHandler.findNotesByCreationDate((java.sql.Date) dateOfCreationConsole()));
			break;

		case 3:
			view.displayNotes(noteHandler.findNotesByEmail(emailConsole()));
			break;

		case 4:
			view.displayNotes(noteHandler.findNotesByMsg(msgConsole()));
			break;

		case 5:
			view.displayNotes(noteHandler.findNotesByTopicAndEmail(topicConsole(), emailConsole()));
			break;

		case 6:
			view.displayNotes(
					noteHandler.findNoteByMsgAndCreationDate(msgConsole(), (java.sql.Date) dateOfCreationConsole()));
			break;

		default:
			break;
		}
	}

	public void runConsoleMenu() {

		while (true) {
			int choice;

			do {
				System.out.println(">>>NotePad<<<");
				System.out.println("1 - Show all notes\n" + "2 - Add new note\n" + "3 - Remove note\n"
						+ "4 - Find note\n" + "exit - to quit from notepad");

				while (!scanner.hasNextInt()) {

					if (scanner.next().equals("exit")) {
						noteHandler.saveNotesToFile();
						System.exit(0);
					}

					System.out.println("Choose correct option");
				}

				choice = scanner.nextInt();
				scanner.nextLine();

			} while (choice < 1 || choice > 4);

			switch (choice) {

			case 1:
				view.displayNotes(noteHandler.getNotes());
				break;

			case 2:
				noteHandler.addNote(new Note(topicConsole(), dateOfCreationConsole(), emailConsole(), msgConsole()));
				break;

			case 3:
				noteHandler.removeNote(topicConsole());
				break;

			case 4:
				runConsoleSearch();
				break;

			default:
				break;
			}
		}

	}

	private String topicConsole() {
		System.out.println("Enter topic:");
		return scanner.nextLine();
	}

	private java.sql.Date dateOfCreationConsole() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date;

		System.out.println("Enter date of creation like dd/MM/yyyy:");

		while (true) {

			try {
				date = simpleDateFormat.parse(scanner.nextLine());

				return (java.sql.Date) date;

			} catch (ParseException e) {
				System.out.println("Date must be like dd/MM/yyyy  try again");
			}
		}
	}

	private String msgConsole() {
		System.out.println("Enter message:");
		return scanner.nextLine();
	}

	private String emailConsole() {

		while (true) {
			System.out.println("Enter email:");
			String email = scanner.nextLine();

			if (EMAIL_PATTERN.matcher(email).find()) {
				return email;
			}

			System.out.println("Incorrect email");
		}
	}
}
