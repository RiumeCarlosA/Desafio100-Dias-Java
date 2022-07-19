import javax.swing.JOptionPane;

public class Desafio_12{
	public static void main(String args[]) {		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite mais um numero"));
		
		int soma = n1 + n2;
		JOptionPane.showMessageDialog(null, "A soma dos numeros é: "+ soma);
	}
}