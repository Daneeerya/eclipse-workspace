package bucle_i_basics;
import javax.swing.JOptionPane;
public class for2 {
	
	public static void main(String[] args) {
		String cad = "";
		for (int i = 1; i <= 10; i++) {
			cad = cad + (i + "\n");
		}//end-for
		JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}//end-main
}//end-class

