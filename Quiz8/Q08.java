import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JC15010701Q08 extends JFrame {
	private JLabel la = new JLabel("No Mouse Event");
	
	public JC15010701Q08() {
		setTitle("15010701 ¹ÚÇö¿ì");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		c.setBackground(Color.GREEN);
		c.add(la);
		setSize(300,200);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{
		
		public void mousePressed(MouseEvent e) {
			
		}
		
		public void mouseReleased(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);
			la.setText("No Mouse Event");
		}
		
		public void mouseDragged(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
			la.setText("Moust is Dragging");
		}

		public void mouseMoved(MouseEvent arg0) {
		}

		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JC15010701Q08();
	}

}
