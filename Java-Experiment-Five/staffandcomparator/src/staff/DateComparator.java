package staff;

import java.util.Comparator;

public class DateComparator implements Comparator<Staff> {
    @Override

    public int compare(Staff o1, Staff o2) {
        return o1.getDateHired().compareTo(o2.getDateHired());
    }
}