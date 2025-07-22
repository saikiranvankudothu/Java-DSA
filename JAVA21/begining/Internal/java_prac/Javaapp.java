import java.applet.*;
import java.awt.Graphics;

public class Javaapp extends Applet {
    private int i;

    public void paint(Graphics g) {
        g.drawString("i = " + i, 100, 100);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        i++;
        repaint();
    }
}
