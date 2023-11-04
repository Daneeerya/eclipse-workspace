// Demanem nums i multipliquem els 5 primers multiples de 2 i de 3
package exercici;
import javax.swing.JOptionPane;
public class n_nums_prod_multiples {

	public static void main(String[] args) {
		int num = 0;
		int prod = 1;
		String intro_num = "";
		int cont = 0;
		boolean correcto=true;

		while (cont<5) {
			do{
				try{
					 intro_num=JOptionPane.showInputDialog(null, "Escribe un num1 int","Num int",JOptionPane.QUESTION_MESSAGE);
					if( intro_num==null){
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
			if (((num%2)==0) && ((num%3)==0)) {
				prod = prod * num;
				cont ++;
			}
		}
		JOptionPane.showMessageDialog(null, "El prod dels 5 primers num introduits es "+ prod, "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}

}
