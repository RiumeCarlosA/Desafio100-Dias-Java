import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

interface OperacaoMatematica{
	int calcula(int a, int b);
}
class Soma implements OperacaoMatematica{
	@Override
	public int calcula(int a, int b) {
		return (a + b);
	}
}
class Subtracao implements OperacaoMatematica{
	@Override
	public int calcula(int a, int b) {
		return (a - b);
	}
}
class Multiplicacao implements OperacaoMatematica{
	@Override
	public int calcula(int a, int b) {
		return (a * b);
	}
}
class Divisao implements OperacaoMatematica{
	@Override
	public int calcula(int a, int b) {
		return (a / b);
	}
}
public class Desafio_26 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Soma soma = new Soma();
		Subtracao subtracao = new Subtracao();
		Multiplicacao multiplicacao = new Multiplicacao();
		Divisao divisao = new Divisao();

		frame.setTitle("Desafio Java");
		frame.setSize(300,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel jl1 = new JLabel("Digite o primeiro número");
		jl1.setBounds(50, 15, 200, 20);
		frame.add(jl1);
		
		JTextField tf1 = new JTextField(20);
		tf1.setBounds(50, 40, 200, 20);
		frame.add(tf1);
		
		JLabel jl2 = new JLabel("Digite o segundo número");
		jl2.setBounds(50, 65, 200, 20);
		frame.add(jl2);
		
		JTextField tf2 = new JTextField(20);
		tf2.setBounds(50, 90, 200, 20);
		frame.add(tf2);
		
		JTextField tf3 = new JTextField(20);
		tf3.setBounds(50, 130, 200, 20);
		frame.add(tf3);
		
		JButton bt1 = new JButton("+");
		bt1.setBounds(50, 170, 35, 35);
		bt1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				String s1 = tf1.getText();
				int n1 = Integer.parseInt(s1);
				String s2 = tf2.getText();
				int n2 = Integer.parseInt(s2);
				tf3.setText(String.valueOf(soma.calcula(n1, n2)));
			}
			
		});
		frame.add(bt1);
		
		JButton bt2 = new JButton("-");
		bt2.setBounds(105, 170, 35, 35);
		bt2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				String s1 = tf1.getText();
				int n1 = Integer.parseInt(s1);
				String s2 = tf2.getText();
				int n2 = Integer.parseInt(s2);
				tf3.setText(String.valueOf(subtracao.calcula(n1, n2)));
			}
			
		});
		frame.add(bt2);
		
		JButton bt3 = new JButton("X");
		bt3.setBounds(160, 170, 35, 35);
		bt3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				String s1 = tf1.getText();
				int n1 = Integer.parseInt(s1);
				String s2 = tf2.getText();
				int n2 = Integer.parseInt(s2);
				tf3.setText(String.valueOf(multiplicacao.calcula(n1, n2)));
			}
			
		});
		frame.add(bt3);
		
		JButton bt4 = new JButton("/");
		bt4.setBounds(215, 170, 35, 35);
		bt4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				String s1 = tf1.getText();
				int n1 = Integer.parseInt(s1);
				String s2 = tf2.getText();
				int n2 = Integer.parseInt(s2);
				tf3.setText(String.valueOf(divisao.calcula(n1, n2)));
			}
			
		});
		frame.add(bt4);
		
		frame.setVisible(true);
	}

}
