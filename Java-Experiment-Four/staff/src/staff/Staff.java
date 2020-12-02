package staff;

import java.util.Date;

public class Staff {
    private String name;
    private String address;
    private int age;
    private int sex;//0是女的，1是男的
    private double salary;
    private Date dateHired;

    public Staff(String name, String address, int age, int sex, double salary, Date dateHired) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
         return age;
    }

    public int getSex() {
        return sex;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", salary=" + salary +
                ", dateHired=" + dateHired;
    }
}
