import java.util.Scanner;
public class GradePointAverage {
  public static void main(String[] args){
    System.out.println("*** Average grade notes***");
    var scanner = new Scanner(System.in);
    
    System.out.print("How many grade notes do you wan to have? ");
    var quantityGrades = Integer.parseInt(scanner.nextLine());
    
    // dynamic array
    var gradesNote = new int[quantityGrades];

    for (var i = 0; i < gradesNote.length; i++) {
      System.out.print("Write a grade note in this space: [" + i + "] = ");
      gradesNote[i] = Integer.parseInt(scanner.nextLine());
    }

    var totalGradesN = 0;

    System.out.println("\n Showing gradesNote notes: ");
    for (var i = 0; i < gradesNote.length; i++) {
      System.out.println("grade # [" + i + "] = " + gradesNote[i]);
      totalGradesN +=  gradesNote[i];
    }

    var averageGrade = totalGradesN / quantityGrades;
    
    System.out.print("The average grade note is: " + averageGrade);
    scanner.close();
  }
  
}