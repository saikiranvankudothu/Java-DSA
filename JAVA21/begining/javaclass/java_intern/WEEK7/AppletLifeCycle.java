import java.applet.*;
import java.awt.Graphics;

// Define a basic applet class
public class AppletLifeCycle extends applet {
    // Initialization method
    public void init() {
        // Perform initialization tasks
        System.out.println("Initializing the applet");
    }

    // Start method
    public void start() {
        // Perform actions when the applet is started
        System.out.println("Starting the applet");
    }

    // Paint method
    public void paint(Graphics g) {
        // Draw graphics or perform visual tasks
        System.out.println("Painting the applet");
        g.drawString("Hello, Applet!", 20, 20);
    }

    // Stop method
    public void stop() {
        // Perform actions when the applet is stopped
        System.out.println("Stopping the applet");
    }

    // Destroy method
    public void destroy() {
        // Perform cleanup tasks when the applet is destroyed
        System.out.println("Destroying the applet");
    }
}
