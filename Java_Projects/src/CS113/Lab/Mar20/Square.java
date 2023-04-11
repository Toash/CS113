// Group members: Justin Ho, Khanh Dang

package CS113.Lab.Mar20;

import java.util.Scanner;
public class Square
{
   // First index = row
   // Second index = column
   int[][] square;
   //--------------------------------------
//create new square of given size
//--------------------------------------
   public Square(int size)
   {
      this.square = new int[size][size];
   }
   //--------------------------------------
//return the sum of the values in the given row
//--------------------------------------
   public int sumRow(int row)
   {
      int sum = 0;
      for(int i = 0; i<square.length;i++){
         sum += square[row][i];
      }
      return sum;
   }
//--------------------------------------
//return the sum of the values in the given column
//--------------------------------------
   public int sumCol(int col)
   {
      int sum = 0;
      for(int i = 0; i<square.length;i++){
         sum += square[i][col];
      }
      return sum;
   }
   //--------------------------------------
//return the sum of the values in the main diagonal
//--------------------------------------
   public int sumMainDiag()
   {
      int sum = 0;
      for(int i = 0; i<square.length; i++){
         sum += square[i][i];
      }
      return sum;
   }
   //--------------------------------------
//return the sum of the values in the other ("reverse") diagonal
//--------------------------------------
   public int sumOtherDiag()
   {
      int sum = 0;
      for(int i = 0; i < square.length; i++){
         sum += square[square.length-1-i][square.length-1-i];
      }
      return sum;
   }
   //--------------------------------------
//return true if the square is magic (all rows, cols, and diags have
//same sum), false otherwise
//--------------------------------------
   public boolean magic()
   {
      //this sum should be the same for all row, col and diag.
      int sum = sumRow(0);

      // Loop through all the rows and columns
      for(int i = 0; i<this.square.length;i++){
         int sumRow = sumRow(i);
         int sumCol = sumCol(i);
         // If sums aren't same, not magic
         if((sumRow != sum) || (sumCol != sum)){
            return false;
         }
      }

      // rows and columns have same sum, now check diagonals.
      if(sumMainDiag() != sum){
         return false;
      }
      if(sumOtherDiag() != sum){
         return false;
      }
      return true;

   }
   //--------------------------------------
//read info into the square from the input stream associated with the
//Scanner parameter
//--------------------------------------
   public void readSquare(Scanner scan)
   {
       for (int row = 0; row < square.length; row++)
           for (int col = 0; col < square.length; col ++)
               square[row][col] = scan.nextInt();
   }
   //----------------------------------------
//print the contents of the square, neatly formatted
//----------------------------------------
   public void printSquare()
   {
      for(int i = 0; i<this.square.length;i++){
         for(int j = 0; j<this.square.length; j++){
            System.out.print(this.square[i][j]);
            // Space makes it look nicer
            System.out.print(" ");
         }
         // New row
         System.out.println();
      }
   }
}