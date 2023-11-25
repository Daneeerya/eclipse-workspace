package framework_oop_arrays.modules.products.utils.CRUD_dummies;

import framework_oop_arrays.classes.date_object;
import framework_oop_arrays.modules.products.classes.Singleton;

public class CRUD_arrays_dummies {
	private static final int LONGDUMMIES = 5;
	private static int[] stockL = { 1, 2, 3, 4, 5 };
	private static float[] weightL = { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f }; // 2
	private static float[] priceL = { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f }; // 3
	private static String[] IDL = { "123-A", "123-B", "123-C", "123-D", "123-E" }; // 5
	private static date_object[] purchaseDateL = { new date_object("01/01/2000"), new date_object("02/01/2000"),
			new date_object("03/01/2000"), new date_object("04/01/2000"), new date_object("05/01/2000") };

	public static void carregarDades() {
		int longitud = 5;
		carregarDummies(longitud);
	}

	public static laptop_dum carregarDummies(int longitud) {
		product_dum l = null;
		for (int i = 0; i < LONGDUMMIES; i++) {
			l = new laptop_dum(stockL[i], weightL[i], priceL[i], IDL[i], purchaseDateL[i]);
			System.out.println(l);
		}
		return (laptop_dum) l;
	}

	public static laptop_dum ask_laptopID() {

		Singleton.ID = "123-2";
		return new laptop_dum(Singleton.ID);
	}

}
