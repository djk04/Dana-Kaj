package hw03;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	JButton button1;
	JButton button2;
	
	public MyFrame(String title) {
		super(title);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		
		button2 = new JButton("Button 2");
//		frame.getContentPane().add(button2);
		
		this.setVisible(true);
		
		button1 = new JButton("Press");
//		frame.getContentPane().add(button1);
		this.getContentPane().add(BorderLayout.WEST,button1);
		this.getContentPane().add(BorderLayout.EAST,button2);
		
		this.getContentPane().setLayout(new FlowLayout()); 
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		
		if (b == button1){
			JOptionPane.showConfirmDialog(this, "You clicked Button1","Button Click Event Handler", JOptionPane.PLAIN_MESSAGE);	
			}
		else if (b == button2){
				JOptionPane.showConfirmDialog(this, "You clicked Button2","Button Click Event Handler", JOptionPane.PLAIN_MESSAGE);
			}

		
	}
	
	
}

	
