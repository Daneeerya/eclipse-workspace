package framework_oop_prods_concad;

import javax.swing.JOptionPane;
public class CRUD {
	public static product create ( int options) {
		product p = null;
		switch (options) {
		case 0:
			 p = new laptop (1, 1.5f, 5.5f, "124-A", 2, 2.5f,"1/1/24", "3/1/24");
			 break;
		case 1: 
			p = new smartphone (2, 2.5f, 7.5f, "124-B",  3, 4, "Name brand", "5/12/24");
			break;
		case 2:
			p = new accessory(3, 3.5f, "124-C", 8.5f, 2.5f, 2.5f, "8/12/24", "Headphones"); 
			break;
		}//end-switch
		return p;
	}// end-create
	
	public static void read_all (product p) {
		if (p instanceof laptop) { 
			JOptionPane.showMessageDialog(null, ((laptop)p).toString(), "Information", JOptionPane.INFORMATION_MESSAGE);
		}else if (p instanceof smartphone) {
			JOptionPane.showMessageDialog(null, ((smartphone)p).toString(), "Information", JOptionPane.INFORMATION_MESSAGE);
		}else if (p instanceof accessory) {
			JOptionPane.showMessageDialog(null, ((accessory)p).toString(), "Information", JOptionPane.INFORMATION_MESSAGE);
		}//end-else if
	}// end-read_all
	
	public static void read_one (product p) {
		String cad = "";
		int attrs = 0;
		if (p instanceof laptop) {
			String [] opt_attrs = {"Stock", "Weight", "Price", "ID product","N Days with promo","Price Promotion", "Creation date","Promotion date"};
			attrs = menus.menu(opt_attrs, "What attribute do you want to read?","Attributes");		
			switch (attrs) {
			case 0: // Stock
				cad =  "There is a stock of " + ((laptop)p).getStock() + " units of laptops";
				 break;
			case 1: //Weight
				cad = "The weight of the laptop is " + ((laptop)p).getWeight() + " kg";
	            break;
			case 2: //Price
				cad = "The price of the laptop is " + ((laptop)p).getPrice() + "€";
				break;
			case 3: //ID_product
				cad = "The ID of the laptop is " + ((laptop)p).getID_prod();
				break;
			case 4: //N Days with promo
				cad = "There are " + ((laptop)p).getN_days_with_promo() + " days of promotion";
				break;
			case 5: //Price Promotion
				cad = "The price with the promotion is  " + ((laptop)p).getPrice_promo() + "€";
				break;
			case 6: //Creation date
				cad ="The creation date of the laptop is  " + ((laptop)p).getCreation_date();
				break;
			case 7: //Promotion date
				cad = "The promotion date of the laptop is  " + ((laptop)p).getPromo_date();
				break;
			}//end-switch
			JOptionPane.showMessageDialog(null,cad);
		}// end instanceof smartphone
		else if (p instanceof smartphone) {
			String [] opt_attrs = {"Stock", "Weight", "Price", "ID product","Number days last units", "Number of sales days", "Brand", "Date of last units"};
			attrs = menus.menu(opt_attrs, "What attribute do you want to read?","Attributes");		
			switch (attrs) {
			case 0: // Stock
				 cad ="There is a stock of " + ((smartphone)p).getStock() + " units of smartphone";
				 break;
			case 1: //Weight
				cad = "The weight of the laptop is " + ((smartphone)p).getWeight() + "kg";
	            break;
			case 2: //Price
				cad = "The price of the laptop is " + ((smartphone)p).getPrice() + "€";
				break;
			case 3: //ID_product
				cad = "The ID of the laptop is " + ((smartphone)p).getID_prod();
				break;
			case 4: //Number days last units
				cad = "There are " + ((smartphone)p).getN_days_last_units() + " days of last units for smartphone ";
				break;
			case 5: //Number of sales days
				cad = "There are  " + ((smartphone)p).getN_sales_days() + " days of sales for smartphone";
				break;
			case 6: //Brand
				cad = "The brand of the smartphone is  " + ((smartphone)p).getBrand();
				break;
			case 7: //Date of lasts units
				cad = "The date of lasts units of the smartphone is  " + ((smartphone)p).getDate_last_units();
				break;
			}//end-switch
			JOptionPane.showMessageDialog(null,cad);
		}else if (p instanceof accessory) {
			String [] opt_attrs = {"Stock", "Weight", "Price", "ID product","Price last units", "Price of sales","Date of sales", "Type of product"};
			attrs = menus.menu(opt_attrs, "What attribute do you want to read?","Attributes");		
			switch (attrs) {
			case 0: // Stock
				 cad = "There is a stock of " + ((accessory)p).getStock() + " units of accessorys";
				 break;
			case 1: //Weight
				cad = "The weight of the accessory is " + ((accessory)p).getWeight() + "kg";
	            break;
			case 2: //Price
				cad = "The price of the accessory is " + ((accessory)p).getPrice() + "€";
				break;
			case 3: //ID_product
				cad = "The ID of the accessory is " + ((accessory)p).getID_prod();
				break;
			case 4: //Price last units
				cad = "The price of the last units is " + ((accessory)p).getPrice_last_units() + "€";
				break;
			case 5: //Price of sales
				cad = "The price of sales is  " + ((accessory)p).getPrice_sales() + "€";
				break;
			case 6: //Date of sales
				cad = "The date of sales is  " + ((accessory)p).getF_sales();
				break;
			case 7: //Type of product
				cad = "The type of product is  " + ((accessory)p).getType_of_product();
				break;
			}//end-switch		
			JOptionPane.showMessageDialog(null,cad);
		}//end-if
	}// end-read_one
	
