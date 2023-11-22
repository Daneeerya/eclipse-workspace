package framework_oop_arrays.modules.products.utils;

import javax.swing.JOptionPane;

import framework_oop_arrays.modules.products.classes.Singleton;
import framework_oop_arrays.modules.products.classes.accessory;
import framework_oop_arrays.modules.products.classes.laptop;
import framework_oop_arrays.modules.products.classes.product;
import framework_oop_arrays.modules.products.classes.smartphone;
import framework_oop_arrays.utils.menus;
import framework_oop_arrays.utils.validators;

public class CRUD_arrays {

// CREATE
// Laptop
	public static laptop ask_laptop() {
		int stock = product_data.ask_stock("laptop");
		float weight = product_data.ask_weight("laptop");
		float price = product_data.ask_price("laptop");
		String ID = Singleton.ID;
		framework_oop_arrays.classes.date_object purchaseDate = product_data.ask_purchaseDate();
		framework_oop_arrays.classes.date_object deliveryDate = product_data.ask_deliveryDate(purchaseDate);
		framework_oop_arrays.classes.date_object returnDate = product_data.ask_returnDate(deliveryDate);
		framework_oop_arrays.classes.date_object iniPromoDate = product_data.ask_startDatePromo(purchaseDate);
		framework_oop_arrays.classes.date_object endPromoDate = product_data.ask_endDatePromo(iniPromoDate);
		float price_promo = validators.valida_float("Enter the discount promo ", "Discount");
		float price_total = 0.0f;

		laptop l1 = new laptop(stock, weight, price, ID, purchaseDate, deliveryDate, returnDate, iniPromoDate,
				endPromoDate, price_promo, price_total);
		l1.calculate_total_price();
		return l1;
	}

	public static laptop ask_laptopID() {
		Singleton.ID = core_product.ID("ID?", "ID");
		return new laptop(Singleton.ID);
	}

//	Smartphone
	public static smartphone ask_smartphone() {
		int stock = product_data.ask_stock("smartphpone");
		float weight = product_data.ask_weight("smartphpone");
		float price = product_data.ask_price("smartphpone");
		String ID = Singleton.ID;
		framework_oop_arrays.classes.date_object purchaseDate = product_data.ask_purchaseDate();
		framework_oop_arrays.classes.date_object deliveryDate = product_data.ask_deliveryDate(purchaseDate);
		framework_oop_arrays.classes.date_object returnDate = product_data.ask_returnDate(deliveryDate);
		framework_oop_arrays.classes.date_object iniPromoDate = product_data.ask_startDatePromo(purchaseDate);
		framework_oop_arrays.classes.date_object endPromoDate = product_data.ask_endDatePromo(iniPromoDate);
		float price_promo = validators.valida_float("Enter the price promo", "Price promo");
		String brand = special_prod.comboBrand("smartphone");
		float price_total = 0.0f;

		smartphone S1 = new smartphone(stock, weight, price, ID, purchaseDate, deliveryDate, returnDate, iniPromoDate,
				endPromoDate, brand, price_total, price_promo);
		S1.calculate_total_price();

		return S1;
	}

	public static smartphone ask_smartphoneID() {

		Singleton.ID = core_product.ID("ID?", "ID");
		return new smartphone(Singleton.ID);
	}

//	Accessory
	public static accessory ask_accessory() {
		int stock = product_data.ask_stock("accessory");
		float weight = product_data.ask_weight("accessory");
		float price = product_data.ask_price("accessory");
		String ID = Singleton.ID;
		framework_oop_arrays.classes.date_object purchaseDate = product_data.ask_purchaseDate();
		framework_oop_arrays.classes.date_object deliveryDate = product_data.ask_deliveryDate(purchaseDate);
		framework_oop_arrays.classes.date_object returnDate = product_data.ask_returnDate(deliveryDate);
		framework_oop_arrays.classes.date_object iniPromoDate = product_data.ask_startDatePromo(purchaseDate);
		framework_oop_arrays.classes.date_object endPromoDate = product_data.ask_endDatePromo(iniPromoDate);
		float price_promo = validators.valida_float("Enter the price promo", "Price promo");
		float price_total = 0.0f;
		String type_of_product = special_prod.comboAccessory("accessory");

		accessory A1 = new accessory(stock, weight, price, ID, purchaseDate, deliveryDate, returnDate, iniPromoDate,
				endPromoDate, price_total, price_promo, type_of_product);
		A1.calculate_total_price();

		return A1;
	}

