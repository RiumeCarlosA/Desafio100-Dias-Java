import java.util.Scanner;

public class Desafio_8 {
    static int[] coletarVetor(){
        int A[] = new int [10];
        int B[] = new int [10];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < A.length; i++){
            A[i] = entrada.nextInt();
            if(A[i]%2 == 0){
                B[i] = A[i]*5;
            }else{
                B[i] = A[i]+5;
            }
        }
        entrada.close();
        return B;
    }
    static void imprimirVetor(int vetor[]){
        for (int i : vetor){   
            System.out.printf("%d ", i);
        }
    }
    public static void main(String args []){
        System.out.println("Digite 10 valores:");
        int vetor[] = coletarVetor();
        imprimirVetor(vetor);
    }
}
