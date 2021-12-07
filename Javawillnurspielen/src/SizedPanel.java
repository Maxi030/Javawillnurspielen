import javax.swing.*;

import util.ShowInFrame;

import java.awt.Dimension;
public class SizedPanel extends JPanel  {

	int preferredwidth=800;
	int preferredheight=800;
	
	public SizedPanel(int w,int h) {
		preferredwidth=w;
		preferredheight=h;}
		
	public SizedPanel() {}
	
	
	@Override public Dimension getPreferredSize() {
		return new Dimension(preferredwidth,preferredheight); }
	
	
}
 