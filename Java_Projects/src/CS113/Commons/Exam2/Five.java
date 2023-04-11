package CS113.Commons.Exam2;

public class Five {
    //95 95
    public static void replace(int[] allGrades, int examScore) {
        int temp=allGrades[0];
        allGrades[0] = examScore;
        examScore = temp;
    }
    public static void main(String args[]) {
        int[] myGrades = {72,84,75,95};
        replace(myGrades, myGrades[3]);
        System.out.println(myGrades[0]+", "+myGrades[3]);
    }
}
