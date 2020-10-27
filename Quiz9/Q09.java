import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JC15010701Q09 extends JFrame {
	
	Container c;
	private JTextField tf = new JTextField(10);
	private JComboBox<String> strCombo = new JComboBox<String>();
	
	public JC15010701Q09() {
		setTitle("15010701 박현우");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		tf.addKeyListener(new make());
		c.add(tf);
		c.add(strCombo);
		setSize(250,150);
		setVisible(true);
		
	}
	
	class make extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int KeyCode = e.getKeyCode();
			if (KeyCode == KeyEvent.VK_ENTER){
				strCombo.addItem(tf.getText());
				tf.setText("");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JC15010701Q09();
		System.out.println("15010701 박현우");
	}

}
