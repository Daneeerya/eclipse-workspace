package modules.products.utils;

import javax.swing.JOptionPane;
import modules.products.classes.*;
import modules_oop.main;
import utils.insert_data;
import utils.menus;
import utils.validators;

public class CRUD {
	public static product create(int i) {
		product p = null;
		if (i == 0) {
			int stock = product_data.ask_stock("laptop");
			float weight = product_data.ask_weight("laptop");
			float price = product_data.ask_price("laptop");
			String ID_prod = product_data.ask_ID("laptop");
			classes.date_object purchaseDate = product_data.pide_fecha_compra();
			classes.date_object deliveryDate = product_data.pide_fecha_entrega(purchaseDate);
			classes.date_object returnDate = product_data.pide_fecha_devolucio(deliveryDate);
//			classes.date_object return_Purchase_Date = product_data.pide_fecha_devolucio_compra(deliveryDate, returnDate);
			classes.date_object iniPromoDate = product_data.pide_f_inicio_promo(purchaseDate);
			classes.date_object endPromoDate = product_data.pide_f_fin_promo(iniPromoDate, purchaseDate);
			int n_days_with_promo = validators.valida_int("Enter the days with promo ", "Days with promo");
			float price_promo = validators.valida_float("Enter the price promo", "Price promo");

			p = new laptop(stock, weight, price, ID_prod, purchaseDate, deliveryDate, returnDate, iniPromoDate,
					endPromoDate, n_days_with_promo, price_promo);

		} else if (i == 1) {
			int stock = product_data.ask_stock("smartphpone");
			float weight = product_data.ask_weight("smartphpone");
			float price = product_data.ask_price("smartphpone");
			String ID_prod = product_data.ask_ID("smartphpone");
			classes.date_object purchaseDate = product_data.pide_fecha_compra();
			classes.date_object deliveryDate = product_data.pide_fecha_entrega(purchaseDate);
			classes.date_object returnDate = product_data.pide_fecha_devolucio(deliveryDate);
//			classes.date_object return_Purchase_Date = product_data.pide_fecha_devolucio_compra(deliveryDate, returnDate);
			classes.date_object iniPromoDate = product_data.pide_f_inicio_promo(purchaseDate);
			classes.date_object endPromoDate = product_data.pide_f_fin_promo(iniPromoDate, purchaseDate);
			int n_days_last_units = validators.valida_int("Enter the days with promo ", "Days with promo");
			int n_sales_days = validators.valida_int("Enter the qty of sales days", "Sales days");
			String brand = validators.valida_string("Enter the brand", "Brand");

			p = new smartphone(stock, weight, price, ID_prod, purchaseDate, deliveryDate, returnDate, iniPromoDate,
					endPromoDate, n_days_last_units, n_sales_days, brand);

		} else if (i == 2) {
			int stock = product_data.ask_stock("accessory");
			float weight = product_data.ask_weight("accessory");
			float price = product_data.ask_price("accessory");
			String ID_prod = product_data.ask_ID("accessory");
			classes.date_object purchaseDate = product_data.pide_fecha_compra();
			classes.date_object deliveryDate = product_data.pide_fecha_entrega(purchaseDate);
			classes.date_object returnDate = product_data.pide_fecha_devolucio(deliveryDate);
//			classes.date_object return_Purchase_Date = product_data.pide_fecha_devolucio_compra(deliveryDate, returnDate);
			classes.date_object iniPromoDate = product_data.pide_f_inicio_promo(purchaseDate);
			classes.date_object endPromoDate = product_data.pide_f_fin_promo(iniPromoDate, purchaseDate);
			float price_last_units = validators.valida_float("Enter the price", "price");
			float price_sales = validators.valida_float("Enter the price", "price");
			String type_of_product = validators.valida_string("Enter the type of product", "Type of product");

			p = new accessory(stock, weight, price, ID_prod, purchaseDate, deliveryDate, returnDate, iniPromoDate,
					endPromoDate, price_last_units, price_sales, type_of_product);
		}
		return p;
	}// end-create

