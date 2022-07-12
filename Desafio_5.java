import java.util.Scanner;

public class Desafio_5{

    static double impostoDeRenda (double salario){
        double desconto, descontoTotal = 1;

        if(salario <= 1903.98){
            
        }
            if(salario >= 1903.98 && salario <= 2826.65){
                desconto = 7.5 / 100;
                descontoTotal = salario * desconto;
            }   
                if(salario >= 2826.66 && salario <= 3751.05){
                    desconto = 15 / 100;
                    descontoTotal = salario * desconto;
                }
                    if(salario >= 3751.06 && salario <= 4664.68){
                        desconto = 22.5 / 100;
                        descontoTotal = salario * desconto;
                    }
                        if(salario > 4664.68){
                            desconto = 27.5 / 100;
                            descontoTotal = salario * desconto;
                        }   

        return descontoTotal;
    }
    static double INSS (double salario){
        double desconto = 0, descontoTotal = 1;

        if(salario <= 1212.00){
            desconto = 0.075;
            descontoTotal = salario * desconto;
        }
            if(salario >= 1212.01 && salario <= 2427.35){
                desconto = 0.09;
                descontoTotal = salario * desconto;
            }
                if(salario >= 2427.36 && salario <= 3641.06){
                    desconto = 0.12;
                    descontoTotal = salario * desconto;
                }
                    if(salario >= 3641.07 && salario <= 7087.22){
                        desconto = 0.14;
                        descontoTotal = salario * desconto;
                    }
        return descontoTotal;
    }
    public static void main(String args []){
        double salarioLiquido, salarioBruto, salario, descontoIR, descontoINSS, FGTS, sindicato, descontoSindicato, totalDescontos;
        int horas;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a carga horaria mensal:");
        horas = entrada.nextInt();
        System.out.println("Digite o valor da hora:");
        salario = entrada.nextDouble();

        salarioBruto = horas * salario;
        descontoIR = impostoDeRenda(salarioBruto);
        descontoINSS = INSS(salarioBruto);
        FGTS = 0.08 * salarioBruto;
        sindicato = 0.03;
        descontoSindicato = sindicato * salarioBruto;
        totalDescontos = descontoINSS + descontoIR + descontoSindicato;
        salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf(
		  "Salário bruto: (%.2f X %d)..................R$ %.2f \n"+
          "(-) Imposto de Renda:......................R$ %.2f \n"+
          "(-) INSS..................................R$ %.2f \n"+
          "FGTS......................................R$ %.2f \n"+
          "Total de descontos........................R$ %.2f \n"+
          "Salário líquido...........................R$ %.2f",
		  salario, horas, salarioBruto, descontoIR, descontoINSS, FGTS, totalDescontos, salarioLiquido);

    }
}