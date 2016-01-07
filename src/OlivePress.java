import java.util.ArrayList;

import model.Olive;
import model.Press;

public class OlivePress implements Press {

	private int currentOil;

	public int getOil(ArrayList<Olive> olives) {

		int totalOil = currentOil;
		for (Olive o : olives) {
			totalOil += o.crush();
		}
		return totalOil;
	}

	@Override
	public void setOil(int oil) {
		currentOil = oil;
	}
}
