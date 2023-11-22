package framework_oop_arrays.modules.products.utils;

import javax.swing.JOptionPane;

import framework_oop_arrays.classes.date_object;
import framework_oop_arrays.modules.products.classes.product;
import framework_oop_arrays.utils.insert_data;
import framework_oop_arrays.utils.validators;

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

	public static framework_oop_arrays.classes.date_object ask_purchaseDate() {
		return insert_data.insert_date("purchase", "Purchase date");
	}

//	Fecha de entrega debe ser 1 días después de compra
	public static framework_oop_arrays.classes.date_object ask_deliveryDate(
			framework_oop_arrays.classes.date_object purchaseDate) {
		int duration = 0;
		framework_oop_arrays.classes.date_object deliveryDate = null;
		do {
			deliveryDate = insert_data.insert_date_duration("delivery", " 1 ", "Delivery date");
			duration = purchaseDate.RestaFechas(deliveryDate);
			if (duration != 1) {
				JOptionPane.showMessageDialog(null, "The delivery date must be 1 day after the purchase date", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (duration != 1);
		return deliveryDate;
	}

//		Fecha de devolución debe ser 2 días después de entrega
	public static framework_oop_arrays.classes.date_object ask_returnDate(
			framework_oop_arrays.classes.date_object deliveryDate) {
		int duration = 0;
		framework_oop_arrays.classes.date_object returnDate = null;
		do {
			returnDate = insert_data.insert_date_optional("return", " 2 ", "Return date");
			if (returnDate == null) {
				return returnDate;
			}
			duration = deliveryDate.RestaFechas(returnDate);
			if (duration != 2) {
				JOptionPane.showMessageDialog(null, "The return date must be 2 days after the delivery date", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (duration != 2);
		return returnDate;
	}

//		Fecha de devolución debe ser 3 días después de compra
	public static framework_oop_arrays.classes.date_object ask_purchaseDateReturn(
			framework_oop_arrays.classes.date_object purchaseDate) {
		int duration = 0;
		date_object purchaseDateReturn = null;
		do {
			purchaseDateReturn = insert_data.insert_date_duration("return", " 3 ", "Return purchase date");
			duration = purchaseDate.RestaFechas(purchaseDateReturn);
			if (duration != 3) {
				JOptionPane.showMessageDialog(null, "The return date must be 3 days after the purchase date", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (duration != 3);
		return purchaseDateReturn;
	}

//		La fecha de inicio de promo no tiene ninguna condición
	public static framework_oop_arrays.classes.date_object ask_startDatePromo(
			framework_oop_arrays.classes.date_object purchaseDate) {
		return insert_data.insert_date("start promo", "Start promotion");
	}

//	La fecha de fin de promo debe ser antes de la de inicio de promo
	public static framework_oop_arrays.classes.date_object ask_endDatePromo(
			framework_oop_arrays.classes.date_object startDatePromo) {
		framework_oop_arrays.classes.date_object endDatePromo = null;
		int duration = 0;
		do {
			endDatePromo = insert_data.insert_date("end promo", "End  promotion");
			duration = startDatePromo.RestaFechas(endDatePromo);
			if (duration < 0) {
				JOptionPane.showMessageDialog(null, "The end date of the promo cannot be before the start date",
						"ERROR", JOptionPane.ERROR_MESSAGE);
			}
		} while (duration < 0);
		return endDatePromo;
	}

	public static float obtener_Precio_total(framework_oop_arrays.classes.date_object fecha_devolucio, float price) {
		float precio_total = 0.0f;
		if ((fecha_devolucio != null && price > 0) || (fecha_devolucio == null && price < 0)) {
			precio_total = price * (-1);
		}
		return precio_total;
	}

	public static boolean pricePromotion(product p) {
		boolean promotion = false;
		if ((p.getstartPromoDate().comparaFechas(p.getpurchaseDate()) <= 0)
				&& (p.getendPromoDate().comparaFechas(p.getpurchaseDate()) == 1)) {
			promotion = true;
		}
		return promotion;
	}

	public static boolean returnProduct(product p) {
		boolean returnDate = false;
		if (p.getreturnDate() != null) {
			returnDate = true;
		}
		return returnDate;
	}
}
