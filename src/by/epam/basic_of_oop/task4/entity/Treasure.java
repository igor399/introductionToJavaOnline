package by.epam.basic_of_oop.task4.entity;

import java.util.Objects;

public abstract class Treasure {
	private String name;
	private int value;
	private String descriptionOfTreasure;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getDescriptionOfTreasure() {
		return descriptionOfTreasure;
	}

	public void setDescriptionOfTreasure(String descriptionOfTreasure) {
		this.descriptionOfTreasure = descriptionOfTreasure;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(descriptionOfTreasure, name, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treasure other = (Treasure) obj;
		return Objects.equals(descriptionOfTreasure, other.descriptionOfTreasure) && Objects.equals(name, other.name)
				&& value == other.value;
	}

	@Override
	public abstract String toString();
}
