package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class NameDaolmpl implements NameDao{
    @Override
    public List getNameFromArray(String[] names) {
       List<String> ret=new ArrayList<>();
       ListIterator<String> it=ret.listIterator();
       for(String name:names){
           it.add(name);
       }
       return ret;
    }

    @Override
    public int searchName(List nameList, String name) {
        int i=0;
        for(Object getName:nameList){
            if(getName.equals(name)){
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override
    public boolean removeFromList(List nameList, int id) {
        int i=0;
        if(id<0||id>nameList.size()){
            throw new IllegalArgumentException();
        }
        Iterator it=nameList.iterator();
        it.next();
        while(it.hasNext()){
            if(i==id){
                it.remove();
                return true;
            }
            it.next();
            i++;
        }
        return false;
    }


}
