package rect;

public class Rect {
    protected double width;
    protected double height;
    public Rect(){
        this.width=10;
        this.height=10;
    }

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }

    @Override
    public String toString() {
        return "Rect{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
