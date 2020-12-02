package rect;

public class PlainRect extends Rect {
    private double startX,startY;

    public PlainRect() {
        super(0,0);
        this.startX = 0;
        this.startY = 0;
    }

    public PlainRect(double width, double height, double  startX, double startY) {
        super(width, height);
        this.startX = startX;
        this.startY = startY;
    }
    public boolean isInside(double x, double y) {
        if(x>=startX&&x<=startX+width&&y<=startY&&y>=startY-height){return true;}
        else return false;
    }

    @Override
    public String toString() {
        return "PlainRect{" +
                "startX=" + startX +
                ", startY=" + startY +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
