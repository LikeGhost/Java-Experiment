package IsPrime;

import java.util.Arrays;
import java.util.Scanner;

public class IsPrime {
    public static void printPrimeNumbers(int[] n){
        System.out.println("n="+(n.length-1));
        System.out.print("The prime numbers are ");
        boolean sign=false;
        for (int j =0;j<n.length;j++) {
            if (n[j] != 0)  {
                if(sign)System.out.print(",");
                System.out.print(j);
                sign = true;
            }
        }
    }

    public static int[] getPrimeNumbers(int n){
        int[]result=new int[n+1];
        Arrays.fill(result,1);
        result[0]=0;
        result[1]=0;
        for(int i=2;i*i<=n+10;i++){
            if(i!=0){
                for(int j=2*i;j<result.length;j=j+i){
                    result[j]=0;
                }
            }
        }
        return result;
    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        printPrimeNumbers(getPrimeNumbers(n));
    }

}
