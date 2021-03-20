//Author: Kamran Hussain
//date: 11/16/2020
//Rev01 Drew all step susing for loops that are static
//Rev02 tried to make for loops moveable
//Rev03 fixed method of doing the lab and created a new walker class.
//Notes:
// This class represents a walker with two feet.

import java.awt.Image;
import java.awt.Graphics;
import java.awt.Color;

public class Walker
{
  public static final int PIXELS_PER_INCH = 6;
  private Foot leftFoot, rightFoot;
  private int stepLength;
  private int stepsCount;
  
  // Constructor
  public Walker(int x, int y, Image leftPic, Image rightPic)		//constructors have the same name as the class   
  {
    leftFoot =  new Foot(x, y - PIXELS_PER_INCH * 4, leftPic);
    rightFoot = new Foot(x, y + PIXELS_PER_INCH * 4, rightPic);
    stepLength = PIXELS_PER_INCH * 9;
  }  
  
  // Returns the left foot
  public Foot getLeftFoot()
  {
    return leftFoot;
  }

  // Returns the right foot
  public Foot getRightFoot()
  {
    return rightFoot;
  }

  // Makes first step, starting with the left foot
  public void firstStep()
  {
    leftFoot.moveForward(2*stepLength);
    stepsCount = 1;
  }

  // Makes next step
  public void nextStep()
  {
    if (stepsCount % 2 == 0)  // if stepsCount is even
      leftFoot.moveForward(4 * stepLength);
    else  
      rightFoot.moveForward(4 * stepLength);

    stepsCount++;  // increment by 1
  }

  // Stops this walker (brings its feet together)
  public void stop()
  {
	  if (stepsCount % 2 == 0)  // if stepsCount is even
	      leftFoot.moveForward(2 * stepLength);
	    else  
	      rightFoot.moveForward(2 * stepLength);

	    stepsCount++;
  }

  // Returns the distance walked
  public int distanceTraveled()
  {
    return stepsCount * stepLength;
  }

  // Draws this walker
  public void draw(Graphics g)
  {
	  leftFoot.draw(g);
	  rightFoot.draw(g);
  }
  
}





