package Num1;

import javax.swing.*;
import java.awt.*;

public class JC15010701E1 extends JFrame {
	
	public JC15010701E1() {
		int i = 0;
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		for(i=0;i<20;i++) {
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			JButton b = new JButton();
			b.setBackground(Color.BLUE);
			b.setLocation(x, y);
			b.setSize(10,10);
			b.setOpaque(true);
			contentPane.add(b);
		}
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("15010701 ¹ÚÇö¿ì");
		new JC15010701E1();
		
	}

}
