package depurador;

import java.util.Scanner;

public class depurador {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String nameLeido;
		
			System.out.println ("Write your name");
			nameLeido = input.nextLine();
			if (nameLeido=="Laura") {
				System.out.println ("El programa ha terminado");

			}

		input.close();
	}
	
}
