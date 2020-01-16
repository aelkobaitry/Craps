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
            System.out.println("To start, you roll two six-sided dice and add the two numbers rolled together.");
            System.out.println("On this first result, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses.");
            System.out.println("If any other number is rolled, that number becomes your \"point\".");
            System.out.println("You then continue to roll the two dice until you roll either a 7 or your point.");
            System.out.println("If you roll a 7, you lose, and if you roll your point, you win.");
            System.out.println("Continue to roll the dice until you roll a 7 or your point.");
            System.out.println("Good Luck!");
        }
    }
    
    public static int rollTheDice(Scanner in, Die d){
        System.out.print("Press [Enter] to roll the dice!");
        in.nextLine();
        int r1 = d.rollDie();
        int r2 = d.rollDie();
        printVisual(r1);
        printVisual(r2);
        int total = r1 + r2;
        System.out.println("You rolled a " + r1 + " and a " + r2 + " for a total of " + total);
        return total;
    }
    
    public static void printVisual(int d1){
        //Die one
        System.out.println("+-------+");
        //line one
        if(d1 == 1){
            System.out.println("|       |");
        }
        else if(d1 == 2 || d1 == 3){
            System.out.println("| 0     |");
        }
        else{
            System.out.println("| 0   0 |");
        }
        //line two
        if(d1 == 1 || d1 == 3 || d1 == 5){
            System.out.println("|   0   |");
        }
        else if(d1 == 2 || d1 == 4){
            System.out.println("|       |");
        }
        else{
            System.out.println("| 0   0 |");
        }
        //line three
        if(d1 == 1){
            System.out.println("|       |");
        }
        else if(d1 == 2 || d1 == 3){
            System.out.println("|     0 |");
        }
        else{
            System.out.println("| 0   0 |");
        }
        System.out.println("+-------+");
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
                    System.out.println("Roll again!");
                    result = rollTheDice(in,die);
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
