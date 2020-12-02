package staff;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Staff>{
    @Override
    public int compare(Staff o1, Staff o2) {
        return -(Double.compare(o1.getSalary(),o2.getSalary()));
    }
}
