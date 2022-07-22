import javax.swing.JFrame;
import javax.swing.JLabel;

public class Desafio_15{
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		
		frame.setTitle("Desafio Java");
		frame.setSize(500,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("Desafio dos 100 dias de programação Java");
		lb1.setBounds(100, 44, 300, 100);
		frame.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("Hoje já é o 15º Dia do desafio");
		lb2.setBounds(146, 104, 300, 100);
		frame.getContentPane().add(lb2);
		
		frame.setVisible(true);
	}
}