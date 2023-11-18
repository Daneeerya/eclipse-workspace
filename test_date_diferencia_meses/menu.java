package test_date_v2;

import java.util.Calendar;

import test_date_diferencia_meses.

import javax.swing.JOptionPane;

public class menu {
	public static void menu() {
		 String cad = "";
		 
		 String date = insert_data.insert_date();
		 date delivery = new date(date);
		 
		 String date_dev = insert_data.
		 date dev = new date(date_dev);
		 
		 int resultado = delivery.comparaFechas(dev);
		 
		 if (resultado ==-1) {
			 cad= "La fecha de devolución " + dev.toString()  + " es mayor a la de devolucion  " +  delivery.toString();
		 }else if (resultado ==0) {
			 cad="ERROR: La fecha de entrega es igual a la de devolución ";
		 }else {
			 cad="ERROR: La fecha de entrega es menor a la de devolución ";
		 }
		 
		 int diferencia_anyos = delivery.RestaFechasAnyo();		 
		 int diferencia_meses = delivery.RestaFechasMes(date_dev);
		 int diferencia_dias = delivery.RestaFechasDia(date_dev);
		 
		 System.out.println ("Fecha entrega: " + date + "\n" +
				 			"Fecha devolución: " + date_dev);
		 System.out.println ("La diferencia es de "+ diferencia_dias + "dias, "+ diferencia_meses + " meses y" + diferencia_anyos + " años");
		 JOptionPane.showMessageDialog(null, cad);
	}
}
