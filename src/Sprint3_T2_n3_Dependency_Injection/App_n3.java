package Sprint3_T2_n3_Dependency_Injection;

import java.util.ArrayList;
import java.util.List;

public class App_n3 {

	/*
	 * Diseña una clase que muestre en pantalla el precio de 
	 * varios artículos. Ya que tendrá que mostrarlos también 
	 * en varios tipos de moneda.
	 * 
	 * Asegúrate de añadirle como Inyección de Dependencia 
	 * una clase Conversor de Moneda que efectúe la corrección
	 *  del precio en función del cambio de divisa.
	 */
	
	public static void main(String[] args) {

		IRates iRate;
		
		System.out.println("\n" + "Lista de precios convertida a Dolar" + "\n");
		iRate = new ExchangeRateDolar();
		callPriceConverter(iRate);
		
		System.out.println("\n" + "Lista de precios convertida a Pesos" + "\n");
		iRate = new ExchangeRatePesoArg();
		callPriceConverter(iRate);
		
		System.out.println("\n" + "Lista de precios convertida a Yenes" + "\n");
		iRate = new ExchangeRateYen();
		callPriceConverter(iRate);
		
	}
	
	public static void callPriceConverter(IRates iRate) {
		
		ConvertPrice cp = new ConvertPrice(iRate);
		cp.priceConverted();
		
	}
	
}
