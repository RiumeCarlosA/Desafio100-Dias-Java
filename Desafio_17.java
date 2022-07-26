import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class Jogo{
	int[] n = new int [9];
	int[][] tabuleiro = new int[9][4];
	int tentativas = 0;
	
	void instanciar(){
		this.tabuleiro[n[0]][0] = 100;
		this.tabuleiro[n[0]][1] = 50;
		this.tabuleiro[n[0]][2] = 50;
		this.tabuleiro[n[0]][3] = 50;
		
		this.tabuleiro[n[1]][0] = 150;
		this.tabuleiro[n[1]][1] = 50;
		this.tabuleiro[n[1]][2] = 50;
		this.tabuleiro[n[1]][3] = 50;
		
		this.tabuleiro[n[2]][0] = 200;
		this.tabuleiro[n[2]][1] = 50;
		this.tabuleiro[n[2]][2] = 50;
		this.tabuleiro[n[2]][3] = 50;
		
		this.tabuleiro[n[3]][0] = 100;
		this.tabuleiro[n[3]][1] = 100;
		this.tabuleiro[n[3]][2] = 50;
		this.tabuleiro[n[3]][3] = 50;
		
		this.tabuleiro[n[4]][0] = 150;
		this.tabuleiro[n[4]][1] = 100;
		this.tabuleiro[n[4]][2] = 50;
		this.tabuleiro[n[4]][3] = 50;
		
		this.tabuleiro[n[5]][0] = 200;
		this.tabuleiro[n[5]][1] = 100;
		this.tabuleiro[n[5]][2] = 50;
		this.tabuleiro[n[5]][3] = 50;
		
		this.tabuleiro[n[6]][0] = 100;
		this.tabuleiro[n[6]][1] = 150;
		this.tabuleiro[n[6]][2] = 50;
		this.tabuleiro[n[6]][3] = 50;
		
		this.tabuleiro[n[7]][0] = 150;
		this.tabuleiro[n[7]][1] = 150;
		this.tabuleiro[n[7]][2] = 50;
		this.tabuleiro[n[7]][3] = 50;
		
		this.tabuleiro[n[8]][0] = 200;
		this.tabuleiro[n[8]][1] = 150;
		this.tabuleiro[n[8]][2] = 50;
		this.tabuleiro[n[8]][3] = 50;
	}
	public boolean verificar(int posicao) {
		if(posicao+1 == this.n[8] || posicao-1 == this.n[8] || posicao+3 == this.n[8] || posicao-3 == this.n[8]) {
			return true;
		}
		return false;
	}
	public void verificarVencedor() {
		if(this.n[0] == 0 && this.n[1] == 1 && this.n[2]== 2 && this.n[3] == 3 && this.n[4] == 4 && this.n[5] == 5 && this.n[6] == 6 && this.n[7] == 7 && this.n[8] == 8) {
			JOptionPane.showMessageDialog(null, "Parabens!! você ganhou");
		}
	}
	public void gerarNumero() {
		Random random = new Random();
	    Set<Integer> num1 = new HashSet<>();
	    for(int i = 0; i < 10; i++) {
	       num1.add(random.nextInt(9));	       
	    }
	    for(int i:num1) {
	    	int k = this.n[8];
			this.n[8] = this.n[i];
			this.n[i] = k;
	    }
    }
}
public class Desafio_17 {
	static void tela() {
		Jogo jogo = new Jogo();
		jogo.n[0] = 0;
		jogo.n[1] = 1;
		jogo.n[2] = 2;
		jogo.n[3] = 3;
		jogo.n[4] = 4;
		jogo.n[5] = 5;
		jogo.n[6] = 6;
		jogo.n[7] = 7;
		jogo.n[8] = 8;
		jogo.instanciar();
		jogo.gerarNumero();
		
		JFrame frame = new JFrame();
		frame.setTitle("Desafio Java");
		frame.setSize(375,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel();
		lb1.setText("tentativas: "+ jogo.tentativas);
		lb1.setBounds(40, 15, 100, 20);
		frame.add(lb1);
		
		JLabel tempo = new JLabel();
		tempo.setBounds(230, 15, 150, 20);
		Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 0;
            int j = 0;
            int y = 0;
            int k = 0;
            public void run() {
                tempo.setText("Tempo: "+ k + j +" : "+ y + i);
                i++;
                if(i == 10) {
                	y++;
                	i = 0;
                	if(y == 6) {
                    	y = 0;
                    	j++;
                    	if(j == 10) {
                    		j = 0;
                    		k++;
                    	}
                    }
                }
            }
        }, 0, 1000);
        frame.add(tempo);
		
