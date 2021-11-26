import java.awt.Graphics;

import javax.swing.ImageIcon;

import util.ShowInFrame;

public class GeometricImage extends GeometricObject implements Paintable{

	ImageIcon icon;
	
	public GeometricImage(String fileName,double y,double x) {
		super(x,y);
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
		width = icon.getImage().getHeight(icon.getImageObserver());
	}
	public void paintTo(java.awt.Graphics g) {
		icon.paintIcon(null, g,(int)pos.x,(int)pos.y);
	}
	public void main(String[] args) {
		GeometricImage gi = new GeometricImage("png-transparent-geometry-dash-alien-isolation-computer-icons-game-dash-miscellaneous-video-game-snout.png",10,10);
		System.out.println(gi.width);
		System.out.println(gi.height);
		ShowInFrame.show(new PaintablePanel(gi));
		GeometricImage sword = new GeometricImage("sword.png",10,10);
		System.out.println(sword.width);
		System.out.println(sword.height);
		ShowInFrame.show(new PaintablePanel(sword));
	}
	
	
	
	
		
	}
	
	
	
	
	
	

