import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import util.ShowInFrame;

public class Main {

	public static void main(String[] args) {
	

		ShowInFrame.show("Erstes Rechteck", new SimpleSizedPanel());
		
		List<Paintable> ps = new ArrayList<Paintable>() ;
		ps.add(new PaintableOval (100,50,30,50));
		ps.add(new PaintableOval (100,50,130,150));
		
		
		
		ShowInFrame.show("Oval",new PaintablesPanels(ps));
		
		Paintable pa[] = {new PaintableOval(100,50,50,100),new PaintableOval(50,30,50,50)} ;
	}
	
	









}


		
		






