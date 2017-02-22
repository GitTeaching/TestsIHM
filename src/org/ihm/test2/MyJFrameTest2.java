package org.ihm.test2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MyJFrameTest2 extends JFrame{
	
	public MyJFrameTest2 () {
		super();
		initMyJFrame();
	}

	private void initMyJFrame() {
		this.setSize(500, 450);
		this.setTitle("My Frame");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Profil", new ProfilPanel());
		jtp.addTab("Age", new AgePanel());
		jtp.addTab("Say Something", new GamePanel());
		this.getContentPane().add(jtp);
	}
	
	private class ProfilPanel extends JPanel{
		
		private JTextField nom;
		private JLabel nomLabel;
		private JList<String> listNames;

		public ProfilPanel() {
			
		    String items [] = new String[20];
		    for(int i=0; i<20; i++)
		    	items[i] ="User   Name   " + i;
		    
		    listNames = new JList<String>(items);
		    listNames.addListSelectionListener(new ListSelectionListener(){

				@Override
				public void valueChanged(ListSelectionEvent e) {
					if(!e.getValueIsAdjusting()){
						nom.setText((String)listNames.getSelectedValue());
					}
					
				}});
		    this.add(listNames);
		    
		    JScrollPane scroll = new JScrollPane(listNames);
		    this.add(scroll);
		    
		    
		    nomLabel = new JLabel("Enter the User's Name :"); 
		    this.add(nomLabel);
		    
		    nom = new JTextField();
		    nom.setColumns(15);
		    this.add(nom);
		}	
		
	}
		
	private class AgePanel extends JPanel{
		private JSlider slider;
		private JLabel label;

		public AgePanel() {
			
			this.setLayout(new BorderLayout());
			
			label=new JLabel("Age : ");
			label.setFont(new Font("Serif", Font.BOLD, 20));
			this.add(label, BorderLayout.SOUTH);
			
			slider = new JSlider (10, 60, 18);
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(10);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.addChangeListener(new ChangeListener(){

				@Override
				public void stateChanged(ChangeEvent e) {
					int value = slider.getValue();
					label.setText("Age : " + Integer.toString(value));	
				}			
			});
			this.add(slider, BorderLayout.WEST);
		}	
	}
	
    private class GamePanel extends JPanel{
		
		private JTextField textField;
		private JButton okBtn;
		private JTextArea textArea;

		public GamePanel() { 
					
			textField = new JTextField();
			textField.setColumns(15);
			textField.setBorder(BorderFactory.createTitledBorder("Write your post : "));
		    this.add(textField);
			
			okBtn = new JButton("OK");
			okBtn.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
				    String status = textField.getText() + "\n\n";
				    textArea.setText(textArea.getText() + status);
					
				}});
			this.add(okBtn);
			
			textArea = new JTextArea("Listing your posts ...\n\n", 10, 20);
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			this.add(textArea);
			
			JScrollPane scroll = new JScrollPane(textArea);
			this.add(scroll);
		}
	}	

}
