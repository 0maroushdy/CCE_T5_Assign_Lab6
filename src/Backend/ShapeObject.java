package Backend;

import java.awt.Color;
import java.awt.Point;
import java.util.Map;

/**
 *
 * @author Omar
 */
public abstract class ShapeObject implements Shape {
    
    private Point position;
    private Map<String, Double> properties;
    private Color color;
    private Color fillColor;
    
    // set a shape postion
    @Override
    public void setPosition(Point position){
        
    }  
    @Override
    public Point getPosition(){     
       
        return position;
    }

    // update properties
    @Override
    public void setProperties(Map<String, Double> properties){
        
    }
    @Override
    public Map<String, Double> getProperties(){
        return properties;
    }

    // colorize 
    @Override
    public void setColor(Color color){
        
    }
    @Override
    public Color getColor(){
        return color;
    }
    @Override
    public void setFillColor(Color color){
        
    }
    @Override
    public Color getFillColor(){
        
        return fillColor;
    }

    // redraw the shape on the canvas
    @Override
    public void draw(java.awt.Graphics canvas){
        
    }
    
    
}
