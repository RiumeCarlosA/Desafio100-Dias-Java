package Desafio_25;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Display{
	JTextField tf1 = new JTextField(20);
	public JTextField getTF() {
		return tf1;
	}
	public void painel1(JFrame frame, String c) {
		tf1.setHorizontalAlignment(JTextField.RIGHT);
		tf1.setFont(new Font("Dialog", Font.PLAIN, 25));
		tf1.setBounds(75, 30, 215, 50);
		tf1.setText(c);
		frame.add(tf1);
	}
}
