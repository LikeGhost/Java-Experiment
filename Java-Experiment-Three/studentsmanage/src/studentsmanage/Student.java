package studentsmanage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student{
    private String name;
    private int math,java,ds,avg,total;

    public void setName(String name) {
        this.name = name;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public void setDs(int ds) {
        this.ds = ds;
    }

    public void setAvg() {
        this.avg = (java+math+ds)/3;
    }

    public void setTotal() {
        this.total = java+math+ds;
    }


    public String getName() {
        return name;
    }

    public int getMath() {
        return math;
    }

    public int getJava() {
        return java;
    }

    public int getDs() {
        return ds;
    }
    public int getAvg() {
        if(avg==-1)setAvg();
        return avg;
    }

    public int getTotal() {
        if(total==-1)setTotal();
        return total;
    }
    public Student(String name, int math, int java, int ds) {
        this.name = name;
        this.math = math;
        this.java = java;
        this.ds = ds;
        this.avg=-1;
        this.total=-1;
    }
    public Student(String name, int math, int java, int ds, int avg,int total) {
        this(name,math,java,ds);
        this.total = total;
        this.avg = avg;
    }
    public String toString(){
        return name+" "+math+" "+java+" "+ds+" "+avg+" "+total;
    }



}