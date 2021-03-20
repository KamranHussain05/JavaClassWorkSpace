//  This program shows simple graphics in a window.
//Author: Kamran Hussain
//Date: 10/20/2020
//Rev 03
//Notes: original lines are commented as ORIGINAL
//		 I figured out how to fix HelloGUI.java and print the plain text on the console

import java.awt.*;
import javax.swing.*;

public class HelloGraphics extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //  to paint the background
 
    //  g.setColor(Color.RED); ORIGINAL 
    g.setColor(Color.BLUE);

    // Draw a 150 by 45 rectangle with the upper-left
    // corner at x = 20, y = 40: 
    //ORIGINAL g.drawRect(20, 40, 150, 45);  
    g.fillRect(130, 105, 150, 45); 
    
   // g.setColor(Color.BLUE); ORIGINAL
    g.setColor(Color.WHITE);
    // Draw a string of text starting at x = 55, y = 65:
    g.drawString("Hello, Graphics!", 155, 133);
  }

  public static void main(String[] args)  {
    JFrame window = new JFrame("Hello Graphics!"); //Original title was "Graphics Demo"
    
    // Set this window's location and size:
    // upper-left corner at 300, 300; width 200, height 150
   //ORIGINAL  window.setBounds(300, 300, 200, 150);
    window.setBounds(300, 300, 400, 300);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    HelloGraphics panel = new HelloGraphics();
    panel.setBackground(Color.WHITE);  // the default color is light gray
    Container c = window.getContentPane();
    c.add(panel);
    
    window.setVisible(true);
  }
}

