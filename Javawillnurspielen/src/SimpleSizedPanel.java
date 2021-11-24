import javax.swing.*;
import util.ShowInFrame; 
import java.awt.Color;
public class SimpleSizedPanel extends SizedPanel {

	@Override public void paintComponent(java.awt.Graphics g) {
		g.fillRect(30, 50, 45, 80);
	}
    
	public static void main(String[] args) {
		ShowInFrame.show("Erstes Rechteck", new SimpleSizedPanel());

	}
}
