package framework_oop;

import javax.swing.JOptionPane;

public class CRUD_products {

	 public static product create() {
//		String ID_refer ="";
//		ID_refer = validators.valida_string(ID_refer, ID_refer);
		int stock =0; validators.valida_int("Introdueix un stock ", "Stock");
		int num_dies_devolucio = 0;
		int num_dies_recollida = 0;
		int num_dies_entrega =0;
		float weight= 0.0f;
		float dimension =0;
		float price =0.0f;
		String ID_prod ="";
		String color ="";
		String f_compra = "";
		String f_devolucio = "";
		String f_recollida = "";
		String f_entrega = "";
		String f_envio= "";
		
		product p1 = new product (stock,num_dies_entrega,num_dies_devolucio,num_dies_recollida,weight,
				dimension,price,ID_prod,color,f_compra,f_entrega,f_devolucio,f_recollida);
		stock = validators.valida_int("Introdueix un stock ", "Stock");
		num_dies_recollida= validators.valida_int("Introdueix els num_dies_recollida ", "num_dies_recollida");
		num_dies_entrega = validators.valida_int("Introdueix los numeros de dies entrega ", "Dies de entrega");
		weight = validators.valida_int("Introdueix el peso ", "Peso");
		dimension = validators.valida_int("Introdueix una dimensión ", "Dimensión");
		price = validators.valida_int("Introdueix el precio ", "Precio");
		ID_prod = validators.valida_string("Introdueix un ID ", "ID");
		color = validators.valida_string("Introdueix un color ", "Color");
		f_compra = validators.valida_string("Introdueix la fecha de compra ", "F_compra");
		f_entrega = validators.valida_string("Introdueix la fecha de entrega ", "F_entrega");
		f_envio = validators.valida_string("Introdueix la fecha de envio ", "f_envio");
		return p1;
	}
		
	
	 public static void read (product p1) {
		JOptionPane.showMessageDialog(null, p1.toString());
		
	}
	 
	 public static void  update (product p1) {
		 
	 }
	 
	 public static product delete (product p1) {
			p1= null;
			return p1;
	 }
//	

//	}//Delete sempre serà aixi
}
