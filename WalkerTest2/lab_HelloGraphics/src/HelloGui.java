/**
 *  This program displays a message in a window.
 *  rev 02: removed super GUI demo replaced with void paintComponent
 *  Date: 10/20/2020
 *  
 *  Author: Kamran Hussain
 *  Date: 10/20/2020
 *  Rev: 02
 *  Notes: 
 */

import java.awt.*;
import javax.swing.*;


public class HelloGui extends JPanel  {   //JPanel //JFrame changed to JPanel for compatibility with paint component 
	
 public HelloGui()  { //Constructor
 
  
	//super("GUI Demo");    // Set the title bar
    //Container c = getContentPane();
    /// c.setBackground(Color.CYAN);
    //c.add(new JTextField(" Hello, GUI!", 10));
  }
  
  public void paintComponent(Graphics g) {
	  
	  super.paintComponent(g);
	  g.setColor(Color.WHITE);
	  //g.setFont(ITALIC);                  // Attempted to change the font style of the printed text
	  g.drawString("Hello GUI!", 55, 55);
  }


  public static void main(String[] args) {                    //Had to replace this chunk of code because it wouldn't compiler
    JFrame window = new JFrame("Hello GUI!");
    //HelloGui window = new HelloGui();
    // Set this window's location and size:
    // upper-left corner at 300, 300; width 200, height 100
    window.setBounds(300, 300, 400, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
  
    HelloGui panel = new HelloGui();
    panel.setBackground(Color.BLUE);
    Container c = window.getContentPane();
    c.add(panel);
    
    window.setVisible(true);
  }
  
}


