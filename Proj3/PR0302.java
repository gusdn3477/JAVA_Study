package Num2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JC15010701E2 extends JFrame {
	
	private JLabel la = new JLabel("C");
	public JC15010701E2() {
		setTitle("클릭 연습 용 응용 프로그램");
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
			int x = (int)(Math.random()*250); // 화면 밖으로 나가지 않기 위해 임의 값 250으로 설정하였습니다.
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
		System.out.println("15010701 박현우");
		new JC15010701E2();
	}

}
