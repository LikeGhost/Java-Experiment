package staff;

import java.util.Comparator;

public class NameComparator implements Comparator<Staff> {
    @Override
    public int compare(Staff a,Staff b){
        return a.getName().compareTo(b.getName());
    }
}
