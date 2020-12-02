package drawline;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

public class MainFrame extends JFrame {
    public  MainFrame(){
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Dimension screenSize=toolkit.getScreenSize();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(screenSize.width*3/4,screenSize.height*3/4);
        this.setTitle("DrawLine");
        this.setLocationRelativeTo(null);
        this.add(new DrawLineComponent());
    }

}
