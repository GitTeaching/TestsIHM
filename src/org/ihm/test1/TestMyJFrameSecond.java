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
	    
		JLabel question = new JLabel("En quelle ann�e ont eu lieu les �v�nements du 5 octobre en Alg�rie ?");
		this.getContentPane().add(question);
		
		repA = new JCheckBox("R�ponse A:  1980");
		this.getContentPane().add(repA);
		repB = new JCheckBox("R�ponse B:  1988");
		this.getContentPane().add(repB);
		repC = new JCheckBox("R�ponse C:  1999");
		this.getContentPane().add(repC);
		repD = new JCheckBox("R�ponse D:  2004");
		this.getContentPane().add(repD);
		
		reponse = new JLabel();
		this.getContentPane().add(reponse);
		
		submit = new JButton("r�pondre");
		submit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (repB.isSelected()) {
					reponse.setText("R�ponse Juste!");
				}
				if(repA.isSelected() || repC.isSelected() || repD.isSelected()){
					reponse.setText("R�ponse Fausse!");	
				}
			}
		});
		this.getContentPane().add(submit);
		
	}
}