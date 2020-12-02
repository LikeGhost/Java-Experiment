package shape;

public class TestShape {
    public static void main(String[] args) {
        Shape[] arr = new Shape[6];
        //构建两个长方形
        arr[0]=new Rectangle(1 + (Math.random() * 10), 1 + (Math.random() * 10));
        arr[1] = new Rectangle(1 + (Math.random() * 10), 1 + (Math.random() * 10));

        //构建两个三角形
        arr[2]= new Triangle(1 + (Math.random() * 10), 1 + (Math.random() * 10), 1 + Math.random() * 10);
        arr[3] = new Triangle(1 + (Math.random() * 10), 1 + (Math.random() * 10), 1 + Math.random() * 10);

        //构建两个圆形
        arr[4]= new Circle(1 + Math.random() * 10);
        arr[5]= new Circle(1 + Math.random() * 10);

        double sumP = 0, sumA = 0;
        for(Shape S:arr){
            sumP=sumP+S.getPerimeter();
            sumA=sumA+S.getArea();
        }
        System.out.printf("面积和为：%.2f\n周长和为：%.2f",sumA,sumP);
    }
}
