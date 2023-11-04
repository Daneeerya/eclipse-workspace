package framework_examen_esp;
import javax.swing.JOptionPane;

public class utils_working {

	//________Contador________cont compta n impars i quan porte 3 imprimeix el prod
		public static void contador() {
			int num = 0;
			int prod = 1;
			int cont = 0;
			while (cont <= 3) {
				validators.valida_int("Introduce un numero entero", "Numero int");
				if (num%2 !=0){  
					cont ++;
					prod = prod * num;
				}//end-if
			}//end-while
		JOptionPane.showMessageDialog(null, "El prod dels 3 primers num impars es "+ prod, "Resultado",JOptionPane.INFORMATION_MESSAGE);
		}//end-static contador

	
	// + statics
}//end-class
