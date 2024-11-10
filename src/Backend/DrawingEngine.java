package Backend;

/**
 *
 * @author Omar
 */
public interface DrawingEngine {
    
    // Manage shape objects
    public void addShape(Shape shape);
    public void removeShape(Shape shape);
    
    // return the created shape 
    public Shape[] getShapes();
    
    // redraw all shapes
    public void refresh(java.awt.Graphics canvas);

    
    
}
