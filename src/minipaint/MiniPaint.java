package minipaint;

import Frontend.MainPage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiniPaint {

    public static void main(String[] args) {
        int WIDTH = 970;
        int HIGHT = 480;

        MainPage fr1 = new MainPage();
        fr1.setTitle("Vector Drawing Application");
        fr1.setVisible(true);
        
        fr1.setPreferredSize(new Dimension(WIDTH, HIGHT));
        fr1.setMinimumSize(new Dimension(WIDTH, HIGHT));
        fr1.setMaximizedBounds( WIDTH, HIGHT );
        fr1.setResizable(false);
        
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.setLocationRelativeTo(null);
        
        
        
        
//        JPanel mainPnl = new JPanel();
//        fr1.add( mainPnl);
//        mainPnl.setVisible(true);
//        mainPnl.setBackground(Color.red);
//        Point p = new Point();
//        p.x = 4; p.y = 4;
//        mainPnl.setLocation(p);
        
        
        
        
        fr1.getContentPane().setBackground(new Color(240, 240,250));
        
    }
    
}
