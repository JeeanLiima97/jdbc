package teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		String usuario = "root";
		String senha = "jean5698";
		
		Connection conexao = DriverManager
				.getConnection(url, usuario, senha);
	
		System.out.println("Conexão com Sucesso");
		
		conexao.close();
	}

}
