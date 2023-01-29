package concesionario;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App_concesionario {

	/*
6.-Primer coche de una marca:
	 * 7.-Último coche de una marca:
	 */

	private static Coche car;
	private static List<Coche> cars = new ArrayList<>();

	public static void main(String[] args) {

		cars.add(new Coche("Ford", "F-100", 2500, 200));
		cars.add(new Coche("Ford", "F-200", 3000, 260));
		cars.add(new Coche("Ford", "Fiesta", 1600, 120));
		cars.add(new Coche("Ford", "Puma", 1800, 160));
		cars.add(new Coche("Ford", "Ford T", 100, 10));
		cars.add(new Coche("Ford", "Falcon", 3000, 100));
		cars.add(new Coche("Fiat", "Palio", 1500, 100));
		cars.add(new Coche("Fiat", "Cinquecento", 1000, 500));
		cars.add(new Coche("Fiat", "Cinquecento", 1500, 500));
		cars.add(new Coche("Fiat", "Panda", 1600, 120));
		cars.add(new Coche("Fiat", "Tipo", 1800, 1650));
		cars.add(new Coche("Fiat", "Tipo", 1500, 1650));
		cars.add(new Coche("Fiat", "Tipo", 1000, 1650));
		cars.add(new Coche("Fiat", "Doblo", 2000, 1500));

		potencia();
		marcaYModelo();
		mediaCaballos();
		cantidad("Ford");
		listMarca("Fiat");
		firtCar("Ford");
		lastCar("FORD");
	}

	// 1
	public static void potencia() {

		System.out.println("\n" + "1.-Coches de más de 100 cv de potencia: ");
		cars.stream().filter(x -> x.getPotencia() > 100).forEach(x -> System.out.println(x));
	}

	// 2
	public static void marcaYModelo() {

		System.out.println("\n" + "2.-Coches de marca Ford, modelo: F");
		cars.stream().filter(x -> x.getMarca().equals("Ford") && x.getModelo().startsWith("F-"))
				.forEach(System.out::println);
	}

	// 3
	public static void mediaCaballos() {
		System.out.println("\n" + "3. Media de los caballos de todos los coches:");
		System.out.println(Math.round(cars.stream().collect(Collectors.averagingInt(x -> x.getPotencia()))));

	}

	// 4
	public static void cantidad(String marca) {
		System.out.println("\n" + "4. Cantidad de coches de una marca en concreto:");
		System.out.println("Cantidad de vechículos de marca " + marca + ": " + cars.stream().filter(x -> x.getMarca().equalsIgnoreCase(marca)).count());
	
	}

	// 5  
	public static void listMarca(String marca) {
		System.out.println("\n" + "5.-Todos los coches diferentes de una marca:");		
		cars.stream().filter(x -> x.getMarca().equalsIgnoreCase(marca)).distinct().forEach(x -> System.out.println(x));
		
	
	}
	
	// 6
	private static void firtCar(String marca) {
		System.out.println("\n" + "6.-Primer coche de una marca:");		
		System.out.print(cars.stream().filter(x -> x.getMarca().equalsIgnoreCase(marca)).limit(1).collect(Collectors.toList()));		
		// 6b
		System.out.println("\n" + "6.b idem pero con findFist()");
		System.out.println(cars.stream().filter(x -> x.getMarca().equalsIgnoreCase(marca)).findFirst());
	}


	// 7
	private static void lastCar(String marca) {
		System.out.println("\n" + "7.-Ultimo coche de una marca:");			
		long size = cars.stream().filter(x -> x.getMarca().equalsIgnoreCase(marca)).count();
		System.out.println(cars.get((int) (size - 1)).toString());	
	}
}
