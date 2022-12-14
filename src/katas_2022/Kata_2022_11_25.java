package katas_2022;

public class Kata_2022_11_25 {

	public static void main(String[] args) {
		
		int posicionPar = 0;
		int posicionImpar = 19;
		int[] numeros = new int[20];
		
		for(int i=0; i<20; i++) {
			
			int numero = (int) (Math.random() * 100);
			
			if(numero % 2 == 0) {
				numeros[posicionPar] = (int) numero;
				posicionPar++;
			}else {
				numeros[posicionImpar] = (int) numero;
				posicionImpar--;
			}
		}
		int posicion = 1;
		for (int j : numeros) {
			System.out.println("posicion " + posicion + " valor " + j);
			posicion++;
		}
		
	}

}
