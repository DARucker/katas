package Sprint3_T2_n3_DI;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IConexion iConexion1 = new ConexionMySQL("roo", "", "localhost");
		iConexion1.conectar();
		IConexion iConexion2 = new ConexionPostgre("usuario", "clave", "host");
		iConexion2.conectar();
	}

}
