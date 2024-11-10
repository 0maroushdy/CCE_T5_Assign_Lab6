package Backend;

import java.awt.Graphics;
import java.util.ArrayList;

public class DrawingBase implements DrawingEngine {
    private ArrayList<ShapeObject> data;
    private int size;
    private int circleCounter;
    private int lineCounter;
    private int rectangelCounter;
    private int squareCounter;
    
    //------------------**Constr.**------------------
    public DrawingBase() {
        this.data = new ArrayList<ShapeObject>();
        this.size = 0;
        this.circleCounter = 0;
        this.lineCounter = 0;
        this.rectangelCounter = 0;
        this.squareCounter = 0;
    }
 
    //------------------**getters**------------------
    public ArrayList<ShapeObject> getData() {
        return data;
    }

    public int getSize() {
        return size;
    }

    public int getCircleCounter() {
        return circleCounter;
    }

    public int getLineCounter() {
        return lineCounter;
    }

    public int getRectangelCounter() {
        return rectangelCounter;
    }

    public int getSquareCounter() {
        return squareCounter;
    }
    
    //------------------**Functions**------------------
    @Override
    public void addShape(ShapeObject shape) {
        data.add(shape);
    }

    @Override
    public void removeShape(ShapeObject shape) {
        data.remove(shape);
//
    }

    @Override
    public ShapeObject[] getShapes() {
//
    return data.toArray(new ShapeObject[0]);
    }

    @Override
    public void refresh(Graphics canvas) {
        
//
     }
    
    
}
