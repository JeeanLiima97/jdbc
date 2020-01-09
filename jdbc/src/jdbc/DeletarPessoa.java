package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class DeletarPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o nome da pessoa para ser deletado");
		String pesquisa = sc.nextLine();
		
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE nome = ?";
		
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, pesquisa );
		if(stmt.executeUpdate()>0) {
			System.out.println("Pessoa Exluida");
		}else {
			System.out.println("Registro não encontrado");
		}
		stmt.close();
		conexao.close();
		
	}
}
