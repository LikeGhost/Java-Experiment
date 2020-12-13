package inputandoutput;


import java.io.*;
import java.util.Scanner;

public class Test {
    public static void writeStudent(Student s, DataOutputStream dos) throws IOException {
            dos.writeInt(s.getId());
            dos.writeUTF(s.getName());
            dos.writeInt(s.getAge());
            dos.writeDouble(s.getGrade());

    }
    public static Student readStudent(DataInputStream dis) throws IOException {
        return new Student(dis.readInt(),dis.readUTF(),dis.readInt(),dis.readDouble());
    }
    public static void writeStudent(Student s, PrintWriter dos){
        dos.println(s.getId());
        dos.println(s.getName());
        dos.println(s.getAge());
        dos.println(s.getGrade());
        dos.close();
    }
    public static Student readStudent(Scanner dis){
        return new Student(dis.nextInt(),dis.next(),dis.nextInt(),dis.nextDouble());

    }
    public static void writeStudent(Student s, ObjectOutputStream dos) throws IOException {
        dos.writeObject(s);
    }
    public static Student readStudent(ObjectInputStream dis) throws IOException, ClassNotFoundException {
        return (Student) dis.readObject();
    }
    public static void main(String[]args){
        Student student=new Student(1,"张三",18,90);
//        Student student1=new Student(2,"asda",23,123);
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("StudentDataStream.txt"));
            writeStudent(student,dataOutputStream);
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("StudentDataStream.txt"));
            System.out.println(readStudent(dataInputStream));

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            PrintWriter printWriter=new PrintWriter(new FileOutputStream("Student.txt"));
            writeStudent(student,printWriter);
            Scanner scanner=new Scanner(new FileInputStream("Student.txt"));

            System.out.println(readStudent(scanner));

        } catch (Exception e) {
            e.printStackTrace();
        }
//        try {
//            PrintWriter printWriter=new PrintWriter(new FileOutputStream("Student.txt"));
//            writeStudent(student1,printWriter);
//            Scanner scanner=new Scanner(new FileInputStream("Student.txt"));
//            System.out.println(readStudent(scanner));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }????
        try {
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("StudentObjectStream.txt"));
            writeStudent(student,objectOutputStream);
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("StudentObjectStream.txt"));
            System.out.println(readStudent(objectInputStream));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
