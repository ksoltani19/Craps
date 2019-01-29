
/**
 * Plays the game of craps.
 *
 * @author Kian Soltani
 * @version 1-23-19
 */
import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        // initial setup of the dice as well as the roll, this is necessary for any dice game.
        Die dice_1 = new Die();
        Die dice_2 = new Die();
        Scanner in = new Scanner(System.in);

        while (true)
        {
            System.out.println("Time for some Craps!");

            System.out.println("Hit [Enter] to roll both dice:");
            in.nextLine();

            int roll_1 = dice_1.roll();
            int roll_2 = dice_2.roll();
            int totalroll = roll_1 + roll_2;
            System.out.println("You rolled a " + roll_1 + " and a " + roll_2);
            System.out.println("Which combine for a total roll of " + totalroll);

            // time to set up if statements to determine whether the player has won, lost, or still plays.

            if (totalroll == 7 || totalroll == 11)
            {
                System.out.println("Congrats! You won! :D ");
            }

            else if (totalroll == 2 || totalroll == 3 || totalroll == 12)
            {
                System.out.println("Sorry! You lost! :( ");
            }   

            else
            {
                // we now need a point for the player to attempt to roll for
                int point = totalroll;

                // boolean needed here to keep the game continuous after the first roll
                boolean keepplaying = true;

                while(keepplaying) 
                {
                    // same code from above needed for the game to continue
                    System.out.println("Hit [Enter] to roll both dice:");
                    in.nextLine();

                    roll_1 = dice_1.roll();
                    roll_2 = dice_2.roll();
                    totalroll = roll_1 + roll_2;
                    System.out.println("You rolled a " + roll_1 + " and a " + roll_2);
                    System.out.println("Which combine for a total roll of " + totalroll);

                    // now we check to see if they rolled the point
                    if (totalroll == point)
                    {
                        System.out.println("You matched the point. You win! :D");
                        keepplaying = false;
                    }

                    else if (totalroll == 7)
                    {
                        System.out.println("You rolled a 7. You lost! :(");
                        keepplaying = false;
                    }   
                }
            } 
            System.out.println("Play again?");
            String playAgain = in.nextLine();
            if (playAgain.equals(""))
            {
            }
            if (playAgain.substring(0,1).equals("n"))
            {
                break;
            }   
        }
        System.out.println("Thanks for playing Craps!");
    }    
}
