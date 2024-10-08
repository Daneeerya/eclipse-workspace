package framework_oop_1_prod;

import javax.swing.JOptionPane;
public class CRUD_product {

	public static product create() {
	    int stock = 4;
	    float weight = 0.5f;
	    String ID_prod = "12AB";
//	    stock = validators.valida_int("Introdueix un stock ", "Stock");  // Per a que ho fique el user inicialitzar tot a 0	 
//    	weight = validators.valida_float("Enter a weight", "Weight");
//	    ID_prod = validators.valida_string("Enter the product ID", "ID product");	
	    product p1 = new product(stock, weight, ID_prod);
	    String cad = "Producto creado correctamente";
	    JOptionPane.showMessageDialog(null, cad);
	    JOptionPane.showMessageDialog(null, p1.toString());
	    
	    return p1;
	}


	 public static void read (product p1) {
		int menu_interior =0;
		String [] opc_menu_interior= {"Stock", "ID_prod","Weight","Exit" };
		menu_interior = menus.menu_interior(opc_menu_interior);
		switch (menu_interior) {
		 	case 0:
                JOptionPane.showMessageDialog(null, "There is a stock of " + p1.getStock() + " units", "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 1: 
                JOptionPane.showMessageDialog(null, "The product ID is " + p1.getID_prod(), "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2:
                JOptionPane.showMessageDialog(null, "The weight of the product is " + p1.getWeight(), "Result", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 3: //Salir
				JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación");
				break;
		}
		JOptionPane.showMessageDialog(null, p1.toString());
	}
	 
	 public static void  update (product p1) {
		 int menu_interior =0;
			String [] opc_menu_interior= {"Stock", "ID_prod","Weight","Exit" };
			menu_interior = menus.menu_interior(opc_menu_interior);
			switch (menu_interior) {
			 	case 0:
			 		int newStock = Integer.parseInt(JOptionPane.showInputDialog("Enter new stock:"));
		            p1.setStock(newStock);
                    JOptionPane.showMessageDialog(null, "Stock updated to " + newStock, "Result", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 1: 
					String newID = JOptionPane.showInputDialog("Enter new ID:");
		            p1.setID_prod(newID);
                    JOptionPane.showMessageDialog(null, "ID updated to " + newID, "Result", JOptionPane.INFORMATION_MESSAGE);
					break;
				 case 2:
		            double newWeight = Double.parseDouble(JOptionPane.showInputDialog("Enter new weight:"));
		            p1.setWeight(newWeight);
                    JOptionPane.showMessageDialog(null, "Weight updated to " + newWeight, "Result", JOptionPane.INFORMATION_MESSAGE);
		            break;
				case 3: //Salir
					JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación");
					break;
				 default:
			            JOptionPane.showMessageDialog(null, "Opción no válida");
			            break;
			}
			JOptionPane.showMessageDialog(null, p1.toString());
		 
	 }

	 public static product delete(product L) {
		    L = null; // Asignar null a p1 para eliminar la referencia al objeto
		    return L; // Devolver null para indicar que el objeto se ha eliminado
		    
	 }
}
