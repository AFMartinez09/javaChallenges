package algorithms;

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
  public static void main(String[] args){
System.out.println("funciona");
    var algorithmSelection = new SortingAlgorithms();
    int[] value = {15, 3, 19, 8, 12, 1, 20, 5, 7, 14, 2, 18, 10, 6, 13, 9, 4, 17, 11, 16};
    for (int num : value) {
      System.out.print( num + " " );
    }
    var arraySorted = algorithmSelection.selectionSort(value);

    System.out.println();

    for (int num : arraySorted) {
    System.out.print( num + " " );
    }
  }
}
