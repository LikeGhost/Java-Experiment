package staff;

import java.util.Date;

public class Teacher extends Staff{
    private String department;
    private String speciality;
    private double postAllowance;
    public Teacher(String name, String address, int age, int sex, double salary, Date dateHired, String department, String speciality,double postAllowance) {
        super(name, address,age,sex,salary,dateHired);
        this.department=department;
        this.speciality=speciality;
        this.postAllowance=postAllowance;
    }

    public String getDepartment() {
        return department;
    }

    public String getSpeciality() {
        return speciality;
    }

    public double getPostAllowance() {
        return postAllowance;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setPostAllowance(double postAllowance) {
        this.postAllowance = postAllowance;
    }
    public double getSalary(){
        return super.getSalary()+this.postAllowance;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", department='" + department + '\'' +
                ", speciality='" + speciality + '\'' +
                ", postAllowance=" + postAllowance ;
    }
}
