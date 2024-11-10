package Backend;

/**
 *
 * @author Omar
 */
public interface DrawingEngine {
    
    // Manage shape objects
    public void addShape(ShapeObject shape);
    public void removeShape(ShapeObject shape);
    
    // return the created shape 
    public ShapeObject[] getShapes();
    
    // redraw all shapes
    public void refresh(java.awt.Graphics canvas);

    
    
}
