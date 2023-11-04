//EX13 demana un num i extrau la suma dels divisors pars
package exercici;
import javax.swing.JOptionPane;
public class num_divisors {

	public static void main(String[] args) {
		int num = 0, suma = 0;
		String intro_num = "";
		String cad = "";
		boolean correcto=true;

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

		for (int i = 1; i<=num; i++) {
			if (((num%i)==0)&& (i%2)==0){
				suma = suma + i;
			}
		}
		cad = "La suma dels divisors pars de " + num +" son " + suma;
		JOptionPane.showMessageDialog(null, cad, "Resultado",JOptionPane.INFORMATION_MESSAGE);		
	}

}
