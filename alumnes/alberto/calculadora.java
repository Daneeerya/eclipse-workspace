package alberto;

import javax.swing.JOptionPane;

public class calculadora {

	public static void main(String[] args) {
		String [ ] operaciones= {"suma","resta","producto","división", "hola"};
		int opcioneleg =1, conti=0;
		float resultado = 0.0f;
		do {
		opcioneleg = funciones.menu(operaciones);

		switch(opcioneleg){
		
		case 0://sumar
				do {
					resultado=funciones.suma();
					JOptionPane.showMessageDialog(null, resultado);
					conti = funciones.menuconti();
				}while(conti == 0);
				break;
			
		case 1://restar
			do {
				resultado=funciones.restar();
				JOptionPane.showMessageDialog(null, resultado);
				conti = funciones.menuconti();
			}while(conti == 0);
			break;
		case 2://multiplicar
			do {
				resultado=funciones.multiplicar();
				JOptionPane.showMessageDialog(null, resultado);
				conti = funciones.menuconti();
			}while(conti == 0);
			break;
		case 3://dividir
			do {
				resultado=funciones.dividir();
				JOptionPane.showMessageDialog(null, resultado);
				conti = funciones.menuconti();
			}while(conti == 0);
			break;
		case 4:JOptionPane.showMessageDialog(null, "Hola");
				break;
		}
		if (conti==2) {
			System.exit(0);
		}
	
		}while(conti==1);
	}

}
