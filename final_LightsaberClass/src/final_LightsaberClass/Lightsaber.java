//Author: Kamran Hussain
//Date: 12/14/20
//Rev01
//Notes: Also on Poster

package final_LightsaberClass;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class Lightsaber extends JPanel {

	private boolean ignition;
	private int bladeLength;
	private Color kyberCrystal;
	private boolean jedi;
	private boolean bladeContact;
	
	public Lightsaber (boolean ignition, boolean jedi, boolean bladeContact, int bladeLength, Color kyberCrystal) {
		this.ignition = true;
		this.jedi = true;
		this.bladeContact = false;
		this.bladeLength = 0;
		this.kyberCrystal = Color.BLUE;
	}
	
	
	public void lightsaberIgnition (int imperialMeasurement, Graphics g) {
		imperialMeasurement = 30; //represents 1 foot
		
		if (jedi == true) {
			kyberCrystal = Color.BLUE;
		} else {
			kyberCrystal = Color.RED;
		}
		 
		if (ignition = true) {
			super.paintComponent (g);
			g.setColor(kyberCrystal);
			
			bladeLength = 3*imperialMeasurement;
		} else 
			bladeLength = 0;
		bladeContact = false;
	}
	
	public Color ligthsaberContact (Color clash) {
		
		if (bladeContact == true) {
			clash = Color.YELLOW;
		}
		
		kyberCrystal = clash;
		return kyberCrystal;
	}
}
