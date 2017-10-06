/**
 * The program will generate a random number between 1 and 10, and you will have five tries to guess a number.
 * If you guess incorrectly, the program will tell you that your guess is too high or too low.
 * @author Dylan
 * @version 9/15/17
 */
import java.util.Scanner;
import java.lang.Math;
public class GuessGame
{
    public static void loop(){
        Scanner scanner = new Scanner(System.in);
        double num = Math.random();
        int rand = (int) ((num * 10) +1);
        System.out.println(rand);
        System.out.println("What is your guess?");
        int count = 0;
        int guess = -1;
        for (int i = 1; i < 5; i+=1){
            if (guess < rand) {
                System.out.println(" Your guess was too low!");
            }else if (guess > rand){
                System.out.println(" Your guess was too high!");
            }else{
                System.out.println(" You got it!");
                System.exit(0);
            }
        }
        System.out.println(" You suck at this game...");
    }
}