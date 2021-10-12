
public class SimpleSquare extends GeometricObject {
public SimpleSquare(double w, Vertex pos) {
	(w, pos);
}

public SimpleSquare(double w, double x, double y) {
	this(w, new Vertex(x, y));
}

@Override
public double area() {
	return width * width;
}

@Override
public String toString() {
	return "SimpleSquare (" + super.toString() + ")";
}

@Override
public boolean equals(Object that) {
	return (that instanceof SimpleSquare) && super.equals(that);
}

}
