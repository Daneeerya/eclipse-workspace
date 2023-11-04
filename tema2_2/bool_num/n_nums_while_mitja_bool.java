// Introdueixen n nums on el bucle pararà quan introduisquen el -1. Hauràs de traure la mitja i preguntar-li si vol continuar.
package bool_num;
import javax.swing.JOptionPane;
public class n_nums_while_mitja_bool {

	public static void main(String[] args) {
		int num = 0, major = 0, menor = 0, suma = 0, cont = 0,  cont_mitja = 0;
		int denegado = 0;
		String num_input= "", cad_major_menor = "", cad_mijta = "", cad = "";
		boolean interruptor = false;

		
		while (interruptor == false) {
			do{
				try{
					num_input=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
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
			if (num == -1) {
				interruptor = true;
			}else {
				if (cont == 0) { //CREAR PIVOT
				cont ++;
				major = num;
				menor = num;
				}// end-if
				if (num < menor) {
					menor = num;
				}
				if (num > major) {
					major = num;
				}
				cont_mitja ++;
				suma = suma + num;
			}
		}
		
		cad_major_menor = "El major es " + major + " i el menor es " +  menor ;		
		if (cont_mitja!= 0) {
			cad_mijta = " La mitja es " + ((float)suma/cont_mitja) + "\n";
		}else {
			cad_mijta = "Error 503";
		}
	cad  = cad_major_menor + cad_mijta;
	JOptionPane.showMessageDialog(null, cad,  "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}
}
