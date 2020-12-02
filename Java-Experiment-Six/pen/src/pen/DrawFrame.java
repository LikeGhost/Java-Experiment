package pen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Point2D;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;

public class DrawFrame extends JFrame  {
    private PenComponent penComponent;
    public static void writeToFile(ArrayList<PointSet>pointSets)throws FileNotFoundException {
        for(int i=0;i<pointSets.size();i++){
            PointSet pointSet= pointSets.get(i);
            PrintWriter out=new PrintWriter(Integer.toString(i)+".txt");
            for(Point2D.Double point:pointSet.getData()){
                out.println(point.toString());
            }
            out.close();
        }

    }
    public DrawFrame() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(screenSize.width * 3 / 4, screenSize.height * 3 / 4);
        this.setTitle("Pen");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        penComponent=new PenComponent();
        this.add(penComponent);
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {

                try {
                    writeToFile(penComponent.pointSets);
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }

            }
        });
    }



}
