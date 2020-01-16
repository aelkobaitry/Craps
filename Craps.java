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
    
    public static int rollTheDice(Scanner in, Die d){
        System.out.println("Press [Enter] to roll the dice!");
        in.next();
        int r1 = d.rollDie();
        int r2 = d.rollDie();
        int total = r1 + r2;
        System.out.println("You rolled a " + r1 + " and a " + r2 + " for a total of " + total);
        return total;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Die die = new Die();
        System.out.println("Welcome to the game Craps!");
        giveInstructions(in);
        String play = "y";
        while(play.equals("") || play.substring(0,1).equalsIgnoreCase("y")){
            System.out.println("First Roll: ");
            int result = rollTheDice(in,die);
            if(result == 7 || result == 11){
                System.out.println("You win!");
            }
            else if(result == 2 || result == 3 || result == 12){
                System.out.println("You lose...");
            }
            else{
                int point = result;
                System.out.println("Your point is: " + point);
                result = rollTheDice(in,die);
                while(result != point && result != 7){
                    result = rollTheDice(in,die);
                    System.out.println("Roll again!");
                }
                if(result == point){
                    System.out.println("You win!");
                }
                else{
                    System.out.println("You lose...");
                }
            }
            System.out.println("Would you like to play again (Y/n)?");
            play = in.nextLine();
        }
        System.out.println("Thanks for playing!");
    }
}
