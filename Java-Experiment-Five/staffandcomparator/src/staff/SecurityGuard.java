package staff;

import java.util.Date;

public class SecurityGuard extends Staff {
    private String skills;
    private double dangerousAllowance;

    public SecurityGuard(String name, String address, int age, int sex, double salary, Date dateHired, String skills, double dangerousAllowance) {
        super(name, address, age, sex, salary, dateHired);
        this.skills = skills;
        this.dangerousAllowance = dangerousAllowance;
    }

    public String getSkills() {
        return skills;
    }

    public double getDangerousAllowance() {
        return dangerousAllowance;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setDangerousAllowance(double dangerousAllowance) {
        this.dangerousAllowance = dangerousAllowance;
    }
    public double getSalary(){
        return super.getSalary()+this.dangerousAllowance;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", skills='" + skills + '\'' +
                ", dangerousAllowance=" + dangerousAllowance
                ;
    }

}
