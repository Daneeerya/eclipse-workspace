// Demana num al usuari i extrau la tabla de multiplicar
package bucle_i_basics;
import javax.swing.JOptionPane;
public class n_num_tabla_multiplicar {

	public static void main(String[] args) {
		int num = 0;
		String cad = "";
		String s="";
		boolean correcto=true;
		do{
			try{
				s=JOptionPane.showInputDialog(null, "Escribe un número entero","Num int",JOptionPane.QUESTION_MESSAGE);
				if( s == null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
				}else {
					num=Integer.parseInt(s);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un número entero", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		for (int i= 1; i<=10; i++) {
			cad = cad + (num + " x " + i + " = " + (num * i) + "\n");
			System.out.println(num + "y" + i);
		}//end-for
		JOptionPane.showMessageDialog(null, cad, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}//end-main
}//end-class
