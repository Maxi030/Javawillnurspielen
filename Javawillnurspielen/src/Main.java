import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import util.ShowInFrame;

public class Main {

	public static void main(String[] args) {
		
		//ShowInFrame.show(new SimpleButton()); //f�rSimpleButton
		
		//ShowInFrame.show(new Counter()); // f�rCounter
		
		/*GeometricImage gi = new GeometricImage("png-transparent-geometry-dash-alien-isolation-computer-icons-game-dash-miscellaneous-video-game-snout.png",10,10);
		System.out.println(gi.width);
		System.out.println(gi.height);
		ShowInFrame.show(new PaintablePanel(gi));
		GeometricImage sword = new GeometricImage("sword.png",10,10);
		System.out.println(sword.width);
		System.out.println(sword.height);
		ShowInFrame.show(new PaintablePanel(sword)); //f�rGeometricImage
		
		//ShowInFrame.show(new SizedPanel());//f�rSizedPanel
		
	 
		//ShowInFrame.show("Erstes Rechteck", new SimpleSizedPanel());
		
		List<Paintable> ps = new ArrayList<Paintable>() ;
		//ps.add(new PaintableOval (100,50,30,50));
		//ps.add(new PaintableOval (100,50,130,150));
		
		
		
		//ShowInFrame.show("Oval",new PaintablesPanels(ps));*/
		
		ButtonAnimation b = new ButtonAnimation();
		MoveablePanel p= new SimpleAnimation();
		p.gos.add(new MoveableImage("biene.png",0,0,1,1));
		p.gos.add(new MoveableImage("hexe.png",600,600,10,10)); 
		ShowInFrame.show(p);
		
		
		//Paintable pa[] = {new PaintableOval(100,50,50,100),new PaintableOval(50,30,50,50)} ;
	}
		
	









}


		
		






