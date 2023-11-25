package framework_oop_arrays.modules.products.classes;

import java.util.ArrayList;

import framework_oop_arrays.modules.products.utils.CRUD_dummies.laptop_dum;

public class Singleton {
	public static ArrayList<laptop> productlaptop = new ArrayList<>();
	public static ArrayList<smartphone> productsmartphone = new ArrayList<>();
	public static ArrayList<accessory> productaccessory = new ArrayList<>();
	public static String ID;
	public static ArrayList<laptop_dum> productlaptop_dummies = new ArrayList<>();
	public static ArrayList<smartphone> productsmartphone_dummies = new ArrayList<>();
	public static ArrayList<accessory> productaccessory_dummies = new ArrayList<>();
	public static String ID_dummies;
}
