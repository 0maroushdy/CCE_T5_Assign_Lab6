package Backend;
import java.awt.Color;
import java.awt.Point;
import java.util.Map;

/**
 *
 * @author Omar
 */
public class Line extends ShapeObject {
    
    public Line(Point position, Map<String, Double> properties, Color color, Color fillColor, DrawingBase database ) {
        
        super(position, properties, color, fillColor);
        super.setUniqueName( generateUniqueName(database.getLineCounter()));
        
    }
    
    public String generateUniqueName(int serial){
        return "Line" + String.format("%02d", serial);
    }
    
   
}
