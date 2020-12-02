package pen;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public class PointSet {
    private ArrayList<Point2D.Double> data;

    public PointSet(){
        data=new ArrayList<Point2D.Double>();
    }
    public Point2D.Double[] getData() {
        Point2D.Double[]ret=new Point2D.Double[data.size()];
        data.toArray(ret);
        return ret;
    }

    public void setData(ArrayList<Point2D.Double> data) {
        this.data = data;
    }
    public void addData(Point2D.Double p){
        data.add(p);
    }

}
