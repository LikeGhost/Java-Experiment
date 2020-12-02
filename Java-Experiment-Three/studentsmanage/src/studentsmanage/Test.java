package studentsmanage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static Student[] readStudentsFromFile(String fileName)throws FileNotFoundException {
        List<String> list=new ArrayList<>();
        Scanner in=new Scanner(new File(fileName));
        String read;
        while(in.hasNextLine()){
            read=in.nextLine();
            list.add(read);
        }
        String []studentFromFile= new String[list.size()];
        list.toArray(studentFromFile);
        return makeStudentFromString(studentFromFile);
    }
    public static Student[] makeStudentFromString(String[] students){
        Student []ret=new Student[students.length];
        for(int i=0;i<students.length;i++){
            Scanner scanner=new Scanner(students[i]);
            ret[i]=new Student(scanner.next(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        }
        return ret;
    }
    public static void sort(Student[] students){
        for(int i=0;i<students.length-1;i++){
            for(int j=1;j<students.length-i;j++){
                if(students[j-1].getAvg()<students[j].getAvg()){
                    Student T=students[j-1];
                    students[j-1]=students[j];
                    students[j]=T;
                }
            }
        }
        for(Student out:students){
            System.out.println(out.toString());
        }
    }
    public static void main(String[]args)throws FileNotFoundException {
        Student[] students=readStudentsFromFile("Students.txt");
        sort(students);
    }
}
