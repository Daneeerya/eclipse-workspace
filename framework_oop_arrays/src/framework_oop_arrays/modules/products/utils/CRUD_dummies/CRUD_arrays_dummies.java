package framework_oop_arrays.modules.products.utils.CRUD_dummies;

import framework_oop_arrays.classes.date_object;
import framework_oop_arrays.modules.products.classes.laptop;

public class CRUD_arrays_dummies {
	public static laptop ask_laptop() {

		laptop l1 = new laptop(1, 2.0f, 1.0f, "123-A", new date_object("01/01/2023"), new date_object("02/01/2023"),
				new date_object("04/01/2023"), new date_object("01/01/2023"), new date_object("05/01/2023"), 2.0f,
				2.0f);
		l1.calculate_total_price();
		return l1;
	}

}
