package framework_oop_arrays.modules.products.utils.CRUD_dummies;

import javax.swing.JOptionPane;

import framework_oop_arrays.classes.date_object;
import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.classes.accessory;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.classes.product;
import framework_oop_arrays.modules.products.classes.smartphone;
import framework_oop_arrays.modules.products.utils.special_prod;
import framework_oop_arrays.utils.menus;

public class CRUD_arrays_dummies {

	public static laptop ask_laptop_dummies(int longitud) {
		laptop l = null;
		final int LONGDUMMIES = 5;
		int[] stock = { 1, 2, 3, 4, 5 };
		float[] weight = { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f };
		float[] price = { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f };
		String[] ID = { "123-A", "123-B", "123-C", "123-D", "123-E" };
		date_object[] purchaseDate = { new date_object("01/01/2000"), new date_object("02/01/2000"),
				new date_object("03/01/2000"), new date_object("04/01/2000"), new date_object("05/01/2000") };
		date_object[] deliveryDate = { new date_object("02/01/2000"), new date_object("03/01/2000"),
				new date_object("04/01/2000"), new date_object("05/01/2000"), new date_object("06/01/2000") };
		date_object[] returnDate = { new date_object("04/01/2000"), null, new date_object("06/01/2000"),
				new date_object("07/01/2000"), new date_object("07/01/2000") };
		date_object[] startPromoDate = { new date_object("01/01/2000"), new date_object("20/01/2000"),
				new date_object("03/01/2000"), new date_object("31/01/2000"), new date_object("31/01/2000") };
		date_object[] endPromoDate = { new date_object("01/02/2000"), new date_object("20/02/2000"),
				new date_object("03/05/2000"), new date_object("31/02/2000"), new date_object("31/03/2000") };
		float[] price_promo = { 10.0f, 20.0f, 30.0f, 40.0f, 50.0f };
		float[] price_total = { 10.0f, 20.0f, 30.0f, 40.0f, 50.0f };
		for (int i = 0; i < LONGDUMMIES; i++) {
			l = new laptop(stock[i], weight[i], price[i], ID[i], purchaseDate[i], deliveryDate[i], returnDate[i],
					startPromoDate[i], endPromoDate[i], price_promo[i], price_total[i]);
			Singleton.productlaptop.add((laptop) l);

		}

		return (laptop) l;
	}

	public static laptop ask_laptopID() {
		String ID = Singleton.ID;
		return new laptop(ID);
	}

	public static smartphone ask_smartphone_dummies(int longitud) {
		smartphone S = null;
		final int LONGDUMMIES = 5;
		int[] stock = { 1, 2, 3, 4, 5 };
		float[] weight = { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f }; // 2
		float[] price = { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f }; // 3
		String[] ID = { "123-A", "123-B", "123-C", "123-D", "123-E" }; // 5
		date_object[] purchaseDate = { new date_object("01/01/2000"), new date_object("02/01/2000"),
				new date_object("03/01/2000"), new date_object("04/01/2000"), new date_object("05/01/2000") };
		date_object[] deliveryDate = { new date_object("02/01/2000"), new date_object("03/01/2000"),
				new date_object("04/01/2000"), new date_object("05/01/2000"), new date_object("06/01/2000") };
		date_object[] returnDate = { new date_object("04/01/2000"), null, new date_object("06/01/2000"),
				new date_object("07/01/2000"), new date_object("07/01/2000") };
		date_object[] startPromoDate = { new date_object("01/01/2000"), new date_object("20/01/2000"),
				new date_object("03/01/2000"), new date_object("31/01/2000"), new date_object("31/01/2000") };
		date_object[] endPromoDate = { new date_object("01/02/2000"), new date_object("20/02/2000"),
				new date_object("03/05/2000"), new date_object("31/02/2000"), new date_object("31/03/2000") };
		String brand[] = { "Headphone", "Mouse", "Mouse", "Headphone", "Screen" };
		float[] price_promo = { 10.0f, 20.0f, 30.0f, 40.0f, 50.0f }; // 2
		float[] price_total = { 10.0f, 20.0f, 30.0f, 40.0f, 50.0f }; // 2

		for (int i = 0; i < LONGDUMMIES; i++) {
			S = new smartphone(stock[i], weight[i], price[i], ID[i], purchaseDate[i], deliveryDate[i], returnDate[i],
					startPromoDate[i], endPromoDate[i], brand[i], price_total[i], price_promo[i]);
			Singleton.productsmartphone.add((smartphone) S);

		}

		return (smartphone) S;
	}

