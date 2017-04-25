package buses;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import graphics.Graphics;

public class Bus extends AbBus{
	
	
	int pos[] = new int[2];
	private Graphics graphic;
	JLabel image;
	
	public Bus(String img, Graphics graphic, int pos[]){
		
		this.pos[0] = pos[0];
		this.pos[1] = pos[1];
		this.graphic = graphic;
		image = new JLabel( new ImageIcon(img));
		graphic.jframeadd(image, pos);
		
	}
	
	public int[] getpos(){
		return pos;
	}
	
	public void setpos(int pos[]){
		this.pos[0] = pos[0];
		this.pos[1] = pos[1];
	}
	
	public void update(){
		graphic.setlocation(image, this.pos);
	}
	
}
