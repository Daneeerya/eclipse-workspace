//Ex 10 Mentre user diga si, llegir n i comptar positius i negatius
package bool_num;
import javax.swing.JOptionPane;
public class num_bool_contpos_i_neg {
	public static void main(String[] args) {
		int confirmado = 0;
		int denegado = 0;
		int cont_pos = 0, cont_neg = 0;
		int num = 0;
		String num_input= "";		
		do {
			do{
				try{
					num_input=JOptionPane.showInputDialog(null, "Introdueix un num i comptaré els positius i negatius","Num int",JOptionPane.QUESTION_MESSAGE);
					if(num_input==null){
						JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
					}else {
						num=Integer.parseInt(num_input);
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
				}
			}while(JOptionPane.NO_OPTION == denegado);
			
				if (num > 0) {
					cont_pos ++;
				}else {
					cont_neg ++;
				}
				confirmado = JOptionPane.showConfirmDialog (null, "¿Desea continuar?");
		}while (JOptionPane.OK_OPTION == confirmado);
		
		JOptionPane.showMessageDialog(null, "Dels n introduits hi ha " + cont_pos + " positius i " +  cont_neg + " negatius",  "Resultado",JOptionPane.INFORMATION_MESSAGE);		
	}//end-main
}//end-class
