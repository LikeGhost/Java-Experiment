package MathRand;

import java.util.Scanner;

public class MathRand {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt(),cnt=0;
        int[]arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = (int) (2000 + Math.random() * (3000 - 2000 + 1));
            if(arr[i]>2500)cnt++;
        }
        System.out.printf("大于2500的整数占比：%.2f%%\n",cnt*1.0/n*100);
        System.out.printf("小于等于2500的整数占比：%.2f%%\n",(n-cnt)*1.0/n*100);
    }
}
