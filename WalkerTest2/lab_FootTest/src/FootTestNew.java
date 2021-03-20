// Author: Ed Taylor
//Assigned to Kamran Hussain
// Date:   10/20/2019
//Date: 10.23.2020
// Rev:    03
// Notes:
// 02 this version is a modified version of the text book example
//    this version moves instantiation of the foot object out of the
//    paintComponent() method.


//Made two functions
//One rotates shoes 90 degrees and creates a box with side lengths of 100
//Second faced all four shoes northwardly in a horizontal line


import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class FootTestNew extends JPanel
{
  private Image shoe;
  
  // the FootTestNew class now has an x, y coordinate and a foot
  private int x = 300; // variable name not the best style but left for comparison
  private int y = 100; // variable name not the best style but left for comparison
  private int stepLength = 100;
  private Foot foot;  //

  // Constructor
  public FootTestNew() {
    shoe = (new ImageIcon("leftshoe.gif")).getImage(); //image for shoe brought to life
    foot = new Foot(300, 100, shoe); // foot is brought to life
    
  }

  // Called automatically when the panel needs repainting
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    // no foot instantiation here, all we do is draw the foot now
    for (int count = 1; count <= 4; count++) {
      
   	  foot.turn(270); 				//rev 1
      foot.draw(g);					//puts feet in horizontal line and vertically (upward) facing toes
      foot.turn(90);
      foot.moveForward(stepLength);
    	
      	//foot.draw(g);								//rev 02
    	//foot.moveForward(stepLength/2);			//these functions rotate the shoes for a square.
    	//foot.moveSideways(stepLength);
      	//foot.turn(90);
      
      //foot.draw(g);								//R&D
      //foot.moveForward(stepLength);
      //foot.moveForward(stepLength);
      //foot.turn(45);
      
    }

    // Draw a cursor at the expected center of the first "shoe":
    g.drawLine(x - 50, y, x + 50, y);
    g.drawLine(x, y - 50, x, y + 50);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Feet");
    window.setBounds(100, 100, 500, 480);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    FootTestNew panel = new FootTestNew();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);

    window.setVisible(true);
  }
}

