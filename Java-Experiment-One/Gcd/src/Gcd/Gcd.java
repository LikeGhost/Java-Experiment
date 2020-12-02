package Gcd;

import java.util.Scanner;

public class Gcd {
    private static int gcd(int m, int n){
        int gcd=n;
        while(true){
            if(m%n==0)break;
            gcd=m%n;
            m=n;
            n=gcd;
        }
        return gcd;
    }
    private static int gcd_recursive(int m, int n){
        if(m%n!=0) {
            return gcd_recursive(n,m%n);
        }
        return n;
    }
    public static void main(String []args){
        int x,y;
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        y=in.nextInt();
        if(x<y){
            int t=y;
            y=x;
            x=t;
        }
        System.out.println(gcd(x,y));
        System.out.println(gcd_recursive(x,y));
    }
}
