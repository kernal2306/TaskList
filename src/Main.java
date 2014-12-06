import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				TaskList();
			}
		});
	}
	
	private static void TaskList(){
		JFrame frame = new JFrame("Task List");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Content goes here");
		label.setPreferredSize(new Dimension(200, 400));
		frame.getContentPane().add(label, BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
	}

}
