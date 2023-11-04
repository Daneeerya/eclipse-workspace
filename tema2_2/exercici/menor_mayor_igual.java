// Compara 2 nums entre major, menor i igual
package exercici;
import javax.swing.JOptionPane;
public class menor_mayor_igual {
	public static void main (String[] args) {
		int num1 = 0;
		int num2 = 0;
		String intro_num;
		String cad = "";
		boolean correcto=true;
		
		do{
			try{
				 intro_num=JOptionPane.showInputDialog(null, "Introduce el num1 int","Num int",JOptionPane.QUESTION_MESSAGE);
				if( intro_num==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
				}else {
					num1=Integer.parseInt(intro_num);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		//JOptionPane.showMessageDialog(null, "Has introducido: "+num1,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "La suma es igual a "+ resultado, "Resultado",JOptionPane.INFORMATION_MESSAGE);
		
		do{
			try{
				 intro_num=JOptionPane.showInputDialog(null, "Introduce el num2 int","Num int",JOptionPane.QUESTION_MESSAGE);
				if( intro_num==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
				}else {
					num2=Integer.parseInt(intro_num);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		//JOptionPane.showMessageDialog(null, "Has introducido: "+num1,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	
		//JOptionPane.showMessageDialog(null, "La suma es igual a "+ resultado, "Resultado",JOptionPane.INFORMATION_MESSAGE);
		cad ="";
		if (num1 > num2) {
			cad = num1 + " es major que " + num2;
		}else if (num1 < num2) {
			cad = num1 + " es menor que " + num2;
			//JOptionPane.showMessageDialog(null, num1 +" es menor que " + num2 +JOptionPane.INFORMATION_MESSAGE);
		}else {
			cad = num1 + " es igual que " + num2;
			//JOptionPane.showMessageDialog(null, num1 +" es igual que " + num2 +JOptionPane.INFORMATION_MESSAGE);
		}
		JOptionPane.showMessageDialog(null, cad, "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}
}
