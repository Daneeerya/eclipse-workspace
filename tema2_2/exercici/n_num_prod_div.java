// Demane n num i he de traure el prod dels divisors i que també donen >=20
package exercici;
import javax.swing.JOptionPane;
public class n_num_prod_div {

	public static void main(String[] args) {
		int num = 0; int prod= 1; int num1= 0;
		boolean correcto = true;
		String cad = ""; String intro_num ="";
		
		do{
			try{
				intro_num =JOptionPane.showInputDialog(null, "¿Cuantos numeros vas a introducir?","Num int",JOptionPane.QUESTION_MESSAGE);
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
		
		for (int i=0; i < num; i++) {
			do{
				try{
					intro_num=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
					if(intro_num==null){
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
			prod = 1;
			System.out.println (num);
			System.out.println (i);
			for (int j = 1; j <= num1 ; j++) {
				if ((num1%j)==0) {
					prod = prod* j;
				}
			}
			if (prod >= 20) {
				cad = cad + "El prod dels divisors de " + num1 + " es >=20" + "\n"; 
			} else {
				cad = cad + "El prod dels divisors de "+ num1 +" es menor que 20 \n";
			}
		}
		JOptionPane.showMessageDialog(null, cad, "Resultado",JOptionPane.INFORMATION_MESSAGE);
		
	}//end-main
}//end-class