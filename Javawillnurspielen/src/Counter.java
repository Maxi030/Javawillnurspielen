import javax.swing.*;
import java.awt.event.*;
public class Counter extends SimpleButton {
	public int i= 0;
	public Counter() {
		b.addActionListener(
				
		new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				i++;
				l.setText(""+i);
			}
					
		}
		
	);
	
			c.addActionListener(
					
			new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					i= 0;
					l.setText(""+i);
	}
	 
			}
			);
d.addActionListener(
			
			new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					i --;
					l.setText(""+i);
	}
	 
			}
			);

}
}




