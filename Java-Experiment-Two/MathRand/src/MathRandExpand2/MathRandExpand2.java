package MathRandExpand2;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


public class MathRandExpand2 {
    public static void main(String[]args) throws FileNotFoundException{
            //打开Object.txt文件
            File f=new File("Object.txt");
            Scanner in=new Scanner(f);
            int[] cnt = new int[26];//计数数组
            int wordCnt=0;

            while(in.hasNextLine()) {
                String str=in.nextLine();//分行多次读取文件内容并统计
                char[] ch = str.toCharArray();
                for (int i = 0; i < ch.length; i++) {
                    if (ch[i] >= 'a' && ch[i] <= 'z') {
                        cnt[(ch[i] - 'a')]++;
                        wordCnt++;
                    } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                        cnt[ch[i] - 'A']++;
                        wordCnt++;
                    }
                }
            }
            for (int i=0;i<cnt.length ;i++ ) {
                System.out.printf("%c占比：%.2f%%\n",i+'a',cnt[i]*1.0/wordCnt*100);
            }
            in.close();
    }
}
