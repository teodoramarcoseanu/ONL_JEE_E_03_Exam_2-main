package pl.coderslab.exam;

import java.util.ArrayList;
import java.util.List;

public class FurnitureDao {

	public List<Furniture> getList() {
		List<Furniture> list = new ArrayList<>();
		list.add(new Furniture(1, " Reggae Sofa, grey", "Retro three-seater sofa. ", 10));
		list.add(new Furniture(1, "Left corner unit Belle",
				"The spacious Belle corner sofa is ideal for large families. ", 120));
		list.add(new Furniture(1, "Puzzle corner module", "Puzzle is an original modular furniture system. ", 2));
		list.add(new Furniture(1, "ONTARIO 160X200",
				"Modern Ontario bed combines uniqueness, luxury and comfort. ", 33));
		list.add(new Furniture(1, "Two-seater sofa",
				"Colista sleeper sofa is a simple form combined with great comfort. ", 11));
		list.add(new Furniture(1, "VANITY TABLE",
				"Unique makeup vanity table with stool and large mirror. ", 5));

		return list;
	}
}
