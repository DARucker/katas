package mainPackage;

import java.util.Scanner;


public class MainClass {
	
	private Scanner inputKey;
	
	private String shopName;

	public void bienvenida() {
		
		
		System.out.println("Bienvenido al sistema de gestion de Floristeria");
		shopName = captureString("Insert Flower Shop name");
	
		System.out.println("1. Product");
		System.out.println("2. Invoice");
		System.out.println("3. Exit");
		
		int choice = captureNumber("Select task: ");
		
	}
	

	
	
	
	
	// Metodos auxiliares para el ingreso de datos numericos y alfanumericos por keyboard
	
	public  String captureString(String mensaje) {
		inputKey = new Scanner(System.in);
		System.out.println(mensaje);
		return inputKey.nextLine();
	}

	public int captureNumber(String mensaje) {
		Integer datoNumerico;

		do {
			System.out.println(mensaje);
			try {
				datoNumerico = Integer.parseInt(inputKey.nextLine());
			} catch (Exception e) {
				System.out.println("El valor ingresado no es un numero. Intente nuevamente ");
				datoNumerico = -1;
			}

		} while (datoNumerico == -1);
		return datoNumerico;
	}

	
}
