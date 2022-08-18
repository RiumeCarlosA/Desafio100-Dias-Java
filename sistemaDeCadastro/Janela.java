package sistemaDeCadastro;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Janela{
	public void criarJanela(){
		JFrame frame = new JFrame();
		
		frame.setTitle("Desafio 30 Java");
		frame.setSize(400,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("ID");
		lb1.setBounds(30, 30, 20, 20);
		frame.add(lb1);
		
		JTextField tf1 = new JTextField(20);
		tf1.setBounds(100, 30, 50, 20);
		frame.add(tf1);
		
		JLabel lb2 = new JLabel("Nome");
		lb2.setBounds(30, 70, 50, 20);
		frame.add(lb2);
		
		JTextField tf2 = new JTextField(20);
		tf2.setBounds(100, 70, 250, 20);
		frame.add(tf2);
		
		JLabel lb3 = new JLabel("Email");
		lb3.setBounds(30, 110, 50, 20);
		frame.add(lb3);
		
		JTextField tf3 = new JTextField(20);
		tf3.setBounds(100, 110, 200, 20);
		frame.add(tf3);
		
		JButton bt1 = new JButton("Inserir");
		bt1.setFont(new Font("Arial",1 , 10));
		bt1.setBounds(100, 160, 75, 20);
		bt1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				Crud crud = new Crud();
				try {
					crud.InserirDados(tf1.getText(), tf2.getText(), tf3.getText());
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		frame.add(bt1);
		
		JButton bt2 = new JButton("Excluir");
		bt2.setFont(new Font("Arial",1 , 10));
		bt2.setBounds(223, 160, 75, 20);
		frame.add(bt2);
		
		frame.setVisible(true);
		
	}
}
