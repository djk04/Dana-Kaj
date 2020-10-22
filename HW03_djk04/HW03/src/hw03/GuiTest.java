package hw03;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class GuiTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My first GUI");
		MyFrame frame2 = new MyFrame("My first GUI prime");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		
		JButton button2 = new JButton("Button 2");
//		frame.getContentPane().add(button2);
		
		frame.setVisible(true);
		frame2.setVisible(true);
		
		JButton button1 = new JButton("Press");
//		frame.getContentPane().add(button1);
		frame.getContentPane().add(BorderLayout.WEST,button1);
		frame.getContentPane().add(BorderLayout.EAST,button2);
		
		frame.getContentPane().setLayout(new FlowLayout()); 

		
	}

}
