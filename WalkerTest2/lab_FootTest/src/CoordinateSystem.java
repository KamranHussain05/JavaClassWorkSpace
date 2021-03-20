import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

//Edits: Kamran Hussain
//Changed shoe positions for seamless square format.

public class CoordinateSystem
{
  private Image picture;
  private AffineTransform coordTransform;

   //  0 degrees points east
  public CoordinateSystem(int x, int y, Image pic)
  {
    picture = pic;
    coordTransform = new AffineTransform();

    int w = picture.getWidth(null) / 2;
    int h = picture.getHeight(null) / 2;
    coordTransform.translate(x - w, y - h);
  }

  //public void shift(double dx, double dy-25) //Image spacing; -25 for the Square
  //{
  
  public void shift(double dx, double dy) //no edits for line of northward facing shoes
  {
    coordTransform.translate(dx-50, dy); 
  }

  public void rotate(double radians)
  {
    int w = picture.getWidth(null);
    int h = picture.getHeight(null);
    coordTransform.rotate(radians, w/2, h/2);
  }

  public void drawImage(Graphics g, Image picture)
  {
    ((Graphics2D)g).drawImage(picture, coordTransform, null);
  }
}

