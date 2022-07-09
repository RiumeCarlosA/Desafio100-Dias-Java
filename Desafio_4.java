import java.util.Scanner;
import java.io.IOException;

public class Desafio_4 {
    public static void main(String args []) throws IOException{
        double resultado = 0, n1, n2;
        char operando = 's';
        Scanner entrada = new Scanner(System.in);

        while(operando != 'x'){
            System.out.println("============= Calculadora =============");
            System.out.println("| [+] Soma\n| [-] Subtração\n| [*] Multiplicação\n| [/] Divisão\n| [%] Porcentagem\n| [x] Sair ");
            System.out.println("Digite um número, operação e outro número");

            n1 = entrada.nextDouble();
            operando = (char)System.in.read();
            n2 = entrada.nextDouble();

            switch(operando){
                case '+':
                    resultado = n1 + n2;
                    break;
                case '-':
                    resultado = n1 - n2;
                    break;
                case '*':
                    resultado = n1 * n2;
                    break;
                case '/':
                    resultado = n1 / n2;
                    break;
                case '%':
                    resultado = (n1/100) * n2;
                    break;
                case 'x':
                    System.out.println("Até mais!");
                    break;
            }
            System.out.println(resultado);
        }
    }
}
