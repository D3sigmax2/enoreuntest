package graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Graphics extends Thread{
	
	private String text = "130262.png";
	JFrame frame;
	Dimension d = new Dimension(200,200);
	JPanel pane = new JPanel();
	JPanel pane_station = new JPanel();
	JPanel pane_person = new JPanel();
	private int x,y;
	
	public Graphics(){
		
		
	
	}
	public void run(){
		createAndShowGUI();
		//refreshpane();
		while(true){
			refreshpane();
			//System.out.println("FPPPPPS");
			try{
				Thread.sleep(1000/60);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public void refreshpane(){
		
		//pane.add(pane_station);
		//pane.add(pane_person);
		
		//frame.getContentPane().add(pane);
		//pane.remove(pane_person);
		
		frame.setContentPane(pane);
		
	}
	
	protected void createAndShowGUI() {
		
		// TODO Auto-generated method stub
		frame = new JFrame("GUI");
		//frame.getContentPane().add(pane);
		pane.setLayout(null);
		pane.setBackground(Color.WHITE);
		pane_person.setLayout(null);
		frame.pack();		
		frame.setSize(1900, 1000);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}
	
	synchronized public void jframeadd(JLabel image,int pos[]){
		
		
		image.setBounds(pos[0], pos[1], image.getPreferredSize().width, image.getPreferredSize().height);
		pane.add(image);
		
	}
	public void remove(JLabel image){
		
		
		pane.remove(image);
		
	}
	
	public void setlocation(JLabel image,int pos[]){
		
		image.setLocation(pos[0],pos[1]);
		
	}

}
