package calculatetime;

import org.w3c.dom.NameList;

import java.util.*;

public class Test {
    public static void main(String[]args){
        int n=10000000;
        List<String>nameList=Util.generateNameList(n);
        Map<String,Student>stuMap=Util.generateStudentMap(n);


        Scanner in=new Scanner(System.in);
        System.out.println("寻找的人名：");
        String name=in.next();


        long startTime=System.currentTimeMillis();   //获取开始时间
        if( Util.searchName(nameList,name)!=null){
            System.out.println("找到"+name);
        }
        else System.out.println("未找到"+name);
        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("基于List的程序运行时间： "+(endTime-startTime)+"ms");


        startTime=System.currentTimeMillis();   //获取开始时间
        if(Util.searchStudent(stuMap,name)!=null){
            System.out.println("找到"+name);
        }
        else System.out.println("未找到"+name);
        endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("基于Map的程序运行时间： "+(endTime-startTime)+"ms");


        Set<Map.Entry<String,Student>> set=stuMap.entrySet();
        int i=0;
        for(Map.Entry<String,Student>entry:set){
            System.out.println(entry.getValue());
            i++;
            if(i==10){
                break;
            }
        }
    }
}
