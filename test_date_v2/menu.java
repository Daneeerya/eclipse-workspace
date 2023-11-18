package test_date;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class menu {
	public static void menu() {
		 String cad = "";
		 String date = insert_data.insert_date();
		 date entrega = new date(date);
		 String date_dev = insert_data.insert_date();
		 date dev = new date(date_dev);
		 int resultado = entrega.comparaFechas(dev);
		 if (resultado ==-1) {
			 cad= "La fecha de devolución " + dev.toString()  + " es mayor a la de  " +  entrega.toString();
		 }else 
			 if (resultado ==0) {
			 cad="ERROR: La fecha de entrega es igual a la de devolución ";
		 }else {
			 cad="ERROR: La fecha de entrega es mayor a la de devolución ";
		 }
		 int diferencia_años = entrega.RestaFechas();		 
		 int diferencia_meses = entrega.RestaFechasMes(date_dev);
		 System.out.println ("La diferencia es de " + diferencia_meses + "meses y" + diferencia_años + "años");
		 JOptionPane.showMessageDialog(null, cad);
	}
}