	public static accessory ask_accessoryID() {
		Singleton.ID = core_product.ID("ID?", "ID");
		return new accessory(Singleton.ID);
	}

	public static void readProduct(product param) {
		String cad = "";
		int attrs = 0;
		// Admin
		if (param instanceof laptop) {
			laptop l1 = (laptop) param;
			String[] opt_attrs = { "Stock", "Weight", "Price", "ID", "Purchase Date", "Delivery Date", "Return Date",
					"Start Promo Date", "End Promo Date", "Price Promotion" };
			attrs = menus.menu(opt_attrs, "What attribute do you want to read?", "Attributes");

			switch (attrs) {
			case 0: // Stock
				cad = "Stock is " + l1.getStock();
				break;
			case 1: // Weight
				cad = "Weight updated to " + l1.getWeight();
				break;
			case 2: // Price
				cad = "Price updated to " + l1.getPrice();
				break;
			case 3: // ID
				cad = "Price updated to " + l1.getID();
				break;
			case 4: // Purchase Date
				cad = "Purchase Date updated to " + l1.getpurchaseDate();
				break;
			case 5: // Delivery Date
				cad = "Delivery Date updated to " + l1.getdeliveryDate();
				break;
			case 6: // Return Date
				cad = "Return Date updated to " + l1.getreturnDate();
				break;
			case 7: // Start Promo Date
				cad = "Start Promo Date updated to " + l1.getstartPromoDate();
				break;
			case 8: // End Promo Date
				cad = "End Promo Date updated to " + l1.getendPromoDate();
				break;
			case 9: // Price Promotion
				cad = "Price Promotion updated to " + l1.getPrice_promo();
				break;
			}
		} else if (param instanceof smartphone) {
			smartphone S1 = (smartphone) param;
			String[] opt_attrs = { "Stock", "Weight", "Price", "ID product", "Purchase Date", "Delivery Date",
					"Return Date", "Start Promo Date", "End Promo Date", "Price Promo", "Brand" };
			attrs = menus.menu(opt_attrs, "What attribute do you want to set?", "Attributes");

			switch (attrs) {
			case 0: // Stock
				cad = "Stock updated to " + S1.getStock();
				break;
			case 1: // Weight
				cad = "Weight updated to " + S1.getWeight();
				break;
			case 2: // Price
				cad = "Price updated to " + S1.getPrice();
				break;
			case 3: // ID
				cad = "Price updated to " + S1.getID();
				break;
			case 4: // Purchase Date
				cad = "Purchase Date updated to " + S1.getpurchaseDate();
				break;
			case 5: // Delivery Date
				cad = "Delivery Date updated to " + S1.getdeliveryDate();
				break;
			case 6: // Return Date
				cad = "Return Date updated to " + S1.getreturnDate();
				break;
			case 7: // Start Promo Date
				cad = "Start Promo Date updated to " + S1.getstartPromoDate();
				break;
			case 8: // End Promo Date
				cad = "End Promo Date updated to " + S1.getendPromoDate();
				break;
			case 9: // Price Promotion
				cad = "Price Promotion updated to " + S1.getPrice_promo();
				break;
			case 10: // Brand
				cad = "Brand Promotion updated to " + S1.getBrand();
				break;
			}// end-switch

		} else if (param instanceof accessory) {
			accessory A1 = (accessory) param;
			String[] opt_attrs = { "Stock", "Weight", "Price", "ID product", "Purchase Date", "Delivery Date",
					"Return Date", "Start Promo Date", "End Promo Date", "Type of product" };
			attrs = menus.menu(opt_attrs, "What attribute do you want to set?", "Attributes");

			switch (attrs) {
			case 0: // Stock
				cad = "Stock updated to " + A1.getStock();
				break;
			case 1: // Weight
				cad = "Weight updated to " + A1.getWeight();
				break;
			case 2: // Price
				cad = "Price updated to " + A1.getPrice();
				break;
			case 3: // ID
				cad = "Price updated to " + A1.getID();
				break;
			case 4: // Purchase Date
				cad = "Purchase Date updated to " + A1.getpurchaseDate();
				break;
			case 5: // Delivery Date
				cad = "Delivery Date updated to " + A1.getdeliveryDate();
				break;
			case 6: // Return Date
				cad = "Return Date updated to " + A1.getreturnDate();
				break;
			case 7: // Start Promo Date
				cad = "Start Promo Date updated to " + A1.getstartPromoDate();
				break;
			case 8: // End Promo Date
				cad = "End Promo Date updated to " + A1.getendPromoDate();
				break;
			case 9: // Price Promotion
				cad = "Price Promotion updated to " + A1.getPrice_promo();
				break;
			case 10: // Type of product
				cad = "Type of product updated to " + A1.getType_of_product();
				break;
			}

		}
		JOptionPane.showMessageDialog(null, cad);

	}

// UPDATE
	public static void updateProduct(product param) {
		String cad = "";
		int attrs = 0;
		// Admin
		if (param instanceof laptop) {
			laptop l1 = (laptop) param;
			String[] opt_attrs = { "Stock", "Weight", "Price", "ID", "Purchase Date", "Delivery Date", "Return Date",
					"Start Promo Date", "End Promo Date", "Price Promotion" };
			attrs = menus.menu(opt_attrs, "What attribute do you want to set?", "Attributes");

			switch (attrs) {
			case 0: // Stock
				l1.setStock(product_data.ask_stock("laptop"));
				cad = "Stock updated to " + l1.getStock();
				break;
			case 1: // Weight
				l1.setWeight(product_data.ask_weight("laptop"));
				cad = "Weight updated to " + l1.getWeight();
				break;
			case 2: // Price
				l1.setPrice(product_data.ask_price("laptop"));
				cad = "Price updated to " + l1.getPrice();
				break;
			case 3: // ID
				functions_find.find_laptop(l1);

				l1.setID(product_data.ask_ID("laptop"));

				cad = "ID updated to " + l1.getID();
				break;
			case 4: // Purchase Date
				l1.setpurchaseDate(product_data.ask_purchaseDate());
				cad = "Purchase Date updated to " + l1.getpurchaseDate();
				break;
			case 5: // Delivery Date
				l1.setdeliveryDate(product_data.ask_deliveryDate(l1.getpurchaseDate()));
				cad = "Delivery Date updated to " + l1.getdeliveryDate();
				break;
			case 6: // Return Date
				l1.setreturnDate(product_data.ask_returnDate(l1.getdeliveryDate()));
				cad = "Return Date updated to " + l1.getreturnDate();
				break;
			case 7: // Start Promo Date
				l1.setstartPromoDate(l1.getpurchaseDate());
				cad = "Start Promo Date updated to " + l1.getstartPromoDate();
				break;
			case 8: // End Promo Date
				l1.setendPromoDate(l1.getstartPromoDate());
				cad = "End Promo Date updated to " + l1.getendPromoDate();
				break;
			case 9: // Price Promotion
				l1.setPrice_promo(l1.getPrice_promo());
				cad = "Price Promotion updated to " + l1.getPrice_promo();
				break;
			}

		} else if (param instanceof smartphone) {
			smartphone S1 = (smartphone) param;
			String[] opt_attrs = { "Stock", "Weight", "Price", "ID product", "Purchase Date", "Delivery Date",
					"Return Date", "Start Promo Date", "End Promo Date", "Price Promo", "Brand" };
			attrs = menus.menu(opt_attrs, "What attribute do you want to set?", "Attributes");

			switch (attrs) {
			case 0: // Stock
				S1.setStock(product_data.ask_stock("laptop"));
				cad = "Stock updated to " + S1.getStock();
				break;
			case 1: // Weight
				S1.setWeight(product_data.ask_weight("laptop"));
				cad = "Weight updated to " + S1.getWeight();
				break;
			case 2: // Price
				S1.setPrice(product_data.ask_price("laptop"));
				cad = "Price updated to " + S1.getPrice();
				break;
			case 3: // ID
				S1.setID(product_data.ask_ID("laptop"));
				cad = "ID updated to " + S1.getID();
				break;
			case 4: // Purchase Date
				S1.setpurchaseDate(product_data.ask_purchaseDate());
				cad = "Purchase Date updated to " + S1.getpurchaseDate();
				break;
			case 5: // Delivery Date
				S1.setdeliveryDate(product_data.ask_deliveryDate(S1.getpurchaseDate()));
				cad = "Delivery Date updated to " + S1.getdeliveryDate();
				break;
			case 6: // Return Date
				S1.setreturnDate(product_data.ask_returnDate(S1.getdeliveryDate()));
				cad = "Return Date updated to " + S1.getreturnDate();
				break;
			case 7: // Start Promo Date
				S1.setstartPromoDate(product_data.ask_startDatePromo(S1.getpurchaseDate()));
				cad = "Start Promo Date updated to " + S1.getstartPromoDate();
				break;
			case 8: // End Promo Date
				S1.setendPromoDate(product_data.ask_endDatePromo(S1.getstartPromoDate()));
				cad = "End Promo Date updated to " + S1.getendPromoDate();
				break;
			case 9: // Price Promotion
				S1.setPrice_promo(S1.getPrice_promo());
				cad = "Price Promotion updated to " + S1.getPrice_promo();
				break;
			case 10: // Brand
				S1.setBrand(special_prod.comboBrand("smartphone"));
				cad = "Brand Promotion updated to " + S1.getBrand();
				break;
			}// end-switch

		} else if (param instanceof accessory) {
			accessory A1 = (accessory) param;
			String[] opt_attrs = { "Stock", "Weight", "Price", "ID product", "Purchase Date", "Delivery Date",
					"Return Date", "Start Promo Date", "End Promo Date", "Type of product" };
			;
			attrs = menus.menu(opt_attrs, "What attribute do you want to set?", "Attributes");

			switch (attrs) {
			case 0: // Stock
				A1.setStock(product_data.ask_stock("accessory"));
				cad = "Stock updated to " + A1.getStock();
				break;
			case 1: // Weight
				A1.setWeight(product_data.ask_weight("accessory"));
				cad = "Weight updated to " + A1.getWeight();
				break;
			case 2: // Price
				A1.setPrice(product_data.ask_price("accessory"));
				cad = "Price updated to " + A1.getPrice();
				break;
			case 3: // ID
				A1.setID(product_data.ask_ID("accessory"));
				cad = "ID updated to " + A1.getID();
				break;
			case 4: // Purchase Date
				A1.setpurchaseDate(product_data.ask_purchaseDate());
				cad = "Purchase Date updated to " + A1.getpurchaseDate();
				break;
			case 5: // Delivery Date
				A1.setdeliveryDate(product_data.ask_deliveryDate(A1.getpurchaseDate()));
				cad = "Delivery Date updated to " + A1.getdeliveryDate();
				break;
			case 6: // Return Date
				A1.setreturnDate(product_data.ask_returnDate(A1.getdeliveryDate()));
				cad = "Return Date updated to " + A1.getreturnDate();
				break;
			case 7: // Start Promo Date
				A1.setstartPromoDate(product_data.ask_startDatePromo(A1.getpurchaseDate()));
				cad = "Start Promo Date updated to " + A1.getstartPromoDate();
				break;
			case 8: // End Promo Date
				A1.setendPromoDate(product_data.ask_endDatePromo(A1.getstartPromoDate()));
				cad = "End Promo Date updated to " + A1.getendPromoDate();
				break;
			case 9: // Price Promotion
				A1.setPrice_promo(A1.getPrice_promo());
//				A1.setPrice_promo(4.0f); <--DUMMIES (if/else)
				cad = "Price Promotion updated to " + A1.getPrice_promo();
				break;

			case 10: // Type of product
				A1.setType_of_product(special_prod.comboAccessory("accessory"));
				cad = "Type of product updated to " + A1.getType_of_product();
				break;
			}

		}
		JOptionPane.showMessageDialog(null, cad);
	}

	public static void set_laptopID(laptop l1, product param) {
		int location = -1;
		l1 = CRUD_arrays.ask_laptopID();
		location = functions_find.find_laptop(l1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "The laptop is not created", "Error", location);
		} else {
			param.setID(Singleton.ID);
		}
	}

	public static void set_smartphoneID(smartphone A1, product param) {
		int location = -1;
		A1 = CRUD_arrays.ask_smartphoneID();
		location = functions_find.find_smartphone(A1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "The smartphone is not created", "Error", location);
		} else {
			param.setID(Singleton.ID);
		}
	}

	public static void set_accessoryID(accessory A1, product param) {
		int location = -1;
		A1 = CRUD_arrays.ask_accessoryID();
		location = functions_find.find_accessory(A1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "The accessory is not created", "Error", location);
		} else {
			param.setID(Singleton.ID);
		}
	}
}
