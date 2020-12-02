package MathRandExpand1;

import java.util.Scanner;

public class MathRandExpand1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int[] cnt = new int[26];
        char[] ch = new char[n];
        //随机生成n个字母
        for(int i=0;i<n;i++){
            ch[i]=(char)('a'+Math.random()*('z'-'a'+1));
        }
        //统计字母出现次数
        for (int i = 0; i < ch.length; i++) {
            cnt[(ch[i]-'a')]++;
        }
        for (int i=0;i<cnt.length ;i++ ) {
            System.out.printf("%c占比：%.2f%%\n",i+'a',cnt[i]*1.0/n*100);
        }
    }
}
