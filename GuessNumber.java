import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
  public static void main(String[] args){
    var scanner = new Scanner(System.in);
    System.out.println("*** Guess Number ***");
    var random = new Random();

    final var opportunities = 5;
    var secretNumber = random.nextInt(20) + 1;
    var userOpportunities = 0;
    var number = 0;

    while( number != secretNumber && userOpportunities < opportunities){
      System.out.print("Choose a number bewteen 1 - 20 (only integers): ");
      number = scanner.nextInt();
      
      if(number > 0 && number <= 20 && number % 2 == 0) {
        if (number < secretNumber){
          System.out.println("The secret number is higher");
        } 
        if (number > secretNumber){
        System.out.println("The secret number is lower"); 
        }
      }
      else{
        System.out.println("Only numbers (integers) bewteen 1-20");
      };
      userOpportunities++;
    };
    if(number == secretNumber) {
      System.out.printf("Congratulations you guest the secret number" +
        " and you only need " + userOpportunities + " opportunities.");
    } else{
      System.out.printf("Game over. Play again.");
      System.out.println(" The secret number was: " + secretNumber);
    }
    scanner.close();
  };
};
