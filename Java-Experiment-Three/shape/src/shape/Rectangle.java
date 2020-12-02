package shape;

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

}
