package CS113.Commons;

public class Grade {
    int numGrade;
    char letterGrade;
    public Grade(int numGrade){
        this.numGrade = numGrade;
        if(numGrade >= 65){
            this.letterGrade = 'S';
        } else{
            this.letterGrade = 'U';
        }

    }

    public int getNumGrade(){
        return this.numGrade;
    }
    public char getLetterGrade(){
        return this.letterGrade;

    }
    public void setNumGrade(int numGrade){
        this.numGrade = numGrade;
    }
    public void setLetterGrade(char letterGrade){
        this.letterGrade = letterGrade;
    }

    @Override
    public String toString(){
        return "Score: " + this.numGrade + ", Letter Grade: " + this.letterGrade;
    }

    public boolean isSatisfactory(){
        if(this.letterGrade == 'S'){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equals(Grade other){
        if(this.isSatisfactory() == other.isSatisfactory()){
            return true;
        }
        return false;
    }
}
