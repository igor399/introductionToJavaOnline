package by.epam.programmingWithClass.agregationandcomposition.car;

public class Wheel {
	
	public int diameter;
	private String firm;
	
	public Wheel(int diameter, String firm) {
		this.diameter = diameter;
		this.firm = firm;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public String getFirm() {
		return firm;
	}

	public void setFirm(String firm) {
		this.firm = firm;
	}
}
