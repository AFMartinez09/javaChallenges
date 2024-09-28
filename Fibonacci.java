public class Fibonacci {
  // 
  static int fiboFunction(int num){
    if (num == 0 || num == 1){
      return num;
    };
    if(num < 0){
      return 0;
    };
    return (fiboFunction( num - 2 ) + fiboFunction( num - 1 ));
  };

  public static void main(String[] args){
    System.out.println(fiboFunction(6));
  };
};
