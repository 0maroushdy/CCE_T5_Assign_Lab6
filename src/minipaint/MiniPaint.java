package minipaint;

import Frontend.MainPage;
import java.awt.Color;

public class MiniPaint {

    public static void main(String[] args) {
        // TODO code application logic here
        MainPage fr1 = new MainPage();
        fr1.setLocationRelativeTo(null);
        fr1.setVisible(true);
        fr1.getContentPane().setBackground(new Color(240, 240,250));
        fr1.setTitle("Vector Drawing Application");
        
    }
    
}
