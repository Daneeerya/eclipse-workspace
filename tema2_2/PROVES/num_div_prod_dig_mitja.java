// Quants num vol ingresar, traure els divisors de cada num, el prod de tots els div pars i que siguen majors de 2, els dig del prod
//i la mitja de tots els prod

package PROVES;

import javax.swing.JOptionPane;

public class num_div_prod_dig_mitja {

	public static void main(String[] args) {
		String intro_num = "";
		String cad_prod_par = "";
		String cad_cant_num = "";
		String cad_div = "";
		int prod = 1;
		boolean correcto = true;
		int num = 0; int num1 = 0;
		do{
			try{
				intro_num =JOptionPane.showInputDialog(null, "¿Cuantos numeros vas a introducir?","Num int",JOptionPane.QUESTION_MESSAGE);
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
		cad_cant_num = "La cantidad de numeros introducidos es " + num + "\n";
		//Hasta aquí el programa le pide al usuario cuantos nums va a introducir y guarda la cantidad de num
		for (int i=0; i < num; i++) { 
			do{
				try{
					intro_num=JOptionPane.showInputDialog(null, "Escribe un num int","Num int",JOptionPane.QUESTION_MESSAGE);
					if(intro_num==null){
						JOptionPane.showMessageDialog(null, "Saliendo de la aplicaci�n","Saliendo",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecuci�n
					}else {
						num1=Integer.parseInt(intro_num);
						correcto=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido un num int", "Error",JOptionPane.ERROR_MESSAGE);
					correcto=false;
				}
				prod = 1;
				String name = "";
				for (int j = 1; j<= num1; j++) {
//					name = cad_div.toString();
//					String lastTwo= "";
					if ((num1%j)==0) {
						if(cad_div.isEmpty()  ) {
							cad_div = cad_div +  j ;
						}else {
							//lastTwo = name.substring(name.length()-2);
							cad_div = cad_div +"," + j ;
//							if (name=="/n") {
//								System.out.println ("NOMRE");
//								System.out.println (name);
//							}
						}
					}	
				
				}cad_div= cad_div + "\n";
				
				
//				name = cad_div.toString();
//				String lastTwo= name.substring(name.length()-2);
//				System.out.println (lastTwo);
			}while(correcto==false);
	} //Hasta aquí ingresa los numeros num veces 

		JOptionPane.showMessageDialog(null, cad_cant_num + cad_div, "Resultado",JOptionPane.INFORMATION_MESSAGE);
	}//end-main
}//end-class
