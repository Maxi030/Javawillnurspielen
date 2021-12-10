import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import util.*;

public class MouseControlledAnimation extends RemoveAnimation{

	GameObject controlled;
	
	MouseControlledAnimation(final GameObject contr) {
		controlled=contr;
		gos.add(controlled);
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				final Vertex delta = new Vertex(e.getX(),e.getY());
				delta.addMod(controlled.getPos().skalarMult(-1));
				delta.addMod(new Vertex(-controlled.getWidth()/2,-controlled.getHeight()/2));
				final double factor =  controlled.getDeltaPos().length()/delta.length();
				delta.skalarMultMod(factor);
				controlled.setDeltaPos(delta);
			}
		});
	} 
}
