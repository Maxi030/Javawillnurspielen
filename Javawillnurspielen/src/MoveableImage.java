import javax.swing.ImageIcon;

public class MoveableImage extends GeometricImage implements GameObject{

	Vertex deltaPos = new Vertex(0,0);
	
	public Vertex getDeltaPos() {
		return deltaPos;
		}
	public void setDeltaPos(Vertex v) {
		deltaPos = v;
		}
	
	public MoveableImage(String name,double x,double y) {
		super(name,x,y);
		}
	
	public MoveableImage(String name,double x,double y,double dX, double dY) {
		super(name,x,y);
		deltaPos=new Vertex(dX,dY);
		}
	public MoveableImage(ImageIcon icon, String name,double x,double y,double dX,double dY) {
		super(name,x,y);
		deltaPos=new Vertex(dX,dY);
		}
	public void move() {pos.addMod(deltaPos);}
	public void turn() {deltaPos.skalarMultMod(-1);}
	
	public boolean isLeftOf(GameObject that) {
		return this.getPos().x+this.getWidth()<that.getPos().y;
	}
	public boolean isAbove(GameObject that) {
		return this.getPos().y+this.getHeight()<that.getPos().y;
	}
	public boolean touches(GameObject that) {
		if(this.isLeftOf(that)) {return false;}
		if(that.isLeftOf(this)) {return false;}
		if(this.isAbove(that)) {return false;}
		if(that.isAbove(this)) {return false;}
		return true;
	}
	public boolean isLargerThan(GameObject that) {
		return getWidth()*getHeight()>that.getWidth()*that.getHeight();
	}
				
}	

