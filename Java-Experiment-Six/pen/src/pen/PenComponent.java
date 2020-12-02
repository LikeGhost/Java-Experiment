package pen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class PenComponent extends JComponent implements MouseMotionListener, MouseListener {
    public ArrayList<PointSet> pointSets;
    private PointSet t;
    private int cnt = 0;

    public PenComponent() {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        pointSets = new ArrayList<>();
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        t = new PointSet();
        t.addData(new Point2D.Double(e.getX(), e.getY()));
        pointSets.add(t);
        repaint();
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        PointSet now = pointSets.get(cnt);
        now.addData(new Point2D.Double(e.getX(), e.getY()));
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        cnt++;

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }



    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D pen = (Graphics2D) g;
        for (PointSet pointSet : pointSets) {
            Point2D.Double[] point = pointSet.getData();
            for (int i = 0; i < point.length - 1; i++) {
                pen.draw(new Line2D.Double(point[i], point[i + 1]));
            }
        }
    }


}