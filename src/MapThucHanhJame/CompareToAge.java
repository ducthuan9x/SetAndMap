package MapThucHanhJame;

import java.util.Comparator;

public class CompareToAge implements Comparator<ThucHanh2> {
    @Override
    public int compare(ThucHanh2 o1, ThucHanh2 o2) {
        if(o1.getAge()>o2.getAge()){
            return 1;
        }
        else if(o1.getAge()<o2.getAge()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
