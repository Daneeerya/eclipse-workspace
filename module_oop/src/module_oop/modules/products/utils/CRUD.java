package module_oop.modules.products.utils;

import javax.swing.JOptionPane;

import module_oop.menu;
import module_oop.modules.products.classes.accessory;
import module_oop.modules.products.classes.laptop;
import module_oop.modules.products.classes.product;
import module_oop.modules.products.classes.smartphone;
import module_oop.utils.insert_data;
import module_oop.utils.menus;
import module_oop.utils.validators;

public class CRUD {
	public static void create(int i) {
		if (i == 0) {
			int stock = product_data.ask_stock("laptop");
			float weight = product_data.ask_weight("laptop");
			float price = product_data.ask_price("laptop");
			String ID_prod = product_data.ask_ID("laptop");
			module_oop.classes.date_object purchaseDate = product_data.ask_purchaseDate();
			module_oop.classes.date_object deliveryDate = product_data.ask_deliveryDate(purchaseDate);
			module_oop.classes.date_object returnDate = product_data.ask_returnDate(deliveryDate);
			module_oop.classes.date_object iniPromoDate = product_data.ask_startDatePromo(purchaseDate);
			module_oop.classes.date_object endPromoDate = product_data.ask_endDatePromo(iniPromoDate);
			int n_days_with_promo = validators.valida_int("Enter the days with promo ", "Days with promo");
			float price_promo = validators.valida_float("Enter the price promo", "Price promo");
			float price_total = 0.0f;
			menu.L = new laptop(stock, weight, price, ID_prod, purchaseDate, deliveryDate, returnDate, iniPromoDate,
					endPromoDate, n_days_with_promo, price_promo, price_total);
			menu.L.calculate_total_price();

		} else if (i == 1) {
			int stock = product_data.ask_stock("smartphpone");
			float weight = product_data.ask_weight("smartphpone");
			float price = product_data.ask_price("smartphpone");
			String ID_prod = product_data.ask_ID("smartphpone");
			module_oop.classes.date_object purchaseDate = product_data.ask_purchaseDate();
			module_oop.classes.date_object deliveryDate = product_data.ask_deliveryDate(purchaseDate);
			module_oop.classes.date_object returnDate = product_data.ask_returnDate(deliveryDate);
			module_oop.classes.date_object iniPromoDate = product_data.ask_startDatePromo(purchaseDate);
			module_oop.classes.date_object endPromoDate = product_data.ask_endDatePromo(iniPromoDate);
			int n_days_last_units = validators.valida_int("Enter the days with promo ", "Days with promo");
			int n_sales_days = validators.valida_int("Enter the qty of sales days", "Sales days");
			float price_promo = validators.valida_float("Enter the price promo", "Price promo");
			String brand = validators.valida_string("Enter the brand", "Brand");
			float price_total = 0.0f;

			menu.S = new smartphone(stock, weight, price, ID_prod, purchaseDate, deliveryDate, returnDate, iniPromoDate,
					endPromoDate, n_days_last_units, n_sales_days, brand, price_total, price_promo);
			menu.S.calculate_total_price();

		} else if (i == 2) {
			int stock = product_data.ask_stock("accessory");
			float weight = product_data.ask_weight("accessory");
			float price = product_data.ask_price("accessory");
			String ID_prod = product_data.ask_ID("accessory");
			module_oop.classes.date_object purchaseDate = product_data.ask_purchaseDate();
			module_oop.classes.date_object deliveryDate = product_data.ask_deliveryDate(purchaseDate);
			module_oop.classes.date_object returnDate = product_data.ask_returnDate(deliveryDate);
			module_oop.classes.date_object iniPromoDate = product_data.ask_startDatePromo(purchaseDate);
			module_oop.classes.date_object endPromoDate = product_data.ask_endDatePromo(iniPromoDate);
			float price_last_units = validators.valida_float("Enter the price", "price");
			float price_sales = validators.valida_float("Enter the price", "price");
			String type_of_product = validators.valida_string("Enter the type of product", "Type of product");
			float price_promo = validators.valida_float("Enter the price promo", "Price promo");
			float price_total = 0.0f;

			menu.A = new accessory(stock, weight, price, ID_prod, purchaseDate, deliveryDate, returnDate, iniPromoDate,
					endPromoDate, price_last_units, price_sales, price_promo, type_of_product, price_total);
			menu.A.calculate_total_price();

		}
	}// end-create

