package org.ihm.test1;

import javax.swing.SwingUtilities;

public class TestTopLevelContainers {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		
		//JFrame
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				TestMyJFrame frame = new TestMyJFrame();
				//TestMyJFrame frame = new TestMyJFrame();
				frame.setVisible(true);
				System.out.println(Thread.currentThread());
			}
		});
		
	}

}
