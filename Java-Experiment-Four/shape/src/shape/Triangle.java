package shape;

import java.util.Objects;

public class Triangle extends Shape {

    private double edge1,edge2,edge3;
    Triangle(double edge1,double edge2,double edge3){
        this.edge1=edge1;
        this.edge2=edge2;
        this.edge3=edge3;
    }

    public double getEdge1() {
        return edge1;
    }

    public double getEdge2() {
        return edge2;
    }

    public double getEdge3() {
        return edge3;
    }

    public void setEdge1(double edge1) {
        this.edge1 = edge1;
    }

    public void setEdge2(double edge2) {
        this.edge2 = edge2;
    }

    public void setEdge3(double edge3) {
        this.edge3 = edge3;
    }

    public  double getPerimeter(){
        return this.edge1+this.edge2+this.edge3;
    }
    public  double getArea(){
        double p=getPerimeter();
        return Math.sqrt(p*(p-edge1)*(p-edge2)*(p-edge3));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.edge1, edge1) == 0 &&
                Double.compare(triangle.edge2, edge2) == 0 &&
                Double.compare(triangle.edge3, edge3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edge1, edge2, edge3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "edge1=" + edge1 +
                ", edge2=" + edge2 +
                ", edge3=" + edge3 +
                '}';
    }
}
