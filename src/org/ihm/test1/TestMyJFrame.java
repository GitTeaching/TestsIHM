package org.ihm.test1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TestMyJFrame extends JFrame implements ComponentListener {
	
	private JLabel label;
	private JPanel panel;

	public TestMyJFrame () {
		super();
		initMyJFrame();
	}

	private void initMyJFrame() {
		this.setSize(500, 450);
		this.setTitle("JFrame - Exercice 1");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    //JMenuBar
	    JMenuBar menuBar = new JMenuBar();	    
	    JMenu compte = new JMenu("Mon Compte");
	    menuBar.add(compte);	    
	    JMenuItem param = new JMenuItem("Paramètres");
	    compte.add(param);    
	    compte.addSeparator();    
	    JMenuItem exit = new JMenuItem("Se Déconnecter");
	    compte.add(exit);	    
	    this.setJMenuBar(menuBar);
	    
	    //JTextFields
	    panel = new JPanel();
	    panel.setLayout(new BorderLayout());
	    this.setContentPane(panel);
	    
	    JPanel tfPanel = new JPanel();
	    tfPanel.setBorder(BorderFactory.createTitledBorder("Text Fields: "));
	    tfPanel.setLayout(new GridLayout(2, 2, 10, 2));
	    
	    JLabel textFieldLabel = new JLabel("JTextField: ");
	    tfPanel.add(textFieldLabel);
	    JTextField textField = new JTextField();
	    textField.setColumns(20);
	    tfPanel.add(textField);
	    
	    JLabel passwordFieldLabel = new JLabel("JPasswordField: ");
	    tfPanel.add(passwordFieldLabel);
	    JPasswordField passwordField = new JPasswordField();
	    passwordField.setColumns(20);
	    tfPanel.add(passwordField);
	    
	    panel.add(tfPanel, BorderLayout.SOUTH);
	    
	    label = new JLabel("Label - NORTH");
	    panel.add(label, BorderLayout.NORTH);
	    
	    this.addComponentListener(this);
	}

	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
        int X = e.getComponent().getX();
		
		if(X<=650) {
			panel.add(label, BorderLayout.WEST);
		    label.setText("Label - WEST");
		}
		else {
			panel.add(label, BorderLayout.EAST);
		    label.setText("Label - EAST");
		}
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		
	}

}
