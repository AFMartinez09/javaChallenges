import java.util.Scanner;

public class Calculator {
  public static void main(String[] args){
    System.out.println("*** Calcultor in Java ***");
    var scanner = new Scanner(System.in);
    var out = false;


    while(!out){
      System.out.printf("""
          What operation would you like to do:
          1. Plus
          2. Minus
          3. Multipy
          4. Divide
          5. Out
          Choose an option:\s""");
    var option = scanner.nextInt();

    // parameters
    System.out.print("Type first number: ");
    var firstOption = scanner.nextDouble();
    System.out.print("Type second number: ");
    var secondOption = scanner.nextDouble();
      
      switch(option){
        case 1 ->{
            System.out.printf("The result in plus is: %.2f%n%n", ( firstOption + secondOption ));
        }
        case 2 ->{
            System.out.printf("The result in minus is: %.2f%n%n", ( firstOption - secondOption ));
        }
        case 3 ->{
          System.out.printf("The result in multiply is: %.2f%n%n", ( firstOption * secondOption ));
        }
        case 4 ->{
          if( secondOption != 0){
            System.out.printf("The result in divide is: %.2f%n%n", ( firstOption / secondOption ));
          } else
          System.out.println("Error: is not possible zero as a divisor");
        }
        case 5 ->{
          System.out.println("Closing app calculator");
          out = true;
        }
        default -> System.out.println("Error: this option does not exists: " + option);
      };
    };
    scanner.close();
  }
  
}