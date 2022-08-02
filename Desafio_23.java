class Animal{
	private String nome;
	private int idade;
	private String som;
	private String acao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getAcao() {
		return acao;
	}
	public void emitirSom() {
		System.out.println(som);
	}
	public void emitirAcao() {
		System.out.println(acao);
	}
	public void emitirEspecie() {
		System.out.println("Animal");
	}
}
class Cachorro extends Animal{
	@Override
	public void emitirSom() {
		System.out.println("Au au ");
	}
	@Override
	public void emitirAcao() {
		System.out.println("Corre ");
	}
	@Override
	public void emitirEspecie() {
		System.out.println("Cachorro: ");
	}
}
class Cavalo extends Animal{
	@Override
	public void emitirSom() {
		System.out.println("iiirrrrí, rilinchin ");
	}
	@Override
	public void emitirAcao() {
		System.out.println("Corre ");
	}
	@Override
	public void emitirEspecie() {
		System.out.println("Cavalo: ");
	}
}
class Preguica extends Animal{
	@Override
	public void emitirSom() {
		System.out.println("Aaa aa ");
	}
	@Override
	public void emitirAcao() {
		System.out.println("Sobe em árvore ");
	}
	@Override
	public void emitirEspecie() {
		System.out.println("Preguiça: ");
	}
}
class Veterinario{
	public void examinar(Animal animal) {
		animal.emitirEspecie();
		animal.emitirSom();
	}
}
public class Desafio_23 {

	public static void main(String[] args) {
		Animal[] jaula = new Animal[10];
		Preguica preguica = new Preguica();
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica2 = new Preguica();
		Cachorro cachorro2 = new Cachorro();
		Cavalo cavalo2 = new Cavalo();
		Preguica preguica3 = new Preguica();
		Cachorro cachorro3 = new Cachorro();
		Cavalo cavalo3 = new Cavalo();
		Preguica preguica4 = new Preguica();
		Veterinario veterinario = new Veterinario();
		
		veterinario.examinar(preguica);
		veterinario.examinar(cavalo);
		veterinario.examinar(cachorro);
		
		jaula[0] = preguica;
		jaula[1] = cachorro;
		jaula[2] = cavalo;
		jaula[3] = preguica2;
		jaula[4] = cachorro2;
		jaula[5] = cavalo2;
		jaula[6] = preguica3;
		jaula[7] = cachorro3;
		jaula[8] = cavalo3;
		jaula[9] = preguica4;
		
		for(int i = 0; i < jaula.length; i++) {
			jaula[i].emitirEspecie();
			jaula[i].emitirAcao();
		}
	}

}
