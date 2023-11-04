package bucle_i_basics;
import javax.swing.JOptionPane;
public class do_while {
	public static void main(String[] args) {
		String cad = "";
		int i = 1;
		do {
			cad = cad + (i +"\n");
			i++;
		}while ( i<=10);
		JOptionPane.showMessageDialog(null, cad, "Resulado",JOptionPane.INFORMATION_MESSAGE);
	}//end-main
}//end-class
