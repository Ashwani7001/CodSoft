import java.util.Random;
import java.util.Scanner;

public class Game {

  public static void main(String[] args) {

    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    
    int randomNumber = rand.nextInt(100) + 1;
    int attempts = 0;
    int maxattempts=5;//Number of attempts
    while(attempts<maxattempts) {
      System.out.println("Attempt no."+(attempts + 1)+" Enter your guess (1-100):");
      
      int playerGuess = scanner.nextInt();
      attempts++;
      
      if (playerGuess == randomNumber) {
        System.out.println("Correct! You Win!");
        System.out.println("Your score is : "+((maxattempts+1)-attempts)+"/5");
        break;
      }
      else if(randomNumber > playerGuess) {
        System.out.println("Nope! The number is higher. Guess again.");
      }
      else {
        System.out.println("Nope! The number is lower. Guess again.");
      }
    }
    if(attempts==maxattempts){
      System.out.println("Sorry, you've used all " + maxattempts + " attempts.");
      System.out.println("The correct number was " + randomNumber);
      System.out.println("Your score is : "+(maxattempts-attempts)+"/5");
    }
    scanner.close();
    
  }
}