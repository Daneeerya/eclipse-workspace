// demana n nums i extaau els divisors (j) dels nums (i) que t'hagen dit
package exercici;
import javax.swing.JOptionPane;
public class n_num_divisors {
	public static void main(String[] args) {
		int num = 0; 
		int n = 1;
		boolean correcto = true;
		String intro_num = ""; String cad = "";
		for (int i = 0; i < n; i ++) {
			//Comença valida int
			do{
				try{
					intro_num=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
					if(intro_num==null){
						JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
					}else {
						num =Integer.parseInt(intro_num);
						correcto=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
					correcto=false;
				}
			}while(correcto==false);
			// Acaba valida int
			cad = cad + "Los divisores de " + num + " son: ";
			for (int j = 1; j <= num; j ++) {
				if ((num%j) == 0) {
				cad = cad + (j + ",");
				}
			}
			cad = cad + "\n";
			
		}
		JOptionPane.showMessageDialog(null, cad, "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end-main
}//end-class
