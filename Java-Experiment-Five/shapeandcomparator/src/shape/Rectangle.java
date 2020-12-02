package shape;

import java.util.Objects;

public class Rectangle extends Shape {
    private double length,wide;

    Rectangle(double length ,double wide){
        if(length<wide){
            double t=length;
            length=wide;
            wide=t;
        }
        this.length=length;
        this.wide=wide;
    }

    public double getLength() {
        return length;
    }

    public double getWide() {
        return wide;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public  double getPerimeter(){
        return 2*(this.length+this.wide);
    }
    public  double getArea(){
        return length*wide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.length, length) == 0 &&
                Double.compare(rectangle.wide, wide) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, wide);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", wide=" + wide +
                '}';
    }
}
