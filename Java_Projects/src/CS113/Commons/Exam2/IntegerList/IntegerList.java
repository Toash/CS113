package CS113.Commons.Exam2.IntegerList;
import java.util.Random;

public class IntegerList {
    int[] list;

    public IntegerList(int size){
        list = new int[size];
    }

    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }

    public void randomize(){
        Random random = new Random();
        for(int i=0; i<this.list.length;i++){
            this.list[i] = random.nextInt(1,101);
        }
    }

    @Override
    public String toString(){
        String s = "";

        for(int i=0; i<this.list.length;i++){
            s += (this.list[i] + " ");
        }
        return s;
    }

    public static IntegerList merge(IntegerList intListA, IntegerList intListB){
        int[] listA = intListA.getList();
        int[] listB = intListB.getList();

        int mergedSize = listA.length + listB.length;
        int[] mergedList = new int[mergedSize];

        // Copying first list
        for(int i=0; i<listA.length; i++){
            mergedList[i] = listA[i];
        }

        // Copying second list
        for(int j=0; j<listB.length; j++){
            mergedList[listA.length + j] = listB[j];
        }

        IntegerList intList = new IntegerList(0);
        intList.setList(mergedList);
        return intList;
    }
}
