package bucle_i_basics;
import javax.swing.JOptionPane;
public class suma {
	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int suma= 0;
		String num_input;
		boolean correcto=true;
		do{
			try{
				 num_input=JOptionPane.showInputDialog(null, "Escribe un num1 int","Num int",JOptionPane.QUESTION_MESSAGE);
				if( num_input==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
				}else {
					num1=Integer.parseInt(num_input);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		//JOptionPane.showMessageDialog(null, "Has introducido: "+num1,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	
		do{
			try{
				 num_input=JOptionPane.showInputDialog(null, "Escribe un num2 int","Num int",JOptionPane.QUESTION_MESSAGE);
				if( num_input==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
				}else {
					num2=Integer.parseInt(num_input);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		
		//JOptionPane.showMessageDialog(null, "Has introducido: "+num2,"Resultado",JOptionPane.INFORMATION_MESSAGE);
		suma = num1 + num2;
		JOptionPane.showMessageDialog(null, "La suma es igual a "+ suma, "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end-main
}//end-class

