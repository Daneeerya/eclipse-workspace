package basics;
import javax.swing.JOptionPane;
public class validafloat {
	public static void main(String[] args) {
		float a = 0.0f; // así se hace un float
		String s;
		boolean correcto=true;

		do{
			try{
				s=JOptionPane.showInputDialog(null, "Escribe un num float","Num float",JOptionPane.QUESTION_MESSAGE);
				if(s==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
				}else {
					a=Float.parseFloat(s);
					correcto=true;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un num float", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);	
		JOptionPane.showMessageDialog(null, "Has introducido: "+a,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}
}