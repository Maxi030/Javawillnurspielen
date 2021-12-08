import java.awt.Graphics;

import javax.swing.ImageIcon;

import util.ShowInFrame;

public class GeometricImage extends GeometricObject implements Paintable{

	ImageIcon icon;
	
	public GeometricImage(String fileName,double y,double x) {
		super(new Vertex(x,y));
		icon=new ImageIcon(getClass().getClassLoader().getResource(fileName));
		init();
	}
	public GeometricImage(ImageIcon icon,double x,double y) {
		super(x,y);
		this.icon=icon;
		init();
	}
	void init() {
		width = icon.getImage().getWidth(icon.getImageObserver());
		height = icon.getImage().getHeight(icon.getImageObserver());
	}
	public void paintTo(java.awt.Graphics g) {
		icon.paintIcon(null, g,(int)pos.x,(int)pos.y);
	}
	
	
	
	
	
		
	}
	
	
	
	
	
	

