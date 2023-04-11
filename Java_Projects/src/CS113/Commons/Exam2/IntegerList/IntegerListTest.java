package CS113.Commons.Exam2.IntegerList;

public class IntegerListTest {
    public static void main(String[] args) {

        IntegerList intList1 = new IntegerList(0);
        intList1.setList(new int[]{1,2,3,4});

        IntegerList intList2 = new IntegerList(0);
        intList2.setList(new int[]{5,6,7,8});


        IntegerList mergedList = IntegerList.merge(intList1,intList2);

        System.out.println(intList1);
        System.out.println(intList2);

        System.out.println(mergedList);

    }


}
