import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class GraphicsApplet extends Applet {

    public void paint(Graphics g) {
        // Draw a face
        drawFace(g);

        // Draw a house
        drawHouse(g);

        // Draw a car
        drawCar(g);

        // Draw movable objects
        drawMovableObjects(g);
    }

    private void drawFace(Graphics g) {
        // Draw face outline
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 100, 100);

        // Draw eyes
        g.setColor(Color.BLACK);
        g.fillOval(75, 80, 10, 10);
        g.fillOval(115, 80, 10, 10);

        // Draw mouth
        g.drawArc(75, 80, 50, 50, 180, 180);
    }

    private void drawHouse(Graphics g) {
        // Draw house body
        g.setColor(Color.BLUE);
        g.fillRect(200, 50, 100, 100);

        // Draw roof
        int[] xPoints = {200, 250, 300};
        int[] yPoints = {50, 20, 50};
        g.setColor(Color.RED);
        g.fillPolygon(xPoints, yPoints, 3);

        // Draw door
        g.setColor(Color.YELLOW);
        g.fillRect(230, 100, 40, 50);
    }

    private void drawCar(Graphics g) {
        // Draw car body
        g.setColor(Color.GREEN);
        g.fillRect(50, 200, 100, 50);

        // Draw wheels
        g.setColor(Color.BLACK);
        g.fillOval(60, 250, 20, 20);
        g.fillOval(120, 250, 20, 20);
    }

    private void drawMovableObjects(Graphics g) {
        // Draw a simple movable object
        g.setColor(Color.ORANGE);
        g.fillRect(200, 200, 30, 30);
    }
}