	public static void read_all(product p) {
		if (p instanceof laptop) {
			JOptionPane.showMessageDialog(null, (menu.L).toString(), "Information", JOptionPane.INFORMATION_MESSAGE);
		} else if (p instanceof smartphone) {
			JOptionPane.showMessageDialog(null, (menu.S).toString(), "Information", JOptionPane.INFORMATION_MESSAGE);
		} else if (p instanceof accessory) {
			JOptionPane.showMessageDialog(null, (menu.A).toString(), "Information", JOptionPane.INFORMATION_MESSAGE);
		} // end-else if
	}// end-read_all

	public static void read_one(product p) {
		String cad = "";
		int attrs = 0;
		if (p instanceof laptop) {
			String[] opt_attrs = { "Stock", "Weight", "Price", "ID", "Purchase Date", "Delivery Date", "Return Date",
					"Start Promo Date", "End Promo Date", "N Days with promo", "Price Promotion" };
			attrs = menus.menu(opt_attrs, "What attribute do you want to read?", "Attributes");
			switch (attrs) {
			case 0: // Stock
				cad = "There is a stock of " + (menu.L).getStock() + " units of laptops";
				break;
			case 1: // Weight
				cad = "The weight of the laptop is " + (menu.L).getWeight() + " kg";
				break;
			case 2: // Price
				cad = "The price of the laptop is " + (menu.L).getPrice() + "€";
				break;
			case 3: // ID_product
				cad = "The ID of the laptop is " + (menu.L).getID_prod();
				break;
			case 4: // Purchase Date
				cad = "The purchase date of the laptop is " + (menu.L).getpurchaseDate();
				break;
			case 5: // Delivery Date
				cad = "The delivery date of the laptop is " + (menu.L).getdeliveryDate();
				break;
			case 6: // Return Date
				cad = "The return date of the laptop is " + (menu.L).getreturnDate();
				break;
			case 7: // Start Promo Date
				cad = "The start promotion date of the laptop is " + (menu.L).getiniPromoDate();
				break;
			case 8: // End Promo Date
				cad = "The end promotion date of the laptop is " + (menu.L).getendPromoDate();
				break;
			case 9: // N Days with promo
				cad = "There are " + (menu.L).getN_days_with_promo() + " days of promotion";
				break;
			case 10: // Price Promotion
				cad = "The price with the promotion is  " + (menu.L).getPrice_promo() + "€";
				break;
			}// end-switch
		} // end instanceof smartphone
		else if (p instanceof smartphone) {
			String[] opt_attrs = { "Stock", "Weight", "Price", "ID product", "Purchase Date", "Delivery Date",
					"Return Date", "Start Promo Date", "End Promo Date", "Number days last units",
					"Number of sales days", "Brand" };
			attrs = menus.menu(opt_attrs, "What attribute do you want to read?", "Attributes");
			switch (attrs) {
			case 0: // Stock
				cad = "There is a stock of " + (menu.S).getStock() + " units of smartphone";
				break;
			case 1: // Weight
				cad = "The weight of the smartphone is " + (menu.S).getWeight() + "kg";
				break;
			case 2: // Price
				cad = "The price of the smartphone is " + (menu.S).getPrice() + "€";
				break;
			case 3: // ID_product
				cad = "The ID of the smartphone is " + (menu.S).getID_prod();
				break;
			case 4: // Purchase Date
				cad = "The purchase date of the smartphone is " + (menu.S).getpurchaseDate();
				break;
			case 5: // Delivery Date
				cad = "The delivery date of the smartphone is " + (menu.S).getdeliveryDate();
				break;
			case 6: // Return Date
				cad = "The return date of the smartphone is " + (menu.S).getreturnDate();
				break;
			case 7: // Start Promo Date
				cad = "The start promotion date of the smartphone is " + (menu.S).getiniPromoDate();
				break;
			case 8: // End Promo Date
				cad = "The end promotion date of the smartphone is " + (menu.S).getendPromoDate();
				break;
			case 9: // Number days last units
				cad = "There are " + (menu.S).getN_days_last_units() + " days of last units for smartphone ";
				break;
			case 10: // Number of sales days
				cad = "There are  " + (menu.S).getN_sales_days() + " days of sales for smartphone";
				break;
			case 11: // Brand
				cad = "The brand of the smartphone is  " + (menu.S).getBrand();
				break;
			}// end-switch
		} else if (p instanceof accessory) {
			String[] opt_attrs = { "Stock", "Weight", "Price", "ID product", "Purchase Date", "Delivery Date",
					"Return Date", "Start Promo Date", "End Promo Date", "Price last units", "Price of sales",
					"Type of product" };
			attrs = menus.menu(opt_attrs, "What attribute do you want to read?", "Attributes");
			switch (attrs) {
			case 0: // Stock
				cad = "There is a stock of " + (menu.A).getStock() + " units of accessorys";
				break;
			case 1: // Weight
				cad = "The weight of the accessory is " + (menu.A).getWeight() + "kg";
				break;
			case 2: // Price
				cad = "The price of the accessory is " + (menu.A).getPrice() + "€";
				break;
			case 3: // ID_product
				cad = "The ID of the accessory is " + (menu.A).getID_prod();
				break;
			case 4: // Purchase Date
				cad = "The purchase date of the accessory is " + (menu.A).getpurchaseDate();
				break;
			case 5: // Delivery Date
				cad = "The delivery date of the accessory is " + (menu.A).getdeliveryDate();
				break;
			case 6: // Return Date
				cad = "The return date of the accessory is " + (menu.A).getreturnDate();
				break;
			case 7: // Start Promo Date
				cad = "The start promotion date of the accessory is " + (menu.A).getiniPromoDate();
				break;
			case 8: // End Promo Date
				cad = "The end promotion date of the accessory is " + (menu.A).getendPromoDate();
				break;
			case 9: // Price last units
				cad = "The price of the last units is " + (menu.A).getPrice_last_units() + "€";
				break;
			case 10: // Price of sales
				cad = "The price of sales is  " + (menu.A).getPrice_sales() + "€";
				break;
			case 11: // Type of product
				cad = "The type of product is  " + (menu.A).getType_of_product();
				break;
			}// end-switch
		} // end-if
		JOptionPane.showMessageDialog(null, cad);

	}// end-read_one

