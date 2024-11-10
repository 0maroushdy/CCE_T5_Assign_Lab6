package Backend;
import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Omar
 */
public class Circle extends ShapeObject {
    
    public Circle(Point position, Map<String, Double> properties, Color color, Color fillColor, DrawingBase database ) {
        
        super(position, properties, color, fillColor);
        super.setUniqueName( generateUniqueName(database.getCircleCounter()));
        
    }
    
    public String generateUniqueName(int serial){
        return "Circle" + String.format("%02d", serial);
    }
    
    
   
}
