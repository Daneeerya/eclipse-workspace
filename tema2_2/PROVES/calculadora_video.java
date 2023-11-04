// Si introdueixes una string continua funcionant (?)
package PROVES;

import javax.swing.JOptionPane;

public class calculadora_video {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion; 
		char seguir; 
		int num1= 0; float numdiv_1 =0;
		int num2 =0; float numdiv_2 = 0;
		//String intro_num = "";
		 
		do {
			//menu_____________________________________________________
			do {
				try {
					String intro_num = JOptionPane.showInputDialog(null,
							"Menú"+ "\n"+
							"-----------------------"+ "\n"+
							"1. Sumar" +"\n"+
							"2. Restar" +"\n"+
							"3. Multiplicar" +"\n"+
							"4. Dividir" +"\n"+
							"5. Salir del programa" +"\n"+
							"Elige la opción (1,2,3,4,5)" +"\n"+
							"-----------------------"+ "\n"+
							"Menú",
							JOptionPane.QUESTION_MESSAGE);
					opcion = Integer.parseInt (intro_num);
					}catch (Exception e) {
						System.err.println ("Error: "+ e.getMessage());
						opcion = Integer.MIN_VALUE;
					}	
			}while (opcion<1 || opcion>5);
		//menu-end______________________________________________________
			switch (opcion) {
			case 1: //calcular + ---------------------------------------
				do{
					try {
						String intro_num =JOptionPane.showInputDialog(null, 
						 "Dame el 1º operando"+"\n", 
						 "Introducción de datos", 
						 JOptionPane.QUESTION_MESSAGE); 
						 num1=Integer.parseInt(intro_num);
					}catch (Exception e) {
						System.err.println("Error"+ e.getMessage());
						num1 =Integer.MIN_VALUE;
					}
					try {
						String intro_num2 =JOptionPane.showInputDialog(null, 
						 "Dame el 2º operando"+"\n", 
						 "Introducción de datos", 
						 JOptionPane.QUESTION_MESSAGE); 
						 num2=Integer.parseInt(intro_num2);
					}catch (Exception e) {
						System.err.println("Error"+ e.getMessage());
						num2 =Integer.MIN_VALUE;
					}
					JOptionPane.showMessageDialog(null, 
							"Resultado de la suma: " + (num1+num2),
							"Suma",
							JOptionPane.INFORMATION_MESSAGE);
					do {
						try {
							String intro_num = JOptionPane.showInputDialog(null,
									"¿Quieres realizar otra operación?(S/N)"+ "\n",
									"Introducción de datos",
								JOptionPane.QUESTION_MESSAGE);
							seguir= intro_num.charAt (0);
						}catch (Exception e) {
							System.err.println("Error"+ e.getMessage());
							seguir=Character.MIN_VALUE;
						}
				}while (seguir != 'S'&& seguir != 'N');
			}while (seguir== 'S');
			break;
			case 2: //calcular ------------------------------------------------------
				do{
					try {
						String intro_num =JOptionPane.showInputDialog(null, 
						 "Dame el 1º operando"+"\n", 
						 "Introducción de datos", 
						 JOptionPane.QUESTION_MESSAGE); 
						 num1=Integer.parseInt(intro_num);
					}catch (Exception e) {
						System.err.println("Error"+ e.getMessage());
						num1 =Integer.MIN_VALUE;
					}
					try {
						String intro_num2 =JOptionPane.showInputDialog(null, 
						 "Dame el 2º operando"+"\n", 
						 "Introducción de datos", 
						 JOptionPane.QUESTION_MESSAGE); 
						 num2=Integer.parseInt(intro_num2);
					}catch (Exception e) {
						System.err.println("Error"+ e.getMessage());
						num2 =Integer.MIN_VALUE;
					}
					JOptionPane.showMessageDialog(null, 
							"Resultado de la resta: " + (num1-num2),
							"Resta",
							JOptionPane.INFORMATION_MESSAGE);
					do {
						try {
							String intro_num = JOptionPane.showInputDialog(null,
									"¿Quieres realizar otra operación?(S/N)"+ "\n",
									"Introducción de datos",
								JOptionPane.QUESTION_MESSAGE);
							seguir= intro_num.charAt (0);
						}catch (Exception e) {
							System.err.println("Error"+ e.getMessage());
							seguir=Character.MIN_VALUE;
						}
				}while (seguir != 'S'&& seguir != 'N');
			}while (seguir== 'S');
			break;
			case 3: //calcular ------------------------------------------------------
				do{
					try {
						String intro_num =JOptionPane.showInputDialog(null, 
						 "Dame el 1º operando"+"\n", 
						 "Introducción de datos", 
						 JOptionPane.QUESTION_MESSAGE); 
						 num1=Integer.parseInt(intro_num);
					}catch (Exception e) {
						System.err.println("Error"+ e.getMessage());
						num1 =Integer.MIN_VALUE;
					}
					try {
						String intro_num2 =JOptionPane.showInputDialog(null, 
						 "Dame el 2º operando"+"\n", 
						 "Introducción de datos", 
						 JOptionPane.QUESTION_MESSAGE); 
						 num2=Integer.parseInt(intro_num2);
					}catch (Exception e) {
						System.err.println("Error"+ e.getMessage());
						num2 =Integer.MIN_VALUE;
					}
					JOptionPane.showMessageDialog(null, 
							"Resultado de la multiplicación: " + (num1*num2),
							"Multiplicación",
							JOptionPane.INFORMATION_MESSAGE);
					do {
						try {
							String intro_num = JOptionPane.showInputDialog(null,
									"¿Quieres realizar otra operación?(S/N)"+ "\n",
									"Introducción de datos",
								JOptionPane.QUESTION_MESSAGE);
							seguir= intro_num.charAt (0);
						}catch (Exception e) {
							System.err.println("Error"+ e.getMessage());
							seguir=Character.MIN_VALUE;
						}
				}while (seguir != 'S'&& seguir != 'N');
			}while (seguir== 'S');
			break;
			case 4: //calcular ------------------------------------------------------
				do{
					try {
						String intro_num =JOptionPane.showInputDialog(null, 
						 "Dame el 1º operando"+"\n", 
						 "Introducción de datos", 
						 JOptionPane.QUESTION_MESSAGE); 
						 numdiv_1=Integer.parseInt(intro_num);
					}catch (Exception e) {
						System.err.println("Error"+ e.getMessage());
						num1 =Integer.MIN_VALUE;
					}
					try {
						String intro_num2 =JOptionPane.showInputDialog(null, 
						 "Dame el 2º operando"+"\n", 
						 "Introducción de datos", 
						 JOptionPane.QUESTION_MESSAGE); 
						numdiv_2=Integer.parseInt(intro_num2);
					}catch (Exception e) {
						System.err.println("Error"+ e.getMessage());
						num2 =Integer.MIN_VALUE;
					}
					JOptionPane.showMessageDialog(null, 
							"Resultado de la división: " + (numdiv_1/numdiv_2),
							"División",
							JOptionPane.INFORMATION_MESSAGE);
					do {
						try {
							String intro_num = JOptionPane.showInputDialog(null,
									"¿Quieres realizar otra operación?(S/N)"+ "\n",
									"Introducción de datos",
								JOptionPane.QUESTION_MESSAGE);
							seguir= intro_num.charAt (0);
						}catch (Exception e) {
							System.err.println("Error"+ e.getMessage());
							seguir=Character.MIN_VALUE;
						}
				}while (seguir != 'S'&& seguir != 'N');
			}while (seguir== 'S');
			break;			
			}// switch-end
		}while (opcion != 5);
}
}
