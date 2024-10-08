package framework_oop_prods_sincad;

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
		}
		return p;
		}// end-create
	
	public static void read_all (product p) {
		if (p instanceof laptop) {
			JOptionPane.showMessageDialog(null, ((laptop)p).toString(), "Information", JOptionPane.INFORMATION_MESSAGE);
		}else if (p instanceof smartphone) {
			JOptionPane.showMessageDialog(null, ((smartphone)p).toString(), "Information", JOptionPane.INFORMATION_MESSAGE);
		}else if (p instanceof accessory) {
			JOptionPane.showMessageDialog(null, ((accessory)p).toString(), "Information", JOptionPane.INFORMATION_MESSAGE);
		}
	}// end-read_all
	
	public static void read_one (product p) {
		if (p instanceof laptop) {
			int attrs = 0;
			String [] opt_attrs = {"Stock", "Weight", "Price", "ID product","N Days with promo","Price Promotion", "Creation date","Promotion date"};
			attrs = menus.menu(opt_attrs, "What attribute do you want to read?","Attributes");		
			switch (attrs) {
			case 0: // Stock
				 JOptionPane.showMessageDialog(null, "There is a stock of " + ((laptop)p).getStock() + " units of laptops", "Result", JOptionPane.INFORMATION_MESSAGE);
				 break;
			case 1: //Weight
				JOptionPane.showMessageDialog(null, "The weight of the laptop is " + ((laptop)p).getWeight() + "kg", "Result", JOptionPane.INFORMATION_MESSAGE);
	            break;
			case 2: //Price
				JOptionPane.showMessageDialog(null, "The price of the laptop is " + ((laptop)p).getPrice() + "€", "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 3: //ID_product
				JOptionPane.showMessageDialog(null, "The ID of the laptop is " + ((laptop)p).getID_prod(), "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 4: //N Days with promo
				JOptionPane.showMessageDialog(null, "There are " + ((laptop)p).getN_days_with_promo() + "days of promotion", "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 5: //Price Promotion
				JOptionPane.showMessageDialog(null, "The price with the promotion is  " + ((laptop)p).getPrice_promo() + "€", "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 6: //Creation date
				JOptionPane.showMessageDialog(null, "The creation date of the laptop is  " + ((laptop)p).getCreation_date(), "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 7: //Promotion date
				JOptionPane.showMessageDialog(null, "The promotion date of the laptop is  " + ((laptop)p).getPromo_date(), "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			}//end-switch
		}// end instanceof smartphone
		else if (p instanceof smartphone) {
			int attrs = 0;
			String [] opt_attrs = {"Stock", "Weight", "Price", "ID product","Number days last units", "Number of sales days", "Brand", "Date of last units"};
			attrs = menus.menu(opt_attrs, "What attribute do you want to read?","Attributes");		
			switch (attrs) {
			case 0: // Stock
				 JOptionPane.showMessageDialog(null, "There is a stock of " + ((smartphone)p).getStock() + " units of smartphone", "Result", JOptionPane.INFORMATION_MESSAGE);
				 break;
			case 1: //Weight
				JOptionPane.showMessageDialog(null, "The weight of the laptop is " + ((smartphone)p).getWeight() + "kg", "Result", JOptionPane.INFORMATION_MESSAGE);
	            break;
			case 2: //Price
				JOptionPane.showMessageDialog(null, "The price of the laptop is " + ((smartphone)p).getPrice() + "€", "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 3: //ID_product
				JOptionPane.showMessageDialog(null, "The ID of the laptop is " + ((smartphone)p).getID_prod(), "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 4: //Number days last units
				JOptionPane.showMessageDialog(null, "There are " + ((smartphone)p).getN_days_last_units() + "days of last units for smartphone ", "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 5: //Number of sales days
				JOptionPane.showMessageDialog(null, "There are  " + ((smartphone)p).getN_sales_days() + "days of sales for smartphone", "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 6: //Brand
				JOptionPane.showMessageDialog(null, "The brand of the smartphone is  " + ((smartphone)p).getBrand(), "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 7: //Date of lasts units
				JOptionPane.showMessageDialog(null, "The date of lasts units of the smartphone is  " + ((smartphone)p).getDate_last_units(), "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			}//end-switch
		}else if (p instanceof accessory) {
			int attrs = 0;
			String [] opt_attrs = {"Stock", "Weight", "Price", "ID product","Price last units", "Price of sales","Date of sales", "Type of product"};
			attrs = menus.menu(opt_attrs, "What attribute do you want to read?","Attributes");		
			switch (attrs) {
			case 0: // Stock
				 JOptionPane.showMessageDialog(null, "There is a stock of " + ((accessory)p).getStock() + " units of accessorys", "Result", JOptionPane.INFORMATION_MESSAGE);
				 break;
			case 1: //Weight
				JOptionPane.showMessageDialog(null, "The weight of the accessory is " + ((accessory)p).getWeight() + "kg", "Result", JOptionPane.INFORMATION_MESSAGE);
	            break;
			case 2: //Price
				JOptionPane.showMessageDialog(null, "The price of the accessory is " + ((accessory)p).getPrice() + "€", "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 3: //ID_product
				JOptionPane.showMessageDialog(null, "The ID of the accessory is " + ((accessory)p).getID_prod(), "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 4: //Price last units
				JOptionPane.showMessageDialog(null, "The price of the last units is " + ((accessory)p).getPrice_last_units() , "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 5: //Price of sales
				JOptionPane.showMessageDialog(null, "There are  " + ((accessory)p).getPrice_sales() + "days of sales for accessorys", "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 6: //Date of sales
				JOptionPane.showMessageDialog(null, "The brand of the laptop is  " + ((accessory)p).getF_sales(), "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 7: //Type of product
				JOptionPane.showMessageDialog(null, "The date of lasts units of the laptop is  " + ((accessory)p).getType_of_product(), "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			}//end-switch
		
		}
	}// end-read_one
	
	public static product update (product p) {
		if (p instanceof laptop) {
			int attrs =0;
			String [] opt_attrs = {"Stock", "Weight", "Price", "ID product","N Days with promo","Price Promotion", "Creation date","Promotion date"};
			attrs = menus.menu(opt_attrs, "What attribute do you want to set?","Attributes");
			
			switch (attrs) {
			case 0: // Stock
				int newStock = Integer.parseInt(JOptionPane.showInputDialog("Enter a new Stock: "));
				((laptop)p).setStock(newStock);
				JOptionPane.showMessageDialog(null, "Stock updated to " + newStock, "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 1: //Weight
		        float newWeight = Float.parseFloat(JOptionPane.showInputDialog("Enter new weight:"));
				((laptop)p).setWeight(newWeight);
				JOptionPane.showMessageDialog(null, "Weight updated to " + newWeight, "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2: //Price
				int newPrice = Integer.parseInt(JOptionPane.showInputDialog("Enter a new price: "));
				((laptop)p).setPrice(newPrice);
				JOptionPane.showMessageDialog(null, "Price updated to " + newPrice, "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 3: //ID_product
			    String newID_prod = JOptionPane.showInputDialog("Enter a new ID: ");
	            ((laptop) p).setID_prod(newID_prod);
				JOptionPane.showMessageDialog(null, "ID updated to " + newID_prod, "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 4: //N Days with promo
				int newN_days_with_promo = Integer.parseInt(JOptionPane.showInputDialog("Enter a new days with promotion: "));
				((laptop)p).setStock(newN_days_with_promo);
				JOptionPane.showMessageDialog(null, "New days with promotion updated to " + newN_days_with_promo, "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 5: //Price Promotion
				float newPrice_Promotion = Float.parseFloat(JOptionPane.showInputDialog("Enter new price to promotion:"));
				((laptop)p).setPrice_promo(newPrice_Promotion);
				JOptionPane.showMessageDialog(null, "Price to promotion updated to " + newPrice_Promotion, "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 6: //Creation date
			    String newCreationDate = JOptionPane.showInputDialog("Enter a new creation date: ");
			    ((laptop)p).setCreation_date(newCreationDate);
				JOptionPane.showMessageDialog(null, "Creation date updated to " + newCreationDate, "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 7: //Promotion date
				String newPromotionDate = JOptionPane.showInputDialog("Enter a new promotion date: ");
			    ((laptop)p).setPromo_date(newPromotionDate);
				JOptionPane.showMessageDialog(null, "Promotion date updated to " + newPromotionDate, "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
		}//end-switch

	} else if (p instanceof smartphone) {
		int attrs =0;
		String [] opt_attrs = {"Stock", "Weight", "Price", "ID product","Number days last units", "Number of sales days", "Brand", "Date of last units"};
		attrs = menus.menu(opt_attrs, "What attribute do you want to set?","Attributes");
		
		switch (attrs) {
		case 0: // Stock
			int newStock = Integer.parseInt(JOptionPane.showInputDialog("Enter a new Stock: "));
			((smartphone)p).setStock(newStock);
			JOptionPane.showMessageDialog(null, "Stock updated to " + newStock, "Result", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 1: //Weight
	        float newWeight = Float.parseFloat(JOptionPane.showInputDialog("Enter new weight:"));
			((laptop)p).setWeight(newWeight);
			JOptionPane.showMessageDialog(null, "Weight updated to " + newWeight, "Result", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2: //Price
			int newPrice = Integer.parseInt(JOptionPane.showInputDialog("Enter a new price: "));
			((laptop)p).setPrice(newPrice);
			JOptionPane.showMessageDialog(null, "Price updated to " + newPrice, "Result", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3: //ID_product
		    String newID_prod = JOptionPane.showInputDialog("Enter a new ID: ");
            ((laptop) p).setID_prod(newID_prod);
			JOptionPane.showMessageDialog(null, "ID updated to " + newID_prod, "Result", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4: //N Days with promo
			int newN_days_with_promo = Integer.parseInt(JOptionPane.showInputDialog("Enter a new days with promotion: "));
			((laptop)p).setStock(newN_days_with_promo);
			JOptionPane.showMessageDialog(null, "New days with promotion updated to " + newN_days_with_promo, "Result", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 5: //Price Promotion
			float newPrice_Promotion = Float.parseFloat(JOptionPane.showInputDialog("Enter new price to promotion:"));
			((laptop)p).setPrice_promo(newPrice_Promotion);
			JOptionPane.showMessageDialog(null, "Price to promotion updated to " + newPrice_Promotion, "Result", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 6: //Creation date
		    String newCreationDate = JOptionPane.showInputDialog("Enter a new creation date: ");
		    ((laptop)p).setCreation_date(newCreationDate);
			JOptionPane.showMessageDialog(null, "Creation date updated to " + newCreationDate, "Result", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 7: //Promotion date
			String newPromotionDate = JOptionPane.showInputDialog("Enter a new promotion date: ");
		    ((laptop)p).setPromo_date(newPromotionDate);
			JOptionPane.showMessageDialog(null, "Promotion date updated to " + newPromotionDate, "Result", JOptionPane.INFORMATION_MESSAGE);
			break;
	}//end-switch
		
	}else if (p instanceof accessory) {
		int attrs =0;
		String [] opt_attrs = {"Stock", "Weight", "Price", "ID product","Price last units", "Price of sales","Date of sales", "Type of product"};
		attrs = menus.menu(opt_attrs, "What attribute do you want to set?","Attributes");
		
		switch (attrs) {
		case 0: // Stock
			int newStock = Integer.parseInt(JOptionPane.showInputDialog("Enter a new Stock: "));
			((accessory)p).setStock(newStock);
			JOptionPane.showMessageDialog(null, "Stock updated to " + newStock, "Result", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 1: //Weight
	        float newWeight = Float.parseFloat(JOptionPane.showInputDialog("Enter new weight:"));
			((accessory)p).setWeight(newWeight);
			JOptionPane.showMessageDialog(null, "Weight updated to " + newWeight, "Result", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2: //Price
			int newPrice = Integer.parseInt(JOptionPane.showInputDialog("Enter a new price: "));
			((accessory)p).setPrice(newPrice);
			JOptionPane.showMessageDialog(null, "Price updated to " + newPrice, "Result", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3: //ID_product
		    String newID_prod = JOptionPane.showInputDialog("Enter a new ID: ");
            ((accessory) p).setID_prod(newID_prod);
			JOptionPane.showMessageDialog(null, "ID updated to " + newID_prod, "Result", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4: //Price last units
			int newPrice_last_units = Integer.parseInt(JOptionPane.showInputDialog("Enter a price of the last units: "));
			((accessory)p).setPrice_last_units(newPrice_last_units);
			JOptionPane.showMessageDialog(null, "Price last units updated to " + newPrice_last_units, "Result", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 5: //Price of sales
			float newPriceSales = Float.parseFloat(JOptionPane.showInputDialog("Enter new price of sales:"));
			((accessory)p).setWeight(newPriceSales);
			JOptionPane.showMessageDialog(null, "Price of sales updated to " + newPriceSales, "Result", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 6: //Date of sales
		    String SalesDate = JOptionPane.showInputDialog("Enter a new date of sales: ");
		    ((accessory)p).setF_sales(SalesDate);
			JOptionPane.showMessageDialog(null, "Date of sales updated to " + SalesDate, "Result", JOptionPane.INFORMATION_MESSAGE);
			break;
		case 7: //Type of Product
			String newTypeOfProduct = JOptionPane.showInputDialog("Enter a new type of product: ");
		    ((accessory)p).setType_of_product(newTypeOfProduct);
			JOptionPane.showMessageDialog(null, "Type of Product updated to " + newTypeOfProduct, "Result", JOptionPane.INFORMATION_MESSAGE);
			break;
	}
	}
		return p;
		
	}
	
	public static product delete (product p) {
		p= null;
		return p;
	}
	
	
}// end-class

