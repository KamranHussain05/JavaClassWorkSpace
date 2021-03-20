//Author: Kamran Hussain
//Date: 10.18.2020
//Rev: 03
//Notes: File name is purposefully spelled incorrectly due to other file with same name. 

import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class RedCrosss
{

	// Fields
	
	// Constructors 
	public RedCrosss() {
		
	}

	// Methods
	
	// Draws a red cross centered between (0, 0) and (xWidth, xHeight)
	public void draw (Graphics g, int xWidth, int yHeight)
	{
		int xCenter = xWidth / 2;
	    int yCenter = yHeight / 2;
		
	    
	    g.setColor(Color.RED);
	    //g.setColor(Color.BLUE);
	    g.fillRect(xCenter, yCenter-20, 10, 50);
	    //g.setColor(Color.GREEN);
	    g.fillRect(xCenter-20, yCenter, 50, 10);
	}
	
}

