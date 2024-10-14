package sales_system;

public class Sales {
  public static void main(String[] args){
    System.out.println("*** Sales System ***");
    var product1 = new Products("shorts", 20.33);
    var product2 = new Products("shoes", 80.99);

    var order1 = new Order();
    order1.addProduct(product1);
    order1.addProduct(product2);

    System.out.println(order1);
  }
}
