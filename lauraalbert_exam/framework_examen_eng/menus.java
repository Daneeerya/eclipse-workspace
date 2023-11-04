package framework_examen_eng;

import javax.swing.JOptionPane;

public class menus {
	//main_menu 
	public static int main_menu(String[] main_menu) {
			
			int option=0;
			
			option = JOptionPane.showOptionDialog(null,"What operation do you want to realize?","Main Menu",0,JOptionPane.QUESTION_MESSAGE,null,main_menu,main_menu[0]);
			
			return option;
			
		}

	//secondary_menu
	public static int secondary_menu() {
		String[] operations = { "Repetir operacion","Menú","Salir" };
		int option=0;
		
		option = JOptionPane.showOptionDialog(null,"¿Que acción quieres realizar?","Secondary Menu",0,JOptionPane.QUESTION_MESSAGE,null,operations,operations[0]);
		
		return option;
		
	}
}
