package framework_examen_eng;
import javax.swing.JOptionPane;

public class utils_working {

	//________Contador________cont compta n impars i quan porte 3 imprimeix el prod
		public static void contador() {
			int num = 0;
			int prod = 1;
			int cont = 0;
			while (cont <= 3) {
				validators.validate_int("Introduce a number int", "Number int");
				if (num%2 !=0){  
					cont ++;
					prod = prod * num;
				}//end-if
			}//end-while
		JOptionPane.showMessageDialog(null, "The product of the 3 odd number primers is "+ prod, "Result",JOptionPane.INFORMATION_MESSAGE);
		}//end-static contador

	
	// + statics
}//end-class
