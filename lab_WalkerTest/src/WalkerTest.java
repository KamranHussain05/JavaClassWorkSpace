//Author: Kamran Hussain
//Date:   10/20/2019
//Date: 10.23.2020		Finished: 11.16.20
//Rev:    03

//Notes:
//01 Original FootTest Project

//02 Drew all shoes using for loops, incorrect method

//further edits are commented in 3 examples and one R&D section outlined below. 

//03
//The first example prints a series of shoes in 4 columns of 2
//The second example prints 4 columns of shoes with the third column blank
//The third example prints 4 columns of shoes with the first and last columns double rows of shoes, and the second column
//


import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class WalkerTest extends JPanel
{
  private Image leftShoe;
  private Image rightShoe;
  //private Image Shoe;
  
  // the FootTestNew class now has an x, y coordinate and a foot
  private int x = 300; // variable name not the best style but left for comparison
  private int y = 100; // variable name not the best style but left for comparison
  private int stepLength = 100;
  private Walker walker; 

  // Constructor
  public WalkerTest() {
    leftShoe = (new ImageIcon("leftshoe.gif")).getImage();
    rightShoe = (new ImageIcon("rightshoe.gif")).getImage();//image for shoe brought to life
    walker = new Walker(300, 100, leftShoe, rightShoe); // foot is brought to life
    
  }

  // Called automatically when the panel needs repainting
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);	

    // no foot instantiation here, all we do is draw the foot now
    
//**********EXAMPLE 1**************
   
    //first row of shoes
    walker.draw(g);
    walker.firstStep();
    walker.stop();
    //second row of shoes
    walker.draw(g);
    walker.firstStep();
    walker.stop(); 
    //third row of shoes
    walker.draw(g);
    walker.firstStep(); 
    walker.stop();
    //fourth row of shoes
    walker.draw(g);
    walker.firstStep();
    walker.stop();
    
//************ END EXAMPLE 1 ***************
    
//	*********BEGIN EXAMPLE 2***********

    walker.draw(g);
    walker.firstStep();
    walker.draw(g);
    walker.stop();
    walker.draw(g);
    walker.nextStep();
    walker.draw(g);
    walker.nextStep();
    walker.draw(g);

//*******EXAMPLE 3***********

    walker.draw(g);
    walker.firstStep();
    walker.draw(g);
    walker.nextStep();
    walker.draw(g);
    walker.nextStep();
    walker.stop();
    walker.draw(g);
    walker.firstStep();
    walker.stop();
    
//*******END EXAMPLE 3***********
//************R&D***************

    walker.draw(g);
    walker.firstStep();
    walker.draw(g);
    walker.nextStep();
    walker.draw(g);
    walker.nextStep();
    walker.draw(g);
    walker.nextStep();
    walker.draw(g);
    walker.nextStep();
    walker.draw(g);
    walker.nextStep();
    walker.draw(g);
    walker.stop();
    walker.draw(g);
    walker.firstStep();
    
//  ********* END *************
   
  }
  

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Walker");
    window.setBounds(100, 100, 900, 280);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    WalkerTest panel = new WalkerTest();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);

    window.setResizable(false);
    window.setVisible(true);
  }
  
 
}

