package Desafio_25;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Teclado{
	String c;
	public void setSinal(String c) {
		this.c = c;
	}
	public String getSinal() {
		return c;
	}
	public void teclado1(JFrame frame) {
		JButton bt1 = new JButton("7");
		bt1.setBounds(75, 85, 50, 50);
		bt1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				setSinal("7");
			}
			
		});
		frame.add(bt1);
		
		JButton bt2 = new JButton("8");
		bt2.setBounds(130, 85, 50, 50);
		bt2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				setSinal("8");				
			}
			
		});
		frame.add(bt2);
		
		JButton bt3 = new JButton("9");
		bt3.setBounds(185, 85, 50, 50);
		bt3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				setSinal("9");
			}
			
		});
		frame.add(bt3);
		
		JButton bt4 = new JButton("/");
		bt4.setBounds(240, 85, 50, 50);
		frame.add(bt4);
		
		JButton bt5 = new JButton("4");
		bt5.setBounds(75, 140, 50, 50);
		bt5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				setSinal("4");
			}
			
		});
		frame.add(bt5);
		
		JButton bt6 = new JButton("5");
		bt6.setBounds(130, 140, 50, 50);
		bt6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				setSinal("5");
			}
			
		});
		frame.add(bt6);
		
		JButton bt7 = new JButton("6");
		bt7.setBounds(185, 140, 50, 50);
		bt7.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				setSinal("6");
			}
			
		});
		frame.add(bt7);
		
		JButton bt8 = new JButton("X");
		bt8.setBounds(240, 140, 50, 50);
		bt8.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				setSinal("X");
			}
			
		});
		frame.add(bt8);
		
		JButton bt9 = new JButton("1");
		bt9.setBounds(75, 195, 50, 50);
		bt9.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				setSinal("1");
			}
			
		});
		frame.add(bt9);
		
		JButton bt10 = new JButton("2");
		bt10.setBounds(130, 195, 50, 50);
		bt10.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				setSinal("2");
			}
			
		});
		frame.add(bt10);
		
		JButton bt11 = new JButton("3");
		bt11.setBounds(185, 195, 50, 50);
		bt11.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				setSinal("3");
			}
			
		});
		frame.add(bt11);
		
		JButton bt12 = new JButton("-");
		bt12.setBounds(240, 195, 50, 50);
		bt12.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				setSinal("-");
			}
			
		});
		frame.add(bt12);
		
		JButton bt13 = new JButton("0");
		bt13.setBounds(75, 250, 50, 50);
		bt13.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				setSinal("0");
			}
			
		});
		frame.add(bt13);
		
		JButton bt14 = new JButton(".");
		bt14.setBounds(130, 250, 50, 50);
		bt14.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				setSinal(".");
			}
			
		});
		frame.add(bt14);
		
		JButton bt15 = new JButton("+");
		bt15.setBounds(185, 250, 50, 50);
		bt15.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				setSinal("+");
			}
			
		});
		frame.add(bt15);
		
		JButton bt16 = new JButton("=");
		bt16.setBounds(240, 250, 50, 50);
		bt16.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ev) {
				setSinal("=");
			}
			
		});
		frame.add(bt16);
	}
}
