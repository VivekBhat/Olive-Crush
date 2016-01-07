package model;

public abstract class Olive {

	public OliveName name;
	public OliveColor color;
	public int oil;

	public Olive(OliveName name2, OliveColor color2, int oil2) {
		this.name = name2;
		this.color = color2;
		this.oil = oil2;
	}

	public OliveName getName() {
		return name;
	}

	public void setName(OliveName name) {
		this.name = name;
	}

	public OliveColor getColor() {
		return color;
	}

	public void setColor(OliveColor color) {
		this.color = color;
	}

	public int crush() {
		String msg = name + ",  from "+ getOrigin() +" : " + oil + " units";
		System.out.println(msg);
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	public abstract String getOrigin();
}
