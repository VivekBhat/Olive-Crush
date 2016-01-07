import java.util.ArrayList;

import model.Kalamata;
import model.Ligurian;
import model.Olive;
import model.Press;

public class Main {

	public static void main(String[] args) {

		ArrayList<Olive> olives = new ArrayList<>();

		olives.add(new Kalamata());
		olives.add(new Kalamata());
		olives.add(new Ligurian());
		olives.add(new Ligurian());
		olives.add(new Ligurian());

		Press press = new OlivePress();
		press.setOil(5);
		int totalOil = press.getOil(olives);

		System.out
				.println("Total Olive Oil is " + totalOil + " units of oil. ");

	}
}