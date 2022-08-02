import java.util.Scanner;

class Midia{
	private int codigo;
	private double preco;
	private String nome;
	
	Midia(){
		
	}
	Midia(int codigo, double preco, String nome){
		this.codigo = codigo;
		this.preco = preco;
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return "Midia";
	}
	public String[] getDetalhes() {
		String[] detalhes = new String[4];
		String codigo = String.valueOf(this.codigo);
		String preco = Double.toString(this.preco);
		detalhes[0] = getTipo();
		detalhes[1] = this.nome;
		detalhes[2] = preco;
		detalhes[3] = codigo;
		
		return detalhes;
	}
	public void printDados() {
		String[] dados = getDetalhes();
		for(int i = 0; i < dados.length; i++) {
			System.out.println(dados[i]);
		}
	}
	public void inserirDados() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira os dados: ");
		
		System.out.println("nome: ");
		this.nome = entrada.next();
		System.out.println("preço: ");
		this.preco = entrada.nextDouble();
		System.out.println("Código: ");
		this.codigo = entrada.nextInt();
		entrada.close();
	}
}
class DVD extends Midia{
	private int faixas;
	DVD(){
		
	}
	public DVD(int codigo, double preco, String nome, int faixas) {
		super(codigo, preco, nome);
		this.faixas = faixas;	
	}
	public int getFaixas() {
		return faixas;
	}
	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}
	@Override
	public String getTipo() {
		return "DVD";
	}
	@Override
	public String[] getDetalhes() {
		String[] detalhes = new String[5];
		String codigo = String.valueOf(getCodigo());
		String preco = Double.toString(getPreco());
		String faixas = String.valueOf(this.faixas);
		detalhes[0] = getTipo();
		detalhes[1] = getNome();
		detalhes[2] = preco;
		detalhes[3] = faixas;
		detalhes[4] = codigo;
		
		return detalhes;
	}
	@Override
	public void inserirDados() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira os dados: ");
		
		System.out.println("nome: ");
		String nome = entrada.next();
		setNome(nome);
		System.out.println("preço: ");
		double preco = entrada.nextDouble();
		setPreco(preco);
		System.out.println("Código: ");
		int codigo = entrada.nextInt();
		setCodigo(codigo);
		System.out.println("Faixa: ");
		this.faixas = entrada.nextInt();
		
		entrada.close();
	}
}
class CD extends Midia{
	private int musicas;
	
	CD(){	
	}
	public CD(int codigo, double preco, String nome, int musicas) {
		super(codigo, preco, nome);
		this.musicas = musicas;
	}

	public int getMusicas() {
		return musicas;
	}

	public void setMusicas(int musicas) {
		this.musicas = musicas;
	}
	@Override
	public String getTipo() {
		return "CD";
	}
	@Override
	public String[] getDetalhes() {
		String[] detalhes = new String[5];
		String codigo = String.valueOf(getCodigo());
		String preco = Double.toString(getPreco());
		String musicas = String.valueOf(this.musicas);
		detalhes[0] = getTipo();
		detalhes[1] = getNome();
		detalhes[2] = preco;
		detalhes[3] = musicas;
		detalhes[4] = codigo;
		
		return detalhes;
	}
	@Override
	public void inserirDados() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira os dados: ");
		
		System.out.println("nome: ");
		String nome = entrada.next();
		setNome(nome);
		System.out.println("preço: ");
		double preco = entrada.nextDouble();
		setPreco(preco);
		System.out.println("Código: ");
		int codigo = entrada.nextInt();
		setCodigo(codigo);
		System.out.println("musicas: ");
		this.musicas = entrada.nextInt();
		
		entrada.close();
	}
	
}
public class Desafio_24 {

	public static void main(String[] args) {
		DVD dvd = new DVD();
		CD cd = new CD();
		cd.inserirDados();
		cd.printDados();
		
		dvd.inserirDados();
		dvd.printDados();
		
	}

}
