import java.util.Random;

public class Desafio_10 {
    public static void main(String args[]){
        int valor[] = new int[6];
        int lado;
        Random dado = new Random();
        for(int i = 0; i < 100; i++){
            lado = (dado.nextInt(6) + 1);
            if(lado % 2 == 0){
                if(lado == 2){valor[1] = valor[1] + 1;}
                    if(lado == 4){valor[3] = valor[3]+ 1;}
                        else{valor[5] = valor[5]+ 1;}
            }if(lado == 1){valor[0] = valor[0]+ 1;}
                if(lado == 3){valor[2] = valor[2]+ 1;}
                    else{valor[4] = valor[4]+ 1;}
        }
        System.out.printf("O lado com valor 1 caiu: %d\n"+ 
                            "O lado com valor 2 caiu: %d\n"+ 
                            "O lado com valor 3 caiu: %d\n"+ 
                            "O lado com valor 4 caiu: %d\n"+ 
                            "O lado com valor 5 caiu: %d\n"+
                            "O lado com valor 6 caiu: %d\n", valor[0],valor[1], valor[2],valor[3],valor[4],valor[5]);
    }
}
