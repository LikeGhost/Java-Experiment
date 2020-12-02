package leapyear;

import java.util.Scanner;

public class Test {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("请输入需要判断的年份：");
        int x=in.nextInt();
        LeapYear y=new LeapYear();
        System.out.println(y.isLeapYear(x));
    }
}
