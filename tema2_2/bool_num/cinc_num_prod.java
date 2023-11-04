//Ex4 --> li demane n num al client i després de cada ú vols continuar? Fins diga que no i imprimir el prod final
package bool_num;
import javax.swing.JOptionPane;
public class cinc_num_prod {

	public static void main(String[] args) {
		int confirmado = 0;
		int denegado = 0;
		int num = 0;
		int prod = 1;
		String num_input= "";
		
		do {
				do{
					try{
						 num_input=JOptionPane.showInputDialog(null, "Introduce un num entero","Num int",JOptionPane.QUESTION_MESSAGE);
						 confirmado = JOptionPane.showConfirmDialog (null, "Desea continuar?");
						 
						if(num_input==null){
							JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
						}else {
							num=Integer.parseInt(num_input);
						}
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
					}
				}while(JOptionPane.NO_OPTION == denegado);
				prod = prod*num;
		}while (JOptionPane.OK_OPTION == confirmado);
		JOptionPane.showMessageDialog(null, "El prod dels nums introduits es " + prod, "Resultado",JOptionPane.INFORMATION_MESSAGE);		
	}//end-main
}//end-class

