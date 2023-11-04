package basics;
import javax.swing.JOptionPane;
public class valida_showinput_combobox {
	public static void main(String[] args) {
		Object seleccion = JOptionPane.showInputDialog(
				   null,
				   "Selecciona estado civil",
				   "Selector de opciones",
				   JOptionPane.QUESTION_MESSAGE,
				   null,  // null para icono defecto
				   new Object[] { "Soltero", "Casado", "Separado", "Divorciado", "Viudo" },
				   "Soltero");
				 
		if(seleccion==null)
			JOptionPane.showMessageDialog(null,"Saliendo de la aplicaci�n","Saliendo ...",JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"El usuario ha escogido "+seleccion,"Saliendo ...",JOptionPane.INFORMATION_MESSAGE);	
	}
}
