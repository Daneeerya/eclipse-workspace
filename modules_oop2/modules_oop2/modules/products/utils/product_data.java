package modules_oop2.modules.products.utils;

import javax.swing.JOptionPane;

import modules_oop2.classes.date_object;
import modules_oop2.modules.products.classes.product;
import modules_oop2.utils.insert_data;
import modules_oop2.utils.validators;

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

	public static String ask_ID(String product) {
		String ID = insert_data.insert_id("Enter the ID of the" + product, "ID");
		return ID;
	}

	public static modules_oop2.classes.date_object pide_fecha_compra() {
		return insert_data.insert_date("purchase", "Purchase date");
	}

	public static modules_oop2.classes.date_object pide_fecha_entrega(modules_oop2.classes.date_object fecha_compra) {
		int duration = 0;
		modules_oop2.classes.date_object fecha_entrega = null;
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

//		Fecha de devolución debe ser 2 días después de entrega si se quiere devolver, sino se puede devolver vacio
	public static modules_oop2.classes.date_object pide_fecha_devolucio(
			modules_oop2.classes.date_object fecha_entrega) {
		int duration = 0;
		modules_oop2.classes.date_object fecha_devolucio = null;
		do {
			fecha_devolucio = insert_data.insert_date_optional("return", " 2 ", "Return date");
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

	public static float obtener_Precio_total(modules_oop2.classes.date_object fecha_devolucio, float price) {
		float precio_total = 0.0f;
		if ((fecha_devolucio != null && price > 0) || (fecha_devolucio == null && price < 0)) {
			precio_total = price * (-1);
		}
		return precio_total;
	}

//		Fecha de devolución debe ser 3 días después de compra
	public static modules_oop2.classes.date_object pide_fecha_devolucio_compra(
			modules_oop2.classes.date_object fecha_compra) {
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

	public static modules_oop2.classes.date_object pide_f_inicio_promo(modules_oop2.classes.date_object fecha_compra) {
		return insert_data.insert_date("start promo", "Start promotion");
	}

	public static modules_oop2.classes.date_object pide_f_fin_promo(modules_oop2.classes.date_object fecha_promo) {
		modules_oop2.classes.date_object f_fin_promo = null;
		int duration = 0;
		do {
			f_fin_promo = insert_data.insert_date("end promo", "End  promotion");
			duration = fecha_promo.RestaFechas(f_fin_promo);
			if (duration < 0) {
				JOptionPane.showMessageDialog(null, "The end date of the promo cannot be before the start date",
						"ERROR", JOptionPane.ERROR_MESSAGE);
			}
		} while (duration < 0);
		return f_fin_promo;
	}

	public static boolean pricePromotion(product p) {
		boolean promotion = false;
		// Verificar si la fecha de compra está entre fecha_promo y fecha_fin_promo
		System.out.println(p.getiniPromoDate());
		if ((p.getiniPromoDate().comparaFechas(p.getpurchaseDate()) <= 0)
				&& (p.getendPromoDate().comparaFechas(p.getpurchaseDate()) == 1)) {
			promotion = true;
		}

		return promotion;
	}
}
