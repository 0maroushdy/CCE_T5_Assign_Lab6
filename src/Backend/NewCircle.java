
package Backend;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Omar
 */
public class NewCircle extends javax.swing.JPanel {

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

    /**
     * Creates new form NewCircle
     */
    public NewCircle() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
