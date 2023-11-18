package modules.products.utils;

import utils.insert_data;
import utils.validators;

import javax.swing.JOptionPane;

public class product_data {
	public static int ask_stock(String product) {
		int stock = validators.valida_int("Enter the stock of the" + product, "Stock");
		return stock;
	}
	
	public static float ask_weight(String product) {
		float weight = validators.valida_float("Enter the weight of the" + product, "Weight");
		return weight;
	}
	
	public static float ask_price(String product) {
		float price = validators.valida_float("Enter the price of the" + product, "Price");
		return price;
	}
	
	public static String ask_ID (String product) {
		String ID = insert_data.insert_id("Enter the ID of the" + product, "ID");
		return ID;
	}
	
	public static classes.date_object pide_fecha_compra() {
		return insert_data.insert_date("purchase", "Purchase date");
	}
	


	public static classes.date_object pide_fecha_entrega(classes.date_object fecha_compra) {
		int duration = 0;
		classes.date_object fecha_entrega = null;
		do {
			fecha_entrega = insert_data.insert_date_duration("delivery", " 1 ", "Delivery date");
			duration = fecha_compra.RestaFechas(fecha_entrega);
			if (duration != 1) {
				JOptionPane.showMessageDialog(null, "The delivery date must be 1 day after the purchase date", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (duration != 1);
		return fecha_entrega;
	}

//		Fecha de devolución debe ser 2 días después de entrega
	public static classes.date_object pide_fecha_devolucio(classes.date_object fecha_entrega) {
		int duration = 0;
		classes.date_object fecha_devolucio = null;
		do {
			fecha_devolucio = insert_data.insert_date_duration("return", " 2 ", "Return date");
			duration = fecha_entrega.RestaFechas(fecha_devolucio);
			if (duration != 2) {
				JOptionPane.showMessageDialog(null, "The return date must be 2 days after the delivery date", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (duration != 2);
		return fecha_devolucio;
	}

//		Fecha de devolución debe ser 3 días después de compra
//		public static classes.date_object pide_fecha_devolucio_compra(classes.date_object fecha_compra, classes.date_object fecha_devolucio) {
//			int duration = 0;
//			duration = fecha_compra.RestaFechas(fecha_devolucio);
//			if (duration != 3) {
//				JOptionPane.showMessageDialog(null, "The return date must be 3 days after the purchase date", "ERROR",
//						JOptionPane.ERROR_MESSAGE);
//			} else {
//				JOptionPane.showMessageDialog(null, "The return date is 3 days after the purchase date", "INFORMACIÓN",
//						JOptionPane.INFORMATION_MESSAGE);
//			}
//			return fecha_devolucio_compra;
//		}

	public static classes.date_object pide_f_inicio_promo(classes.date_object fecha_compra) {
		int duration = 0;
		classes.date_object f_inicio_promo = null;
		do {
			f_inicio_promo = insert_data.insert_date("promotion start", "Promotion start date");
			duration = fecha_compra.RestaFechas(f_inicio_promo);
			if (duration > 0) {
				JOptionPane.showMessageDialog(null, "The promotion date must be before the purchase date", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (duration > 0);
		return f_inicio_promo;
	}

	public static classes.date_object pide_f_fin_promo(classes.date_object fecha_promo, classes.date_object fecha_compra) {
		classes.date_object f_fin_promo = null;
//			do{
//				f_fin_promo = insert_data.insert_date_duration("Devolución");
//				duration = fecha_compra.RestaFechas(f_fin_promo);
//				if (duration !=2) {
//					JOptionPane.showMessageDialog(null, "La fecha de devolución debe ser 2 dias posterior a la de entrega", "ERROR",
//							JOptionPane.ERROR_MESSAGE);	}
//			}while (duration!=2);	
		return f_fin_promo;
	}

}