	public static void update(product p) {
		String cad = "";
		int attrs = 0;
		if (p instanceof laptop) {
			String[] opt_attrs = { "Stock", "Weight", "Price", "ID", "Purchase Date", "Delivery Date", "Return Date",
					"Start Promo Date", "End Promo Date", "N Days with promo", "Price Promotion" };
			;
			attrs = menus.menu(opt_attrs, "What attribute do you want to set?", "Attributes");

			switch (attrs) {
			case 0: // Stock
				int newStock = validators.valida_int("Enter a new stock", "Stock");
				(menu.L).setStock(newStock);
				cad = "Stock updated to " + newStock;
				break;
			case 1: // Weight
				float newWeight = validators.valida_float("Enter a new weight", "Weight");
				(menu.L).setWeight(newWeight);
				cad = "Weight updated to " + newWeight;
				break;
			case 2: // Price
				int newPrice = validators.valida_int("Enter a new price", "Price");
				(menu.L).setPrice(newPrice);
				cad = "Price updated to " + newPrice;
				break;
			case 3: // ID_product
				String newID_prod = insert_data.insert_id("Enter a new ID for the laptop", "ID laptop");
				(menu.L).setID_prod(newID_prod);
				cad = "ID updated to " + newID_prod;
				break;
			case 4: // Purchase Date
				module_oop.classes.date_object newPurchaseDate = product_data.ask_purchaseDate();
				(menu.L).setpurchaseDate(newPurchaseDate);
				cad = "Purchase Date updated to " + newPurchaseDate;
				break;
			case 5: // Delivery Date
				module_oop.classes.date_object datePurchase = product_data.ask_deliveryDate((menu.L).getpurchaseDate());
				(menu.L).setdeliveryDate(datePurchase);
				break;
			case 6: // Return Date
				module_oop.classes.date_object deliveryDate = product_data.ask_returnDate((menu.L).getdeliveryDate());
				(menu.L).setdeliveryDate(deliveryDate);
				break;
			case 7: // Start Promo Date
				module_oop.classes.date_object date_ini_prom = product_data
						.ask_startDatePromo((menu.L).getpurchaseDate());
				(menu.L).setiniPromoDate(date_ini_prom);
				break;
			case 8: // End Promo Date
				module_oop.classes.date_object date_end_prom = product_data
						.ask_endDatePromo((menu.L).getiniPromoDate());
				(menu.L).setendPromoDate(date_end_prom);
				break;
			case 9: // N Days with promo
				int newN_days_with_promo = validators.valida_int("Enter a new days with promotion",
						"Days with promotion");
				(menu.L).setN_days_with_promo(newN_days_with_promo);
				cad = "New days with promotion updated to " + newN_days_with_promo;
				break;
			case 10: // Price Promotion
				float newPrice_Promotion = validators.valida_float("Enter new price to promotion", "Price Promotion");
				(menu.L).setPrice_promo(newPrice_Promotion);
				cad = "Price to promotion updated to " + newPrice_Promotion;
				break;
			}// end-switch

		} else if (p instanceof smartphone) {
			String[] opt_attrs = { "Stock", "Weight", "Price", "ID product", "Purchase Date", "Delivery Date",
					"Return Date", "Start Promo Date", "End Promo Date", "Number days last units",
					"Number of sales days", "Brand" };
			attrs = menus.menu(opt_attrs, "What attribute do you want to set?", "Attributes");

			switch (attrs) {
			case 0: // Stock
				int newStock = validators.valida_int("Enter a new stock", "Stock");
				(menu.S).setStock(newStock);
				cad = "Stock updated to " + newStock;
				break;
			case 1: // Weight
				float newWeight = validators.valida_float("Enter a new weight", "Weight");
				(menu.S).setWeight(newWeight);
				cad = "Weight updated to " + newWeight;
				break;
			case 2: // Price
				int newPrice = validators.valida_int("Enter a new price", "Price");
				(menu.S).setPrice(newPrice);
				cad = "Price updated to " + newPrice + "€";
				break;
			case 3: // ID_product
				String newID_prod = insert_data.insert_id("Enter a new ID for the smartphone", "ID smartphone");
				(menu.S).setID_prod(newID_prod);
				cad = "ID updated to " + newID_prod;
				break;
			case 4: // Purchase Date
				module_oop.classes.date_object newPurchaseDate = product_data.ask_purchaseDate();
				(menu.S).setpurchaseDate(newPurchaseDate);
				cad = "Purchase Date updated to " + newPurchaseDate;
				break;
			case 5: // Delivery Date
				module_oop.classes.date_object datePurchase = product_data.ask_deliveryDate((menu.S).getpurchaseDate());
				(menu.S).setdeliveryDate(datePurchase);
				break;
			case 6: // Return Date
				module_oop.classes.date_object deliveryDate = product_data.ask_returnDate((menu.S).getdeliveryDate());
				(menu.S).setdeliveryDate(deliveryDate);
				break;
			case 7: // Start Promo Date
				module_oop.classes.date_object datePurchase_prom = product_data
						.ask_startDatePromo((menu.S).getpurchaseDate());
				(menu.S).setiniPromoDate(datePurchase_prom);
				break;
			case 8: // End Promo Date
				module_oop.classes.date_object date_end_prom = product_data
						.ask_endDatePromo((menu.S).getiniPromoDate());
				(menu.S).setendPromoDate(date_end_prom);
				break;
			case 9: // Number days last units
				int newN_days_last_units = validators.valida_int("Enter a new days with last units", "Days last units");
				(menu.S).setStock(newN_days_last_units);
				cad = "Days with last units updated to " + newN_days_last_units;
				break;
			case 10: // Number of sales days
				int newSalesDays = validators.valida_int("Enter new sales days", "Sales Days");
				(menu.S).setN_sales_days(newSalesDays);
				cad = "Sales Days updated to " + newSalesDays;
				break;
			case 11: // Brand
				String newBrand = validators.valida_string("Enter a new brand ", "Brand");
				(menu.S).setBrand(newBrand);
				cad = "Brand updated to " + newBrand;
				break;
			}// end-switch

		} else if (p instanceof accessory) {
			String[] opt_attrs = { "Stock", "Weight", "Price", "ID product", "Purchase Date", "Delivery Date",
					"Return Date", "Start Promo Date", "End Promo Date", "Price last units", "Price of sales",
					"Type of product" };
			;
			attrs = menus.menu(opt_attrs, "What attribute do you want to set?", "Attributes");

			switch (attrs) {
			case 0: // Stock
				int newStock = validators.valida_int("Enter a new stock", "Stock");
				(menu.A).setStock(newStock);
				cad = "Stock updated to " + newStock;
				break;
			case 1: // Weight
				float newWeight = validators.valida_float("Enter a new weight", "Weight");
				(menu.A).setWeight(newWeight);
				cad = "Weight updated to " + newWeight;
				break;
			case 2: // Price
				int newPrice = validators.valida_int("Enter a new price", "Price");
				(menu.A).setPrice(newPrice);
				cad = "Price updated to " + newPrice + "€";
				break;
			case 3: // ID_product
				String newID_prod = insert_data.insert_id("Enter a new ID for the accessory", "ID accessory");
				(menu.A).setID_prod(newID_prod);
				cad = "ID updated to " + newID_prod;
				break;
			case 4: // Purchase Date
				module_oop.classes.date_object newPurchaseDate = product_data.ask_purchaseDate();
				(menu.A).setpurchaseDate(newPurchaseDate);
				cad = "Purchase Date updated to " + newPurchaseDate;
				break;
			case 5: // Delivery Date
				module_oop.classes.date_object datePurchase = product_data.ask_deliveryDate((menu.A).getpurchaseDate());
				(menu.A).setdeliveryDate(datePurchase);
				break;
			case 6: // Return Date
				module_oop.classes.date_object deliveryDate = product_data.ask_returnDate((menu.A).getdeliveryDate());
				(menu.A).setdeliveryDate(deliveryDate);
				break;
			case 7: // Start Promo Date
				module_oop.classes.date_object datePurchase_prom = product_data
						.ask_startDatePromo((menu.A).getpurchaseDate());
				(menu.A).setiniPromoDate(datePurchase_prom);
				break;
			case 8: // End Promo Date
				module_oop.classes.date_object date_end_prom = product_data
						.ask_endDatePromo((menu.A).getiniPromoDate());
				(menu.A).setendPromoDate(date_end_prom);
				break;
			case 10: // Price last units
				float newPrice_last_units = validators.valida_float("Enter a new price of last units",
						"Price last units");
				(menu.A).setPrice_last_units(newPrice_last_units);
				cad = "Price last units updated to " + newPrice_last_units + "€";
				break;
			case 11: // Price of sales
				float newPriceSales = validators.valida_float("Enter a new price of sales", "Price sales");
				(menu.A).setWeight(newPriceSales);
				cad = "Price of sales updated to " + newPriceSales + "€";
				break;
			case 12: // Type of Product
				String newTypeOfProduct = validators.valida_string("Enter a new type of product", "Type of product");
				(menu.A).setType_of_product(newTypeOfProduct);
				cad = "Type of Product updated to " + newTypeOfProduct;
				break;
			}// end-switch
		} // end-else-if
		JOptionPane.showMessageDialog(null, cad);

	}// end-update

	public static void delete(product p) {
		if (p instanceof laptop) {
			menu.L = null;
		} else if (p instanceof smartphone) {
			menu.S = null;
		} else if (p instanceof accessory) {
			menu.A = null;
		}
	}// end-delete

}
