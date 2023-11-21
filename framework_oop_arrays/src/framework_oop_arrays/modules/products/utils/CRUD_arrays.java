package framework_oop_arrays.modules.products.utils;

import javax.swing.JOptionPane;

import framework_oop_arrays.menu;
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
		float price_promo = validators.valida_float("Enter the price promo", "Price promo");
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
		String brand = special_prod.comboBrand();
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
		float price_sales = validators.valida_float("Enter the price", "price");
		float price_promo = validators.valida_float("Enter the price promo", "Price promo");
		float price_total = 0.0f;

		menu.A = new accessory(stock, weight, price, ID, purchaseDate, deliveryDate, returnDate, iniPromoDate,
				endPromoDate, price_total, price_sales, price_promo);
		menu.A.calculate_total_price();

		return new accessory(stock, weight, price, ID, purchaseDate, deliveryDate, returnDate, iniPromoDate,
				endPromoDate, price_total, price_sales, price_promo);
	}

	public static accessory ask_accessoryID() {
		Singleton.ID = core_product.ID("ID?", "ID");
		return new accessory(Singleton.ID);
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
				l1.setID(product_data.ask_ID("laptop"));
				cad = "Price updated to " + l1.getID();
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
				cad = "Price updated to " + S1.getID();
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
				S1.setPrice_promo(product_data.ask_price_promo ());
				cad = "Price Promotion updated to " + S1.getPrice_promo();
				break;
			case 10: // Brand
				S1.setBrand(product_data.ask_brand("smartphone"));
				cad = "Brand Promotion updated to " + S1.getBrand();
				break;
			}// end-switch

		} else if (param instanceof accessory) {
//
//			String[] opt_attrs = { "Stock", "Weight", "Price", "ID product", "Purchase Date", "Delivery Date",
//					"Return Date", "Start Promo Date", "End Promo Date", "Price last units", "Price of sales",
//					"Type of product" };
//			;
//			attrs = menus.menu(opt_attrs, "What attribute do you want to set?", "Attributes");
//
//			switch (attrs) {
//			case 0: // Stock
//				int newStock = validators.valida_int("Enter a new stock", "Stock");
//				(menu.A).setStock(newStock);
//				cad = "Stock updated to " + newStock;
//				break;
//			case 1: // Weight
//				float newWeight = validators.valida_float("Enter a new weight", "Weight");
//				(menu.A).setWeight(newWeight);
//				cad = "Weight updated to " + newWeight;
//				break;
//			case 2: // Price
//				int newPrice = validators.valida_int("Enter a new price", "Price");
//				(menu.A).setPrice(newPrice);
//				cad = "Price updated to " + newPrice + "€";
//				break;
//			case 3: // IDuct
//				String newID = insert_data.insert_id("Enter a new ID for the accessory", "ID accessory");
//				(menu.A).setID(newID);
//				cad = "ID updated to " + newID;
//				break;
//			case 4: // Purchase Date
//				framework_oop_arrays.classes.date_object newPurchaseDate = product_data.ask_purchaseDate();
//				(menu.A).setpurchaseDate(newPurchaseDate);
//				cad = "Purchase Date updated to " + newPurchaseDate;
//				break;
//			case 5: // Delivery Date
//				framework_oop_arrays.classes.date_object datePurchase = product_data
//						.ask_deliveryDate((menu.A).getpurchaseDate());
//				(menu.A).setdeliveryDate(datePurchase);
//				break;
//			case 6: // Return Date
//				framework_oop_arrays.classes.date_object deliveryDate = product_data
//						.ask_returnDate((menu.A).getdeliveryDate());
//				(menu.A).setdeliveryDate(deliveryDate);
//				break;
//			case 7: // Start Promo Date
//				framework_oop_arrays.classes.date_object datePurchase_prom = product_data
//						.ask_startDatePromo((menu.A).getpurchaseDate());
//				(menu.A).setiniPromoDate(datePurchase_prom);
//				break;
//			case 8: // End Promo Date
//				framework_oop_arrays.classes.date_object date_end_prom = product_data
//						.ask_endDatePromo((menu.A).getiniPromoDate());
//				(menu.A).setendPromoDate(date_end_prom);
//				break;
//			case 9: // Price of sales
//				float newPriceSales = validators.valida_float("Enter a new price of sales", "Price sales");
//				(menu.A).setWeight(newPriceSales);
//				cad = "Price of sales updated to " + newPriceSales + "€";
//				break;
//			}// end-switch
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
