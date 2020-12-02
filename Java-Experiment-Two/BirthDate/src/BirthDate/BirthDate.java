package BirthDate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class MyComparator implements Comparator<String> {//比较器
    public int compare(String o1, String o2) {
        if(Integer.parseInt(o1.substring(6,10))>Integer.parseInt(o2.substring(6,10))){
            return 1;
        }
        else if(Integer.parseInt(o1.substring(6,10))==Integer.parseInt(o2.substring(6,10))){
            return 0;
        }
        else{
            return -1;
        }
    }

}
public class BirthDate {
    public static String getBirthDate(String id){//从身份证信息中得到出生日期
        String ret;
        ret=id.substring(6,10)+'-';
        ret=ret+id.substring(10,12)+'-';
        ret=ret+id.substring(12,14);
        return ret;

    }

    public static String[]idRand(int n){//用于随机生成身份证信息
        String[]arr=new String[n];
        System.out.println("随机出的n份身份证：");
        for(int i=0;i<arr.length;i++){

            int x=(int)(350000+Math.random()*(350100-350000+1));
            arr[i]=Integer.toString(x);
            x=(int)(1800+Math.random()*(2020-1800+1));
            arr[i]=arr[i]+x;
            x=(int)(1+Math.random()*(12-1+1));
            if(x<10)arr[i]=arr[i]+'0';
            arr[i]=arr[i]+x;
            x=(int)(1+Math.random()*(28-1+1));
            if(x<10)arr[i]=arr[i]+'0';
            arr[i]=arr[i]+x;
            x=(int)(1000+Math.random()*(9999-1000+1));
            arr[i]=arr[i]+x;

        }

        return arr;
    }
    public static void  main(String[]args){
        Scanner in=new Scanner(System.in);
        //演示getBirthDate功能
        String id=in.nextLine();
        String ret=getBirthDate(id);
        System.out.println(ret);

        //演示随机身份信息和按出生年月大小排序好的出生日期
        int n=in.nextInt();
        String []result=idRand(n);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

        Comparator cmp=new MyComparator();
        Arrays.sort(result,cmp);

        for(int i=0;i<result.length;i++){
            System.out.println(getBirthDate(result[i]));
        }
    }
}
