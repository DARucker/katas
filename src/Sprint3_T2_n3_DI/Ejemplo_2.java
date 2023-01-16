package Sprint3_T2_n3_DI;

public class Ejemplo_2 {

	public static void main(String[] args) {

		IEquipo iEquipo1 = new Barcelona();
			
		Messi messi = new Messi(iEquipo1);
		messi.mostrarEquipo();
	}

}

class Messi {

	private IEquipo iEquipo;

	public Messi(IEquipo iEquipo) {
		this.iEquipo = iEquipo;
	}

	public void mostrarEquipo() {
		iEquipo.mostrar();
	}

}

interface IEquipo {
	void mostrar();
}

class Barcelona implements IEquipo {

	@Override
	public void mostrar() {

		System.out.println("FC Barcelona");
	}

}