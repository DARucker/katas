package practicas_lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class App {

	public static void main(String[] args) {

		Imprimir imp = (s) -> System.out.println(s);
		imp.print("hello world");
		
		Imprimir imp1 = System.out::println;
		imp1.print("bye bye world");
		
		imp.print("hola a tothom");
		
		
		Supplier<Double> prueba = () -> 1.08;
		System.out.println(prueba);

		Prueba p1 = () -> 1.08;
		System.out.println(p1.exRateUsd());
		
		Exchange fx = (double a) -> (a * 1.08); 
		System.out.println(fx.exchangeUsd(5));
		
		
		Operacion op = (a,b) -> a+b; // infiere los tipos double
		float res = op.operacion(2, 3);
		System.out.println(res);
		System.out.println(op.operacion(7, 1));
		
		Minusculas m = (s -> s.toLowerCase());
		System.out.println(m.minusculas("Hola"));
		
		Minusculas m1 = (s -> s.toUpperCase());
		System.out.println(m1.minusculas(m.minusculas("Aa")));
		
	}
	
}


 interface Imprimir{
	void print(String s);
}
 
 interface Prueba{
	double exRateUsd ();
}
 
 interface Exchange{
	double exchangeUsd (double a);
}
 
 interface Operacion{
	 
	 float operacion (float a, float b);
	 
 }
 
 interface Minusculas{
	 String minusculas(String s);
 }
 
 