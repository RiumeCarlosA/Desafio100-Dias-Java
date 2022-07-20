import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Desafio_14{
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		
		frame.setTitle("Desafio 14");
		frame.setSize(400,300);
		frame.getContentPane().setBackground(Color.gray);
		frame.setLayout(new BorderLayout());
		
		JPanel pCenter = new JPanel();
		JTextField tf1 = new JTextField(20);
		JButton bt1 = new JButton("Clique aqui");
		pCenter.add(tf1);
		pCenter.add(bt1);
		frame.add(pCenter, BorderLayout.CENTER);
		bt1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				tf1.setText("O botão está funcionando");
			}
			
		});
		frame.setVisible(true);
	}
}