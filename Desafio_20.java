
class Livro{
	String titulo;
	private int qtdPaginas;
	private int paginasLidas;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getQtdPaginas() {
		return qtdPaginas;
	}
	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	public int getPaginasLidas() {
		return paginasLidas;
	}
	public void setPaginasLidas(int paginasLidas) {
		this.paginasLidas = paginasLidas;
	}
	double verificarProgresso() {
		return (this.paginasLidas*100)/this.qtdPaginas;
	}
}
public class Desafio_20 {

	public static void main(String[] args) {
		Livro pequenoPrincipe = new Livro();
		pequenoPrincipe.setTitulo("Pequeno Principe");
		String titulo = pequenoPrincipe.getTitulo();
		pequenoPrincipe.setQtdPaginas(98);
		int qtdPag = pequenoPrincipe.getQtdPaginas();
		System.out.println("O livro " + titulo + " possui " + qtdPag + " páginas");
		pequenoPrincipe.setPaginasLidas(20);
		double pagL = pequenoPrincipe.verificarProgresso();
		System.out.println("Seu progresso do livro " + titulo + " é de: " + pagL);
		pequenoPrincipe.setPaginasLidas(50);
		pagL = pequenoPrincipe.verificarProgresso();
		System.out.println("Seu progresso do livro " + titulo + " é de: " + pagL);
		
	}

}
