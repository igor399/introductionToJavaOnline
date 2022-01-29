package by.epam.task6.notebook.view;

import java.util.List;

import by.epam.task6.notebook.note.Note;

public class View {
	public void displayNotes(List<Note> notes) {

		if (notes.isEmpty()) {
			System.out.println("Для отображения нет заметок");

		} else {

			for (Note note : notes) {
				System.out.println(note);
			}
		}
	}
}
