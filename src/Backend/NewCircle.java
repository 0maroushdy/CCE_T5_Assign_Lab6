package Backend;
import javax.swing.*;
import java.awt.*;

public class NewCircle extends JPanel {
    private int x;
    private int y;
    private double radius;
    private Color color;

    // Constructor to initialize values
    public NewCircle(int x, int y, double radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Call superclass method to ensure proper rendering
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.fillOval(x, y, (int)(radius * 2), (int)(radius * 2)); // Draw the circle
    }
}
