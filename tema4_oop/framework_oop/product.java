package framework_oop;

public class product {
	private int stock ;
	private int num_dies_entrega;
	private int num_dies_devolucio;
	private int num_dies_recogida;
	private float weight ;
	private float dimension ;
	private float price ;
	private String ID_prod ;
	private String color;
	private String f_compra;
	private String f_entrega;
	private String f_devolucio;
	private String f_recogida;
	
//Constructor
	public product(int stock, int num_dies_entrega, int num_dies_devolucio, int num_dies_recogida, float weight,
			float dimension, float price, String iD_prod, String color, String f_compra, String f_entrega,
			String f_devolucio, String f_recogida) {
		super();
		this.stock = stock;
		this.num_dies_entrega = num_dies_entrega;
		this.num_dies_devolucio = num_dies_devolucio;
		this.num_dies_recogida = num_dies_recogida;
		this.weight = weight;
		this.dimension = dimension;
		this.price = price;
		this.ID_prod = iD_prod;
		this.color = color;
		this.f_compra = f_compra;
		this.f_entrega = f_entrega;
		this.f_devolucio = f_devolucio;
		this.f_recogida = f_recogida;
	}
	
//Getters & Setters
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getNum_dies_entrega() {
		return num_dies_entrega;
	}
	public void setNum_dies_entrega(int num_dies_entrega) {
		this.num_dies_entrega = num_dies_entrega;
	}
	public int getNum_dies_devolucio() {
		return num_dies_devolucio;
	}
	public void setNum_dies_devolucio(int num_dies_devolucio) {
		this.num_dies_devolucio = num_dies_devolucio;
	}
	public int getNum_dies_recogida() {
		return num_dies_recogida;
	}
	public void setNum_dies_recogida(int num_dies_recogida) {
		this.num_dies_recogida = num_dies_recogida;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getDimension() {
		return dimension;
	}
	public void setDimension(float dimension) {
		this.dimension = dimension;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getID_prod() {
		return ID_prod;
	}
	public void setID_prod(String iD_prod) {
		this.ID_prod = iD_prod;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getF_compra() {
		return f_compra;
	}
	public void setF_compra(String f_compra) {
		this.f_compra = f_compra;
	}
	public String getF_entrega() {
		return f_entrega;
	}
	public void setF_entrega(String f_entrega) {
		this.f_entrega = f_entrega;
	}
	public String getF_devolucio() {
		return f_devolucio;
	}
	public void setF_devolucio(String f_devolucio) {
		this.f_devolucio = f_devolucio;
	}
	public String getF_recogida() {
		return f_recogida;
	}
	public void setF_recogida(String f_recogida) {
		this.f_recogida = f_recogida;
	}
	
//To String
	@Override
	public String toString() {
		return "Product [stock=" + stock + ", num_dies_entrega=" + num_dies_entrega + ", num_dies_devolucio="
				+ num_dies_devolucio + ", num_dies_recogida=" + num_dies_recogida + ", weight=" + weight
				+ ", dimension=" + dimension + ", price=" + price + ", ID_prod=" + ID_prod + ", color=" + color
				+ ", f_compra=" + f_compra + ", f_entrega=" + f_entrega + ", f_devolucio=" + f_devolucio
				+ ", f_recogida=" + f_recogida + "]";
	}
	
	
}
