package list;

import java.util.List;
import java.util.Scanner;

public class TestList {
    public static String[] randName(){
        String []ret=new String[10];
        for(int i=0;i<ret.length;i++){
            ret[i]="张三"+i;
        }
        return  ret;
    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        NameDaolmpl nameDaolmpl=new NameDaolmpl();
        String[] names=randName();
        List list=nameDaolmpl.getNameFromArray(names);
        System.out.println("请输入要寻找的人名：");
        String searchName=in.next();
        if( nameDaolmpl.searchName(list,searchName)!=-1){
            System.out.println("找到"+searchName);
        }
        else {
            System.out.println("未找到"+searchName);
        }

        while(true) {
            System.out.println("请输入要删除的id：");
            int searchId=in.nextInt();
            try {
                nameDaolmpl.removeFromList(list, searchId);
                System.out.println("已删除id为"+searchId+"的人");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("未找到id为"+searchId+"的人");
            }
        }

    }
}
