import java.awt.*;  
import java.applet.*;  
  
/** Create an applet that loads abd display a .jpg image on it */

public class DisplayImage extends Applet {  
  
    
  public void paint(Graphics g) { 
    Image picture;
    picture = getImage(getDocumentBase(),"puppy.jpg"); 
    g.drawImage(picture,0,0, getWidth(),getHeight(), this);  
  }  
      
}  