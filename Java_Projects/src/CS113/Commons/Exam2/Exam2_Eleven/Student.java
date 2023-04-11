package CS113.Commons.Exam2.Exam2_Eleven;

public class Student {

    private String name;
    private GPA gpa;

    public Student(String name, GPA gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public GPA getGpa(){
        return this.gpa;
    }

    public void setName(String name){
        this.name = name;
    }


    // student gpa compared to parameter
    public boolean honorRoll(GPA honorRollGpa){
        // Honor roll
        if(this.gpa.compareTo(honorRollGpa) >= 0){
            return true;
        } else{
            return false;
        }
    }

}
