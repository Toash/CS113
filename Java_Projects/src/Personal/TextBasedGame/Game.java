package Personal.TextBasedGame;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Game {
    public static  Player player;
    public static void Save(Player player){
        try {
            BufferedWriter writer = new BufferedWriter( new FileWriter("savedata.txt"));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public static void Load(){
        //Read data from file and load
    }
    public static void Encounter(){
        // When player reaches monster
    }
    public static void PrintInstructions(){
        System.out.println("Move: Go Forward");
        System.out.println("Attack: Attack");
        System.out.println("Flee: Flee");
        System.out.println("Quit: Quit");
    }
}
