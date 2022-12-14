package katas_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EjerciciosLambda {

	// https://www.ecodeup.com/entendiendo-paso-a-paso-las-expresiones-lambda-en-java/
	
	List<String> listaStrings;
	
	public static void main(String[] args) {
		EjerciciosLambda e = new EjerciciosLambda();
		e.ejercicios();
	}

	public void ejercicios() {
		listaStrings = new ArrayList<>();
		listaStrings.addAll(Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "Junio", "Julio", "agosto",
				"septiembre", "octubre", "noviembre", "diciembre"));
		
		/*
		A partir de una lista de Strings, escribe un método que devuelve una 
		lista de todas las cadenas que contienen la letra ‘o’. Imprime el resultado.
		*/
		System.out.println("Ejercicio 1" + "\n");
		listaStrings.stream()
			.filter (s -> s.contains("o"))
			.forEach(s -> System.out.print(s + " "));
		System.out.println("\n");
		
		/*
		 Tienes que hacer lo mismo que en el punto anterior, pero ahora, 
		 el método debe devolver una lista con los Strings que además 
		 de contener la letra “o” también tienen más de 5 letras. 
		 Imprime el resultado.
		
		 */
		
		System.out.println("Ejercicio 2" + "\n");
		listaStrings.stream()
			.filter(s -> s.contains("o") 
			&& s.length() > 5)
			.forEach(s -> System.out.print(s + " "));
		System.out.println("\n");
		/*
		 * Crea una llista amb els noms dels mesos de l’any. Imprimeix tots 
		 * els elements de la llista amb una lambda.
		 */
		System.out.println("Ejercicio 3" + "\n");
		listaStrings.forEach(s -> System.out.print(s + " "));
		System.out.println("\n");
		/*
		Realizar la misma impresión del punto anterior, 
		pero mediante method reference.
		*/
		System.out.println("Ejercicio 4" + "\n");
		listaStrings.forEach(System.out::print);
		
		/*
		Crea una Functional Interface con un método llamado 
		getPiValue() que debe devolver un double. 
		Desde el main() de la clase principal, instancia 
		la interfaz y asíñale el valor 3.1415. Invoca el 
		método getPiValue() e imprime el resultado.
		*/
	
	}
}
