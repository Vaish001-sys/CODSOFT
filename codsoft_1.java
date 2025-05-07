// importing all classes from the java.util package utility classes like:Scanner,Random etc.)

import java.util.*;

public class GuessNumber {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Random rand = new Random();
 int score = 0;

 System.out.println("Hey welcome to the Number Guessing Game whose range is (1-100)");
 System.out.println("You get 5 attempts per round\n");

 do {
 int num = rand.nextInt(100) + 1;
 int attempts = 5; //no. of attempts per round is 5

 while (attempts > 0) {
 System.out.print("Attempts left: " + attempts + ". Guess: ");
 int guess = sc.nextInt();


 //if the guessed number is same as teh selected number then provide 10 points
 if (guess == num) {
 score += attempts * 10;
 System.out.println("Correct! Score: " + score);
 break;
 }
 System.out.println(guess < num ? "Are it's quite low" : "Now it's quite high");
 attempts--;
 }
 // when there is a shortage of attempts then show this and will seek for another round
 if (attempts == 0) {
 System.out.println("Now start an another round since you lost, Number was: " + num);
 }
 // whether got a 10points or not do u want to try again
 System.out.print("Do you Wanna Play again? (y/n): ");
 } while (sc.next().equalsIgnoreCase("y"));



 // YOur final score wil be shown
 System.out.println("\nDude this was an end , pack up game over and wait your Final score is: " + score);
 sc.close();
 }
}
