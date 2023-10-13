
package Assign1;

public class Subjects {
    private String SubjName;
    private String Day;
    private int TimeStart;
    private String AmPm1;
    private int TimeEnd;
    private String AmPm2;
    
    public Subjects(String subjname, String day, int start, String ampm1, int end, String ampm2){
        this.SubjName = subjname;
        this.Day = day;
        this.TimeStart = start;
        this.AmPm1 = ampm1;
        this.TimeEnd = end;
        this.AmPm2 = ampm2;
    }

    Subjects(String subjname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getSubjName(){
        return SubjName;
    }
    public String getDay(){
        return Day;
    }
    public int getTimeStart(){
        return TimeStart;
    }
    public String getAmPm(){
        return AmPm1;
    }
    public int getTimeEnd(){
        return TimeEnd;
    }
    public String getAmPm2(){
        return AmPm2;
    }
}
