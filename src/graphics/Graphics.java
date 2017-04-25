package graphics;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Graphics {
	
	private String text = "130262.png";
	JFrame frame;
	Dimension d = new Dimension(200,200);
	JPanel pane = new JPanel();
	private int x,y;
	
	public Graphics(){
		
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				
				createAndShowGUI();
				
			}
		});
	
	}
	
	protected void createAndShowGUI() {
		
		// TODO Auto-generated method stub
		frame = new JFrame("GUI");
		frame.getContentPane().add(pane);
		frame.pack();		
		frame.setSize(700, 1000);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}
	
	public void jframeadd(JLabel image,int pos[]){
		
		pane.setLayout(null);
		image.setBounds(pos[0], pos[1], image.getPreferredSize().width, image.getPreferredSize().height);
		pane.add(image);
		
	}
	
	public void setlocation(JLabel image,int pos[]){
		
		image.setLocation(pos[0],pos[1]);
		
	}

}
