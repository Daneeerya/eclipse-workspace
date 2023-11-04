package xavi;
import javax.swing.JOptionPane;

import xavi.funciones;
public class calculadora {

		
		public static void main(String[] args) {
		
				int seguir;
				String[] tipo = { "Sumar","Restar","Multiplicar","Dividir","Salir"};
				String[] tipo1 = { "Repetir", "Volver", "Acabar" };
				int[] continuar= new int [2];
				float[] numeros=new float[3];
				
				do {
					seguir=funciones.validaboton(tipo);
					switch (seguir) {
					case 0:
						do {
							numeros=funciones.sumar();
							JOptionPane.showMessageDialog(null, "El resultado de la suma de "+numeros[0]+" y "+numeros[1]+" es "+numeros[2]);
							funciones.Repetir(tipo1,continuar);
						} while (continuar[0] == 0); //si continuar[0]==0 es pq el usuario ha pulsado Repetir
						break;
					case 1:
						do {
							numeros=funciones.restar();
							JOptionPane.showMessageDialog(null, "El resultado de la resta es "+numeros[0]+" y "+numeros[1]+" es "+numeros[2]);
							funciones.Repetir(tipo1,continuar);
						} while (continuar[0] == 0);
						break;
					case 2:
						do {
							numeros=funciones.multiplicar();
							JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es "+numeros[0]+" y "+numeros[1]+" es "+numeros[2]);
							funciones.Repetir(tipo1,continuar);
						} while (continuar[0] == 0);
						break;
					case 3:
						do {
							numeros=funciones.dividir();
							JOptionPane.showMessageDialog(null, "El resultado de la division es "+numeros[0]+" y "+numeros[1]+" es "+numeros[2]);
							funciones.Repetir(tipo1,continuar);
						} while (continuar[0] == 0);
						break;
					case 4:
						continuar[1] = 0;//Aço es quan l'usuari pulsa "Salir"
						break;
					default:
						continuar[1] = 0;//Aço es quan l'usuari pulsa tancar la finestra (x)
					}
				} while (continuar[1] == 1);
				JOptionPane.showMessageDialog(null, "Saliendo de la aplicacion");
		}

	}

