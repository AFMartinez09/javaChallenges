package algorithms;
import java.util.Arrays;

public class  SortingAlgorithms {

  public int[] selectionSort(int[] array) {

    for(var i = 0; i < array.length - 1; i++){
      int lowerNum = i;

      for(var j = i + 1; j < array.length; j++ ){
        if(array[lowerNum] > array[j]){
          // change the index to find the lowest number
        lowerNum = j;   
      }
     } 
     var aux = array[i];
     array[i] = array[lowerNum];
     array[lowerNum] = aux; 
    }
    return array;
  };

  public int[] bubbleSort(int[] array){
    for (var i = 0; i < array.length - 1; i++) {
      // - i - 1 permite no volver a compararlos nuevamente haciendo que se más eficiente 
      // hace una resta en el inidice que va (i = 2 array.length = 5 => 5 - 2 - 1 sería lo que recorre j)
      for (var j = 0; j < array.length - i - 1; j++) {

        if( array[j] > array[ j + 1 ] ){
          // proceso para hacer swap (bubble)
          var aux = array[j];
          array[j] = array[j + 1 ];
          array[j + 1 ] = aux;
        } 
      }
    }
    return array; 
  }

  public int[] mergeSort(int[] array) {
    if(array.length == 1){
      return array;
    }
    var arraySize = array.length - 1;
    int middle = Math.floorDiv(arraySize, 2);

    int[] left = Arrays.copyOfRange(array, 0, middle);
    int[] right = Arrays.copyOfRange(array, middle, array.length);

    mergeSort(left);
    mergeSort(right);

    int[] arrayMixed = concatArrays(left, right); 

    for (int i = 0; i < right.length; i++) {
      for (int j = 0; j < right.length; j++) {
        if(array[i] < )
      }
    }

  }
  public static void main(String[] args){
System.out.println("funciona");
    var algorithmSelection = new SortingAlgorithms();
    int[] value = {15, 3, 500, 19, 8, 12, 1, 20, 5, 7, 14, 2, 18, 10, 6, 13, 9, 4, 17, 11, 16, 0};
    int[] value2 = {400, 15, 3, 19, 8, 12, 1, 20, 5, 7, 14, 2, 18, 10, 6, 13, 9, 4, 17, 11, 16, 0};
    System.out.print("Select sort before: ");

    for (int num : value) {
      System.out.print( + num + " " );
    }
    var selectArray = algorithmSelection.selectionSort(value);

    System.out.println();
    System.out.print("Select sort despues: ");
    for (int num : selectArray) {
    System.out.print( num + " " );
    }

    // Bubble sort 
    System.out.println();
    System.out.println();
    System.out.print("Bubble sort before: ");
    for (int num : value2) {
      System.out.print( num + " " );
    }
    System.out.println();
    var bubbleArray = algorithmSelection.bubbleSort(value2);

    System.out.print("Bubble sort despues: ");
    for (int num : bubbleArray) {
      System.out.print( num + " " );
      }
  }
}
