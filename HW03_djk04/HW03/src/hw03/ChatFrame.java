package hw03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ChatFrame implements  ActionListener {
	JFrame frame;
	JButton s;
	JButton r;
	JMenuItem m1;
	JMenuItem m11;
	JPanel p;
	
	public ChatFrame() {
		frame = new JFrame("Chat Frame") ;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.white);
		frame.setSize(300, 300);
		
		JMenuBar mb = new JMenuBar(); 
		JMenu menu1 = new JMenu("FILE"); 
		JMenu menu2 = new JMenu("Help") ;
		mb.add(menu1); 
		mb.add(menu2) ;
		m1 = new JMenuItem("Open"); 
		m11 = new JMenuItem("Save as") ;
		menu1.add(m1); 
		menu1.add(m11) ;
		frame.setJMenuBar(mb);
		
		p = new JPanel() ;
		p.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Enter Text");
		p.add(label) ;
		
		JTextField text = new JTextField("", 10) ;
		p.add(text) ;
		
		s = new JButton("Send") ;
		r = new JButton("Reset") ;
		p.add(s) ;
		p.add(r) ;
		
		frame.add(BorderLayout.SOUTH, p) ;
		frame.setVisible(true);
		
		s.addActionListener(this) ;
		r.addActionListener(this) ;
		m1.addActionListener(this) ;
		m11.addActionListener(this) ;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {	
		ChatFrame test = new ChatFrame();	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() instanceof JButton) { 
			JButton b = (JButton) e.getSource() ; 
			if(b == s) {
				JOptionPane.showMessageDialog(frame, "Send button was pressed");
			}
			else if (b == r) {
				JOptionPane.showMessageDialog(frame, "Reset button was pressed");
			}
		}
		else if (e.getSource() instanceof JMenuItem) {  	
			JMenuItem m = (JMenuItem) e.getSource();  	
			
			if (m == m1) {
				JOptionPane.showMessageDialog(frame, "Open", "JMenu item was clicked", JOptionPane.PLAIN_MESSAGE);
			}
			else if (m == m11) {
				JOptionPane.showMessageDialog(frame, "Save As", "JMenu item was clicked", JOptionPane.PLAIN_MESSAGE);
			}	
		}	
	}
}