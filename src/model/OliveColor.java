package model;

public enum OliveColor {

	PURPLE("Purple", 0x2E0854), BLACK("Black", 0x000000), Green("Green",
			0x00FF00);

	String name;
	long color;

	OliveColor(String name, long color) {
		this.name = name;
		this.color = color;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
