import java.util.Scanner;


public class Desafio_3{
    static double hexagono(float comprimento) {
        double lateral, area;
        lateral = comprimento;
        area = ((lateral*lateral)*6)/(4*Math.tan((Math.PI)/6));
        return area;
    }
    public static void main(String args []){
        Scanner entrada = new Scanner(System.in);   
        float lado;
        double area;

        System.out.println("Coloque o comprimento do lado do hexagono\n");
        lado = entrada.nextFloat();

        area = hexagono(lado);

        System.out.println("A area do hexagono e: " + area);

    }
}