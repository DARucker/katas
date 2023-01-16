package Sprint3_T2_n2_callback;

public class CallbackPractice2 {

	public static void main(String[] args) {
	// Probamos primero sin meter un callback
		
		System.out.println(" --- Operation ");
		
		Adder adder = new Adder(127, 326);
		int result = adder.sum();
		
		System.out.println("Operation 127 + 326, result is "+result);
		
		System.out.println(" --- ");
		
		// Probamos ahora con callback
		System.out.println(" --- Operation ");

		Adder adder2 = new Adder(563, 646);
		adder2.setOnMathOperationPerformed(new OnMathOperationPerformed() {
			
			@Override
			public void onNumbersAdded() {
				System.out.println("Numbers added! This is a callback.");
			}
		});
		
		int result2 = adder2.sum();
		
		System.out.println("Operation 563 + 646, result is "+result2);
		System.out.println(" --- ");
	}

}

interface OnMathOperationPerformed {
	  void onNumbersAdded();
	}

class Adder {
	  
	private OnMathOperationPerformed onMathOperationPerformed;
	private int a, b;
	
	public Adder(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Lanza la operacion matematica, con llamada al callback al final 
	 * para notificar al lanzador de que ya se ha terminado la ejecucion
	 */
	public int sum() {
		int result = a + b;
		
		if (onMathOperationPerformed != null) {
			onMathOperationPerformed.onNumbersAdded();
		}		
		
		return result;
	}


	public OnMathOperationPerformed getOnMathOperationPerformed() {
		return onMathOperationPerformed;
	}


	public void setOnMathOperationPerformed(OnMathOperationPerformed onMathOperationPerformed) {
		this.onMathOperationPerformed = onMathOperationPerformed;
	}

}