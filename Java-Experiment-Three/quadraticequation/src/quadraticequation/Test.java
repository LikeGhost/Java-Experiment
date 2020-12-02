package quadraticequation;

import java.util.Scanner;

public class Test {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("请输入方程式的三个系数a b c：");
        double a=in.nextDouble(),b=in.nextDouble(),c=in.nextDouble();
        QuadraticEquation QE=new QuadraticEquation(a,b,c);
        double Discriminant= QE.getDiscriminant();
        System.out.println("该二元一次方程式的判别式为："+Discriminant);
        if(Discriminant>0){
            System.out.println("该二元一次方程式有两个解："+QE.gerRoot1()+"和"+ QE.gerRoot2());
        }
        else if(Discriminant==0){
            System.out.println("该二元一次方程式有一个解："+QE.gerRoot1());
        }
        else{
            System.out.println("The equation has no roots.");
        }
    }
}
