interface Elevadores{
	void entra(int pessoa);
	void sai(int pessoa);
	void subir(int nmrAndar);
	void descer(int nmrAndar);
}
class Elevador implements Elevadores{
	private int capacidade, andares, pessoasNoElevador = 0, andarAtual = 0;
	Elevador(int capacidade, int andares){
		this.andares = andares;
		this.capacidade = capacidade;
	}
	public void entra(int pessoa) {
		for(int i = 0; i < pessoa; i++) {
			pessoasNoElevador++;
			if(pessoasNoElevador == capacidade) {
				throw new IllegalArgumentException("Não tem como mais uma pessoa antrar, o elevador está cheio"); 
			}
		}
		System.out.println("Entrou " + pessoa + " pessoas do elevador");
		System.out.println("Tem " + pessoasNoElevador + " pessoas no elevador");
	}
	public void sai(int pessoa) {
		for(int i = 0; i < pessoa; i++) {
			pessoasNoElevador--;
			if(pessoasNoElevador == 0) {
				throw new IllegalArgumentException("Não tem como mais uma pessoa sair, o elevador está vazio"); 
			}
		}
		System.out.println("Saiu " + pessoa + " pessoas do elevador");
		System.out.println("Tem " + pessoasNoElevador + " pessoas no elevador");
	}
	public void subir(int nmrAndar) {
		if(andarAtual >= andares) {
			throw new IllegalArgumentException("Não tem como subir, já está no último andar");
		}
		if(nmrAndar < andarAtual) {
			throw new IllegalArgumentException("Você selecionou um andar menor que está atualmente, você precisa chamar a função 'descer' ");
		}
		if(nmrAndar == andarAtual) {
			throw new IllegalArgumentException("Você já está neste andar ");
		}
		andarAtual = nmrAndar;
		System.out.println("Você apertou o " + nmrAndar + "º andar");
		System.out.println("Você está no andar " + andarAtual + "º andar");
	}
	public void descer(int nmrAndar) {
		if(andarAtual <= 0) {
			throw new IllegalArgumentException("Não tem como descer, já está no térreo");
		}
		if(nmrAndar > andarAtual) {
			throw new IllegalArgumentException("Você selecionou um andar maior que está atualmente, você precisa chamar a função 'subir' ");
		}
		if(nmrAndar == andarAtual) {
			throw new IllegalArgumentException("Você já está neste andar ");
		}
		andarAtual = nmrAndar;
		System.out.println("Você apertou o " + nmrAndar + "º andar");
		System.out.println("Você está no andar " + andarAtual + "º andar");
	}
}
public class Desafio_29 {
	static void criarElevador() {
		Elevador elevador = new Elevador(10, 8);
		elevador.entra(2);
		elevador.subir(3);
		elevador.sai(1);
		elevador.descer(2);
		elevador.sai(2);
		elevador.entra(4);
		elevador.descer(4);
	}
	public static void main(String[] args) {
		try {
			criarElevador();
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
