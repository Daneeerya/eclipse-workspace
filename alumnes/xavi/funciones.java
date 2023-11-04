/*LLISTA DE FUNCIONS
	Demanar i validar un (int)
	Demanar i validar un (float)
	Demanar i validar un (double)
	Demanar i validar un (char)	
	Demanar i validar un (String)
	Demanar un numero de opcio en un rango
	Mostrar una finestra en varios botons
	Demanar una confirmacio de (confirmar o cancelar)
	Sumar 2 (float)
	Restar 2 (float)
	Multiplicar 2 (float)
	Dividir 2 (float)
	Funcio especifica de la calculadora per a diferents preguntes de continuar 
	 */


package xavi;
import javax.swing.JOptionPane;
public class funciones {

		//Funcio per a validar un (float)
		public static float validafloat() {
			
			float a = 0.0f;
			String s;
			boolean correcto=true;

			do{
				try{
					s=JOptionPane.showInputDialog(null, "Escribe un num float","Num float",JOptionPane.QUESTION_MESSAGE);
					if(s==null){
						JOptionPane.showMessageDialog(null, "Introduce un numero valido","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					}else {
						a=Float.parseFloat(s);
						correcto=true;
					}
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "No has introducido un num float", "Error",JOptionPane.ERROR_MESSAGE);
					correcto=false;
				}
			}while(correcto==false);	
			
			return (a);
		}
		
		//Funcio per a mostrar una finestra en varios botons
		public static int validaboton(String[] tipo) {
		
		int op=0;
		
		op = JOptionPane.showOptionDialog(null,
						"Pulsa la opción de menú","Menú",0,
						JOptionPane.QUESTION_MESSAGE,null,tipo,tipo[0]);	

		return op;
		}	

		
		//Funcio per a sumar
		public static float[] sumar() {

			float[] numeros=new float[3];

			numeros[0]=validafloat();
			numeros[1]=validafloat();
			numeros[2]=numeros[0]+numeros[1];
			return numeros;
		}

		//Funcio per a restar
		public static float[] restar() {
			
			float[] numeros=new float[3];

			numeros[0]=validafloat();
			numeros[1]=validafloat();
			numeros[2]=numeros[0]-numeros[1];
			return numeros;
		}

		//Funcio per a multiplicar
		public static float[] multiplicar() {
			
			float[] numeros=new float[3];

			numeros[0]=validafloat();
			numeros[1]=validafloat();
			numeros[2]=numeros[0]*numeros[1];
			return numeros;
		}

		//Funcio per a dividir
		public static float[] dividir() {
			
			float[] numeros=new float[3];

			numeros[0]=validafloat();
			do{
				numeros[1]=validafloat();
				if(numeros[1]==0)
					JOptionPane.showMessageDialog(null, "El numero introducido no puede ser 0");
			}while (numeros [1]==0);
			numeros[2]=numeros[0]/numeros[1];	
			return numeros;
		}
		
		//Funcio especifica de varies preguntes de (repetir)
		public static void Repetir (String[] tipo1, int[] continuar) {
			//La posicio vector[0] guarda la opcio de repetir la operacio
			//La posicio vector[1] guarda la opcio de continuar o ixir del programa
			continuar[0] = JOptionPane.showOptionDialog(null,
					" Que desea hacer?", "continuar", 0,
					JOptionPane.QUESTION_MESSAGE, null, tipo1,
					tipo1[0]);
			switch (continuar[0]) {
			
			case 1:// Aço es quan es pulsa repetir, continuar[1]=1 es per que no acabe el bucle global de la calculadora
				continuar[1] = 1;
				break;
			case 2: 
				continuar[1] = 0;
				break;
			default:
				continuar[1] = 0;
			}
		}
		
		
}