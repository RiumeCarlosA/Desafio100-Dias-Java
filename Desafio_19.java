import java.util.Calendar;
import java.util.Scanner;

class Pessoa{
	int idade = 0;
	int[] data = new int[3];
	String nome;
	
	void calculaIdade() {
		Calendar calendario = Calendar.getInstance();
		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		int mes = calendario.get(Calendar.MONTH);
		int ano = calendario.get(Calendar.YEAR);
		this.idade = (ano - data[2])-1;
		if(data[1] - mes < 0) {
			this.idade++;
		}
		if(data[1] == mes) {
			if(data[0] - dia < 0) {
				this.idade++;
			}
		}
		
	}
	int informaIdade() {
		return this.idade;
	}
	String informaNome() {
		return this.nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	void ajustarDataDeNascimento(int[] data) {
		for(int i = 0; i < 3; i++) {
			this.data[i] = data[i];
		}
	}
	
}
public class Desafio_19 {

	public static void main(String[] args) {
		int[] data = new int[3];
		int[] data2 = new int[3];
		
		System.out.println("Digite a idade da primeira pessoa e da segunda pessoa");
		
		Pessoa Albert = new Pessoa();
		Scanner entrada = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			data[i] = entrada.nextInt();		
		}
		Albert.setNome("Albert Einstein");
		Albert.ajustarDataDeNascimento(data);
		Albert.calculaIdade();
		int idadeA = Albert.informaIdade();
		String nomeA = Albert.informaNome();
		System.out.println("Idade de " + nomeA + " é: " + idadeA);
		
		Pessoa Issac = new Pessoa();
		for(int i = 0; i < 3; i++) {
			data2[i] = entrada.nextInt();		
		}
		Issac.setNome("Issac Newton");
		Issac.ajustarDataDeNascimento(data2);
		Issac.calculaIdade();
		int idadeI = Issac.informaIdade();
		String nomeI = Issac.informaNome();
		System.out.println("Idade de " + nomeI + " é: " + idadeI);
		System.out.println("Idade de " + nomeA + " é: " + idadeA);
	}

}
