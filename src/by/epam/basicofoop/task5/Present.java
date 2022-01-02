package by.epam.basicofoop.task5;

import java.util.ArrayList;

import by.epam.basicofoop.task5.sweetness.Sweetness;
import by.epam.basicofoop.task5.wrap.Wrap;

public class Present {
	private ArrayList<Sweetness> sweetnesses = new ArrayList<>();
	private Wrap wrap;
	
	void addSweetness(Sweetness sweetness) {
		sweetnesses.add(sweetness);
	}

	public Wrap getWrap() {
		return wrap;
	}

	public void setWrap(Wrap wrap) {
		this.wrap = wrap;
	}

	@Override
	public String toString() {
		return "Present [sweetness=" + sweetnesses + ", wrap=" + wrap + "]";
	}
}
