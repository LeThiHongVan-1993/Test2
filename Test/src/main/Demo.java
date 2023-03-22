package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Demo extends JFrame{
	
	public Demo() {
		setSize(400, 400);
		setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		add(panel);
		
		
		JLabel label  = new JLabel("Hello Word");
		panel.add(label);
	}

	public static void main(String[] args) {
		new Demo().setVisible(true);
	}
}
