package PROVES;
import javax.swing.*;
public class prova_calculadora {
	public static void main(String[] args) {
		int op=0, num1=0, num2=0,num3=0,num4=0;
		String[] tipo = {"Sumar","Restar","Multiplicar","Dividir","Salir" };
		
		do{
			op = JOptionPane.showOptionDialog(null,"Pulsa la operación que quieras realizar","Contador de vocales",0,
			JOptionPane.QUESTION_MESSAGE,null,tipo,tipo[0]);
				switch (op){
						case 0:{
							num1++;
							break;	
							}
						case 1:{
							num2++;
							break;
							}
						case 2:{
							num3++;
							break;
							}
						case 3:{
							num4++;
							break;
							}
						case 4:{
							JOptionPane.showMessageDialog(null, "Gracias por usar nuestro contador");
							op = 4;
							break;
							}
				}//end switch
			}while (op != 4);//end while
		JOptionPane.showMessageDialog(null, "Numero de veces pulsado: \n"+"A: "+num1+"\n"+"E: "+num2+"\n"+"I: "+num3+"\n"+"O: "+num4);
	}//end-main
}//end-class