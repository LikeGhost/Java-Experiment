package shape;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestShape {
    public static void main(String[] args) {
        //构建两个长方形
        Shape[] arr = new Shape[6];
        arr[0]=new Rectangle(1 + (Math.random() * 10), 1 + (Math.random() * 10));
        arr[1] = new Rectangle(1 + (Math.random() * 10), 1 + (Math.random() * 10));
        System.out.println("两个长方形：");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        //构建两个三角形
        arr[2]= new Triangle(1 + (Math.random() * 10), 1 + (Math.random() * 10), 1 + Math.random() * 10);
        arr[3] = new Triangle(1 + (Math.random() * 10), 1 + (Math.random() * 10), 1 + Math.random() * 10);
        System.out.println("两个三角形：");
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        //构建两个圆形
        arr[4]= new Circle(1 + Math.random() * 10);
        arr[5]= new Circle(1 + Math.random() * 10);
        System.out.println("两个圆形：");
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        double sumP = 0, sumA = 0;
        for(Shape S:arr){
            sumP=sumP+S.getPerimeter();
            sumA=sumA+S.getArea();
        }
        System.out.printf("面积和为：%.2f\n周长和为：%.2f\n",sumA,sumP);

        Arrays.sort(arr);
        for(Shape shape:arr){
            System.out.println(shape+" 面积："+shape.getArea());
        }
    }
}