	public static product update (product p) {
		String cad = "";
		int attrs =0;
		if (p instanceof laptop) {
			String [] opt_attrs = {"Stock", "Weight", "Price", "ID product","N Days with promo","Price Promotion", "Creation date","Promotion date"};
			attrs = menus.menu(opt_attrs, "What attribute do you want to set?","Attributes");
			
			switch (attrs) {
			case 0: // Stock
				int newStock = validators.valida_int("Enter a new stock", "Stock");
				((laptop)p).setStock(newStock);
				cad = "Stock updated to " + newStock;
				break;
			case 1: //Weight
				float newWeight = validators.valida_float("Enter a new weight", "Weight");
				((laptop)p).setWeight(newWeight);
				cad = "Weight updated to " + newWeight;
				break;
			case 2: //Price
				int newPrice = validators.valida_int("Enter a new price", "Price");
				((laptop)p).setPrice(newPrice);
				cad = "Price updated to " + newPrice;
				break;
			case 3: //ID_product
				String newID_prod = validators.valida_string("Enter a new ID: ", "ID");
	            ((laptop) p).setID_prod(newID_prod);
	            cad = "ID updated to " + newID_prod;
				break;
			case 4: //N Days with promo
				int newN_days_with_promo = validators.valida_int("Enter a new days with promotion", "Days with promotion");
				((laptop)p).setStock(newN_days_with_promo);
				cad = "New days with promotion updated to " + newN_days_with_promo;
				break;
			case 5: //Price Promotion
				float newPrice_Promotion = validators.valida_float("Enter new price to promotion", "Price Promotion");
				((laptop)p).setPrice_promo(newPrice_Promotion);
				cad = "Price to promotion updated to " + newPrice_Promotion;
				break;
			case 6: //Creation date
				String newCreationDate = validators.valida_string("Enter a new creation date ", "Creation Date");
			    ((laptop)p).setCreation_date(newCreationDate);
			    cad = "Creation date updated to " + newCreationDate;
				break;
			case 7: //Promotion date
				String newPromotionDate = validators.valida_string("Enter a new promotion date ", "Promotion Date");
			    ((laptop)p).setPromo_date(newPromotionDate);
			    cad = "Promotion date updated to " + newPromotionDate;
				break;
		}//end-switch

	} else if (p instanceof smartphone) {
		String [] opt_attrs = {"Stock", "Weight", "Price", "ID product","Number days last units", "Number of sales days", "Brand", "Date of last units"};
		attrs = menus.menu(opt_attrs, "What attribute do you want to set?","Attributes");
		
		switch (attrs) {
		case 0: // Stock
			int newStock = validators.valida_int("Enter a new stock", "Stock");
			((smartphone)p).setStock(newStock);
			cad = "Stock updated to " + newStock;
			break;
		case 1: //Weight
			float newWeight = validators.valida_float("Enter a new weight", "Weight");
			((smartphone)p).setWeight(newWeight);
			cad = "Weight updated to " + newWeight;
			break;
		case 2: //Price
			int newPrice = validators.valida_int("Enter a new price", "Price");
			((smartphone)p).setPrice(newPrice);
			cad = "Price updated to " + newPrice + "€";
			break;
		case 3: //ID_product
		    String newID_prod = JOptionPane.showInputDialog("Enter a new ID: ");
            ((smartphone) p).setID_prod(newID_prod);
            cad = "ID updated to " + newID_prod;
			break;
		case 4: //Number days last units
			int newN_days_last_units = validators.valida_int("Enter a new days with last units", "Days last units");
			((smartphone)p).setStock(newN_days_last_units);
			cad = "Days with last units updated to " + newN_days_last_units;
			break;
		case 5: //Number of sales days
			int newSalesDays = validators.valida_int("Enter new sales days", "Sales Days");
			((smartphone)p).setN_sales_days(newSalesDays);
			cad = "Sales Days updated to " + newSalesDays;
			break;
		case 6: //Brand
			String newBrand = validators.valida_string("Enter a new brand ", "Brand");
		    ((smartphone)p).setBrand(newBrand);
		    cad = "Brand updated to " + newBrand;
			break;
		case 7: //Date of last units
			String newDateOfLastUnits = validators.valida_string("Enter a new date of last units ", "Date of last units");
		    ((laptop)p).setPromo_date(newDateOfLastUnits);
		    cad = "Date of last units updated to " + newDateOfLastUnits;
			break;
	}//end-switch
		
	}else if (p instanceof accessory) {
		String [] opt_attrs = {"Stock", "Weight", "Price", "ID product","Price last units", "Price of sales","Date of sales", "Type of product"};
		attrs = menus.menu(opt_attrs, "What attribute do you want to set?","Attributes");
		
		switch (attrs) {
		case 0: // Stock
			int newStock = validators.valida_int("Enter a new stock", "Stock");
			((accessory)p).setStock(newStock);
			cad = "Stock updated to " + newStock;
			break;
		case 1: //Weight
			float newWeight = validators.valida_float("Enter a new weight", "Weight");
			((accessory)p).setWeight(newWeight);
			cad = "Weight updated to " + newWeight;
			break;
		case 2: //Price
			int newPrice = validators.valida_int("Enter a new price", "Price");
			((accessory)p).setPrice(newPrice);
			cad = "Price updated to " + newPrice+ "€";
			break;
		case 3: //ID_product
		    String newID_prod = JOptionPane.showInputDialog("Enter a new ID: ");
            ((accessory) p).setID_prod(newID_prod);
            cad = "ID updated to " + newID_prod;
			break;
		case 4: //Price last units
			float newPrice_last_units = validators.valida_float("Enter a new price of last units", "Price last units");
			((accessory)p).setPrice_last_units(newPrice_last_units);
			cad ="Price last units updated to " + newPrice_last_units+ "€";
			break;
		case 5: //Price of sales
			float newPriceSales = validators.valida_float("Enter a new price of sales", "Price sales");
			((accessory)p).setWeight(newPriceSales);
			cad ="Price of sales updated to " + newPriceSales+ "€";
			break;
		case 6: //Date of sales
			String SalesDate = validators.valida_string("Enter a new date of sales ", "Sales Date");
		    ((accessory)p).setF_sales(SalesDate);
			cad ="Date of sales updated to " + SalesDate;
			break;
		case 7: //Type of Product
			String newTypeOfProduct = validators.valida_string("Enter a new type of product", "Type of product");
		    ((accessory)p).setType_of_product(newTypeOfProduct);
			cad ="Type of Product updated to " + newTypeOfProduct;
			break;
		}//end-switch
	}//end-else-if
		return p;
		
	}//end-update
	
	public static product delete (product p) {
		p= null;
		return p;
	}//end-delete
	
	
}// end-class

