import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import util.ShowInFrame;
public class SimpleButton extends JPanel {
	
	JButton b = new JButton("push positiv");
	JButton c = new JButton("push negativ");
	JButton d = new JButton("set Null");
	JLabel l = new JLabel("000");
	
	SimpleButton() {
		add(b);
		add(c);
		add(d);
		add(l);
		
}

	
	




}