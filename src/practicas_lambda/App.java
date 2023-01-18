package practicas_lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class App {

	public static void main(String[] args) {


		
		Imprimir imp = (s) -> System.out.println(s);
		imp.print("hello world");
		
		
		Imprimir2 imp2 = () -> System.out.println("ecode");
		imp2.print(); // el metodo no recibe parametros
		
		Imprimir imp1 = System.out::println;
		imp1.print("bye bye world");
		
		imp.print("hola a tothom");
		
		
		Supplier<Double> prueba = () -> 1.08;
		System.out.println(prueba.get());

		Prueba prueba1 = () -> 1.08;
		System.out.println(prueba1.exRateUsd());
		
		
		Exchange fx = (double a) -> (a * 1.08); 
		System.out.println(fx.exchangeUsd(5));
		probarFxUsd(1.08, fx);
		
		Operacion op = (a,b) -> a+b; // infiere los tipos double
		float res = op.operacion(2, 3);
		System.out.println(res);
		System.out.println(op.operacion(7, 1));
		probarOperacion(12, 3, op);
		
		Operacion opResta = (a,b) -> a-b; // infiere los tipos double
		probarOperacion(12, 3, opResta);
		
		Operacion instancia = new Operacion() {

			@Override
			public float operacion(float a, float b) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		
		
		Minusculas m = (s -> s.toLowerCase());
		System.out.println(m.minusculas("Hola"));
		
		Minusculas m1 = (s -> s.toUpperCase());
		System.out.println(m1.minusculas(m.minusculas("Aa")));
		
		probarImpresion("Dale Globo", imp1);
	}
	
	private static void probarOperacion2(int i, int j, Operacion operacion) {
		
		System.out.println("que hace esta operacion? " + operacion.operacion(6, 2));
		
	}

	private static void probarFxUsd(double d, Exchange fx) {
		System.out.println("\n" + "prueba pasando por parametro el obj fx. Resultado: " + fx.exchangeUsd(10));
		
	}

	public static void probarImpresion(String s, Imprimir imprimirNoImplementado) {
		System.out.println("\n" + "prueba pasando por parametro el obj imp");
		imprimirNoImplementado.print(s);
	}

	public static void probarOperacion(int a, int b, Operacion op) {
		System.out.println("\n" + "prueba pasando por parametro el obj operacion. Resultado: " + op.operacion(a, b));
	}
	
}




 interface Imprimir{
	void print(String s);
}
 
 interface Imprimir2{
	void print();
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
 
 