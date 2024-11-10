package Backend;
import java.awt.Color;
import java.awt.Point;
import java.util.Map;

/**
 *
 * @author Omar
 */
public class Rectangle extends ShapeObject {
    
    public Rectangle(Point position, Map<String, Double> properties, Color color, Color fillColor, DrawingBase database ) {
        
        super(position, properties, color, fillColor);
        super.setUniqueName( generateUniqueName(database.getRectangelCounter()));
        
    }
    
    public String generateUniqueName(int serial){
        return "Rectangle" + String.format("%02d", serial);
    }
    
   
}
