// Demana num i extrau els 5 primers nombres que no siguen multiples de 2 i imprimeix el major i menor
package exercici;
import javax.swing.JOptionPane;
public class n_num_maj_men {

	public static void main(String[] args) {
		int num = 0, cont= 0, major = 0, menor = 0, cont_pivot =0;
		String intro_num = "", cad = "";
		boolean correcto=true;

			while (cont < 5) {
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
				if ((num%2)!= 0) {
					cont ++;
					if (cont_pivot ==0) {
						cont_pivot ++;
						major = menor = num;
					}if (num > major) {
						major = num;
					}if (num < menor) {
						menor = num;
					}
			}
			}
			cad= "El nombre major es " + major + " i el nombre menor es " + menor;
			JOptionPane.showMessageDialog(null, cad, "Resultado",JOptionPane.INFORMATION_MESSAGE);
			
	}

}
