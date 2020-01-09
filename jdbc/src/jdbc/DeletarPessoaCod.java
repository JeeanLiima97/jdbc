package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletarPessoaCod {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o codigo da pessoa para ser deletado");
		String codigo = sc.nextLine();

		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE CODIGO = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, codigo);
		
		if (stmt.executeUpdate()>0){
			System.out.println("Pessoa exluida com sucesso");
		}else {
			System.out.println("Falha ao encontrar o registro");
		}
		stmt.close();
		conexao.close();
	}

}
