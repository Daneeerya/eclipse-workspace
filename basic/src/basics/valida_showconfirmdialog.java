package basics;
import javax.swing.JOptionPane;
public class valida_showconfirmdialog {
	public static void main(String[] args) {
		int confirmado = JOptionPane.showConfirmDialog(
				   null,
				   "�Lo confirmas?");

				if (JOptionPane.OK_OPTION == confirmado)
					JOptionPane.showMessageDialog(null,"Confirmado","Confirmado ...",JOptionPane.INFORMATION_MESSAGE);
				else if (JOptionPane.CANCEL_OPTION == confirmado)
					JOptionPane.showMessageDialog(null,"Cancelado","Cancelado ...",JOptionPane.INFORMATION_MESSAGE);
				else if (JOptionPane.NO_OPTION == confirmado)
					JOptionPane.showMessageDialog(null,"No confirmado","No confirmado ...",JOptionPane.INFORMATION_MESSAGE);
				else 
					JOptionPane.showMessageDialog(null,"Saliendo","Saliendo ...",JOptionPane.INFORMATION_MESSAGE);
	}//end-main
}//end-class