package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		String usuario = "root";
		String senha = "jean5698";
		
		Connection conexao = DriverManager
				.getConnection(url, usuario, senha);
	
Statement stmt = conexao.createStatement();
stmt.execute("CREATE DATABASE IF NOT EXISTS curso");

System.out.println("Banco criado");
		conexao.close();
	}

}