	public static smartphone ask_smartphoneID() {
		String ID = Singleton.ID;
		return new smartphone(ID);
	}

	public static accessory ask_accessory_dummies(int longitud) {
		accessory A = null;
		final int LONGDUMMIES = 5;
		int[] stock = { 1, 2, 3, 4, 5 };
		float[] weight = { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f }; // 2
		float[] price = { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f }; // 3
		String[] ID = { "123-A", "123-B", "123-C", "123-D", "123-E" }; // 5
		date_object[] purchaseDate = { new date_object("01/01/2000"), new date_object("02/01/2000"),
				new date_object("03/01/2000"), new date_object("04/01/2000"), new date_object("05/01/2000") };
		date_object[] deliveryDate = { new date_object("02/01/2000"), new date_object("03/01/2000"),
				new date_object("04/01/2000"), new date_object("05/01/2000"), new date_object("06/01/2000") };
		date_object[] returnDate = { new date_object("04/01/2000"), null, new date_object("06/01/2000"),
				new date_object("07/01/2000"), new date_object("07/01/2000") };
		date_object[] startPromoDate = { new date_object("01/01/2000"), new date_object("20/01/2000"),
				new date_object("03/01/2000"), new date_object("31/01/2000"), new date_object("31/01/2000") };
		date_object[] endPromoDate = { new date_object("01/02/2000"), new date_object("20/02/2000"),
				new date_object("03/05/2000"), new date_object("31/02/2000"), new date_object("31/03/2000") };
		String type_of_product[] = { "Headphone", "Mouse", "Mouse", "Headphone", "Screen" };
		float[] price_promo = { 10.0f, 20.0f, 30.0f, 40.0f, 50.0f }; // 2
		float[] price_total = { 10.0f, 20.0f, 30.0f, 40.0f, 50.0f }; // 2

		for (int i = 0; i < LONGDUMMIES; i++) {
			A = new accessory(stock[i], weight[i], price[i], ID[i], purchaseDate[i], deliveryDate[i], returnDate[i],
					startPromoDate[i], endPromoDate[i], price_promo[i], price_total[i], type_of_product[i]);
			Singleton.productaccessory.add((accessory) A);

		}

		return (accessory) A;
	}

