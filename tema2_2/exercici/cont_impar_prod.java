// EX11 El cont compta nº impars i quan compte 3 els multiplica i imprimeix el prod
package exercici;
import javax.swing.JOptionPane;
public class cont_impar_prod {

	public static void main(String[] args) {
		int num = 0;
		String intro_num = "";
		int prod = 1;
		int cont = 0;
		boolean correcto=true;
		while (cont < 3) {
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
			if (num%2 !=0){
				cont ++;
				prod = prod * num;
			}//end-if
		}//end-while
		JOptionPane.showMessageDialog(null, "El prod dels 3 primers num impars es "+ prod, "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end-main
}//end-class
