import javax.swing.*;

import util.ShowInFrame;

import java.awt.Dimension;
public class SizedPanel extends JPanel  {

	int prefferedwidth=400;
	int prefferedheight=300;
	
	public SizedPanel(int w,int h) {
		prefferedwidth=w;
		prefferedheight=h;}
		
	public SizedPanel() {}
	
	
	public Dimension getPrefferedSize() {
		return new Dimension(prefferedwidth,prefferedheight); }
	
	
}
