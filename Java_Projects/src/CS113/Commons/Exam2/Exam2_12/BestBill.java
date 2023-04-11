package CS113.Commons.Exam2.Exam2_12;

public class BestBill {
    // Row - name
    // Column - months
    public static double[] bestInMonths(double[][] famCellBills){

        // index 0 is january, 1 is feb etc...
        // array length is determined by the amount of months of the parameter that is passed in
        double[] lowestBillForEachMonth = new double[famCellBills[0].length];

        //Loop through months
        for(int month=0; month<famCellBills[0].length;month++){
            // The first person for the current month
            double lowestInCurrentMonth = famCellBills[0][month];

            // Loop through each person for that month
            for(int person = 0 ; person<famCellBills.length ; person++){
                double currentPersonsBill = famCellBills[person][month];

                if(currentPersonsBill < lowestInCurrentMonth){
                    lowestInCurrentMonth = currentPersonsBill;
                }
            }
            //Went through all people, store lowest for current month
            lowestBillForEachMonth[month] = lowestInCurrentMonth;
        }
        return lowestBillForEachMonth;
    }

    public static void main(String[] args) {
        double[][] familyAndBills = {{34.56, 75.34, 23.87}, {87.79, 32.05, 23.54}, {89.78, 66.76, 87.99}, {45.34, 56.45, 16.54}};


        double[] output = bestInMonths(familyAndBills);

        for (double bill : output) {
            System.out.println(bill);
        }
        
    }
}
