package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {

		public static Connection getConexao() {
			try {
				String url = "jdbc:mysql://localhost/curso?verifyServerCertificate=false&useSSL=true";
				String usuario = "root";
				String senha = "123321";
				
				return DriverManager.getConnection(url, usuario, senha);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		
	}
			

}
