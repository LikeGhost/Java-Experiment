package rect;

import java.util.Scanner;

public class Test {
    public static void main(String []args){
        PlainRect rect=new PlainRect((1+Math.random()*(50-1+1)),(1+Math.random()*(50-1+1)),(1+Math.random()*(50-1+1)),(1+Math.random()*(50-1+1)));
        System.out.println("生成的矩形为：");
        System.out.println(rect.toString());
        System.out.println("矩形的周长为"+rect.getPerimeter());
        System.out.println("矩形的面积为"+rect.getArea());
        System.out.println("请输入判断的点：");
        Scanner in=new Scanner(System.in);
        int x=in.nextInt(),y=in.nextInt();
        if(rect.isInside(x,y)){
            System.out.println("该点在矩形内");
        }
        else{
            System.out.println("该点不在矩形内");
        }
    }
}
