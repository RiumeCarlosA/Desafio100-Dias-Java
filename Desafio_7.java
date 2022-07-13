import java.util.Scanner;

public class Desafio_7 {
    public static void main(String args[]){
        double juros, valor, valorTotal, valorDobro, jurosTotal;
        int i = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Coloque o valor inicial:");
        valor = entrada.nextDouble();
        System.out.println("Coloque o juros:");
        juros = entrada.nextDouble();

        juros = juros/100;
        valorDobro = valor*2;
        valorTotal = valor;

        while(valorDobro > valorTotal){
            jurosTotal = valorTotal*juros;
            valorTotal = valorTotal+jurosTotal;
            i++;
        }
        System.out.printf("A quantidade de anos necessário para dobrar o valor de %.2f com %.2f de juros é: %d anos", valor, juros*100, i);
        entrada.close();
    }
    
}
