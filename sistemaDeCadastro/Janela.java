package sistemaDeCadastro;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Janela{
	public void criarJanela() throws SQLException{
		Crud crud = new Crud();
		JFrame frame = new JFrame();
		
		frame.setTitle("Desafio 30 Java");
		frame.setSize(450,350);
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
		bt1.setFont(new Font("Dialog",1 , 8));
		bt1.setBounds(30, 150, 65, 20);
		bt1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				try {
					crud.inserirDados(tf1.getText(), tf2.getText(), tf3.getText());
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		frame.add(bt1);
		
		JButton bt2 = new JButton("Excluir");
		bt2.setFont(new Font("Dialog",1 , 8));
		bt2.setBounds(100, 150, 65, 20);
		bt2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				try {
					crud.excluirDados(tf1.getText(), tf2.getText());
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		frame.add(bt2);
		
		JButton bt3 = new JButton("Alterar");
		bt3.setFont(new Font("Dialog",1 , 8));
		bt3.setBounds(170, 150, 65, 20);
		bt3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				try {
					crud.alterarDados(tf1.getText(), tf2.getText(), tf3.getText());
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		frame.add(bt3);
	
		DefaultListModel model1 = new DefaultListModel();
		JList<Usuario> lista1 = new JList<Usuario>(model1);
		lista1.setBorder(BorderFactory.createLineBorder(Color.gray));
		lista1.setBounds(30, 190, 50, 100);
		lista1.setFont(new Font("Dialog",1 ,9));
		model1.addElement("ID");
		lista1.setModel(model1);
		frame.add(lista1);
		
		DefaultListModel model2 = new DefaultListModel();
		JList<Usuario> lista2 = new JList<Usuario>(model2);
		lista2.setBorder(BorderFactory.createLineBorder(Color.gray));
		lista2.setBounds(80, 190, 120, 100);
		lista2.setFont(new Font("Dialog",1 ,9));
		model2.addElement("Nome");
		lista2.setModel(model2);
		frame.add(lista2);
		
		DefaultListModel model3 = new DefaultListModel();
		JList<Usuario> lista3 = new JList<Usuario>(model3);
		lista3.setBorder(BorderFactory.createLineBorder(Color.gray));
		lista3.setBounds(200, 190, 155, 100);
		lista3.setFont(new Font("Dialog",1 ,9));
		model3.addElement("Email");
		lista3.setModel(model3);
		frame.add(lista3);
		
		JButton bt4 = new JButton("Listar");
		bt4.setFont(new Font("Dialog",1 , 8));
		bt4.setBounds(240, 150, 65, 20);
		bt4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				try {
					model1.clear();
					model2.clear();
					model3.clear();
					lista1.setModel(model1);
					lista1.setModel(model2);
					lista1.setModel(model3);
					List<Usuario> usuario = crud.mostrarDados();
					for(Usuario i : usuario) {
						model1.addElement(i.getId());
						model2.addElement(i.getNome());
						model3.addElement(i.getEmail());
						lista1.setModel(model1);
						lista2.setModel(model2);
						lista3.setModel(model3);
					}
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
		frame.add(bt4);
		
		JButton bt5 = new JButton("limpar");
		bt5.setFont(new Font("Dialog",1 , 8));
		bt5.setBounds(310, 150, 65, 20);
		bt5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				model1.clear();
				model2.clear();
				model3.clear();
				lista1.setModel(model1);
				lista1.setModel(model2);
				lista1.setModel(model3);
			}
		});
		frame.add(bt5);
		
		frame.setVisible(true);
		
	}
}
