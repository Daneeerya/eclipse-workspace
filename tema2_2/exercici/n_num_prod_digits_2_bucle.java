//Ens introduiran numeros fins que arribe el -5 i calcula el producte dels digits multiples de 2 o 3 i si el producte es >= 50 imprimeix el numero
//complet
package exercici;
import javax.swing.JOptionPane;
public class n_num_prod_digits_2_bucle {

	public static void main(String[] args) {
		int num = 0;  int digit = 0; int prod = 0; int copia = 0;
	    boolean correcto = true;
		String intro_num = ""; String cad = "";
	    while (correcto == true) {
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
			if (num == -5) {
				correcto = false;
			}else {
				prod = 1;
				while(num > 0){
	                digit = num % 10;
	                num = num / 10;
	                if (((digit % 2) == 0) || ((digit % 3) == 0)){
	                    prod = prod * digit;
	                }
	            }
	            if (prod >= 10){
	                cad = cad + copia;
	            }
			}
	    }
	    cad = "Els digits multiples de 2 o de 3 de " + copia + " majors de 50 son " + cad + "\n";
	    JOptionPane.showMessageDialog(null, cad, "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}

}
