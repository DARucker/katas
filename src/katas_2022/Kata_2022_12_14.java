package katas_2022;

public class Kata_2022_12_14 {

	public static void main(String[] args) {

		contadorMayusculas();
	}

	public static void contadorMayusculas() {
		String frase = "ola unTTTTdo undial del niVVverso";
		int contador = 0;

		for (int i = 0; i < frase.length(); i++) {
			Character ch = frase.charAt(i);
			if (Character.isUpperCase(ch)) {
				contador++;
			}
		}
		System.out.print(contador);

	}

}
