package framework_ejers_extra_v2;

import javax.swing.JOptionPane;

public class menus {
	//Menu_principal 
	public static int menu_principal(String[] menu_principal) {
			
			int opcion=0;
			
			opcion = JOptionPane.showOptionDialog(null,"¿Que operación quieres realizar?","Menú Principal",0,JOptionPane.QUESTION_MESSAGE,null,menu_principal,menu_principal[0]);
			
			return opcion;
			
		}

	//Menu_secundario
	public static int menu_secundario() {
		String[] operaciones = { "Repetir operacion","Menú","Salir" };
		int opcion=0;
		
		opcion = JOptionPane.showOptionDialog(null,"¿Que acción quieres realizar?","Menú Secundario",0,JOptionPane.QUESTION_MESSAGE,null,operaciones,operaciones[0]);
		
		return opcion;
		
	}
}
