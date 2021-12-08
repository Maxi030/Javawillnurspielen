import java.util.LinkedList;
import java.util.List;

public class RemoveAnimation extends AnimationPanel {

	public void doChecks(){
	    List<GameObject>toRemove = new LinkedList<GameObject>();
	    for (GameObject g1 :gos){
	        for (GameObject g2 :gos){
	            if (g1!=g2 && g1.touches(g2)){
	                if (g1.isLargerThan(g2)){
	                    toRemove.add(g2);
	                } else {
	                    toRemove.add(g1);
	                }
	                
	            }
	        }
	    }
	    System.out.println(toRemove);
	  	 gos.removeAll(toRemove);
	}
}