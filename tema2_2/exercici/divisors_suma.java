//Extrau la suma dels divisors de num
package exercici;
import javax.swing.JOptionPane;
public class divisors_suma {

	public static void main(String[] args) {
		int n = 1;
		int num = 0; int suma = 0;
		String intro_num = ""; String cad = "";
		boolean correcto = true;
		for (int i = 0; i < n; i++) {
			do{
				try{
					intro_num=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
					if(intro_num==null){
						JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
					}else {
						num=Integer.parseInt(intro_num);
						correcto=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
					correcto=false;
				}
			}while(correcto==false);
		suma = 0; // Se reinicia para poder volver a entrar en el bucle
		for (int j = 1; j<= num; j++) {
			if ((num%j)==0) {
				suma = suma + j;
			}
		}
		cad = "La suma dels divisors de " + num + " es " + suma;
		}
		JOptionPane.showMessageDialog(null, cad, "Resultado",JOptionPane.INFORMATION_MESSAGE);
	
	}//end-main
}//end-class
