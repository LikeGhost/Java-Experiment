package calculatetime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Util {
    public static String getRandomName (int min, int max){
        return "张三"+(int)(min+Math.random()*(max-min+1));
    }
    public static int getRandomAge(int min, int max){
        return (int)(min+Math.random()*(max-min+1));
    }
    public static List<Student> getRandomStudents(int n){
        List<Student> ret=new ArrayList<>();
        for(int i=0;i<n;i++){
            Student student=new Student();
            student.setName(getRandomName(1,10000000));
            student.setAge(getRandomAge(15,25));
            ret.add(student);
        }
        return ret;
    }
    public static Map<String, Student> makeStudentMap(List<Student> list){
        Map<String,Student>map=new HashMap<>();
        for(Student student:list){
            map.put(student.getName(),student);
        }
        return map;
    }
    public static String searchName(List<String> nameList, String name){
        for(String str:nameList){
            if(str.equals(name)){
                return str;
            }
        }
        return null;
    }
    public static Student searchStudent(Map<String,Student> stuMap, String name){
        return stuMap.get(name);
    }
    public static List<String> generateNameList(int n){
        List<String> nameList=new ArrayList<>();
        for(int i=0;i<n;i++){
            String name=getRandomName(1,10000000);
            nameList.add(name);
        }
        return nameList;
    }
    public static  Map<String,Student> generateStudentMap(int n){
        Map<String,Student> studentMap=makeStudentMap(getRandomStudents(n));
        return studentMap;
    }
}
