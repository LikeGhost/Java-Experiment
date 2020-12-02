package useScanner;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student{
    String name;
    int a,b,c,avg,total;
    Student() {
        name= "";
        a = b = c = avg = total = 0;
    }
}
class MyComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        if(o1.avg>o2.avg){
            return -1;
        }
        else if(o1.avg==o2.avg){
            return 0;
        }
        else {
            return 1;
        }
    }
}

public class useScanner {
    //随机学生成绩信息
    public static Student[] stuRand() {
        Student[] stu = new Student[10000];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student();
            stu[i].name = "张三" + (int) (0 + Math.random() * (10000 - 0 + 1));
            stu[i].a = (int) (60 + Math.random() * (100 - 60 + 1));
            stu[i].b = (int) (60 + Math.random() * (100 - 60 + 1));
            stu[i].c = (int) (60 + Math.random() * (100 - 60 + 1));
        }
        return stu;
    }
    //将学生信息写入Students.txt文件
    public static void writeFile(Student[] stu) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("Students.txt");
        out.println("Name Math Java DS Average Total");
        for (int i = 0; i < stu.length; i++) {
            out.println(stu[i].name + ' ' + stu[i].a + ' ' + stu[i].b + ' ' + stu[i].c + ' ' + stu[i].avg + ' ' + stu[i].total);
        }
        out.close();
    }
    //寻找学生
    public static String[] findStudent(String name) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Students.txt"));
        String[] stu = new String[10000];
        in.nextLine();
        for (int i = 0; in.hasNextLine(); ) {
            String line = in.nextLine();
            Scanner lineS = new Scanner(line);
            String stuName = lineS.next();
            if (stuName.equals(name)) {
                stu[i] = line;
                i++;
            }
        }
        return stu;
    }

    public static void main(String[] args) throws FileNotFoundException {
        //随即学生信息并写入文件
        Student[] stu = stuRand();
        writeFile(stu);
        Scanner in = new Scanner(new File("Students.txt"));
        in.nextLine();
        //计算学生平均分以及总分
        for (int i = 0; in.hasNextLine(); i++) {
            String line = in.nextLine();
            Scanner lineS = new Scanner(line);
            stu[i].name = lineS.next();
            stu[i].a = lineS.nextInt();
            stu[i].b = lineS.nextInt();
            stu[i].c = lineS.nextInt();
            stu[i].avg = lineS.nextInt();
            stu[i].total = lineS.nextInt();
            stu[i].total = stu[i].a + stu[i].b + stu[i].c;
            stu[i].avg = stu[i].total / 3;
        }
        in.close();
        writeFile(stu);

        //排序并写入前十名学生信息至first_10.txt
        Comparator cmp = new MyComparator();
        Arrays.sort(stu, cmp);
        PrintWriter out = new PrintWriter("first_10.txt");
        for (int i = 0; i < 10; i++) {
            out.println(stu[i].name + ' ' + stu[i].a + ' ' + stu[i].b + ' ' + stu[i].c + ' ' + stu[i].avg + ' ' + stu[i].total);
        }
        out.close();
        //输入需要寻找的学生并将该名字的学生全部输出
        Scanner in2 = new Scanner(System.in);
        String name = in2.nextLine();
        String[] retStu = findStudent(name);

        for(int i=0;i<10000;i++) {
            if(retStu[i]!=null) {
                System.out.println(retStu[i]);
            }
        }

    }
}