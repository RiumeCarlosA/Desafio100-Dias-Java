package Desafio_25;

import javax.swing.JFrame;

public class Calculadora{
	JFrame frame = new JFrame();
	public void criarCalculadora() {
		String c;
		Teclado teclado = new Teclado();
		Display painel = new Display();
		
		frame.setTitle("Desafio Java");
		frame.setSize(400,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		teclado.teclado1(frame);
		c = teclado.getSinal();
		painel.painel1(frame, c);
		frame.add(painel.getTF());
		
		
		frame.setVisible(true);
	}
}