		JButton reiniciar = new JButton("Novo jogo");
		reiniciar.setBounds(100, 230, 150, 30);
		reiniciar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				tela();
			}
			
		});
		frame.add(reiniciar);
		
		JButton bt1 = new JButton("1");
		bt1.setBounds(jogo.tabuleiro[jogo.n[0]][0],jogo.tabuleiro[jogo.n[0]][1],jogo.tabuleiro[jogo.n[0]][2],jogo.tabuleiro[jogo.n[0]][3] );
		bt1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				if(jogo.verificar(jogo.n[0])) {
					int i = jogo.n[8];
					jogo.n[8] = jogo.n[0];
					jogo.n[0] = i;
					bt1.setBounds(jogo.tabuleiro[jogo.n[0]][0],jogo.tabuleiro[jogo.n[0]][1],jogo.tabuleiro[jogo.n[0]][2],jogo.tabuleiro[jogo.n[0]][3] );
					jogo.tentativas++;
					lb1.setText("tentativas: "+ jogo.tentativas);
				}
				jogo.verificarVencedor();
			}
			
		});
		frame.add(bt1);
		
		JButton bt2 = new JButton("2");
		bt2.setBounds(jogo.tabuleiro[jogo.n[1]][0],jogo.tabuleiro[jogo.n[1]][1],jogo.tabuleiro[jogo.n[1]][2],jogo.tabuleiro[jogo.n[1]][3] );
		bt2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				if(jogo.verificar(jogo.n[1])) {
					int i = jogo.n[8];
					jogo.n[8] = jogo.n[1];
					jogo.n[1] = i;
					bt2.setBounds(jogo.tabuleiro[jogo.n[1]][0],jogo.tabuleiro[jogo.n[1]][1],jogo.tabuleiro[jogo.n[1]][2],jogo.tabuleiro[jogo.n[1]][3] );	
					jogo.tentativas++;
					lb1.setText("tentativas: "+ jogo.tentativas);
				}
				jogo.verificarVencedor();
			}
			
		});
		frame.add(bt2);
		
		JButton bt3 = new JButton("3");
		bt3.setBounds(jogo.tabuleiro[jogo.n[2]][0],jogo.tabuleiro[jogo.n[2]][1],jogo.tabuleiro[jogo.n[2]][2],jogo.tabuleiro[jogo.n[2]][3] );				
		bt3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				if(jogo.verificar(jogo.n[2])) {
					int i = jogo.n[8];
					jogo.n[8] = jogo.n[2];
					jogo.n[2] = i;
					bt3.setBounds(jogo.tabuleiro[jogo.n[2]][0],jogo.tabuleiro[jogo.n[2]][1],jogo.tabuleiro[jogo.n[2]][2],jogo.tabuleiro[jogo.n[2]][3] );	
					jogo.tentativas++;
					lb1.setText("tentativas: "+ jogo.tentativas);
				}
				jogo.verificarVencedor();
			}
			
		});
		frame.add(bt3);
		
		JButton bt4 = new JButton("4");
		bt4.setBounds(jogo.tabuleiro[jogo.n[3]][0],jogo.tabuleiro[jogo.n[3]][1],jogo.tabuleiro[jogo.n[3]][2],jogo.tabuleiro[jogo.n[3]][3] );
		bt4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				if(jogo.verificar(jogo.n[3])) {
					int i = jogo.n[8];
					jogo.n[8] = jogo.n[3];
					jogo.n[3] = i;
					bt4.setBounds(jogo.tabuleiro[jogo.n[3]][0],jogo.tabuleiro[jogo.n[3]][1],jogo.tabuleiro[jogo.n[3]][2],jogo.tabuleiro[jogo.n[3]][3] );
					jogo.tentativas++;
					lb1.setText("tentativas: "+ jogo.tentativas);
				}
				jogo.verificarVencedor();
			}
			
		});
		frame.add(bt4);
		
		JButton bt5 = new JButton("5");
		bt5.setBounds(jogo.tabuleiro[jogo.n[4]][0],jogo.tabuleiro[jogo.n[4]][1],jogo.tabuleiro[jogo.n[4]][2],jogo.tabuleiro[jogo.n[4]][3] );
		bt5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				if(jogo.verificar(jogo.n[4])) {
					int i = jogo.n[8];
					jogo.n[8] = jogo.n[4];
					jogo.n[4] = i;
					bt5.setBounds(jogo.tabuleiro[jogo.n[4]][0],jogo.tabuleiro[jogo.n[4]][1],jogo.tabuleiro[jogo.n[4]][2],jogo.tabuleiro[jogo.n[4]][3] );
					jogo.tentativas++;
					lb1.setText("tentativas: "+ jogo.tentativas);
				}
				jogo.verificarVencedor();
			}
			
		});
		frame.add(bt5);
		
		JButton bt6 = new JButton("6");
		bt6.setBounds(jogo.tabuleiro[jogo.n[5]][0],jogo.tabuleiro[jogo.n[5]][1],jogo.tabuleiro[jogo.n[5]][2],jogo.tabuleiro[jogo.n[5]][3] );
		bt6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				if(jogo.verificar(jogo.n[5])) {
					int i = jogo.n[8];
					jogo.n[8] = jogo.n[5];
					jogo.n[5] = i;
					bt6.setBounds(jogo.tabuleiro[jogo.n[5]][0],jogo.tabuleiro[jogo.n[5]][1],jogo.tabuleiro[jogo.n[5]][2],jogo.tabuleiro[jogo.n[5]][3] );
					jogo.tentativas++;
					lb1.setText("tentativas: "+ jogo.tentativas);
				}
				jogo.verificarVencedor();
			}
			
		});
		frame.add(bt6);
		
		JButton bt7 = new JButton("7");
		bt7.setBounds(jogo.tabuleiro[jogo.n[6]][0],jogo.tabuleiro[jogo.n[6]][1],jogo.tabuleiro[jogo.n[6]][2],jogo.tabuleiro[jogo.n[6]][3] );
		bt7.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				if(jogo.verificar(jogo.n[6])) {
					int i = jogo.n[8];
					jogo.n[8] = jogo.n[6];
					jogo.n[6] = i;
					bt7.setBounds(jogo.tabuleiro[jogo.n[6]][0],jogo.tabuleiro[jogo.n[6]][1],jogo.tabuleiro[jogo.n[6]][2],jogo.tabuleiro[jogo.n[6]][3] );
					jogo.tentativas++;
					lb1.setText("tentativas: "+ jogo.tentativas);
				}
				jogo.verificarVencedor();
			}
			
		});
		frame.add(bt7);
		
		JButton bt8 = new JButton("8");
		bt8.setBounds(jogo.tabuleiro[jogo.n[7]][0],jogo.tabuleiro[jogo.n[7]][1],jogo.tabuleiro[jogo.n[7]][2],jogo.tabuleiro[jogo.n[7]][3] );
		bt8.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				if(jogo.verificar(jogo.n[7])) {
					int i = jogo.n[8];
					jogo.n[8] = jogo.n[7];
					jogo.n[7] = i;
					bt8.setBounds(jogo.tabuleiro[jogo.n[7]][0],jogo.tabuleiro[jogo.n[7]][1],jogo.tabuleiro[jogo.n[7]][2],jogo.tabuleiro[jogo.n[7]][3] );
					jogo.tentativas++;
					lb1.setText("tentativas: "+ jogo.tentativas);
				}
				jogo.verificarVencedor();
			}
			
		});
		frame.add(bt8);
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		tela();
		
	}

}
