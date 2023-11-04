package basics;
import javax.swing.JOptionPane;
public class valida_showconfirmadialogbasic {
	
	public static void main(String[] args) {
		int confirmado = 0;
		do {
			confirmado = JOptionPane.showConfirmDialog (null, "Desea continuar?");
		}while (JOptionPane.OK_OPTION == confirmado);
		
	}//end-main
}//end-class

