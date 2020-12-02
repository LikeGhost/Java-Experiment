package staff;

import java.util.Comparator;

public class ComplexComparator implements Comparator<Staff> {
    @Override
    public int compare(Staff o1, Staff o2) {
        if(Double.compare(o1.getSalary(),o2.getSalary())>0){
            return 1;
        }
        else if(Double.compare(o1.getSalary(),o2.getSalary())==0&&o1.getAge() > o2.getAge())return Integer.compare(o1.getAge(),o2.getAge());
        else return -1;
    }
}
