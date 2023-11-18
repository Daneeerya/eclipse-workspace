package exercici;

import javax.swing.JOptionPane;

public class depurador {
	public static void main(String[] args) {
		String name = "";
		name = JOptionPane.showInputDialog("Enter your name:");
		if (name=="Laura") {
			JOptionPane.showMessageDialog(null, "17/11/2023", "Fecha", 0);
		} 
	}
}
