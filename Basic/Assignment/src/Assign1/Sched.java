
package Assign1;

public class Sched {
    public static void main(String[] args) {
        Setup sched = new Setup();
        
        sched.addSubjects("ITPROG3", "Monday", 7, "pm", 9, "pm");
        sched.addSubjects("ENGL5", "Tuesday", 7, "am", 9, "am");
        sched.addSubjects("PHYSICS-LAB", "Tuesday", 1, "pm", 4, "pm");
        sched.addSubjects("NSTP2", "Wednesday", 8, "am", 12, "pm");
        sched.addSubjects("DATABASE", "Wednesday", 4, "pm", 7, "pm");
        sched.addSubjects("ITPROG3", "Thursday", 4, "pm", 7, "pm");
        sched.addSubjects("ITPROG3-LAB", "Thursday", 7, "pm", 9, "pm");
        sched.addSubjects("ENGL5", "Friday", 7, "am", 9, "am");
        sched.addSubjects("PHYSICS", "Friday", 1, "pm", 4, "pm");
        sched.addSubjects("DATABASE-LAB", "Saturday", 4, "pm", 7, "pm");
        sched.showSubjects();
    }
}
