package concesionario;

public class Coche {

	private String marca;
	private String modelo;
	private int cilindrada;
	private int potencia;
	
	public Coche(String marca, String modelo, int cilindrada, int potencia) {
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	@Override
	public String toString() {
		return "marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + ", potencia=" + potencia
				+ " ";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}

	
}
