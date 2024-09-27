import java.util.Scanner;

/* 
In this challenge you should plus diagonal in 2D array
You must use for method to solve this challenge:

for (var i = 0; i < n.length; i++) {
}
*/

public class CalculateDiagonal {
  public static void main(String[] args){
    System.out.println("*** Calculate Diagonal***");
    int row, col;
    var scanner = new Scanner(System.in);
    
    System.out.print("Insert how many rows do you want: ");
    row = Integer.parseInt(scanner.nextLine());
    
    System.out.print("Insert how many cols do you want: ");
    col = Integer.parseInt(scanner.nextLine());
    
    var multiArray = new int[row][col];
    var totalValue = 0;

    // Insert values in 2D array 
    for (var i = 0; i < multiArray.length; i++) {
      for (var j = 0; j < multiArray.length; j++) {
        System.out.print("Value 2D array in [" + i + "][" + j + "] = ");
        multiArray[i][j] = Integer.parseInt(scanner.nextLine());
      };
    };

    // Find diagonal
    for (var i = 0; i < multiArray.length; i++) {
      for (var j = 0; j < multiArray.length; j++) {
        if(multiArray[i] == multiArray[j]){
          totalValue += multiArray[i][j];
        };
      };
    };
    System.out.println("Total 2D array diagonal= " + totalValue);
    scanner.close();
  };
};
