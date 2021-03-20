//Author: Kamran Hussain
//Date: 12/2/2020
//Rev 01
//Notes: converting from inches to football fields.
//This is the Research and Development part of my Lab

package lab_TotalWages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UselessConversions extends JFrame
implements ActionListener
{
	private JTextField inputFields, display;
	private DecimalFormat money = new DecimalFormat("0.00");

	public UselessConversions()
	{
		super("Football Fields to Inches");

		JPanel panel = new JPanel();
	    panel.setLayout(new GridLayout(3,2));

	    panel.add(new JLabel("   FootBall Fields:"));
	    inputFields = new JTextField(5);
	    inputFields.setHorizontalAlignment(JTextField.RIGHT);
	    panel.add(inputFields);
	    

	    panel.add(new JLabel("   Total Length:"));
	    display = new JTextField(20);
	    display.setHorizontalAlignment(JTextField.RIGHT);
	    display.setEditable(false);
	    display.setBackground(Color.yellow);
	    panel.add(display);

	    JButton calc = new JButton("Calculate Length");
	    calc.addActionListener(this);

	    Container c = getContentPane();
	    c.add(panel, BorderLayout.CENTER);
	    c.add(calc, BorderLayout.SOUTH);
	}

	public double footballInches(double footballFields)
	{
		double numberofFields = 120.0*footballFields;
		double inches;
		inches = numberofFields*36;
		return inches;
	}

	public void actionPerformed(ActionEvent e)
	{
		String s = inputFields.getText();
  		double footballFields = Double.parseDouble(s);
  		s = inputFields.getText();
  	    double inches = footballInches(footballFields);
  	    display.setText(money.format(inches));
  	    
  	
	}
	//window generation
	public static void main(String[] args)
	{
		UselessConversions window = new UselessConversions();
		window.setBounds(300, 300, 200, 150);
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
}