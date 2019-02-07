package cihan.kurs.odev9.swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AnaFrame extends JFrame{
	public AnaFrame() {
		getContentPane().setLayout(null);
		setBounds(400, 200, 500, 500);
		setVisible(true);
		
		JButton btn1 = new JButton("Frame Tam Ekran");
		btn1.setBounds(12, 13, 150, 25);
		getContentPane().add(btn1);
		btn1.setVisible(true);
		JButton btn2 = new JButton("Frame Ortala");
		btn2.setBounds(222, 13, 150, 25);
		getContentPane().add(btn2);
		btn2.setVisible(true);
		

		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (btn1.getText().equals("Frame Resize"))
			  {setBounds(400, 200, 500, 500);
			  btn1.setText("Frame Tam Ekran");}
			else
			   {setExtendedState(JFrame.MAXIMIZED_BOTH); 
				btn1.setText("Frame Resize");}
			}
		});
		 
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 setLocationRelativeTo(null);
			}
		});
		
	}
	
}
