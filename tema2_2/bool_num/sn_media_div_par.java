// Desea continuar, la media de sus divisores pares
package bool_num;
import javax.swing.JOptionPane;
public class sn_media_div_par {

	public static void main(String[] args) {
		int num = 0; int suma = 0; int cont_divisor_par = 0;
		float mitja = 0.0f;
		int confirmado = 0;
		boolean correcto = true;
		String cad = "";  String n ="";
		do {
			// VALIDA
			do{
				try{
					n =JOptionPane.showInputDialog(null, "Intro num para sacar la media de los divisores pares","Num int",JOptionPane.QUESTION_MESSAGE);
					if(n==null){
						JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
					}else {
						num=Integer.parseInt(n);
						correcto=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
					correcto=false;
				}
			}while(correcto==false); 
			// acaba VALIDA
			for (int i = 1; i <=num; i++) {
				 if (((num % i) == 0)&& ((i % 2)==0)){
					 cont_divisor_par++;
					 suma = suma  + i ;
				} 
				 if (cont_divisor_par != 0) {
					 mitja = (float)suma/cont_divisor_par;
				 }else {
					mitja = 0.0f;
				}
			}
			
			confirmado = JOptionPane.showConfirmDialog (null, "¿Desea continuar?");
			cad = cad + "La mitja dels divisors pars de " + num + " es " + mitja + "\n";
		}while (JOptionPane.OK_OPTION == confirmado);
		JOptionPane.showMessageDialog(null, cad, "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end-main
}//end-class