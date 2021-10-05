
public class GeometricObject {
	public Vertex pos;
	public double height;
	public double width;
    
	public GeometricObject(double width,double height,Vertex pos) {
	this.pos=pos;
	this.width=width;
	this.height=height;
	}
	
	public double getWidth() {return width;}
	public double getHeight() {return height;}
	
	public Vertex getPos() {return pos;}

	

	
	
}


