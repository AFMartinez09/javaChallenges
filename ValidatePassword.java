import java.util.Scanner;

public class ValidatePassword {
 public static void main(String[] args){
  var scanner = new Scanner(System.in);
  System.out.println("*** Create and validate password ***");
  System.out.print("Create password (must contain 6 characters): ");
  var password = scanner.nextLine();

  var validateP = password.length() >= 6 ? "Your password was created" : "The password should almost contain 6 characters."; 
  System.out.print(validateP);
  scanner.close();
 } 
}
