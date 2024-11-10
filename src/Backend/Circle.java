package Backend;
import java.awt.Color;
import java.awt.Point;
import java.util.Map;

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
