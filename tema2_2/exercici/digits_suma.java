// Extrau la suma dels digits
package exercici;
import javax.swing.JOptionPane;
public class digits_suma {

	public static void main(String[] args) {
		int num = 0; int digit= 0; int suma = 0; int copia = 0;
		String intro_num = "";
		String cad = "";
		boolean correcto = true;
		//Comença valida int
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
		// Acaba valida int
		copia = num;
		while (num > 0) {
			digit = num % 10;
			num = num/10;
			suma = suma + digit;
		}
		cad = "La suma dels digits de " + copia + " es " + suma;
		JOptionPane.showMessageDialog(null, cad,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end-main
}//end-class