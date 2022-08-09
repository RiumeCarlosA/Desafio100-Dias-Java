import java.util.ArrayList;

abstract class FiguraPlana{
	protected double tam, lado, area, perimetro;
	public double getArea() {
		return area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public double getTam() {
		return tam;
	}
	public void setTam(double tam) {
		this.tam = tam;	
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double perimetro(double tam, double lado) {
		setLado(lado);
		setTam(tam);
		this.perimetro = tam * lado;
		return tam * lado;
	}
	public abstract double area(double tam, double lado);
}
class Quadra extends FiguraPlana{
	@Override
	public double area(double tam, double lado) {
		if(lado != 4) {
			throw new IllegalArgumentException("Erro, não se pode criar um quadrado com lado diferente de 4");
		}
		setLado(lado);
		setTam(tam);
		this.area = tam * tam;
		return tam * tam;
	}
}
class Triangulo extends FiguraPlana{
	@Override
	public double area(double tam, double lado) {
		if(lado != 3) {
			throw new IllegalArgumentException("Erro, não se pode criar um triangulo com lado diferente de 3");
		}
		setLado(lado);
		setTam(tam);
		this.area = ((tam*tam)*1.73)/4;
		return ((tam*tam)*1.73)/4;
	}
}
class Losangulo extends FiguraPlana{
	double diagonalMaior, diagonalMenor;
	public double getDiagonalMaior() {
		return diagonalMaior;
	}
	public void setDiagonalMaior(double diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
	}
	public double getDiagonalMenor() {
		return diagonalMenor;
	}
	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	@Override
	public double area(double diagonalMaior, double diagonalMenor) {
		setDiagonalMaior(diagonalMaior);
		setDiagonalMenor(diagonalMenor);
		this.area = (diagonalMaior*diagonalMenor)/2;
		return (diagonalMaior*diagonalMenor)/2;
	}	
}
class Circulo extends FiguraPlana{
	private double raio;
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public double area(double raio, double lado) {
		setRaio(raio);
		this.area = (raio * raio)* 3.14;
		return (raio * raio)* 3.14;
	}
	@Override
	public double perimetro(double raio, double lado){
		setRaio(raio);
		this.perimetro = 2*(3.14*raio);
		return 2*(3.14*raio);
	}
}
public class Desafio_28 {
	public static double[] somarFiguras(ArrayList<FiguraPlana> lista) {
		double [] soma = new double[2];
		//posição 0 fica a soma dos perimetros e a posição 1 a soma das areas
		for(FiguraPlana i : lista) {
			soma[0] = i.getPerimetro();
			soma[1] = i.getArea();
		}
		return soma;
	}
	public static void criarFiguras() {
		ArrayList<FiguraPlana> lista = new ArrayList<FiguraPlana>();
		//primeiro parâmetro é o tamanho do lado, segundo parametro a quantidade de lados
		
		FiguraPlana quadrado = new Quadra();
		quadrado.area(3, 4);
		quadrado.perimetro(3, 4);
		lista.add(quadrado);
		
		FiguraPlana triangulo = new Triangulo();
		triangulo.area(3, 3);
		triangulo.perimetro(3,3);
		lista.add(triangulo);
		
		FiguraPlana losangulo = new Losangulo();
		losangulo.area(4, 4);
		losangulo.perimetro(4, 4);
		lista.add(losangulo);
		
		//somente pode passar o primeiro argumento, que será o raio
		FiguraPlana circulo = new Circulo();
		circulo.area(5, 0);
		circulo.perimetro(5, 0);
		lista.add(circulo);
		
		double[] soma = somarFiguras(lista);
		System.out.println("A soma do perimetro das figuras é: " + soma[0]);
		System.out.println("A soma da área das figuras é: " + soma[1]);
	}
	public static void main(String[] args) {
		try {
			criarFiguras();
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
