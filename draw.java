import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class draw extends JComponent {
    
    private int width;
    private int heigth;
    private static Graphics2D g2D;
    private static Rectangle2D.Double r;
    private static Rectangle2D.Double r2;
    private static Rectangle2D.Double r3;
    
    public draw(int w,int h) {
        width = w;
        heigth = h;
    }
    protected void paintComponent(Graphics g) {
    g2D = (Graphics2D) g;
    
    r = new Rectangle2D.Double(0,0,500,500);
    g2D.setColor(new Color(100,149,237));
    g2D.fill(r);
    
    Rectangle2D.Double r2 = new Rectangle2D.Double(50,50,400,400);
    g2D.setColor(new Color(129,129,129));
    g2D.fill(r2);
    
    r3 = new Rectangle2D.Double(80,80,340,340);
    g2D.setColor(new Color(0,0,0));
    g2D.fill(r3);
    }
}
