import java.util.Scanner;

class PoligonoRegular{
	protected int numLado;
	protected double tamLado;
	
	public PoligonoRegular(double tamLado, int numLado){
		this.numLado = numLado;
		this.tamLado = tamLado;
	}
	public int getNumLados() {
		return numLado;
	}
	public double getTamLado() {
		return tamLado;
	}
	public double calcularPerimetro() {
		return tamLado*numLado;
	}
	public double calcularArea() {
		throw new IllegalArgumentException("Não se pode calcular área de um poligono regular!");
	}
	public double calcularAngulo() {
		return (numLado-2)*180;
	}
}
class TrianguloEq extends PoligonoRegular{
	public TrianguloEq(double tamLado, int numLado) {
		super(tamLado, numLado);
		if(numLado != 3) {
			throw new IllegalArgumentException("Erro, não se pode criar um Triangulo com lado diferente de 3");
		}
	}
	@Override
	public double calcularArea() {
		return ((tamLado*tamLado)*1.73)/4;
	}
	@Override
	public double calcularAngulo() {
		return 180/numLado;
	}
}
class Quadrado extends PoligonoRegular{
	public Quadrado(double tamLado, int numLado) {
		super(tamLado, numLado);
		if(numLado != 4) {
			throw new IllegalArgumentException("Erro, não se pode criar um quadrado com lado diferente de 4");
		}
	}
	@Override
	public double calcularArea() {
		return numLado*numLado;
	}
	@Override
	public double calcularAngulo() {
		return 360/numLado;
	}
}
public class Desafio_22 {

	static void calcularFiguraGeometrica() throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		double resultado = 0;
		int j = 0;
		while(true) {
			System.out.println("Digite qual figura geometrica você deseja fazer operações");
			System.out.println("Poligono......................[1]");
			System.out.println("Triângulo......................[2]");
			System.out.println("Quadrado......................[3]");
			System.out.println("Sair..........................[4]");
			int i = entrada.nextInt();
			System.out.println("Digite quantidade de lados");
			int lado = entrada.nextInt();
			System.out.println("Digite o tamanho dos lados");
			int tamanho = entrada.nextInt();
			switch(i) {
				case 1:
					PoligonoRegular poligono = new PoligonoRegular(tamanho, lado);
					System.out.println("Área..........................[1]");
					System.out.println("Perímetro..........................[2]");
					System.out.println("Ângulo..........................[3]");
					System.out.println("Sair..........................[4]");
					j = entrada.nextInt();
					switch(j) {
						case 1: resultado = poligono.calcularArea(); break;
						case 2: resultado = poligono.calcularPerimetro(); break;
						case 3: resultado = poligono.calcularAngulo(); break;
						case 4: System.exit(0); break;
					}
					break;
				case 2:
					TrianguloEq triangulo = new TrianguloEq(tamanho, lado);
					System.out.println("Área..........................[1]");
					System.out.println("Perímetro..........................[2]");
					System.out.println("Ângulo..........................[3]");
					System.out.println("Sair..........................[4]");
					j = entrada.nextInt();
					switch(j) {
						case 1: resultado = triangulo.calcularArea(); break;
						case 2: resultado = triangulo.calcularPerimetro(); break;
						case 3: resultado = triangulo.calcularAngulo(); break;
						case 4: System.exit(0);break;
					}
					break;
				case 3:
					Quadrado quadrado = new Quadrado(tamanho, lado);
					System.out.println("Área..........................[1]");
					System.out.println("Perímetro..........................[2]");
					System.out.println("Ângulo..........................[3]");
					System.out.println("Sair..........................[4]");
					j = entrada.nextInt();
					switch(j) {
						case 1: resultado = quadrado.calcularArea(); break;
						case 2: resultado = quadrado.calcularPerimetro(); break;
						case 3: resultado = quadrado.calcularAngulo(); break;
						case 4: System.exit(0); break;
					}
					break;
				
				case 4: System.exit(0); break;
				}
				System.out.println("O resultado é: " + resultado + "\n\n\n\n\n\n");
				Thread.sleep(10);
			}
	}
	public static void main(String[] args) throws InterruptedException {
		calcularFiguraGeometrica();
	}

}
