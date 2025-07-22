import java.applet.Applet;
import java.awt.Graphics;

public class AppletLifeCycleExample extends Applet {

    // Initialization method (called once)
    public void init() {
        System.out.println("Applet initialized");
    }

    // Start method (called after init, and also when applet is revisited)
    public void start() {
        System.out.println("Applet started");
    }

    // Paint method (called whenever the applet needs to be redrawn)
    public void paint(Graphics g) {
        System.out.println("Applet painted");
        g.drawString("Hello, Applet!", 20, 20);
    }

    // Stop method (called when the applet is no longer visible)
    public void stop() {
        System.out.println("Applet stopped");
    }

    // Destroy method (called when the applet is about to be unloaded)
    public void destroy() {
        System.out.println("Applet destroyed");
    }
}
