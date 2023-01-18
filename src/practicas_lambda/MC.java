package practicas_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MC {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		lista.add("Lionel");
		lista.add("Julian");
		lista.add("Dibu");
		
		lista.forEach(s -> System.out.print(s + " "));
		
		Collections.sort(lista, (s1, s2) -> s1.compareTo(s2));
		lista.forEach(s -> System.out.print(s + " "));
		Collections.sort(lista);
		lista.forEach(s -> System.out.print(s + " "));
	
		// version sin Lambda
		Collections.sort(lista, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
		
		
	}

}



