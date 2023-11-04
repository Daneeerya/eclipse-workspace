//Dissenya una aplicació amb Java que acabarà quan l’usuari introduïsca el num -1. 
//Imprimirem per a cada num, el major i menor dels seus dígits pars. --> Major i menor digits pars
//num=3482 -> els dígits pars major i menor són 8 i 2
//num=6024 -> els dígits pars major i menor són 6 i 2
//num=8972 -> els dígits pars major i menor són 8 i 2
//num=4362 -> els dígits pars major i menor són 6 i 2
//num=-1

package framework_examen;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		int num_intro=0; int cont_pivot=0; int major =0; int menor =0; int num =0;
		String cad = "";
		do {
			num = validators.valida_int("Introduce un numero entero", "Numero entero");
		}while (num!=-1);
		
		if (cont_pivot == 0) { //CREAR PIVOT
			cont_pivot ++;
			major = num;
			menor = num;
			}// end-if
			if (num < menor) {
				num = menor;
			}
			if (num > major) {
				major = num;
			}
		
		
		cad = "El numero major es " + major + " i el menor es " + menor;
		JOptionPane.showMessageDialog(null, cad, "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}
	
}
		



