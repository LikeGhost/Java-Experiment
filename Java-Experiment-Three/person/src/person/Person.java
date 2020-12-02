package person;

public class Person {
    private String name;
    private int sex;//0代表女性，1代表男性
    private int age;
    private int id;
    public static int count=0;

    Person(){
        this.name="";
        this.sex=0;
        this.age=0;
        count++;
        this.id=count;
    }
    Person(String name,int age){
        this();
        this.name=name;
        this.age=age;
        sex=-1;
    }
    Person(String name,int age,int sex){
        this(name,age);
        this.sex=sex;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSex(int sex){
        this.sex=sex;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public String getSex(){
        String sex="";
        if(this.sex==0){
            sex="女";
        }
        else if(this.sex==1){
            sex="男";
        }
        else if(this.sex==-1){
            sex="未知";
        }
        return sex;
    }
    public int getAge(){
        return this.age;
    }
    public String toString(){

        return this.id+". "+this.name+" "+getSex()+" "+this.age;
    }
}
