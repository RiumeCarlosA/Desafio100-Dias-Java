
class Fatura{
	private int nmr, qtdC;
	private double preco;
	private String descricao;
	public int getNmr() {
		return nmr;
	}
	public void setNmr(int nmr) {
		this.nmr = nmr;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public int getQtdC() {
		return qtdC;
	}
	public void setQtdC(int qtdC) {
		this.qtdC = qtdC;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	Fatura(int nmr, String descricao, int qtdC, double preco){
		if(qtdC >= 0) {
			this.qtdC = qtdC;
		}else {this.qtdC = 0;}
		this.descricao = descricao;
		this.nmr = nmr;
		if(preco >= 0) {
			this.preco = preco;
		}else {this.preco = 0;}
	}
	public double calcularFatura() {
		return qtdC*preco;
	}
		
}
public class Desafio_21 {

	public static void main(String[] args) {
		Fatura item1 = new Fatura(1, "capacete", 10, 59.99);
		double fatura1 = item1.calcularFatura();
		System.out.println("fatura do item 1 é de: " + fatura1);
		
	}

}
