package sum;

import java.sql.Time;
import java.util.Scanner;

public class Test {

    public static int MAX=100000000;
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("请输入需要多少个线程解决问题（1亿除的尽即可）：");
        int threadNum=in.nextInt();
        int piece=MAX/threadNum;
        Thread[]threads=new Thread[threadNum];

        long start=System.currentTimeMillis();
        Sum sum=new Sum();
        for(int i=0;i<threadNum;i++){
            SumWork sumWork=new SumWork(i*piece+1,(i+1)*piece,sum);
            threads[i]=new Thread(sumWork);
            threads[i].start();
        }


        for(Thread thread:threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("1到1亿整型数相加为"+sum.getSum());
        System.out.println("用时："+(end-start)+"ms");

    }
}
