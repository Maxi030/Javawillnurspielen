import javax.swing.*;
import java.awt.event.*;
import util.ShowInFrame;
public class SimpleAnimation extends MoveablePanel{
	
	Timer t =new Timer(30,new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		doOnTick();
		}
	});
	
	SimpleAnimation() {
		t.start();
		t.stop();

}
}