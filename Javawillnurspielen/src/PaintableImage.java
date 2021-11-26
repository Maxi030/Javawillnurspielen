import util.ShowInFrame;
import java.awt.Graphics;
import javax.swing.JPanel;
public class PaintableImage extends JPanel implements Paintable {

	MyImage mi;
	
	public PaintableImage(MyImage mi) {
		this.mi = mi;
	}		
	public PaintableImage(String Name) {
		this.mi=new MyImage(Name);
	}
	@Override public void paintTo(java.awt.Graphics g) {
		g.drawImage(mi.get(),0,0,this);
	}
	public static void main(String[] Args) {
		PaintableImage pi = new PaintableImage("png-transparent-geometry-dash-alien-isolation-computer-icons-game-dash-miscellaneous-video-game-snout.png");
		System.out.println(pi.mi.get().getHeight(pi));
		ShowInFrame.show(new PaintablePanel(pi));
		PaintableImage sword = new PaintableImage("sword.png");
		System.out.println(sword.mi.get().getHeight(sword));
		ShowInFrame.show(new PaintablePanel(sword));
	}
	
	
	
	
	
	
	
	
}
