package framework_oop_prods;

import javax.swing.JOptionPane;

public class menus {
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
