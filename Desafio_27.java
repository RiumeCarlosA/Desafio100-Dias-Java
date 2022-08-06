
public class Desafio_27 {
	public static void main(String[] args){
		System.out.println("Inicio do main");
		try {
			metodo1();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: está tentando colocar mais variaveis no array que o tamanho especificado do array");
		}
		System.out.println("Fim da main");
	}
	public static void metodo1() {
		System.out.println("Inicio do modulo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}
	public static void metodo2() {
		System.out.println("Inicio do metodo 2");
		int[] array = new int[10];
		for(int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
		}
		System.out.println("Fim do metodo 2");
	}

}
