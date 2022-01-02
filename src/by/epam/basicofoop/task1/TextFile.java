package by.epam.basicofoop.task1;

import java.util.Objects;

public class TextFile extends File {

	private File file;
	private String content;

	public TextFile() {
		
	}

	// Создание файла;
	public TextFile(Directory directory, File file, String content) {
		this.directory = directory;
		this.file = file;
		this.content = content;
	}

	// Метод для переименования;
	public void renameFile(String newName) {
		file.setName(newName);
	}

	// Метод вывода на консоль содержимого;
	public void printContent() {
		System.out.println(content);
	}

	// Метод дополнения содержимого;
	public void addContent(String content) {
		this.content += "" + content;
	}

	// Метод удаления файла;
	public void deleteFile() {
		directory = null;
		content = null;
		file = null;
	}

	public Directory getDirectory() {
		return directory;
	}

	public void setDirectory(Directory directory) {
		this.directory = directory;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(content);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextFile other = (TextFile) obj;
		return Objects.equals(content, other.content);
	}

	@Override
	public String toString() {
		return "TextFile [content=" + content + "]";
	}
}
