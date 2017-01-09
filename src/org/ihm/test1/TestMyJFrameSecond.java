package org.ihm.test1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestMyJFrameSecond extends JFrame{
	
	private JCheckBox repC;
	private JCheckBox repB;
	private JCheckBox repA;
	private JCheckBox repD;
	private JButton submit;
	private JLabel reponse;

	public TestMyJFrameSecond () {
		super();
		initMyJFrame();
	}

	private void initMyJFrame() {
		this.setSize(450, 350);
		this.setTitle("JFrame - Exercice 2");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setResizable(false);
		
		BoxLayout box = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
	    this.getContentPane().setLayout(box);
	    
		JLabel question = new JLabel("En quelle année ont eu lieu les événements du 5 octobre en Algérie ?");
		this.getContentPane().add(question);
		
		repA = new JCheckBox("Réponse A:  1980");
		this.getContentPane().add(repA);
		repB = new JCheckBox("Réponse B:  1988");
		this.getContentPane().add(repB);
		repC = new JCheckBox("Réponse C:  1999");
		this.getContentPane().add(repC);
		repD = new JCheckBox("Réponse D:  2004");
		this.getContentPane().add(repD);
		
		reponse = new JLabel();
		this.getContentPane().add(reponse);
		
		submit = new JButton("répondre");
		submit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (repB.isSelected()) {
					reponse.setText("Réponse Juste!");
				}
				if(repA.isSelected() || repC.isSelected() || repD.isSelected()){
					reponse.setText("Réponse Fausse!");	
				}
			}
		});
		this.getContentPane().add(submit);
		
	}
}