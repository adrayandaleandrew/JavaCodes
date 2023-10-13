
package Assign1;

import java.util.ArrayList;
import java.util.List;

public class Setup {
    
    private List<Subjects> subj = new ArrayList<Subjects>();
    
    public void addSubjects(String subjname, String day, int start, String ampm1, int end, String ampm2){
        subj.add(new Subjects(subjname, day, start, ampm1, end, ampm2));
    }
    
    public void showSubjects(){
        System.out.printf("%-20s%-10s%14s%12s\n", "SUBJECT", "DAY", "START", "END");
        System.out.println("--------------------------------------------------------");
        for(Subjects i: subj){
            System.out.printf("%-20s%-10s%10s%3s%10s%3s\n", i.getSubjName(),i.getDay(),i.getTimeStart(),i.getAmPm(),i.getTimeEnd(),i.getAmPm2());
        }
    }
 
}
