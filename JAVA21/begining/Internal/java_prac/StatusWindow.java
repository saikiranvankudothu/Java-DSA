import java.awt.*;
import java.applet.*;

/* <applet code="StatusWindow" width=300 height=50></applet> */
public class StatusWindow extends Applet {
    public void init() {
        setBackground(Color.cyan);
    }

    public void paint(Graphics g) {
        drawContent(g);
        showStatus("This is shown in the status window.");
    }

    private void drawContent(Graphics g) {
        g.drawString("This is in the applet window.", 10, 20);
    }
}
