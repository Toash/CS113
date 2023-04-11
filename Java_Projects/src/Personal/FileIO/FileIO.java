package Personal.FileIO;

//?
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;


public class FileIO {
    public static void main(String[] args) {
        String[] names = {"Justin", "Leo", "Oli"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("I am writing to a file muahahahah!!!");
            writer.write("\n");

            for (String name : names){
                writer.write("\n");
                writer.write(name);
            }

            //Close the stream
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String currentLine;
            while((currentLine = reader.readLine()) != null){
                System.out.println(currentLine);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
