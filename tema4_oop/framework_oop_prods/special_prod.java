package framework_oop_prods;

public class special_prod {
	public static char comboBrand() {
		char brand = 0;
		String[] tipo = { "Samsung", "Apple" };
		String field = menus.menucombo(tipo, " What brand do you want ?", "Brand");
		switch (field) {
		case "Samsung":
			brand = 'S';
			break;
		case "Apple":
			brand = 'A';
			break;
		}
		return brand;
	}


}
