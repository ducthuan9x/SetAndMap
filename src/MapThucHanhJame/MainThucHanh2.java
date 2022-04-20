package MapThucHanhJame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainThucHanh2 {
    public static void main(String[] args) {
        ThucHanh2 student = new ThucHanh2("Kien", 30, "HT");
        ThucHanh2 student1 = new ThucHanh2("Nam", 26, "HN");
        ThucHanh2 student2 = new ThucHanh2("Anh", 38, "HT" );
        ThucHanh2 student3 = new ThucHanh2("Tung", 38, "HT" );

        List<ThucHanh2> lists = new ArrayList<ThucHanh2>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(ThucHanh2 st : lists){
            System.out.println(st.toString());
        }

        CompareToAge ageComparator = new CompareToAge();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(ThucHanh2 st : lists){
            System.out.println(st.toString());
        }
    }
}
