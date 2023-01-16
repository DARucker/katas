package Sprint3_T2_n3_DI;

public class ConexionMySQL implements IConexion{

	

	private String usuario;
	private String clave;
	private String host;

	public ConexionMySQL(String usuario, String clave, String host) {
		this.usuario = usuario;
		this.clave = clave;
		this.host = host;
	}

	@Override
	public void conectar() {
		System.out.println("Conectando a MySQL");
	}
}
