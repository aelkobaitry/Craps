/**
 * This program allows a user to play the game Craps
 *
 * @author Adam Elkobaitry
 * @version 2020-1-15
 */

import java.util.Scanner;

public class Craps
{
    public static void giveInstructions(Scanner in){
        System.out.println("Would you like instructions on how to play the game (Y/n)?");
        String instruct = in.nextLine();
        if(instruct.equals("") || instruct.substring(0,1).equalsIgnoreCase("y")){
            System.out.println("Instructions");
        }
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Die die = new Die();
        System.out.println("Welcome to the game Craps!");
        giveInstructions(in);
        String play = "y";
        while(play.substring(0,1).equalsIgnoreCase("y")){
            System.out.println("Press [Enter] for your first roll!");
            in.nextLine();
            int roll = die.getRolls();
            System.out.println(roll);
        }
    }
}
