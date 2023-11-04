package basics;
import javax.swing.JOptionPane;
public class validastring {
	public static void main(String[] args) {
		String s="";
		boolean correcto=true;

		do{
			try{
				s=JOptionPane.showInputDialog(null, "Escribe una cadena","cadena",JOptionPane.QUESTION_MESSAGE);
				correcto=true;
				if (s==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
				}
				if(s.equals("")){
					JOptionPane.showMessageDialog(null, "Error de introducción de datos","Error",JOptionPane.ERROR_MESSAGE);
					correcto=false;
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido una cadena", "Error",JOptionPane.ERROR_MESSAGE);
				correcto=false;
			}
		}while(correcto==false);
		JOptionPane.showMessageDialog(null, "Has introducido: "+s,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}
}