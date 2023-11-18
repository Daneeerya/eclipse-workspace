package framework_oop_prods;

import javax.swing.JOptionPane;


public class product_data {
	public static int ask_stock(String product) {
		int stock = validators.valida_int("Enter the stock of the " + product, "Stock");
		return stock;
	}
	
	public static float ask_weight(String product) {
		float weight = validators.valida_float("Enter the weight of the " + product, "Weight");
		return weight;
	}
	
	public static float ask_price(String product) {
		float price = validators.valida_float("Enter the price of the " + product, "Price");
		return price;
	}
	
	public static String ask_ID (String product) {
		String ID = insert_data.insert_id("Enter the ID of the " + product, "ID");
		return ID;
	}
	
	public static date_object pide_fecha_compra() {
		return insert_data.insert_date("purchase", "Purchase date");
	}	

	public static date_object pide_fecha_entrega(date_object fecha_compra) {
		int duration = 0;
		date_object fecha_entrega = null;
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

//		Fecha de devolución debe ser 3 días después de compra
		public static date_object pide_fecha_devolucio_compra(date_object fecha_compra) {
			int duration = 0;
			date_object fecha_devolucio_compra = null;
			do {
				fecha_devolucio_compra = insert_data.insert_date_duration("return", " 3 ", "Return purchase date");
				duration = fecha_compra.RestaFechas(fecha_devolucio_compra);
				if (duration != 3) {
					JOptionPane.showMessageDialog(null, "The return date must be 3 days after the purchase date", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
			} while (duration != 3);
			return fecha_devolucio_compra;
		}

	public static date_object pide_f_inicio_promo(date_object purchaseDate) {
		return insert_data.insert_date("start promo", "Start promotion");
		}
	
// Debe ser despues de la de inicio
	public static date_object pide_f_fin_promo(date_object fecha_promo) {
		date_object f_fin_promo = null;
		int duration =0;
			do{
				f_fin_promo = insert_data.insert_date("end promo", "End  promotion");
				duration = fecha_promo.RestaFechas(f_fin_promo);
				if (duration <0) {
					JOptionPane.showMessageDialog(null, "La fecha de final de promo no puede ser anterior a la de inicio", "ERROR",
							JOptionPane.ERROR_MESSAGE);	}
			}while (duration<0);	
		return f_fin_promo;
	}
	
	

//		Fecha de devolución debe ser 2 días después de entrega
	public static date_object pide_fecha_devolucio(date_object fecha_entrega) {
		int duration = 0;
		date_object fecha_devolucio = null;
		do {
			fecha_devolucio = insert_data.insert_date_optional("return", "2", "Return Date");
			if (fecha_devolucio == null) {
				return fecha_devolucio;
			}
			duration = fecha_entrega.RestaFechas(fecha_devolucio);
			if (duration != 2) {
				JOptionPane.showMessageDialog(null, "The return date must be 2 days after the delivery date", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (duration != 2);
		return fecha_devolucio;
	}

	public static float obtener_Precio_total(date_object fecha_devolucio, float price) {
		float precio_total = 0.0f;
		if ((fecha_devolucio != null && price > 0) || (fecha_devolucio == null && price < 0)) {
			precio_total = price * (-1);
		}
		return precio_total;
	}


	}