package com.ict.day22;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Paint extends JFrame {
	JPanel jp;
	JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7;
	String[] items = { "5", "10", "15", "20", "25", "30" };
	JComboBox<String> jcom;
	// 좌표와 넓이
	int x = -5, y = -5, wh = 5;
	Color color;

	// 내부클래스
	CanvasTest ct = new CanvasTest();

	public Ex02_Paint() {
		super("미니그림판");
		
		jp = new JPanel();
		jb1 = new JButton("");
		jb1.setBackground(color.RED);
		jb2 = new JButton("");
		jb2.setBackground(color.GREEN);
		jb3 = new JButton("");
		jb3.setBackground(color.BLUE);
		jb4 = new JButton("");
		jb4.setBackground(color.CYAN);
		jb5 = new JButton("");
		jb5.setBackground(color.MAGENTA);
		jb6 = new JButton("");
		jb6.setBackground(color.YELLOW);
		
		jb7= new JButton("clear");
		
		jcom = new JComboBox<String>(items);
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		jp.add(jb7);
		add(jp, BorderLayout.NORTH);
		add(ct, BorderLayout.CENTER);
		
		//화면크기구함
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		//위치를 지정
		setBounds(ds.width/2, ds.height/2, 600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setResizable(false);
	    setVisible(true);
	    
	    jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				color = Color.GREEN;
			}
	    	
    
	    jb1.addActionListener(new ActionListener() {
	    	
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		color = Color.GREEN;
	    	}
	    	
	    
	    jb1.addActionListener(new ActionListener() {
	    	
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		color = Color.GREEN;
	    	}
	    	
	    
	    jb1.addActionListener(new ActionListener() {
	    	
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		color = Color.GREEN;
	    	}
	    	
	    
	    jb1.addActionListener(new ActionListener() {
	    	
	    	@Override
	    	public void actionPerformed(ActionEvent e) {
	    		color = Color.GREEN;
	    	}
	    	
	    }
	
	}

	// 내부클래스
	private class CanvasTest extends Canvas {
		@Override
		public void paint(Graphics g) {
			g.setColor(color);
			g.fillOval(x, y, wh, wh);
		}

		@Override
		public void update(Graphics g) {
			paint(g);
		}

		public static void main(String[] args) {
			new Ex02_Paint();
		}

	}
}
