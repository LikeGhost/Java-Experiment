package drawline;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class DrawLineComponent extends JComponent implements MouseListener, MouseMotionListener {

    private PointSet[] pointSets;
    Dimension screenSize;
    public void PointMakeShape(Graphics2D pen,Point2D.Double[] arr){
        for(int i = 0; i< arr.length-1; i++) {
            pen.draw(new Line2D.Double(arr[i],arr[i + 1]));
        }
    }
    public DrawLineComponent() {

        Toolkit toolkit=Toolkit.getDefaultToolkit();
        this.screenSize=toolkit.getScreenSize();
        pointSets=new PointSet[2];
        pointSets[0]=new PointSet();
        for(int i = 0; i< 501; i++) {
            pointSets[0].addData(new Point2D.Double(200 * Math.PI / 250 * i + screenSize.width * 3.0 / 8 - Math.PI * 200, 200 * Math.sin(Math.PI / 250 * i) + screenSize.height * 3.0 / 8));
        }
        pointSets[1]=new PointSet();
        for(int i = 0; i< 501; i++){
            pointSets[1].addData(new Point2D.Double(200*Math.PI/250*i+screenSize.width*3.0/8-Math.PI*200,200*Math.cos(Math.PI/250*i)+screenSize.height*3.0/8));
        }
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D pen=(Graphics2D)g;
        pen.draw(new Line2D.Double(0,screenSize.height*3.0/8,screenSize.width,screenSize.height*3.0/8));
        pen.draw(new Line2D.Double(screenSize.width*3.0/8,0,screenSize.width*3.0/8,screenSize.height));

        for(PointSet out:pointSets){
            PointMakeShape(pen,out.getData());
        }
    }

    private int selection=0;
    private PointSet selPointDate;
    private Point2D.Double selPoint;
    private Point2D.Double now=new Point2D.Double();
    private Point2D.Double pressed=new Point2D.Double();
    public void getSelPointData(int x, int y){
        for (PointSet checkShape : pointSets) {
            for (Point2D.Double checkPoint : checkShape.getData()) {
                if (x <=checkPoint.getX()+5&&x>=checkPoint.getX()-5 &&
                        y<=checkPoint.getY()+5 &&y>=checkPoint.getY()-5) {
                    selPointDate=checkShape;
                    selPoint=checkPoint;
                    return;
                }
            }
        }
        selPointDate=null;
        selPoint=null;
    }
    public void setSelPointData(Point2D.Double pressed, Point2D.Double now){
        ArrayList<Point2D.Double> data=new ArrayList<>();
        Point2D.Double[] get=selPointDate.getData();
        for (Point2D.Double checkPoint : get) {
            checkPoint.setLocation(checkPoint.getX()+now.getX()-pressed.getX(),checkPoint.getY()+now.getY()-pressed.getY());
            data.add(checkPoint);
        }
        selPointDate.setData(data);
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        pressed.setLocation(e.getX(),e.getY());
        getSelPointData((int)pressed.getX(), (int)pressed.getY());

        if(selPointDate!=null) {
            if (e.getButton() == MouseEvent.BUTTON1) {
                this.setCursor(new Cursor((Cursor.CROSSHAIR_CURSOR)));
                selection = 1;
            } else if (e.getButton() == MouseEvent.BUTTON3) {
                this.setCursor(new Cursor(Cursor.HAND_CURSOR));
                selection = 3;
            }
        }
        else {
            this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            selection=0;
        }


    }

    @Override
    public void mouseReleased(MouseEvent e) {
        selPointDate=null;
        selPoint=null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

        now.setLocation(e.getX(), e.getY());
        if(selection==3){
            setSelPointData(pressed,now);

        }
        else if(selection==1){
            selPoint.setLocation(selPoint.getX()+now.getX()-pressed.getX(),selPoint.getY()+now.getY()-pressed.getY());
        }
        else{
            return;
        }
        pressed.setLocation(now);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        now.setLocation(e.getX(),e.getY());
        getSelPointData(e.getX(),e.getY());
        if(selPointDate!=null) {
            this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
        else {
            this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }
}
