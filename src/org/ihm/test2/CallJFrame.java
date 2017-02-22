package org.ihm.test2;

import javax.swing.SwingUtilities;

public class CallJFrame {

	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				MyJFrameTest2 frame = new MyJFrameTest2();
				frame.setVisible(true);
			}
		});
		
	}

}
