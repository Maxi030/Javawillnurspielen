

import java.util.List;

import util.ShowInFrame;
public class PaintablesPanels extends SizedPanel {

	List<Paintable>pas;

	public  PaintablesPanels(List<Paintable> pa) {this.pas=pa;} 
		

	public void paintComponent(java.awt.Graphics g) {
		for(Paintable pa:pas)pa.paintTo(g);
	}
	
	
}	
		
		
		
		
