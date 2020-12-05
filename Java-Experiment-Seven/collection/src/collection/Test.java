package collection;

import java.util.*;

public class Test {
    public static Student[] getRandomStudents(int n){
        Student [] students=new Student[n];
        for(int i=0;i<students.length;i++){
            students[i]=new Student();
            students[i].setAge((int)(15+Math.random()*(25-15+1)));
            students[i].setName("张三"+i);
            students[i].setGrade((int)(Math.random()*(100-0+1)));
        }
        return students;
    }
    public static List<Student> getFailedStudent(List<Student> students){
        List<Student> otherList=new ArrayList<>();
        for(Student student:students){
            if(student.getGrade()<60){
                otherList.add(student);
            }
        }
        return otherList;
    }
    public static void main(String []args){
        Student []students=getRandomStudents(100);
        List<Student> studentList=new ArrayList<>(Arrays.asList(students));
        Collections.sort(studentList);

        System.out.println("最大值："+Collections.max(studentList));
        System.out.println("最小值："+Collections.min(studentList));

        Student searchStudent=new Student();
        searchStudent.setGrade(60);
        int index=Collections.binarySearch(studentList,searchStudent);
        if(index>0)
            System.out.println("成绩60的人："+studentList.get(index));
        else{
            System.out.println("没有成绩为60的人");
        }
        List<Student>otherList=getFailedStudent(studentList);
        studentList.removeAll(otherList);
        Collections.shuffle(studentList);

        Student []passStudents=new Student[studentList.size()] ;
        studentList.toArray(passStudents);
        for(Student passStudent:passStudents){
            System.out.println(passStudent);
        }

    }
}
