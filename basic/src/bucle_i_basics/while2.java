package bucle_i_basics;
import javax.swing.JOptionPane;
public class while2 {
	
	public static void main(String[] args) {
		String cad = "";
		int i = 1;
		while (i<=10) {
			cad = cad + (i+ "\n");
			i++;
		}//end-while
		JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}//end-main
}//end-class