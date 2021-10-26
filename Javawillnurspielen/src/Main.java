import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		/*
		 * Vertex v1 = new Vertex(17,4); GeometricObject o1 = new GeometricObject(17,4,
		 * new Vertex(42,23)); GeometricObject o2 = new GeometricObject(17,4);
		 * GeometricObject o3 = new GeometricObject(17); GeometricObject o4 = new
		 * GeometricObject(); SimpleOval ov1 = new SimpleOval (17,4, new Vertex(42,23));
		 * SimpleRectangle r1 = new SimpleRectangle(17,4,4,4); SimpleRectangle r2 = new
		 * SimpleRectangle(17,4,4,4);
		 * 
		 * 
		 * System.out.println(o1.equals(o2)); o2.moveTo(42,23);
		 * System.out.println(o1.equals(o2)); System.out.println(o3.contains(v1));
		 * System.out.println(o4); System.out.println(ov1);
		 * System.out.println(r1.equals(r2)); System.out.println(r1.contains(v1));
		 */

		JFrame f = new JFrame("Mein erstes Rechteck");
		f.add(new FirstPanel());
		f.setVisible(true);
		
		
		
		
		Hund Hund1 = new Hund(31.4 ,"Dog", 4);
		System.out.println(Hund1.getLautstaerkeDB());
	}

}




