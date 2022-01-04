package by.epam.basic_of_oop.task1;

import java.util.Objects;

public class File {

	public String name;
	public Directory directory;
	
	public File() {
		
	}
	
	public File(String name, Directory directory) {	
		this.name = name;
		this.directory = directory;
	}
	
	public String getName() {
		return name;
	}
	
	public Directory getDirectory() {
		return directory;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDirectory(Directory directory) {
		this.directory = directory;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		File other = (File) obj;
		return Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "File [name=" + name + "]";
	}	
}
