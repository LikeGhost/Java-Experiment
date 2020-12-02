package shape;

public abstract class Shape implements Comparable<Shape>{
    public final static double PI=3.1415926535;

    public abstract double getPerimeter();
    public abstract double getArea();
    public int compareTo(Shape other){
        return (int)(getArea()-other.getArea());
    }
}
