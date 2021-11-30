
public interface GameObject extends Moveable,Paintable {

	double getWidth();
	double getHeight();
	Vertex getPos();
	Vertex getDeltaPos();
	void setDeltaPos();
	boolean isLargerThan(GameObject that);
	boolean isAbove(GameObject that);
	boolean touches(GameObject that);
}