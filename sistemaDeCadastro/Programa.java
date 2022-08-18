package sistemaDeCadastro;

import java.sql.SQLException;

public class Programa {

	public static void main(String[] args) throws SQLException {
		Janela janela = new Janela();
		janela.criarJanela();
		Crud crud = new Crud();
		crud.InserirDados("01", "vanessa", "vanessacarlosa@gmail.com");
	}

}
