package Backend;
import java.awt.Color;
import java.awt.Point;
import java.util.Map;

/**
 *
 * @author Omar
 */
public class Square extends ShapeObject {
    
    public Square(Point position, Map<String, Double> properties, Color color, Color fillColor, DrawingBase database ) {
        
        super(position, properties, color, fillColor);
        super.setUniqueName( generateUniqueName(database.getSquareCounter()));
        
    }
    
    public String generateUniqueName(int serial){
        return "Square" + String.format("%02d", serial);
    }
    
   
}
