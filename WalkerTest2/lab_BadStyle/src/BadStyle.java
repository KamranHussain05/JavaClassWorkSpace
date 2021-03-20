//Author: Kamran Hussain
//Date: 11.10.2020
//Rev: 02
//Notes: R&D included improving colors and adding windows, door, and door knob. 

import java.awt.*;
import javax.swing.*; 

public class BadStyle extends JPanel 
{
	public void paintComponent(Graphics GRAPHICS) 
	{
		
		super.paintComponent (GRAPHICS);
		
			GRAPHICS.setColor(Color.GREEN);
			//GRAPHICS.setColor(Color.RED); 
			GRAPHICS.fillRect(120, 20, 17, 40);
			GRAPHICS.setColor(Color.RED);    
			//GRAPHICS.setColor(Color.DARK_GRAY);                         
			GRAPHICS.fillRect(30, 40, 130, 45); 
			GRAPHICS.setColor(Color.BLUE);
			
			
//			//Windows and Door and Door knob
//			GRAPHICS.setColor(Color.YELLOW);
//			GRAPHICS.fillRect(70,  50,  15,  30);
//			GRAPHICS.setColor(Color.BLUE);
//			GRAPHICS.fillRect(45, 50, 15, 15);
//			GRAPHICS.fillRect(95, 50, 15, 15);
//			GRAPHICS.fillRect(115, 50, 15, 15);
//			GRAPHICS.fillRect(135, 50, 15, 15);
//			GRAPHICS.setColor(Color.BLACK);
//			GRAPHICS.fillOval(78, 60, 5, 5);
			
			
		Polygon thisisapolygon = new Polygon();
		
			thisisapolygon.addPoint(30, 40);
			thisisapolygon.addPoint(160, 40);
			thisisapolygon.addPoint(95, 20);
			GRAPHICS.fillPolygon(thisisapolygon);  
	}
	
	public static void main(String[] args) 
	{
		JFrame purpleDinosaur = new JFrame("Graphics Demo");
		purpleDinosaur.setBounds(300, 300, 200, 150);
		purpleDinosaur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		BadStyle panel = new BadStyle();     
		panel.setBackground(Color.WHITE);
		Container c = purpleDinosaur.getContentPane();
		c.add(panel);
		
		purpleDinosaur.setVisible(true);
	}
}
