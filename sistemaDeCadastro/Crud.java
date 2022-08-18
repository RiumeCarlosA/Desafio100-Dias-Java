package sistemaDeCadastro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crud {
	public void InserirDados(String id, String nome, String email) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		String sql = "INSERT INTO cadastro "
				+ "(id, nome, email)"
				+ " VALUES (?, ?, ?);";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, id);
		stmt.setString(2, nome);
		stmt.setString(3, email);
		System.out.println(sql);
		stmt.execute();
	}
}
