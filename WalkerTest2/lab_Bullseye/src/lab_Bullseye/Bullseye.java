package lab_Bullseye;

import java.awt.*;
import javax.swing.*;

public class Bullseye extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		
		//creates large red circle behind everything
		g.setColor(Color.RED);
		g.fillOval(xCenter-10,  yCenter-10,  50,  50);
		//creates medium sized white circle inbetween the red circles
		g.setColor(Color.WHITE);
		g.fillOval(xCenter-3, yCenter-3, 35, 35);
		//creates the red bullseye or center
		g.setColor(Color.RED);
		g.fillOval(xCenter+5,  yCenter+5,  20,  20);
		
		//This draws text instructions and point
		g.setColor(Color.blue);
		g.drawString("Try to hit the blue bulleye with your cursor!", 20, 20);
		//Draws the blue cursor.
		g.setColor(Color.BLUE);
		g.fillOval(xCenter+12, yCenter+12, 5, 5);
		
	}
	
	public static void main(String[] args)
	  {
	    JFrame window = new JFrame("Red Cross");
	    window.setBounds(300, 300, 200, 200);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    Bullseye panel = new Bullseye();
	    panel.setBackground(Color.WHITE);
	    Container c = window.getContentPane();
	    c.add(panel);
	    
	    window.setVisible(true);
	  }
	}