	public static accessory ask_accessoryID() {
		String ID = Singleton.ID;
		return new accessory(ID);
	}

//	UPDATE
	public static void updateProduct(product product) {
		String cad = "";
		int attrs = 0;
		if (product instanceof laptop) {
			laptop l1 = (laptop) product;

			String[] opt_attrs = { "Stock", "Weight", "Price", "ID", "Purchase Date", "Delivery Date", "Return Date",
					"Start Promo Date", "End Promo Date", "Price Promotion" };
			attrs = menus.menu(opt_attrs, "What attribute do you want to set?", "Attributes");

			switch (attrs) {
			case 0: // Stock
				l1.setStock(4);
				cad = "Stock updated to " + l1.getStock();
				break;
			case 1: // Weight
				l1.setWeight(1.0f);
				cad = "Weight updated to " + l1.getWeight();
				break;
			case 2: // Price
				l1.setPrice(8.0f);
				cad = "Price updated to " + l1.getPrice();
				break;
			case 3: // ID
				cad = "This option cannot be modified";
				break;
			case 4: // Purchase Date
				l1.setpurchaseDate(new date_object("03/05/2000"));
				cad = "Purchase Date update to" + l1.getpurchaseDate();
				break;
			case 5: // Delivery Date
				l1.setdeliveryDate(new date_object("05/05/2000"));
				cad = "Delivery Date update to " + l1.getdeliveryDate();
				break;
			case 6: // Return Date
				l1.setreturnDate(null);
				cad = "Return Date update to " + l1.getreturnDate();
				break;
			case 7: // Start Promo Date
				l1.setstartPromoDate(new date_object("01/01/2000"));
				cad = "Start Promo Date updated to " + l1.getstartPromoDate();
				break;
			case 8: // End Promo Date
				l1.setendPromoDate(new date_object("09/01/2000"));
				cad = "End Promo Date updated to " + l1.getendPromoDate();
				break;
			case 9: // Price Promotion
				l1.setPrice_promo(0.2f);
				cad = "Price Promotion updated to " + l1.getPrice_promo();
				break;
			}
		} else if (product instanceof smartphone) {
			smartphone S1 = (smartphone) product;

			String[] opt_attrs = { "Stock", "Weight", "Price", "ID", "Purchase Date", "Delivery Date", "Return Date",
					"Start Promo Date", "End Promo Date", "Price Promotion", "Brand" };
			attrs = menus.menu(opt_attrs, "What attribute do you want to set?", "Attributes");

			switch (attrs) {
			case 0: // Stock
				S1.setStock(4);
				cad = "Stock updated to " + S1.getStock();
				break;
			case 1: // Weight
				S1.setWeight(1.0f);
				cad = "Weight updated to " + S1.getWeight();
				break;
			case 2: // Price
				S1.setPrice(8.0f);
				cad = "Price updated to " + S1.getPrice();
				break;
			case 3: // ID
				cad = "This option cannot be modified";
				break;
			case 4: // Purchase Date
				S1.setpurchaseDate(new date_object("03/05/2000"));
				cad = "Purchase Date update to " + S1.getpurchaseDate();
				break;
			case 5: // Delivery Date
				S1.setdeliveryDate(new date_object("05/05/2000"));
				cad = "Delivery Date update to " + S1.getdeliveryDate();
				break;
			case 6: // Return Date
				S1.setreturnDate(null);
				cad = "Return Date update to " + S1.getreturnDate();
				break;
			case 7: // Start Promo Date
				S1.setstartPromoDate(new date_object("01/01/2000"));
				cad = "Start Promo Date updated to " + S1.getstartPromoDate();
				break;
			case 8: // End Promo Date
				S1.setendPromoDate(new date_object("09/01/2000"));
				cad = "End Promo Date updated to " + S1.getendPromoDate();
				break;
			case 9: // Price Promotion
				S1.setPrice_promo(0.2f);
				cad = "Price Promotion updated to " + S1.getPrice_promo();
				break;
			case 10: // Brand
				S1.setBrand(special_prod.comboBrand("smartphone"));
				cad = "Brand Promotion updated to " + S1.getBrand();
				break;
			}
		} else if (product instanceof accessory) {
			accessory A1 = (accessory) product;
			String[] opt_attrs = { "Stock", "Weight", "Price", "ID", "Purchase Date", "Delivery Date", "Return Date",
					"Start Promo Date", "End Promo Date", "Price Promotion", "Brand" };
			attrs = menus.menu(opt_attrs, "What attribute do you want to set?", "Attributes");

			switch (attrs) {
			case 0: // Stock
				A1.setStock(4);
				cad = "Stock updated to " + A1.getStock();
				break;
			case 1: // Weight
				A1.setWeight(1.0f);
				cad = "Weight updated to " + A1.getWeight();
				break;
			case 2: // Price
				A1.setPrice(8.0f);
				cad = "Price updated to " + A1.getPrice();
				break;
			case 3: // ID
				cad = "This option cannot be modified";
				break;
			case 4: // Purchase Date
				A1.setpurchaseDate(new date_object("03/05/2000"));
				cad = "Purchase Date update to " + A1.getpurchaseDate();
				break;
			case 5: // Delivery Date
				A1.setdeliveryDate(new date_object("05/05/2000"));
				cad = "Delivery Date update to " + A1.getdeliveryDate();
				break;
			case 6: // Return Date
				A1.setreturnDate(null);
				cad = "Return Date update to " + A1.getreturnDate();
				break;
			case 7: // Start Promo Date
				A1.setstartPromoDate(new date_object("01/01/2000"));
				cad = "Start Promo Date updated to " + A1.getstartPromoDate();
				break;
			case 8: // End Promo Date
				A1.setendPromoDate(new date_object("09/01/2000"));
				cad = "End Promo Date updated to " + A1.getendPromoDate();
				break;
			case 9: // Price Promotion
				A1.setPrice_promo(0.2f);
				cad = "Price Promotion updated to " + A1.getPrice_promo();
				break;
			case 10: // Brand String type_of_product
				A1.setType_of_product("Mouse");
				cad = "Brand Promotion updated to " + A1.getType_of_product();
				break;
			}
		}
		JOptionPane.showMessageDialog(null, cad, "Information", JOptionPane.INFORMATION_MESSAGE);
	}
}
