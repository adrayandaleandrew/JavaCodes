
public class Student extends Person{
    private float Grade;
    
    public Student(){
        this.Grade = 0;
    }
    
    public void setGrade(float grade){
        this.Grade = grade;
    }
    
    public float getGrade(){
        return Grade;
    }
}
