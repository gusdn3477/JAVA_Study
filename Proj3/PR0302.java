package Num2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JC15010701E2 extends JFrame {
	
	private JLabel la = new JLabel("C");
	public JC15010701E2() {
		setTitle("Ŭ�� ���� �� ���� ���α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);
		la.setLocation(100,100);
		la.setSize(20,20);
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener{
		public void mouseClicked(MouseEvent e) { // 
			int x = (int)(Math.random()*250); // ȭ�� ������ ������ �ʱ� ���� ���� �� 250���� �����Ͽ����ϴ�.
			int y = (int)(Math.random()*250);
			la.setLocation(x,y);
		}
		public void mouseReleased(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("15010701 ������");
		new JC15010701E2();
	}

}
