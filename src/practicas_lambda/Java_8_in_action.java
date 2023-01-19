package practicas_lambda;

public class Java_8_in_action {

	public static void main(String[] args) {

	
		Comparator<Apple> byWeight = new Comparator<Apple>() {

			@Override
			public int compare(Apple o1, Apple o2) {
				// TODO Auto-generated method stub
				return 0;
			}

		};
		
		Comparator<Apple> byWeight1 =
			    (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
	}
}
		
interface Comparator<T> {
    public int compare(T o1, T o2);
}

class Apple{
	String color;
	int weight;
	
	public String getWeight() {
		// TODO Auto-generated method stub
		return null;
	}
}