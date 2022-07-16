import java.util.Scanner;

public class Desafio_9 {
    static float[][] dimencionarVetorFloat(int tamanho, float[][] vetor1){
        float vetor2[][] = new float[tamanho+1][5];
        int i, j;
        for(i = 0; i<tamanho; i++){
            j = 0;
            vetor2[i][j] = vetor1[i][j];
            for(j = 0; j < 5; j++){
                vetor2[i][j] = vetor1[i][j];
            }
        }
        return vetor2;
    }
    static String[] dimencionarVetorString(int tamanho, String vetor1[]){
        String vetor2[] = new String[tamanho+1];
        for(int i = 0; i < tamanho; i++){
            vetor2[i] = vetor1[i];
        }
        return vetor2;
    }

    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        float notas[][] = new float[1][5];
        String disciplina[] = new String [1];
        int i = 0;

        System.out.println("Digite a disciplina e as notas dos 4 bimestres: ");

        while(continuar){
            disciplina[i] = entrada.next();
            continuar = (disciplina[i].equals("sair")) ? false : true;
            if(continuar == false){break;}
            for(int j = 0; j < 5; j++){
                notas[i][j] = (j == 4) ? (notas[i][0]+notas[i][1]+notas[i][2]+notas[i][3])/4 : entrada.nextFloat();
            }
            i++;
            disciplina = dimencionarVetorString(i, disciplina);
            notas = dimencionarVetorFloat(i, notas);
            System.out.println("Digite a próxima disciplina, e a nota dos 4 bimestres: ");
        }
        entrada.close();
        for(i = 0; i < disciplina.length; i++){
            System.out.printf("\n"+disciplina[i]+":   ");
            if(disciplina[i].equals("sair")){
                System.out.println("Até mais!");
                break;
            }
            for(int j = 0; j < 5; j++){
                if(j < 5){
                    System.out.printf(notas[i][j]+" - ");
                }if(j == 5){
                    System.out.printf(" --- " + notas[i][j]);
                }
            }
        }
    }
}
