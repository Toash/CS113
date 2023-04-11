// GROUP MEMBERS:
// Justin Ho, Khanh Dang

package CS113.Lab.Feb27;// ************************************************************
// Election.java
//
// This file contains a program that tallies the results of
// an election. It reads in the number of votes for each of
// two candidates in each of several precincts. It determines
// the total number of votes received by each candidate, the
// percent of votes received by each candidate, the number of
// precincts each candidate carries, and the
// maximum winning margin in a precinct.
// ************************************************************
import java.util.Scanner;


public class Election
{
    public static void main (String[] args)
    {
        int votesForPolly; // number of votes for Polly in each precinct
        int votesForErnest; // number of votes for Ernest in each precinct

        int precinctsWonByPolly;
        int precinctsWonByErnest;
        int precinctsTied;

        int totalPolly; // running total of votes for Polly
        int totalErnest; // running total of votes for Ernest
        String response; // answer (y or n) to the "more precincts" question
        Scanner scan = new Scanner(System.in);
        System.out.println ();
        System.out.println ("Election Day Vote Counting Program");
        System.out.println ();
// Initializations
        totalPolly = 0;
        totalErnest = 0;

        precinctsWonByPolly = 0;
        precinctsWonByErnest = 0;
        precinctsTied = 0;

        // Votes for Polly and Ernest
        // Used to compute percentages for each candidate
        int totalVotes = 0;
// Loop to "process" the votes in each precinct


        Boolean running = true;
        while(running){
            System.out.println("Are there more precincts to report?");
            System.out.print("Response (Y or N): ");
            response = scan.nextLine();

            switch (response.toLowerCase()){
                // New precinct
                case "y":
                    System.out.println("NEW PRECINCT: ");
                    System.out.println("==========================");
                    System.out.println("How many more votes for Polly?");
                    votesForPolly = scan.nextInt();

                    scan.nextLine(); // clear next line / buffer

                    totalPolly += votesForPolly;

                    System.out.println("How many more votes for Ernest?");
                    votesForErnest = scan.nextInt();

                    scan.nextLine(); // clear next line / buffer

                    totalErnest += votesForErnest;
                    if(votesForErnest > votesForPolly){
                        precinctsWonByErnest++;
                    } else if (votesForPolly > votesForErnest) {
                        precinctsWonByPolly++;
                    } else {
                        precinctsTied++;
                    }
                    System.out.println("==========================");
                    break;

                case "n":
                    running = false;
                    break;

                default:
                    System.out.println("Invalid input, try again.");
                    break;
            }
        }
// Print out the results
        System.out.println("==========================");
        totalVotes = totalPolly + totalErnest;
        double pollyVotePercentage = ((double)totalPolly / totalVotes)*100.00;
        double ernestVotePercentage = ((double)totalErnest / totalVotes)*100.00;

        System.out.println("Polly has "+ totalPolly + " votes.");
        System.out.println("Polly has "+ pollyVotePercentage + " percent of the votes.");
        System.out.println("");
        System.out.println("Ernest has "+ totalErnest + " votes.");
        System.out.println("Ernest has " + ernestVotePercentage + " percent of the votes.");
        System.out.println("");
        System.out.println("Precincts won by Polly: " + precinctsWonByPolly);
        System.out.println("Precincts won by Ernest: " + precinctsWonByErnest);
        System.out.println("Precincts tied: " + precinctsTied);
        System.out.println("==========================");
    }
}