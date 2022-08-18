package sistemaDeCadastro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crud {
	private Connection conexao = FabricaConexao.getConexao();
	public void inserirDados(String id, String nome, String email) throws SQLException {
		String sql = "INSERT INTO cadastro "
				+ "(id, nome, email)"
				+ " VALUES (?, ?, ?);";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, id);
		stmt.setString(2, nome);
		stmt.setString(3, email);
		stmt.execute();
	}
	public void excluirDados(String id, String nome) throws SQLException{
		String sql = "DELETE FROM cadastro WHERE id  = ? and nome = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, id);
		stmt.setString(2, nome);
		stmt.execute();
	}
	public void alterarDados(String id, String nome, String email) throws SQLException{
		String sql = "UPDATE cadastro SET nome = ?, email = ? WHERE id  = ?; ";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.setString(2, email);
		stmt.setString(3, id);
		stmt.execute();
	}
}
