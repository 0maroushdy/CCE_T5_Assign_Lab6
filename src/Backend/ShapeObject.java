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
    
    // ------------------**Constractor**--------------------
    public ShapeObject(Point position, Map<String, Double> properties, Color color, Color fillColor) {
        this.position = position;
        this.properties = properties;
        this.color = color;
        this.fillColor = fillColor;
    }
    
    // ------------------**set shape postion**--------------------
    @Override
    public void setPosition(Point position){
        this.position.x = position.x;
        this.position.y = position.y;
    }  

    @Override
    public Point getPosition(){        
        return position;
    }

    // ------------------**update properties**--------------------
    @Override
    public void setProperties(Map<String, Double> properties){
        this.properties = properties;
    }
    
    @Override
    public Map<String, Double> getProperties(){
        return properties;
    }

    // ------------------**colorize**--------------------
    @Override
    public void setColor(Color color){
        this.color = color;
    }
    @Override
    public Color getColor(){
        return color;
    }
    @Override
    public void setFillColor(Color fillColor){
        this.fillColor = fillColor;
    }
    @Override
    public Color getFillColor(){
        return fillColor;
    }

    // ------------------**redraw the shape on the canvas**--------------------
    @Override
    public void draw(java.awt.Graphics canvas){
        
    }
    
    
}
