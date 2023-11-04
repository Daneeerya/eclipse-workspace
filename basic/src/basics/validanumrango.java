package basics;
import javax.swing.JOptionPane;
public class validanumrango {
	public static void main(String[] args) {
		int op=0;
		String s;
		boolean correcto=true;
		do{
			do{
				try{
					s=JOptionPane.showInputDialog(null, 
					"Introduce una opción de menú\n 1 -> suma\n 2 -> resta\n 3 -> producto\n 4 -> división\n 5 -> salir\n",
					"Menú",JOptionPane.QUESTION_MESSAGE);
					
					if(s==null){
						JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
					}else {
						op=Integer.parseInt(s);
						correcto=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido un int", "Error",JOptionPane.ERROR_MESSAGE);
					correcto=false;
				}	
			}while(correcto==false);
			if ((op<1)||(op>5))
				JOptionPane.showMessageDialog(null,"No has introducido una opción de menú válida","Error",JOptionPane.ERROR_MESSAGE);
		}while((op<1)||(op>5));
		JOptionPane.showMessageDialog(null, "Has introducido la opción de menú "+op,"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}
}