import javax.swing.*;
import java.awt.event.*;
import util.ShowInFrame;
public class ButtonAnimation extends JPanel{

	JButton b = new JButton("push to move");
	MoveablePanel mp = new MoveablePanel();
	
	ButtonAnimation() {
	add(mp);
	add(b);
	
	b.addActionListener(new ActionListener()  {
	
	public void actionPerformed(ActionEvent e) {
		mp.doOnTick();
	}
	});
	}	





}
