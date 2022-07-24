import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Desafio_16 {
	 
	public static void main(String[] args) {
		int n1, n2, result;
		String s1, s2;
		JFrame frame = new JFrame();
		
		frame.setTitle("Desafio Java");
		frame.setSize(400,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("Digite o primeiro número");
		lb1.setBounds(100, 30, 200, 15);
		frame.add(lb1);
		
		JTextField tf1 = new JTextField(20);
		tf1.setBounds(100, 50, 200, 20);
		frame.add(tf1);
		
		JLabel lb2 = new JLabel("Digite o segundo número");
		lb2.setBounds(100, 80, 200, 15);
		frame.add(lb2);
		
		JTextField tf2 = new JTextField(20);
		tf2.setBounds(100, 100, 200, 20);
		frame.add(tf2);
		
		JLabel lb3 = new JLabel("Resultado:");
		lb3.setBounds(100, 130, 200, 15);
		frame.add(lb3);
		
		JTextField tf3 = new JTextField(20);
		tf3.setBounds(100, 150, 200, 20);
		frame.add(tf3);
		
		JButton bt1 = new JButton();
		bt1.setText("+");
		bt1.setBounds(200, 200, 100, 50);
		bt1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				String s1 = tf1.getText();
				String s2 = tf2.getText();
				double n1 = Integer.parseInt(s1);
				double n2 = Integer.parseInt(s2);
				String result = String.valueOf(n1 + n2);
				tf3.setText(result);
			}
		});
		frame.add(bt1);
		
		JButton bt2 = new JButton();
		bt2.setText("-");
		bt2.setBounds(100, 200, 100, 50);
		bt2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				String s1 = tf1.getText();
				String s2 = tf2.getText();
				s1 = s1.replaceAll(",", ".");
				s2 = s2.replaceAll(",", ".");
				double n1 = Integer.parseInt(s1);
				double n2 = Integer.parseInt(s2);
				String result = String.valueOf(n1 - n2);
				tf3.setText(result);
			}
		});
		frame.add(bt2);
		
		frame.setVisible(true);
	}

}
