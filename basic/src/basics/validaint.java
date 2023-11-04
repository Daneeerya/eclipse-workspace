package basics;
import javax.swing.JOptionPane;
public class validaint {
	public static void main(String[] args) {
		int a = 0; // a es num
		String s; // s es num_input
		boolean correcto=true;
		//Comença valida int
		do{
			try{
				s=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
				}else {
					a=Integer.parseInt(s);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		// Acaba valida int
		JOptionPane.showMessageDialog(null, "Has introducido: "+a,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}
}
