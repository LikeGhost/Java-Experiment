package person;

public class TestPerson {
    public  static void main(String[] args){
        Person one=new Person();
        one.setName("张三");
        one.setSex(1);
        one.setAge(25);
        System.out.println(one.getName());
        System.out.println(one.getSex());
        System.out.println(one.getAge());
        System.out.println(one.toString());
        Person two=new Person("李四",26);
        System.out.println(two.toString());
        Person three=new Person("王五",27,1);
        System.out.println(three.toString());
        System.out.println("count="+Person.count);
    }
}