	public static void read_all(product p) {
		if (p instanceof laptop) {
			JOptionPane.showMessageDialog(null, ((laptop) p).toString(), "Information",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (p instanceof smartphone) {
			JOptionPane.showMessageDialog(null, ((smartphone) p).toString(), "Information",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (p instanceof accessory) {
			JOptionPane.showMessageDialog(null, ((accessory) p).toString(), "Information",
					JOptionPane.INFORMATION_MESSAGE);
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
				cad = "There is a stock of " + ((laptop) p).getStock() + " units of laptops";
				break;
			case 1: // Weight
				cad = "The weight of the laptop is " + ((laptop) p).getWeight() + " kg";
				break;
			case 2: // Price
				cad = "The price of the laptop is " + ((laptop) p).getPrice() + "€";
				break;
			case 3: // ID_product
				cad = "The ID of the laptop is " + ((laptop) p).getID_prod();
				break;
			case 4: // Purchase Date
				cad = "The purchase date of the laptop is " + ((laptop) p).getpurchaseDate();
				break;
			case 5: // Delivery Date
				cad = "The delivery date of the laptop is " + ((laptop) p).getdeliveryDate();
				break;
			case 6: // Return Date
				cad = "The return date of the laptop is " + ((laptop) p).getreturnDate();
				break;
			case 7: // Start Promo Date
				cad = "The start promotion date of the laptop is " + ((laptop) p).getiniPromoDate();
				break;
			case 8: // End Promo Date
				cad = "The end promotion date of the laptop is " + ((laptop) p).getendPromoDate();
				break;
			case 9: // N Days with promo
				cad = "There are " + ((laptop) p).getN_days_with_promo() + " days of promotion";
				break;
			case 10: // Price Promotion
				cad = "The price with the promotion is  " + ((laptop) p).getPrice_promo() + "€";
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
				cad = "There is a stock of " + ((smartphone) p).getStock() + " units of smartphone";
				break;
			case 1: // Weight
				cad = "The weight of the smartphone is " + ((smartphone) p).getWeight() + "kg";
				break;
			case 2: // Price
				cad = "The price of the smartphone is " + ((smartphone) p).getPrice() + "€";
				break;
			case 3: // ID_product
				cad = "The ID of the smartphone is " + ((smartphone) p).getID_prod();
				break;
			case 4: // Purchase Date
				cad = "The purchase date of the smartphone is " + ((smartphone) p).getpurchaseDate();
				break;
			case 5: // Delivery Date
				cad = "The delivery date of the smartphone is " + ((smartphone) p).getdeliveryDate();
				break;
			case 6: // Return Date
				cad = "The return date of the smartphone is " + ((smartphone) p).getreturnDate();
				break;
			case 7: // Start Promo Date
				cad = "The start promotion date of the smartphone is " + ((smartphone) p).getiniPromoDate();
				break;
			case 8: // End Promo Date
				cad = "The end promotion date of the smartphone is " + ((smartphone) p).getendPromoDate();
				break;
			case 9: // Number days last units
				cad = "There are " + ((smartphone) p).getN_days_last_units() + " days of last units for smartphone ";
				break;
			case 10: // Number of sales days
				cad = "There are  " + ((smartphone) p).getN_sales_days() + " days of sales for smartphone";
				break;
			case 11: // Brand
				cad = "The brand of the smartphone is  " + ((smartphone) p).getBrand();
				break;
			}// end-switch
		} else if (p instanceof accessory) {
			String[] opt_attrs = { "Stock", "Weight", "Price", "ID product", "Purchase Date", "Delivery Date",
					"Return Date", "Start Promo Date", "End Promo Date", "Price last units", "Price of sales",
					"Type of product" };
			attrs = menus.menu(opt_attrs, "What attribute do you want to read?", "Attributes");
			switch (attrs) {
			case 0: // Stock
				cad = "There is a stock of " + ((accessory) p).getStock() + " units of accessorys";
				break;
			case 1: // Weight
				cad = "The weight of the accessory is " + ((accessory) p).getWeight() + "kg";
				break;
			case 2: // Price
				cad = "The price of the accessory is " + ((accessory) p).getPrice() + "€";
				break;
			case 3: // ID_product
				cad = "The ID of the accessory is " + ((accessory) p).getID_prod();
				break;
			case 4: // Purchase Date
				cad = "The purchase date of the accessory is " + ((accessory) p).getpurchaseDate();
				break;
			case 5: // Delivery Date
				cad = "The delivery date of the accessory is " + ((accessory) p).getdeliveryDate();
				break;
			case 6: // Return Date
				cad = "The return date of the accessory is " + ((accessory) p).getreturnDate();
				break;
			case 7: // Start Promo Date
				cad = "The start promotion date of the accessory is " + ((accessory) p).getiniPromoDate();
				break;
			case 8: // End Promo Date
				cad = "The end promotion date of the accessory is " + ((accessory) p).getendPromoDate();
				break;
			case 9: // Price last units
				cad = "The price of the last units is " + ((accessory) p).getPrice_last_units() + "€";
				break;
			case 10: // Price of sales
				cad = "The price of sales is  " + ((accessory) p).getPrice_sales() + "€";
				break;
			case 11: // Type of product
				cad = "The type of product is  " + ((accessory) p).getType_of_product();
				break;
			}// end-switch
		} // end-if
		JOptionPane.showMessageDialog(null, cad);

	}// end-read_one

	public static product update(product p) {
		String cad = "";
		int attrs = 0;
		if (p instanceof laptop) {
			String[] opt_attrs = { "Stock", "Weight", "Price", "ID", "Purchase Date", "Delivery Date", "Return Date",
					"Start Promo Date", "End Promo Date", "N Days with promo", "Price Promotion" };;
			attrs = menus.menu(opt_attrs, "What attribute do you want to set?", "Attributes");

			switch (attrs) {
			case 0: // Stock
				int newStock = validators.valida_int("Enter a new stock", "Stock");
				((laptop) p).setStock(newStock);
				cad = "Stock updated to " + newStock;
				break;
			case 1: // Weight
				float newWeight = validators.valida_float("Enter a new weight", "Weight");
				((laptop) p).setWeight(newWeight);
				cad = "Weight updated to " + newWeight;
				break;
			case 2: // Price
				int newPrice = validators.valida_int("Enter a new price", "Price");
				((laptop) p).setPrice(newPrice);
				cad = "Price updated to " + newPrice;
				break;
			case 3: // ID_product
				String newID_prod = insert_data.insert_id("Enter a new ID for the laptop", "ID laptop");
				((laptop) p).setID_prod(newID_prod);
				cad = "ID updated to " + newID_prod;
				break;
			case 4: // Purchase Date
				classes.date_object newPurchaseDate = product_data.pide_fecha_compra();
				((laptop) p).setpurchaseDate(newPurchaseDate);
				cad = "Purchase Date updated to " + newPurchaseDate;
				break;
			case 5: // Delivery Date
				classes.date_object datePurchase = product_data.pide_fecha_entrega(((laptop) p).getpurchaseDate());
				((laptop) p).setdeliveryDate(datePurchase);
				break;
			case 6: // Return Date
				classes.date_object deliveryDate = product_data.pide_fecha_devolucio(((laptop) p).getdeliveryDate());
				((laptop) p).setdeliveryDate(deliveryDate);
				break;
			case 7: // Start Promo Date
				classes.date_object datePurchase_prom = product_data.pide_f_inicio_promo(((laptop) p).getpurchaseDate());
				((laptop) p).setiniPromoDate(datePurchase_prom);
				break;
			case 8: // End Promo Date
//				cad = "The end promotion date of the accessory is " + ((accessory) p).getendPromoDate();
				break;
			case 9: // N Days with promo
				int newN_days_with_promo = validators.valida_int("Enter a new days with promotion",
						"Days with promotion");
				((laptop) p).setN_days_with_promo(newN_days_with_promo);
				cad = "New days with promotion updated to " + newN_days_with_promo;
				break;
			case 10: // Price Promotion
				float newPrice_Promotion = validators.valida_float("Enter new price to promotion", "Price Promotion");
				((laptop) p).setPrice_promo(newPrice_Promotion);
				cad = "Price to promotion updated to " + newPrice_Promotion;
				break;
			}// end-switch

		} else if (p instanceof smartphone) {
			String[] opt_attrs ={ "Stock", "Weight", "Price", "ID product", "Purchase Date", "Delivery Date",
					"Return Date", "Start Promo Date", "End Promo Date", "Number days last units",
					"Number of sales days", "Brand" };
			attrs = menus.menu(opt_attrs, "What attribute do you want to set?", "Attributes");

			switch (attrs) {
			case 0: // Stock
				int newStock = validators.valida_int("Enter a new stock", "Stock");
				((smartphone) p).setStock(newStock);
				cad = "Stock updated to " + newStock;
				break;
			case 1: // Weight
				float newWeight = validators.valida_float("Enter a new weight", "Weight");
				((smartphone) p).setWeight(newWeight);
				cad = "Weight updated to " + newWeight;
				break;
			case 2: // Price
				int newPrice = validators.valida_int("Enter a new price", "Price");
				((smartphone) p).setPrice(newPrice);
				cad = "Price updated to " + newPrice + "€";
				break;
			case 3: // ID_product
				String newID_prod = insert_data.insert_id("Enter a new ID for the smartphone", "ID smartphone");
				((smartphone) p).setID_prod(newID_prod);
				cad = "ID updated to " + newID_prod;
				break;				
			case 4: // Purchase Date
				classes.date_object newPurchaseDate = product_data.pide_fecha_compra();
				((smartphone) p).setpurchaseDate(newPurchaseDate);
				cad = "Purchase Date updated to " + newPurchaseDate;
				break;
			case 5: // Delivery Date
				classes.date_object datePurchase = product_data.pide_fecha_entrega(((smartphone) p).getpurchaseDate());
				((smartphone) p).setdeliveryDate(datePurchase);
				break;
			case 6: // Return Date
				classes.date_object deliveryDate = product_data.pide_fecha_devolucio(((smartphone) p).getdeliveryDate());
				((smartphone) p).setdeliveryDate(deliveryDate);
				break;
			case 7: // Start Promo Date
				classes.date_object datePurchase_prom = product_data.pide_f_inicio_promo(((smartphone) p).getpurchaseDate());
				((smartphone) p).setiniPromoDate(datePurchase_prom);
				break;
			case 8: // End Promo Date
//				cad = "The end promotion date of the accessory is " + ((accessory) p).getendPromoDate();
				break;
			case 9: // Number days last units
				int newN_days_last_units = validators.valida_int("Enter a new days with last units", "Days last units");
				((smartphone) p).setStock(newN_days_last_units);
				cad = "Days with last units updated to " + newN_days_last_units;
				break;
			case 10: // Number of sales days
				int newSalesDays = validators.valida_int("Enter new sales days", "Sales Days");
				((smartphone) p).setN_sales_days(newSalesDays);
				cad = "Sales Days updated to " + newSalesDays;
				break;
			case 11: // Brand
				String newBrand = validators.valida_string("Enter a new brand ", "Brand");
				((smartphone) p).setBrand(newBrand);
				cad = "Brand updated to " + newBrand;
				break;
			case 12: // Date of last units
//			String newDateOfLastUnits = insert_data.insert_date();
//			((smartphone)p).setDate_last_units(newDateOfLastUnits);
//			cad = "The date of last units is updated to " + newDateOfLastUnits;
				break;
			}// end-switch

		} else if (p instanceof accessory) {
			String[] opt_attrs = { "Stock", "Weight", "Price", "ID product", "Purchase Date", "Delivery Date",
					"Return Date", "Start Promo Date", "End Promo Date", "Price last units", "Price of sales",
					"Type of product" };;
			attrs = menus.menu(opt_attrs, "What attribute do you want to set?", "Attributes");

			switch (attrs) {
			case 0: // Stock
				int newStock = validators.valida_int("Enter a new stock", "Stock");
				((accessory) p).setStock(newStock);
				cad = "Stock updated to " + newStock;
				break;
			case 1: // Weight
				float newWeight = validators.valida_float("Enter a new weight", "Weight");
				((accessory) p).setWeight(newWeight);
				cad = "Weight updated to " + newWeight;
				break;
			case 2: // Price
				int newPrice = validators.valida_int("Enter a new price", "Price");
				((accessory) p).setPrice(newPrice);
				cad = "Price updated to " + newPrice + "€";
				break;
			case 3: // ID_product
				String newID_prod = insert_data.insert_id("Enter a new ID for the accessory", "ID accessory");
				((accessory) p).setID_prod(newID_prod);
				cad = "ID updated to " + newID_prod;
				break;
			case 4: // Purchase Date
				classes.date_object newPurchaseDate = product_data.pide_fecha_compra();
				((accessory) p).setpurchaseDate(newPurchaseDate);
				cad = "Purchase Date updated to " + newPurchaseDate;
				break;
			case 5: // Delivery Date
				classes.date_object datePurchase = product_data.pide_fecha_entrega(((accessory) p).getpurchaseDate());
				((accessory) p).setdeliveryDate(datePurchase);
				break;
			case 6: // Return Date
				classes.date_object deliveryDate = product_data.pide_fecha_devolucio(((accessory) p).getdeliveryDate());
				((accessory) p).setdeliveryDate(deliveryDate);
				break;
			case 7: // Start Promo Date
				classes.date_object datePurchase_prom = product_data.pide_f_inicio_promo(((accessory) p).getpurchaseDate());
				((accessory) p).setiniPromoDate(datePurchase_prom);
				break;
			case 8: // End Promo Date
//				cad = "The end promotion date of the accessory is " + ((accessory) p).getendPromoDate();
				break;
			case 10: // Price last units
				float newPrice_last_units = validators.valida_float("Enter a new price of last units",
						"Price last units");
				((accessory) p).setPrice_last_units(newPrice_last_units);
				cad = "Price last units updated to " + newPrice_last_units + "€";
				break;
			case 11: // Price of sales
				float newPriceSales = validators.valida_float("Enter a new price of sales", "Price sales");
				((accessory) p).setWeight(newPriceSales);
				cad = "Price of sales updated to " + newPriceSales + "€";
				break;
			case 12: // Type of Product
				String newTypeOfProduct = validators.valida_string("Enter a new type of product", "Type of product");
				((accessory) p).setType_of_product(newTypeOfProduct);
				cad = "Type of Product updated to " + newTypeOfProduct;
				break;
			}// end-switch
		} // end-else-if
		JOptionPane.showMessageDialog(null, cad);
		return p;

	}// end-update

	public static product delete(product p) {
		p = null;
		return p;
	}// end-delete

}// end-class
