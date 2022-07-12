import java.util.Scanner;

public class Desafio_6 {
    static void Tabuada(int inicio, int fim, int valor){
        int resultado = 0;
        for(int i = inicio; i <= fim; i++){
            resultado = i * valor;
            System.out.printf("%d x %d = %d\n", valor, i, resultado);
        }
    }
    public static void main(String args[]){
        int resultado, inicio, fim, tabuada;
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite qual tabuada deseja");
        tabuada = entrada.nextInt();
        System.out.println("digite em qual numero começar");
        inicio = entrada.nextInt();
        System.out.println("digite em qual numero terminar");
        fim = entrada.nextInt();
        Tabuada(inicio, fim, tabuada);

    }
}
