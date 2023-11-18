package modules_oop2.utils;

import javax.swing.JOptionPane;

public class menus {
	//Menu_principal 
	public static int menu1(String[] menu1) {	
		int option=0;
		
		option = JOptionPane.showOptionDialog(null,"What operation do you want to do?","Main Menu",0,JOptionPane.QUESTION_MESSAGE,null,menu1,menu1[0]);
		
		return option;
		
		}

	//Menu_secundario
	public static int secondary_menu() {
		String[] options = { "Repeat operation","Menu","Exit" };
		int option=0;
		
		option = JOptionPane.showOptionDialog(null,"What action do you want to do?","Menú Secundario",0,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
		
		return option;
		
	}
	//Menu_interior
	public static int menu_interior(String[] opc_menu_interior) {
		String[] options ={"Stock", "ID_prod","Weight","Exit" };

		int option=0;
		
		option = JOptionPane.showOptionDialog(null,"What operation do you want to do?","Main Menu",0,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
		
		return option;
		
		}
	
	
	public static int menu(String[] tipo, String message, String title) {
		int operation = JOptionPane.showOptionDialog(null, message, title, 0, JOptionPane.QUESTION_MESSAGE, null, tipo, tipo[0]);
		return operation;
	}
	// -------------------------------------MENU-------------------------------------
	//Menu using combobox-------------------------------------
		public static String menucombo(String[] options, String message, String title){
			Object option=null;
			
			option=JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			
			
			return option.toString();
		}
}
