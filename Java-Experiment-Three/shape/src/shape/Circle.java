package shape;

public class Circle extends Shape  {
    private double radius;
    Circle (double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  double getPerimeter(){
        return 2*super.PI*radius;
    }
    public  double getArea(){
        return super.PI*radius*radius;
    }
}
